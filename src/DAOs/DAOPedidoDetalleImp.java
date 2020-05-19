/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;
import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author Manuel
 */
public class DAOPedidoDetalleImp implements DAOPedidoDetalle{
    ConexionSQL cn = ConexionSQL.getInstance();
    @Override
    public void Insert(PedidoDetalle nuevo) {
        String sql="{call AgregarPedidoDetalle (?,?,?,?,?,?,?,?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setInt(1, nuevo.getCantPedida());
          cn.getPs().setFloat(2, nuevo.getPrecioCompra());
          cn.getPs().setFloat(3, nuevo.getSubtotal());
          cn.getPs().setInt(4, nuevo.getCantRecibida());
          cn.getPs().setInt(5, nuevo.getCantRechazada());
          cn.getPs().setFloat(6, nuevo.getCantAceptada());
          cn.getPs().setInt(7, nuevo.getIdPedido());
          cn.getPs().setInt(8, nuevo.getIdPresentacion());
          
          cn.getPs().execute();
                System.out.println("El registro fué exitoso.");
            cn.getPs().close();
            cn.getRs().close();
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error con el servidor",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void upadate(PedidoDetalle nuevo) {
        String sql="{call EditarPedidoDetalle (?,?,?,?,?,?,?,?,?,?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setInt(1, nuevo.getIdPedidoDetalle());
          cn.getPs().setInt(2, nuevo.getCantPedida());
          cn.getPs().setFloat(3, nuevo.getPrecioCompra());
          cn.getPs().setFloat(4, nuevo.getSubtotal());
          cn.getPs().setInt(5,nuevo.getCantRecibida());
          cn.getPs().setInt(6, nuevo.getCantRechazada());
          cn.getPs().setFloat(7,nuevo.getCantAceptada());
          cn.getPs().setInt(8, nuevo.getEstatus());
          cn.getPs().setInt(9, nuevo.getIdPedido());
          cn.getPs().setInt(10, nuevo.getIdPresentacion());
          
          cn.getPs().execute();
                System.out.println("Se actualizó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error con el servidor",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(PedidoDetalle nuevo) {
        String sql="{call EliminarPedidoDetalle (?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, String.valueOf(nuevo.getIdPedidoDetalle()));
          
          if(cn.getPs().execute())
                System.out.println("Se eliminó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public LinkedList<PedidoDetalle> show(int pagina) {
        LinkedList<PedidoDetalle> pedidoDet;
        try {
            String sql = "select * from sf_paginarRegistrosePEDDET (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            pedidoDet = new LinkedList<>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString(8).charAt(0);
                pedidoDet.add(new PedidoDetalle
                (cn.getRs().getInt(1),
                 cn.getRs().getInt(2), 
                 cn.getRs().getFloat(3), 
                 cn.getRs().getFloat(4), 
                 cn.getRs().getInt(5), 
                 cn.getRs().getInt(6), 
                 cn.getRs().getFloat(7), 
                 estatus, 
                 cn.getRs().getInt(9), 
                 cn.getRs().getInt(10)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pedidoDet;
    }

    @Override
    public int contRegistros() {
        int cantRegistros = 0;
        try {
            String sql = "select count(idPedidoDetalle) as registros from dbo.PedidoDetalle ";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            while(cn.getRs().next()){
                cantRegistros = cn.getRs().getInt(1);
            }
            cn.getPs().close();
            cn.getRs().close();
            return cantRegistros;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cantRegistros;
    }

    @Override
    public LinkedList<PedidoDetalle> consultaInd(String nombre) {
        LinkedList<PedidoDetalle> pedidoDet;
        try {
            String sql = "{call sp_busquedaPorNombrePedioDetalle(?)}";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, Integer.parseInt(nombre));
            cn.setRs(cn.getPs().executeQuery());
            pedidoDet = new LinkedList<>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString(7).charAt(0);
                pedidoDet.add(new PedidoDetalle(cn.getRs().getInt(0),
                        cn.getRs().getInt(1), cn.getRs().getFloat(2), 
                        cn.getRs().getFloat(3), cn.getRs().getInt(4),
                        cn.getRs().getInt(5), cn.getRs().getFloat(6),
                        estatus, cn.getRs().getInt(8), cn.getRs().getInt(9)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pedidoDet;
    }

    @Override
    public LinkedList<PedidoDetalle> obternerIdPedido() {
        LinkedList<PedidoDetalle> pedidoDet;
        try {
            cn.setPs(cn.getCn().prepareStatement("select idPedido from Pedidos"));
            cn.setRs(cn.getPs().executeQuery());
            pedidoDet = new LinkedList<>();
            
            while (cn.getRs().next()) {
                pedidoDet.add(new PedidoDetalle(cn.getRs().getInt(1)));
            }
            
            if(pedidoDet.size() <= 0){
                return null;
            }
                
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pedidoDet;
    }

    @Override
    public LinkedList<PedidoDetalle> obternerIdPresentacion() {
        LinkedList<PedidoDetalle> pedidoDet;
        try {
            cn.setPs(cn.getCn().prepareStatement("select idPresentacion from dbo.PresentacionesProductos"));
            cn.setRs(cn.getPs().executeQuery());
            pedidoDet = new LinkedList<>();
            
            while (cn.getRs().next()) {
                pedidoDet.add(new PedidoDetalle(cn.getRs().getInt(1),0));
            }
            
            if(pedidoDet.size() <= 0){
                return null;
            }
                
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pedidoDet;
    }
    
}
