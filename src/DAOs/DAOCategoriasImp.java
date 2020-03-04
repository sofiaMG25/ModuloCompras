/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;
import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
import java.util.LinkedList;
/**
 *
 * @author Manuel
 */
public class DAOCategoriasImp implements DAOCategorias{
    ConexionSQL cn = ConexionSQL.getInstance();
    
    @Override
    public void Insert(Categorias nuevo) {
        String sql="{call AgregarCategoria (?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, nuevo.getNombre());
          if(cn.getPs().execute())
                System.out.println("El registro fué exitoso.");
            cn.getPs().close();
            cn.getRs().close();
          
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public void upadate(Categorias nuevo) {
       String sql="{call EditarCategoria (?,?,?)}";

        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, String.valueOf(nuevo.getId()));
          cn.getPs().setString(2, nuevo.getNombre());
          cn.getPs().setString(3, String.valueOf(nuevo.getEstatus()));

          if(cn.getPs().execute())
                System.out.println("Se actualizó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public void delete(Categorias nuevo) {
        String sql="{call EliminarCategoria (?)}";
        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, String.valueOf(nuevo.getId()));
         
          if(cn.getPs().execute())
                System.out.println("Se eliminó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public LinkedList<Categorias> show(int pagina) {
        LinkedList<Categorias> categorias;
        try {
            String sql = "select * from sf_paginarRegistroseCAT (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            categorias = new LinkedList<Categorias>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString("estatus").charAt(0);
                categorias.add(new Categorias(cn.getRs().getInt("idCategorias")
                        ,cn.getRs().getString("nombre"),estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return categorias;
    }
    
    public LinkedList<Categorias> consultaInd(String nombre){
        LinkedList<Categorias> categorias;
        try {
            String sql = "SELECT * FROM Categorias Where nombre like "+"'%"+nombre+"%'";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            categorias = new LinkedList<Categorias>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString("estatus").charAt(0);
                categorias.add(new Categorias(cn.getRs().getInt("idCategorias")
                        ,cn.getRs().getString("nombre"),estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return categorias;
    }

    @Override
    public int contRegistros() {
       int cantRegistros = 0;
        try {
            String sql = "select count(idCategorias) as registros from dbo.Categorias ";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            while(cn.getRs().next()){
                cantRegistros = cn.getRs().getInt(1);
            }
            cn.getPs().close();
            cn.getRs().close();
            return cantRegistros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cantRegistros;
    }
}
