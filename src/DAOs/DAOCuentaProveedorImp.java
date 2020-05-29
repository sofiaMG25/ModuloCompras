package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class DAOCuentaProveedorImp implements DAOCuentaProveedor {

    ConexionSQL cn = ConexionSQL.getInstance();

    @Override
    public int contRegistro() {
        int cantRegistros = 0;
        try {
            String sql = "select count(idCuentaProveedor) as registros from dbo.CuentasProveedor ";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            while (cn.getRs().next()) {
                cantRegistros = cn.getRs().getInt(1);
            }
            cn.getPs().close();
            cn.getRs().close();
            return cantRegistros;
        } catch (Exception e) {
            System.out.println("malo" + e.getMessage());
        }
        return cantRegistros;
    }

    @Override
    public LinkedList<CuentasProveedor> obtenerIdProveedores() {
        LinkedList<CuentasProveedor> prov;
        try {
            cn.setPs(cn.getCn().prepareStatement("select nombre from dbo.Proveedores"));
            cn.setRs(cn.getPs().executeQuery());
            prov = new LinkedList<CuentasProveedor>();

            while (cn.getRs().next()) {
                prov.add(new CuentasProveedor(cn.getRs().getString(1)));
            }

            if (prov.size() <= 0) {
                return null;
            }

            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return prov;
    }

    @Override
    public LinkedList<CuentasProveedor> busquedaPorNombre(int id) {
         try {
            cn.setPs(cn.getCn().prepareCall("{call sp_busquedaPorNombreCuenta (?) }"));
            cn.getPs().setInt(1, id);
            cn.setRs(cn.getPs().executeQuery());
            LinkedList<CuentasProveedor> cuenta = new LinkedList<CuentasProveedor>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString("estatus").charAt(0);
                cuenta.add(new CuentasProveedor(cn.getRs().getInt(1),cn.getRs().getString(2)
                        , cn.getRs().getString(3) , cn.getRs().getString(4), estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
            return cuenta;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error con servidor",e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    @Override
    public void Insert(CuentasProveedor nuevo) {
        String sql = "{call sp_agregarCuentaProveedor(?,?,?)}"; //agregar en la bd 1sp_actualizarPresentacion
        try {
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setString(1, nuevo.getProveedor());
            cn.getPs().setString(2, nuevo.getNoCuenta());
            cn.getPs().setString(3, nuevo.getBanco());
            cn.getPs().execute();
            JOptionPane.showMessageDialog(null, "El registro fué exitoso.", "Iniciando registro", JOptionPane.INFORMATION_MESSAGE);

            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO se registro " + ex.getMessage(), "Error con el servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void upadate(CuentasProveedor nuevo) {
        try {
            cn.setPs(cn.getCn().prepareCall("{call sp_actualizarCuentaProveedor (?,?,?,?,?)}"));
            cn.getPs().setInt(1, nuevo.getIdcuentaProveedor());
            cn.getPs().setString(2, nuevo.getProveedor());
            cn.getPs().setString(3, nuevo.getNoCuenta());
            cn.getPs().setString(4, nuevo.getBanco());
            cn.getPs().setString(5, String.valueOf(nuevo.getEstatus()));
            cn.getPs().execute();
            JOptionPane.showMessageDialog(null, "Los datos se han actualizado con exito...", "Actualizando", JOptionPane.INFORMATION_MESSAGE);

            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se actualizaron " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(CuentasProveedor nuevo) {
        String sql = "{call sp_eliminarCuentaProveedor(?)}";//agregar sp en la bd 1sp_eliminarPresentacion 
        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setString(1, String.valueOf(nuevo.getIdcuentaProveedor()));
           
            if (cn.getPs().execute()) {
                JOptionPane.showMessageDialog(null,"El registro fué eliminado."
                        ,"Eliminando", JOptionPane.INFORMATION_MESSAGE);
                
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error con el servidor",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public LinkedList<CuentasProveedor> show(int pagina) {
        LinkedList<CuentasProveedor> cProv;
        try {
            String sql = "SELECT * FROM sf_paginarRegistroseCuentaProv (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            cProv = new LinkedList<CuentasProveedor>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(5).charAt(0);
                cProv.add(new CuentasProveedor(cn.getRs().getInt(1), cn.getRs().getString(2), cn.getRs().getString(3),
                        cn.getRs().getString(4), estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return cProv;

    }
}
