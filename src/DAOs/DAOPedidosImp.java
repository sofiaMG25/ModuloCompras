package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class DAOPedidosImp implements DAOPedidos {

    ConexionSQL cn = ConexionSQL.getInstance();

    @Override
    public void Insert(Pedidos nuevo) {
        String sql="{call sp_AgregarPedido (?,?,?,?,?,?,?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setDate(1, (Date) nuevo.getFecharegistro());
          cn.getPs().setDate(2, (Date) nuevo.getFechaRecepcion());
          cn.getPs().setFloat(3, nuevo.getTotalpagar());
          cn.getPs().setFloat(4, nuevo.getCantidadpagada());
          cn.getPs().setString(5, nuevo.getIdproveedor());
          cn.getPs().setString(6, nuevo.getIdSucursal());
          cn.getPs().setString(7, nuevo.getIdEmpleado());
          cn.getPs().execute();
                  
            JOptionPane.showMessageDialog(null,"Registro exitoso...","Registrando",JOptionPane.INFORMATION_MESSAGE);
               
            cn.getPs().close();
            cn.getRs().close();
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error con el servidor",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    
    }

    @Override
    public void upadate(Pedidos nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pedidos nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Pedidos> show(int pagina) {
        LinkedList<Pedidos> pedidos = null;
        try {
            String sql = "select * from sf_paginarRegistrosePed (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            pedidos = new LinkedList<Pedidos>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(6).charAt(0);
                pedidos.add(new Pedidos(cn.getRs().getInt(1),cn.getRs().getDate(2),cn.getRs().getDate(3),
                        cn.getRs().getFloat(4),cn.getRs().getFloat(5), estatus,
                        cn.getRs().getString(7),cn.getRs().getString(8), cn.getRs().getString(9)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pedidos;

    }

    @Override
    public LinkedList<Pedidos> busquedaPorID(int id) {
        LinkedList<Pedidos> pedidos = null;
        try {
            String sql = "select * from Pedidos where idPedido = ? and estatus = 'A'";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, id);
            cn.setRs(cn.getPs().executeQuery());
            pedidos = new LinkedList<Pedidos>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(6).charAt(0);
                pedidos.add(new Pedidos(cn.getRs().getInt(1),cn.getRs().getDate(2),cn.getRs().getDate(3),
                        cn.getRs().getFloat(4),cn.getRs().getFloat(5), estatus,
                        cn.getRs().getString(7),cn.getRs().getString(8), cn.getRs().getString(9)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pedidos;
    }
}
