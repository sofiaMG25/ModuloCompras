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
public class DAOProductosImp implements DAOProductos{
    ConexionSQL cn = ConexionSQL.getInstance();
    
    @Override
    public int contRegistros() {
        int cantRegistros = 0;
        try {
            String sql = "select count(idProducto) as registros from dbo.Productos ";
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
    public void Insert(Productos nuevo) {
        String sql="{call AgregarProducto (?,?,?,?,?,?,?,?,?,?,?)}";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, nuevo.getNombre());
          cn.getPs().setString(2, nuevo.getDescripcion());
          cn.getPs().setString(3, String.valueOf(nuevo.getPuntoReorden()));
          cn.getPs().setString(4, String.valueOf(nuevo.getPrecioCompra()));
          cn.getPs().setString(5, String.valueOf(nuevo.getPrecioVenta()));
          cn.getPs().setString(6, nuevo.getIngredienteActivo());
          cn.getPs().setString(7, nuevo.getBandaToxicologica());
          cn.getPs().setString(8, nuevo.getAplicacion());
          cn.getPs().setString(9, nuevo.getUso());
          cn.getPs().setString(10, String.valueOf(nuevo.getIdLab()));
          cn.getPs().setString(11, String.valueOf(nuevo.getIdCat()));
          
          cn.getPs().execute();
                System.out.println("El registro fué exitoso.");
            cn.getPs().close();
            cn.getRs().close();
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error con el servidor",JOptionPane.ERROR_MESSAGE);
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
            String sql = "select * from sf_paginarRegistrosePRO (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            productos = new LinkedList<>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString(13).charAt(0);
                productos.add(new Productos(cn.getRs().getInt(1)
                        ,cn.getRs().getString(2),cn.getRs().getString(3)
                        ,cn.getRs().getInt(4),cn.getRs().getFloat(5)
                        ,cn.getRs().getFloat(6),cn.getRs().getString(7)
                        ,cn.getRs().getString(8),cn.getRs().getString(9)
                        ,cn.getRs().getString(10),estatus,cn.getRs().getString(11)
                        ,cn.getRs().getString(12)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return productos;
    }
    
    @Override
    public LinkedList<Productos> consultaInd(String nombre){
        LinkedList<Productos> productos;
        try {
            String sql = "select e.idProducto,e.nombre,e.descripcion,e.puntoReorden,e.precioCompra,\n" +
"	e.precioVenta,e.ingredienteActivo,e.bandaToxicologica,e.aplicacion,e.uso,\n" +
"	l.nombre as labororatorio,c.nombre as categoria,e.estatus   \n" +
"	from Productos as e\n" +
"		join Laboratorios as l on e.idLaboratorio = l.idLaboratorio \n" +
"		join Categorias as c on e.idCategorias = c.idCategorias Where e.nombre like "+"'%"+nombre+"%'";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            productos = new LinkedList<>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString(13).charAt(0);
                productos.add(new Productos(cn.getRs().getInt(1)
                        ,cn.getRs().getString(2),cn.getRs().getString(3)
                        ,cn.getRs().getInt(4),cn.getRs().getFloat(5)
                        ,cn.getRs().getFloat(6),cn.getRs().getString(7)
                        ,cn.getRs().getString(8),cn.getRs().getString(9)
                        ,cn.getRs().getString(10),estatus,cn.getRs().getString(11)
                        ,cn.getRs().getString(12)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return productos;
    }
    
    @Override
    public LinkedList<Productos> obternerIdLaboratorios() {
        LinkedList<Productos> productos;
        try {
            cn.setPs(cn.getCn().prepareStatement("select nombre from Laboratorios"));
            cn.setRs(cn.getPs().executeQuery());
            productos = new LinkedList<>();
            
            while (cn.getRs().next()) {
                productos.add(new Productos(cn.getRs().getString(1)));
            }
            
            if(productos.size() <= 0){
                return null;
            }
                
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return productos;
    }
    
    @Override
    public LinkedList<Productos> obternerIdCategorias() {
        LinkedList<Productos> productos;
        try {
            cn.setPs(cn.getCn().prepareStatement("select nombre from Categorias"));
            cn.setRs(cn.getPs().executeQuery());
            productos = new LinkedList<>();
            
            while (cn.getRs().next()) {
                productos.add(new Productos(cn.getRs().getString(1)));
            }
            
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return productos;
    }
}
