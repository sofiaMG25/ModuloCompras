/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.util.LinkedList;
import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
/**
 *
 * @author Manuel
 */
public class DAOUnidadImp implements DAOUnidad{
    ConexionSQL cn =ConexionSQL.getInstance();
    @Override
    public void Insert(UnidadMedida nuevo) {
        String sql="call dbo.AgregarUnidad (?,?,?,?)";
        String res="";
        try {
          cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, nuevo.getNombre());
          cn.getPs().setString(2, String.valueOf(nuevo.getCapacidad()));
          cn.getPs().setString(3, "A");
          cn.getPs().setString(4, res);
          if(cn.getPs().execute())
                System.out.println("El registro fué exitoso.");
            cn.getPs().close();
            cn.getRs().close();
          
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public void upadate(UnidadMedida nuevo) {
        String sql="call dbo.EditarUnidad (?,?,?,?,?)";
       String res="";
        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, String.valueOf(nuevo.getId()));
          cn.getPs().setString(2, nuevo.getNombre());
          cn.getPs().setString(3, String.valueOf(nuevo.getCapacidad()));
          cn.getPs().setString(4, String.valueOf(nuevo.getEstatus()));
          cn.getPs().setString(5, res);
          if(cn.getPs().execute())
                System.out.println("Se actualizó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public void delete(UnidadMedida nuevo) {
        String sql="call dbo.EliminarUnidad (?,?)";
       String res="";
        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
          cn.getPs().setString(1, String.valueOf(nuevo.getId()));
          cn.getPs().setString(2, res);
          if(cn.getPs().execute())
                System.out.println("Se eliminó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public LinkedList<UnidadMedida> show() {
        LinkedList<UnidadMedida> unidad;
        try {
            String sql = "SELECT * FROM UnidadMedida";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            unidad = new LinkedList<UnidadMedida>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString("estatus").charAt(0);
                unidad.add(new UnidadMedida(cn.getRs().getInt("idUnidad")
                        ,cn.getRs().getString("nombre"),cn.getRs().getFloat("capacidad"),estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return unidad;
    }
    
    public LinkedList<UnidadMedida> consultaInd(String nombre){
        LinkedList<UnidadMedida> unidad;
        try {
            String sql = "SELECT * FROM UnidadMedida Where nombre="+"'"+nombre+"'";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            unidad = new LinkedList<UnidadMedida>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString("estatus").charAt(0);
                unidad.add(new UnidadMedida(cn.getRs().getInt("idUnidad")
                        ,cn.getRs().getString("nombre"),cn.getRs().getFloat("capacidad"),estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return unidad;
    }
}
