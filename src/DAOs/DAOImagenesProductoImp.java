/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.util.LinkedList;
import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Manuel
 */

public class DAOImagenesProductoImp implements DAOImagenesProducto{
    ConexionSQL cn = ConexionSQL.getInstance();
    @Override
    public int contRegistros() {
        int cantRegistros = 0;
        try {
            String sql = "select count(idImagen) as registros from dbo.ImagenesProducto ";
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
        return cantRegistros;}

    @Override
    public LinkedList<ImagenesProducto> consultaInd(String nombre) {
         LinkedList<ImagenesProducto> imagen;
        try {
            String sql = "{call sp_busquedaPorNombreImagen(?)}";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, Integer.parseInt(nombre));
            cn.setRs(cn.getPs().executeQuery());
            imagen = new LinkedList<>();
            char estatus,principal;
            while(cn.getRs().next()){
                principal=cn.getRs().getString(3).charAt(0);
                estatus = cn.getRs().getString(4).charAt(0);
                imagen.add(new ImagenesProducto(cn.getRs().getInt(0),
                        cn.getRs().getString(1), cn.getRs().getBytes(2), 
                        principal, estatus,cn.getRs().getString(5)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return imagen;
    }

    @Override
    public LinkedList<ImagenesProducto> obternerIdProducto() {
        LinkedList<ImagenesProducto> imagen;
        try {
            cn.setPs(cn.getCn().prepareStatement("select idProducto from Productos"));
            cn.setRs(cn.getPs().executeQuery());
            imagen = new LinkedList<>();
            
            while (cn.getRs().next()) {
                imagen.add(new ImagenesProducto(cn.getRs().getString(1)));
            }
            
            if(imagen.size() <= 0){
                return null;
            }
                
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return imagen;
    }

    @Override
    public void Insert(ImagenesProducto nuevo) {
        String sql="{call AgregarImagenesProducto (?,?,?,?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, nuevo.getNombreImagen());
          cn.getPs().setBytes(2, nuevo.getImagen());
          cn.getPs().setInt(3, nuevo.getPrincipal());
          cn.getPs().setString(4, nuevo.getIdProducto());
          
          cn.getPs().execute();
                System.out.println("El registro fué exitoso.");
            cn.getPs().close();
            cn.getRs().close();
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error con el servidor",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void upadate(ImagenesProducto nuevo) {
        String sql="{call EditarImagenesProducto (?,?,?,?,?,?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setInt(1, nuevo.getIdImagen());
          cn.getPs().setString(2, nuevo.getNombreImagen());
          cn.getPs().setBytes(3, nuevo.getImagen());
          cn.getPs().setInt(4, nuevo.getPrincipal());
          cn.getPs().setInt(5,nuevo.getEstatus());
          cn.getPs().setString(6, nuevo.getIdProducto());
          
          cn.getPs().execute();
                System.out.println("Se actualizó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error con el servidor",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(ImagenesProducto nuevo) {
        String sql="{call EliminarImagenesProducto (?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, String.valueOf(nuevo.getIdImagen()));
          
          if(cn.getPs().execute())
                System.out.println("Se eliminó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public LinkedList<ImagenesProducto> show(int pagina) {
        LinkedList<ImagenesProducto> imagen;
        try {
            String sql = "select * from sf_paginarRegistroseIMGPRO (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            imagen = new LinkedList<>();
            char estatus,principal;
            while(cn.getRs().next()){
                principal= cn.getRs().getString(4).charAt(0);
                estatus = cn.getRs().getString(5).charAt(0);
                imagen.add(new ImagenesProducto
                (cn.getRs().getInt(1),
                 cn.getRs().getString(2), 
                 cn.getRs().getBytes(3), 
                 principal, 
                 estatus, 
                 cn.getRs().getString(6)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return imagen;
    }
    
}
