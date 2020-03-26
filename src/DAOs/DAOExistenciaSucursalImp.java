package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class DAOExistenciaSucursalImp implements DAOExistenciaSucursal {

    ConexionSQL conexion = ConexionSQL.getInstance();

    @Override
    public void Insert(ExistenciaSucursal nuevo) {
        try {
            conexion.setPs(conexion.getCn().prepareCall("{call sp_agregarExistenciaSucursal (?,?,?) }"));
            conexion.getPs().setInt(1, nuevo.getIdPresentacion());
            conexion.getPs().setInt(2, nuevo.getIdSucursal());
            conexion.getPs().setInt(3, nuevo.getCantidad());
            conexion.getPs().execute();
                JOptionPane.showMessageDialog(null,"El registro fué exitoso."
                        ,"Iniciando registro", JOptionPane.INFORMATION_MESSAGE);
                
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
           
        }
    }

    @Override
    public void upadate(ExistenciaSucursal nuevo) {
        try {
            conexion.setPs(conexion.getCn().prepareCall("{call sp_actualizarExistenciaSucursal (?,?,?,?)}"));
            conexion.getPs().setInt(1, nuevo.getIdPresentacion());
            conexion.getPs().setInt(2, nuevo.getIdSucursal());
            conexion.getPs().setInt(3, nuevo.getCantidad());
            conexion.getPs().setString(4,String.valueOf(nuevo.getEstado()));
            
            conexion.getPs().execute();
                JOptionPane.showMessageDialog(null,"Los datos se han actualizado con exito..."
                        ,"Actualizando", JOptionPane.INFORMATION_MESSAGE);
                
            conexion.getPs().close();
            conexion.getRs().close();    
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(ExistenciaSucursal nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<ExistenciaSucursal> show(int pagina) {
        LinkedList<ExistenciaSucursal> existenciasSucursal;
        try {
            String sql = "SELECT * FROM sf_paginarRegistrosESUC (?)";
            conexion.setPs(conexion.getCn().prepareCall(sql));
            conexion.getPs().setInt(1, pagina);
            conexion.setRs(conexion.getPs().executeQuery());
            existenciasSucursal = new LinkedList<ExistenciaSucursal>();
            char estatus;
            while (conexion.getRs().next()) {
                estatus = conexion.getRs().getString(4).charAt(0);
                existenciasSucursal.add(new ExistenciaSucursal(conexion.getRs().getInt(1), conexion.getRs().getInt(2),
                        conexion.getRs().getInt(3), estatus));
            }
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return existenciasSucursal;
    }

    @Override
    public LinkedList<ExistenciaSucursal> busquedaPorID(int id) {
        try {
            conexion.setPs(conexion.getCn().prepareCall("{call sp_busquedaPorIDExistenciaSucursal (?) }"));
            conexion.getPs().setInt(1, id);
            conexion.setRs(conexion.getPs().executeQuery());
            LinkedList<ExistenciaSucursal> Exi = new LinkedList<ExistenciaSucursal>();
            char estatus;
            while (conexion.getRs().next()) {
                estatus = conexion.getRs().getString(4).charAt(0);
                Exi.add(new ExistenciaSucursal(conexion.getRs().getInt(1),
                        conexion.getRs().getInt(2), conexion.getRs().getInt(3), estatus));
            }
            conexion.getPs().close();
            conexion.getRs().close();
            return Exi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con servidor", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    @Override
    public int contRegistros(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Sucursales> getsIDSU() {

        try {
            conexion.setPs(conexion.getCn().prepareCall("select idSucursal from dbo.Sucursales"));
            conexion.setRs(conexion.getPs().executeQuery());
            LinkedList<Sucursales> ExiSuc = new LinkedList<Sucursales>();
            while (conexion.getRs().next()) {
                ExiSuc.add(new Sucursales(conexion.getRs().getInt(1)));
            }
            conexion.getPs().close();
            conexion.getRs().close();
            return ExiSuc;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con servidor", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    @Override
    public LinkedList<Presentaciones> getsIDPR() {
    try {
            conexion.setPs(conexion.getCn().prepareCall("select idPresentacion from dbo.PresentacionesProductos"));
            conexion.setRs(conexion.getPs().executeQuery());
            LinkedList<Presentaciones> ExiPre = new LinkedList<Presentaciones>();
            while (conexion.getRs().next()) {
                ExiPre.add(new Presentaciones(conexion.getRs().getInt(1)));
            }
            conexion.getPs().close();
            conexion.getRs().close();
            return ExiPre;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con servidor", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return null;    
    
    }

}
