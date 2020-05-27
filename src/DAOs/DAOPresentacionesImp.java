package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class DAOPresentacionesImp implements DAOPresentaciones {

    ConexionSQL cn = ConexionSQL.getInstance();

    @Override
    public LinkedList<Presentaciones> obtenerIdProducto() {
        LinkedList<Presentaciones> presentaciones;
        try {
            cn.setPs(cn.getCn().prepareStatement("select nombre from Productos"));
            cn.setRs(cn.getPs().executeQuery());
            presentaciones = new LinkedList<Presentaciones>();

            while (cn.getRs().next()) {
                presentaciones.add(new Presentaciones(cn.getRs().getString(1)));
            }

            if (presentaciones.size() <= 0) {
                return null;
            }

            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return presentaciones;
    }

    @Override
    public LinkedList<Presentaciones> obtenerIdEmpaque() {
        LinkedList<Presentaciones> empaques;
        try {
            cn.setPs(cn.getCn().prepareStatement("select nombre from Empaques"));
            cn.setRs(cn.getPs().executeQuery());
            empaques = new LinkedList<Presentaciones>();

            while (cn.getRs().next()) {
                empaques.add(new Presentaciones(0, cn.getRs().getString(1)));
            }

            if (empaques.size() <= 0) {
                return null;
            }

            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return empaques;
    }

    @Override
    public int contRegistro() {
        int cantRegistros = 0;
        try {
            String sql = "select count(idPresentacion) as registros from dbo.PresentacionesProductos ";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            while (cn.getRs().next()) {
                cantRegistros = cn.getRs().getInt(1);
            }
            cn.getPs().close();
            cn.getRs().close();
            return cantRegistros;
        } catch (Exception e) {
            System.out.println("malo"+e.getMessage());
        }
        return cantRegistros;
    }

    @Override
    public void Insert(Presentaciones nuevo) {
        String sql = "{call sp_1agregarPresentaciones(?,?,?,?,?)}"; //agregar en la bd 1sp_actualizarPresentacion
        try {
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setFloat(1, nuevo.getpCompra());
            cn.getPs().setFloat(2, nuevo.getpVenta());
            cn.getPs().setFloat(3, nuevo.getpReorden());
            cn.getPs().setString(4, nuevo.getIdProducto());
            cn.getPs().setString(5, nuevo.getIdEmpaque());
            cn.getPs().execute();
            JOptionPane.showMessageDialog(null, "El registro fué exitoso.", "Iniciando registro", JOptionPane.INFORMATION_MESSAGE);

            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NO se registro "+ ex.getMessage(), "Error con el servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void upadate(Presentaciones nuevo) {
        try {
            cn.setPs(cn.getCn().prepareCall("{call sp_1actualizarPresentacion (?,?,?,?,?,?,?)}"));// aggregar en ka bd 1sp_actualizarPresentacion
            cn.getPs().setInt(1, nuevo.getIdPP());
            cn.getPs().setFloat(2, nuevo.getpCompra());
            cn.getPs().setFloat(3, nuevo.getpVenta());
            cn.getPs().setFloat(4, nuevo.getpReorden());
            cn.getPs().setString(5, nuevo.getIdProducto());
            cn.getPs().setString(6, nuevo.getIdEmpaque());
            cn.getPs().setString(7, String.valueOf(nuevo.getEstatus()));
            
            cn.getPs().execute();
                JOptionPane.showMessageDialog(null,"Los datos se han actualizado con exito..."
                        ,"Actualizando", JOptionPane.INFORMATION_MESSAGE);
                
            cn.getPs().close();
            cn.getRs().close();  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se actualizaron "+ ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(Presentaciones nuevo) {
        String sql = "{call sp_1eliminarPresentacion (?)}";//agregar sp en la bd 1sp_eliminarPresentacion 
        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setString(1, String.valueOf(nuevo.getIdPP()));

            if (cn.getPs().execute()) {
                System.out.println("Se eliminó con éxito.");
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    @Override
    public LinkedList<Presentaciones> show(int pagina) {
         LinkedList<Presentaciones> presentaciones;
        try {
            String sql = "SELECT * FROM sf_paginarRegistrosePPRO (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            presentaciones = new LinkedList<Presentaciones>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(7).charAt(0);
                presentaciones.add(new Presentaciones(cn.getRs().getInt(1),cn.getRs().getFloat(2), cn.getRs().getFloat(3), 
                        cn.getRs().getFloat(4), cn.getRs().getString(5), cn.getRs().getString(6), estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
      return presentaciones;
        
    }
}
