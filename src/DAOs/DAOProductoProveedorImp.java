package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class DAOProductoProveedorImp implements DAOProductoProveedor {

    ConexionSQL cn = ConexionSQL.getInstance();

    @Override
    public LinkedList<ProductoProveedor> obtenerIdProveedor() {
         LinkedList<ProductoProveedor> proveedor;
        try {
            cn.setPs(cn.getCn().prepareStatement("select nombre from dbo.Proveedores"));
            cn.setRs(cn.getPs().executeQuery());
            proveedor = new LinkedList<>();

            while (cn.getRs().next()) {
                proveedor.add(new ProductoProveedor(cn.getRs().getString(1)));
                //proveedor.add(new ProductoProveedor(cn.getRs().getString(1)));
            }

            if (proveedor.size() <= 0) {
                return null;
            }

            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return proveedor;
    }

    @Override
    public LinkedList<ProductoProveedor> obtenerIdProducto() {
        LinkedList<ProductoProveedor> producto;
        try {
            cn.setPs(cn.getCn().prepareStatement("select * from dbo.PresentacionesProductos"));
            cn.setRs(cn.getPs().executeQuery());
            producto = new LinkedList<ProductoProveedor>();

            while (cn.getRs().next()) {
                producto.add(new ProductoProveedor(0, cn.getRs().getString(1)));
            }

            if (producto.size() <= 0) {
                return null;
            }

            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return producto;
    }


    @Override
    public int contRegistro() {
         int cantRegistros = 0;
        try {
            String sql = "select count(idProveedor) as registros from dbo.ProductosProveedor ";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            while (cn.getRs().next()) {
                cantRegistros = cn.getRs().getInt(1);
            }
            cn.getPs().close();
            cn.getRs().close();
            return cantRegistros;
        } catch (Exception e) {
            System.out.println("malo"+e.getMessage());
        }
        return cantRegistros;
    }

    @Override
    public void Insert(ProductoProveedor nuevo) {
        String sql = "{call sp_agregarProdProveedor (?,?,?,?,?,?,?)}";
        try {
            
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setString(1, nuevo.getIdProveedor());
            cn.getPs().setInt(2, Integer.parseInt(nuevo.getIdProductos()));
            cn.getPs().setInt(3, nuevo.getDiasRetardo());
            cn.getPs().setFloat(4, nuevo.getPrecioEstandar());
            cn.getPs().setFloat(5, nuevo.getPrecioUltCompra());
            cn.getPs().setInt(6, nuevo.getCantMinPedir());
            cn.getPs().setInt(7, nuevo.getCantMaxPedir());
            
            cn.getPs().execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso", "Registrando", JOptionPane.INFORMATION_MESSAGE);

            cn.getPs().close();
            cn.getRs().close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void upadate(ProductoProveedor nuevo) {
        String sql = "{call sp_editarProdProveedor(?, ?, ?, ?, ?, ?, ? , ? )}";
        try {
            
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setString(1, nuevo.getIdProveedor());
            cn.getPs().setString(2, nuevo.getIdProductos());
            cn.getPs().setInt(3, nuevo.getDiasRetardo());
            cn.getPs().setFloat(4, nuevo.getPrecioEstandar());
            cn.getPs().setFloat(5, nuevo.getPrecioUltCompra());
            cn.getPs().setInt(6, nuevo.getCantMinPedir());
            cn.getPs().setInt(7, nuevo.getCantMaxPedir());
            cn.getPs().setString(8,String.valueOf(nuevo.getEstatus()));
            cn.getPs().execute();

            JOptionPane.showMessageDialog(null, "Se actualizo con exito", "actualizando", JOptionPane.INFORMATION_MESSAGE);

            cn.getPs().close();
            cn.getRs().close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(ProductoProveedor nuevo) {
        String sql = "{call sp_eliminarProdProveedor (?)}";//agregar sp en la bd 1sp_eliminarPresentacion 
        try {
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setString(1, String.valueOf(nuevo.getIdProductos()));

            if (cn.getPs().execute()) {
                System.out.println("Se eliminó con éxito.");
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    @Override
    public LinkedList<ProductoProveedor> show(int pagina) {
        LinkedList<ProductoProveedor> prodProveedor = null;
        try {
            String sql = "select * from sf_paginarProdProveedor(?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            prodProveedor = new LinkedList<ProductoProveedor>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(8).charAt(0);
                prodProveedor.add(new ProductoProveedor
                    (cn.getRs().getString(1),
                     cn.getRs().getString(2), 
                     cn.getRs().getInt(3),
                     cn.getRs().getInt(4),
                     cn.getRs().getInt(5), 
                     cn.getRs().getInt(6), 
                     cn.getRs().getInt(7), 
                     estatus));
         
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return prodProveedor;
    }

}
