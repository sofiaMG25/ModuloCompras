package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
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
    public LinkedList<ProductoProveedor> obtenerIdPresentaciones() {
         LinkedList<ProductoProveedor> producto;
        try {
            cn.setPs(cn.getCn().prepareStatement("select idPresentacion from dbo.PresentacionesProductos"));
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
    public LinkedList<ProductoProveedor> busquedaPorNombre(int id) {
                 try {
            cn.setPs(cn.getCn().prepareCall("{call sp_busquedaPorNombrepProvedor (?) }"));
            cn.getPs().setInt(1, id);
            cn.setRs(cn.getPs().executeQuery());
            LinkedList<ProductoProveedor> prodProv = new LinkedList<ProductoProveedor>();
            char estatus;
            while(cn.getRs().next()){
                estatus = cn.getRs().getString("estatus").charAt(0);
                prodProv.add(new ProductoProveedor(cn.getRs().getString(1),cn.getRs().getString(2)
                        , Integer.parseInt(cn.getRs().getString(3)) , Float.parseFloat(cn.getRs().getString(4)),
                        Float.parseFloat(cn.getRs().getString(5)),Integer.parseInt(cn.getRs().getString(6)),
                        Integer.parseInt(cn.getRs().getString(7)),estatus));
            }
            cn.getPs().close();
            cn.getRs().close();
            return prodProv;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error con servidor",e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return null;

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
            cn.getPs().setString(2, nuevo.getIdPresentaciones());
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
        try {
            cn.setPs(cn.getCn().prepareCall("{call sp_editarProdProveedor(?, ?, ?, ?, ?, ?, ?, ?)}"));// aggregar en ka bd 1sp_actualizarPresentacion
            cn.getPs().setString(1, nuevo.getIdProveedor());
            cn.getPs().setString(2, nuevo.getIdPresentaciones());
            cn.getPs().setInt(3, nuevo.getDiasRetardo());
            cn.getPs().setFloat(4, nuevo.getPrecioEstandar());
            cn.getPs().setFloat(5, nuevo.getPrecioUltCompra());
            cn.getPs().setInt(6, nuevo.getCantMinPedir());
            cn.getPs().setInt(7, nuevo.getCantMaxPedir());
            cn.getPs().setString(8, String.valueOf(nuevo.getEstatus()));
            cn.getPs().execute();
                JOptionPane.showMessageDialog(null,"Los datos se han actualizado con exito..."
                        ,"Actualizando", JOptionPane.INFORMATION_MESSAGE);
                
            cn.getPs().close();
            cn.getRs().close();  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se actualizaron "+ ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(ProductoProveedor nuevo) {
         try {
            cn.setPs(cn.getCn().prepareCall("{call sp_eliminarProductoProvee (?)}"));
            cn.getPs().setString(1, nuevo.getIdProveedor());
            cn.getPs().execute();
                JOptionPane.showMessageDialog(null,"El registro fué eliminado."
                        ,"Eliminando", JOptionPane.INFORMATION_MESSAGE);
                
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error con el servidor",JOptionPane.ERROR_MESSAGE);
        }finally{
           
        }
    }

    @Override
    public LinkedList<ProductoProveedor> show(int pagina) {
        LinkedList<ProductoProveedor> prodProveedor;
        try {
            String sql = "SELECT * FROM sf_paginarProdProveedor (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            prodProveedor = new LinkedList<ProductoProveedor>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(8).charAt(0);
                prodProveedor.add(new ProductoProveedor(cn.getRs().getString(1), 
                        cn.getRs().getString(2),cn.getRs().getInt(3), 
                        cn.getRs().getFloat(4), cn.getRs().getFloat(5),
                        cn.getRs().getInt(6),cn.getRs().getInt(7),
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
