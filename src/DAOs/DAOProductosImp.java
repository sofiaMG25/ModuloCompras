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
public class DAOProductosImp implements DAOProductos{
    ConexionSQL cn = ConexionSQL.getInstance();
    
    @Override
    public int contRegistros() {
        int cantRegistros = 0;
        try {
            String sql = "select count(idProductos) as registros from dbo.Productos ";
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
    
    

    @Override
    public void Insert(Productos nuevo) {
        String sql="{call AgregarProductos (?,?,?,?,?,?,?,?,?,?,?,?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, String.valueOf(nuevo.getId()));
          cn.getPs().setString(2, nuevo.getNombre());
          cn.getPs().setString(3, nuevo.getDescripcion());
          cn.getPs().setString(4, String.valueOf(nuevo.getPuntoReorden()));
          cn.getPs().setString(5, String.valueOf(nuevo.getPrecioCompra()));
          cn.getPs().setString(6, String.valueOf(nuevo.getPrecioVenta()));
          cn.getPs().setString(7, nuevo.getIngredienteActivo());
          cn.getPs().setString(8, nuevo.getBandaToxicologica());
          cn.getPs().setString(9, nuevo.getAplicacion());
          cn.getPs().setString(10, nuevo.getUso());
          cn.getPs().setString(11, String.valueOf(nuevo.getIdLab()));
          cn.getPs().setString(12, String.valueOf(nuevo.getIdCat()));
          
          if(cn.getPs().execute())
                System.out.println("El registro fué exitoso.");
            cn.getPs().close();
            cn.getRs().close();
          
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public void upadate(Productos nuevo) {
        String sql="{call EditarProducto (?,?,?,?,?,?,?,?,?,?,?,?,?)}";

        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, String.valueOf(nuevo.getId()));
          cn.getPs().setString(2, nuevo.getNombre());
          cn.getPs().setString(3, nuevo.getDescripcion());
          cn.getPs().setString(4, String.valueOf(nuevo.getPuntoReorden()));
          cn.getPs().setString(5, String.valueOf(nuevo.getPrecioCompra()));
          cn.getPs().setString(6, String.valueOf(nuevo.getPrecioVenta()));
          cn.getPs().setString(7, nuevo.getIngredienteActivo());
          cn.getPs().setString(8, nuevo.getBandaToxicologica());
          cn.getPs().setString(9, nuevo.getAplicacion());
          cn.getPs().setString(10, nuevo.getUso());
          cn.getPs().setString(11, String.valueOf(nuevo.getEstatus()));
          cn.getPs().setString(12, String.valueOf(nuevo.getIdLab()));
          cn.getPs().setString(13, String.valueOf(nuevo.getIdCat()));
          if(cn.getPs().execute())
                System.out.println("Se actualizó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public void delete(Productos nuevo) {
        String sql="{call EliminarProducto (?)}";
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
    public LinkedList<Productos> show(int pagina) {
        LinkedList<Productos> productos;
        try {
            String sql = "select * from sf_paginarRegistrosePro (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            productos = new LinkedList<Productos>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString("estatus").charAt(0);
                productos.add(new Productos(cn.getRs().getInt("idProducto")
                        ,cn.getRs().getString("nombre"),cn.getRs().getString("descripcion")
                        ,cn.getRs().getInt("puntoReorden"),cn.getRs().getFloat("precioCompra")
                        ,cn.getRs().getFloat("precioVenta"),cn.getRs().getString("ingredienteActivo")
                        ,cn.getRs().getString("bandaToxicologica"),cn.getRs().getString("aplicacion")
                        ,cn.getRs().getString("uso"),estatus,cn.getRs().getString("idLaboratorio")
                        ,cn.getRs().getString("idCategoria")));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return productos;
    }
    
    public LinkedList<Productos> consultaInd(String nombre){
        LinkedList<Productos> productos;
        try {
            String sql = "SELECT * FROM Productos Where nombre like "+"'%"+nombre+"%'";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            productos = new LinkedList<Productos>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString("estatus").charAt(0);
                productos.add(new Productos(cn.getRs().getInt("idProducto")
                        ,cn.getRs().getString("nombre"),cn.getRs().getString("descripcion")
                        ,cn.getRs().getInt("puntoReorden"),cn.getRs().getFloat("precioCompra")
                        ,cn.getRs().getFloat("precioVenta"),cn.getRs().getString("ingredienteActivo")
                        ,cn.getRs().getString("bandaToxicologica"),cn.getRs().getString("aplicacion")
                        ,cn.getRs().getString("uso"),estatus,cn.getRs().getString("idLaboratorio")
                        ,cn.getRs().getString("idCategoria")));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return productos;
    }
    
    public LinkedList<Productos> obternerIdLaboratorios() {
        LinkedList<Productos> productos;
        try {
            cn.setPs(cn.getCn().prepareStatement("select nombre from Laboratorios"));
            cn.setRs(cn.getPs().executeQuery());
            productos = new LinkedList<Productos>();
            
            while (cn.getRs().next()) {
                productos.add(new Productos(cn.getRs().getString(1)));
            }
            
            if(productos.size() <= 0){
                return null;
            }
                
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return productos;
    }
    
    public LinkedList<Productos> obternerIdCategorias() {
        LinkedList<Productos> productos;
        try {
            cn.setPs(cn.getCn().prepareStatement("select nombre from Categorias"));
            cn.setRs(cn.getPs().executeQuery());
            productos = new LinkedList<Productos>();
            
            while (cn.getRs().next()) {
                productos.add(new Productos(0,cn.getRs().getString(1)));
            }
            
            if(productos.size() <= 0){
                return null;
            }
                
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return productos;
    }
}
