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
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOProveedoresImp implements DAOProveedores {

    ConexionSQL cn = ConexionSQL.getInstance();

    @Override
    public void Insert(Proveedores nuevo) {
        String sql = "{call AgregarProveedor(?,?,?,?,?,?,?)}";
        String res = "";
        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setString(1,nuevo.getNombre());
            cn.getPs().setString(2,nuevo.getEmail());
            cn.getPs().setString(3,nuevo.getColonia());
            cn.getPs().setString(4,String.valueOf(nuevo.getTelefono()));
            cn.getPs().setString(5,nuevo.getDireccion());
            cn.getPs().setString(6,nuevo.getCodPostall());
            cn.getPs().setString(7,String.valueOf(nuevo.getIdCiudad()));
            
            cn.getPs().execute();
                System.out.println("El regisstro fue existoso.");
              cn.getPs().close();
              cn.getRs().close();
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error con el servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void upadate(Proveedores nuevo) {
        String sql = "{call EditarProveedor  (?,?,?,?,?,?)}";
        
        try {
             cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setString(1,nuevo.getNombre());
            cn.getPs().setString(2,nuevo.getEmail());
            cn.getPs().setString(3,nuevo.getColonia());
            cn.getPs().setString(4,String.valueOf(nuevo.getTelefono()));
            cn.getPs().setString(5,nuevo.getDireccion());
            cn.getPs().setString(6,nuevo.getCodPostall());
            cn.getPs().setString(7,String.valueOf(nuevo.getIdCiudad()));
            if(cn.getPs().execute()){
                System.out.println("Se actualizo con exito");
              cn.getPs().close();
              cn.getRs().close();
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
  
    }

    @Override
    public void delete(Proveedores nuevo) {
       String sql = "{call EliminarProveedor (?)}";
        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setString(1,String.valueOf(nuevo.getIdProvedor()));
            
            if(cn.getPs().execute()){
                System.out.println("Se elimino con exito");
               cn.getPs().close();
               cn.getRs().close();
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public LinkedList<Proveedores> show(int pagina) {
       LinkedList<Proveedores> proveedores;
        try {
            String sql = "select * from sf_paginarRegistroePROV (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            proveedores = new LinkedList<>();
            char estatus;
            while (cn.getRs().next()) {                
                estatus = cn.getRs().getString(8).charAt(0);
              proveedores.add(new Proveedores(cn.getRs().getInt(1)
                        ,cn.getRs().getString(2),cn.getRs().getString(3)
                        ,cn.getRs().getInt(4),cn.getRs().getString(5)
                        ,cn.getRs().getString(6),cn.getRs().getString(7),cn.getRs().getString(8),estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return proveedores;
        }

    
   
    public LinkedList<Proveedores> consultaInd(String nombre){
        LinkedList<Proveedores> proveedor;
        try {
            String sql = "{call sp_busquedaPorNombreProveedor(?)}";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setString(1, nombre);
            cn.setRs(cn.getPs().executeQuery());
            proveedor = new LinkedList<>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString(13).charAt(0);
                proveedor.add(new Proveedores(cn.getRs().getInt(1)
                        ,cn.getRs().getString(2), cn.getRs().getString(3)
                        ,cn.getRs().getInt(4),cn.getRs().getString(5),cn.getRs().getString(6)
                        ,cn.getRs().getString(7),cn.getRs().getString(8), estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return proveedor;
    }
    
    
    
    
    
    
    /**
     * Es método es utilizado para la interfaz Agregar Pedido
     *
     * @return
     */
    @Override
    public LinkedList<Proveedores> obtenerProveedores() {
        LinkedList<Proveedores> proveedores;
        try {
            String sql = "select nombre from dbo.Proveedores";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            proveedores = new LinkedList<Proveedores>();
            
            while (cn.getRs().next()) {
                proveedores.add(new Proveedores(cn.getRs().getString(1)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return proveedores;
    }
    
    public int contRegistros(){
        int cantRegistros = 0;
        try {
            String sql = "select count(idProveedor) as registros from dbo.Proveedor";
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
    
   
    
   
    
   
    
   
    
    
    public LinkedList<Proveedores> obtenerIdCiudad(){
        LinkedList<Proveedores> proveedor;
        try{
            cn.setPs(cn.getCn().prepareStatement("select nombre from Ciudades"));
            cn.setRs(cn.getPs().executeQuery());
            proveedor = new LinkedList<>();
            
            
            while(cn.getRs().next()){
                proveedor.add(new Proveedores(cn.getRs().getString(1)));
            }
            
            if(proveedor.size()<= 0){
                return null;
            }
            
            cn.getPs().close();
            cn.getRs().close();
            
        }catch(SQLException e ){
            System.out.println(e.getMessage());
            return null;
        }
        
        
        return proveedor;
    }

}
