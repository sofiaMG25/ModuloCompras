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
public class DAOSucursalesImp implements DAOSucursales {

    ConexionSQL cn = ConexionSQL.getInstance();

    @Override
    public int contRegistros() {
        int cantRegistros = 0;
        try {
            String sql = "select count(idSucursal) as registros from dbo.Sucursales ";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            while (cn.getRs().next()) {
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
    public void Insert(Sucursales nuevo) {
        String sql = "{call sp_agregarSucucusal (?,?,?,?,?,?,?)}";
        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setString(1, nuevo.getNombre());
            cn.getPs().setString(2, nuevo.getTelefono());
            cn.getPs().setString(3, nuevo.getDireccion());
            cn.getPs().setString(4, nuevo.getColonia());
            cn.getPs().setString(5, nuevo.getCodPostal());
            cn.getPs().setFloat(6, nuevo.getPresupuesto());
            cn.getPs().setString(7, nuevo.getCiudad());
            cn.getPs().execute();
            JOptionPane.showMessageDialog(null, "El registro fué exitoso", "Registrando sucursal", JOptionPane.QUESTION_MESSAGE);
            cn.getPs().close();
            cn.getRs().close();

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    @Override
    public void upadate(Sucursales nuevo) {
        String sql = "{call dbo.EditarSucursales (?,?,?,?,?,?,?,?,?)}";

        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setInt(1, nuevo.getIdSucursal());
            cn.getPs().setString(2, nuevo.getNombre());
            cn.getPs().setString(3, nuevo.getTelefono());
            cn.getPs().setString(4, nuevo.getDireccion());
            cn.getPs().setString(5, nuevo.getColonia());
            cn.getPs().setString(6, nuevo.getCodPostal());
            cn.getPs().setFloat(7, nuevo.getPresupuesto());
            cn.getPs().setString(8, String.valueOf(nuevo.getEstatus()));
            cn.getPs().setString(9, nuevo.getCiudad());

            cn.getPs().execute();
            System.out.println("Se actualizó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    @Override
    public void delete(Sucursales nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Sucursales> show(int pagina) {
        LinkedList<Sucursales> Sucursales;
        try {
            String sql = "select * from sf_paginarRegistrosSUC (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            Sucursales = new LinkedList<Sucursales>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(8).charAt(0);
                Sucursales.add(new Sucursales(cn.getRs().getInt(1), cn.getRs().getString(2), cn.getRs().getString(3),
                        cn.getRs().getString(4), cn.getRs().getString(5), cn.getRs().getString(6), cn.getRs().getFloat(7),
                        estatus, cn.getRs().getString(9)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return Sucursales;
    }

    @Override
    public LinkedList<String> obtenerCiudades() {
        LinkedList<String> ciudades = null;
        try {
            cn.setPs(cn.getCn().prepareCall("{ call sp_obtenerCiudades }"));
            cn.setRs(cn.getPs().executeQuery());
            ciudades = new LinkedList<>();
            while (cn.getRs().next()) {
                ciudades.add(cn.getRs().getString(1));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ciudades;
    }

    @Override
    public LinkedList<Sucursales> consultaInd(String nombre) {
        LinkedList<Sucursales> sucursales = null;
        try {
            String sql = "{call sp_busquedaPorNombreSucursal (?)}";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setString(1, nombre);
            cn.setRs(cn.getPs().executeQuery());
            sucursales = new LinkedList<Sucursales>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(8).charAt(0);
                sucursales.add(new Sucursales(cn.getRs().getInt(1),
                        cn.getRs().getString(2), cn.getRs().getString(3), cn.getRs().getString(4),
                        cn.getRs().getString(5), cn.getRs().getString(6), cn.getRs().getFloat(7),
                        estatus, cn.getRs().getString(9)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return sucursales;
    }

    @Override
    public LinkedList<Sucursales> obtenerSucursales() {
        LinkedList<Sucursales> sucursales;
        try {
            String sql = "select nombre from dbo.Sucursales";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            sucursales = new LinkedList<Sucursales>();
            
            while (cn.getRs().next()) {
               sucursales.add(new Sucursales(cn.getRs().getString(1)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return sucursales;
    }

}
