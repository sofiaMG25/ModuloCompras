package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class DAOPedidosImp implements DAOPedidos {

    ConexionSQL cn = ConexionSQL.getInstance();

    @Override
    public void Insert(Pedidos nuevo) {
//        if (nuevo.getCantidadpagada() == 0) //{
        String sql = "{call sp_AgregarPedido (?,?,?,?,?,?,?)}";
        try {
            Date fecharReg = new Date(nuevo.getFecharegistro().getTime());
            Date fecharRecp = new Date(nuevo.getFechaRecepcion().getTime());
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setDate(1, fecharReg);
            cn.getPs().setDate(2, fecharRecp);
            cn.getPs().setFloat(3, nuevo.getTotalpagar());
            cn.getPs().setFloat(4, nuevo.getCantidadpagada());
            cn.getPs().setString(5, nuevo.getIdproveedor());
            cn.getPs().setString(6, nuevo.getIdSucursal());
            cn.getPs().setString(7, nuevo.getIdEmpleado());
            cn.getPs().execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso", "Registrando", JOptionPane.INFORMATION_MESSAGE);

            cn.getPs().close();
            cn.getRs().close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void upadate(Pedidos nuevo) {
        String sql = "{call EditarPedido (?,?,?,?,?,?,?,?,?)}";

        try {
            Date fechaReg = new Date(nuevo.getFecharegistro().getTime());
            Date fechaRecep = new Date(nuevo.getFechaRecepcion().getTime());
            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setInt(1, nuevo.getIdpedido());
            cn.getPs().setDate(2, fechaReg);
            cn.getPs().setDate(3, fechaRecep);
            cn.getPs().setFloat(4, nuevo.getTotalpagar());
            cn.getPs().setFloat(5, nuevo.getCantidadpagada());
            cn.getPs().setString(6, String.valueOf(nuevo.getEstatus()));
            cn.getPs().setString(7, nuevo.getIdproveedor());
            cn.getPs().setString(8, nuevo.getIdSucursal());
            cn.getPs().setString(9, nuevo.getIdEmpleado());
            cn.getPs().execute();

            System.out.println("Se actualizó con éxito.");
            cn.getPs().close();
            cn.getRs().close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    @Override
    public void delete(Pedidos nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Pedidos> show(int pagina) {
        LinkedList<Pedidos> pedidos = null;
        try {
            String sql = "select * from sf_paginarRegistrosePed (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            pedidos = new LinkedList<Pedidos>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(6).charAt(0);
                pedidos.add(new Pedidos(cn.getRs().getInt(1), cn.getRs().getDate(2), cn.getRs().getDate(3),
                        cn.getRs().getFloat(4), cn.getRs().getFloat(5), estatus,
                        cn.getRs().getString(7), cn.getRs().getString(8), cn.getRs().getString(9)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pedidos;

    }

    @Override
    public LinkedList<Pedidos> busquedaPorID(int id) {
        LinkedList<Pedidos> pedidos = null;
        try {
            String sql = "select * from Pedidos where idPedido = ? and estatus = 'A'";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, id);
            cn.setRs(cn.getPs().executeQuery());
            pedidos = new LinkedList<Pedidos>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(6).charAt(0);
                pedidos.add(new Pedidos(cn.getRs().getInt(1), cn.getRs().getDate(2), cn.getRs().getDate(3),
                        cn.getRs().getFloat(4), cn.getRs().getFloat(5), estatus,
                        cn.getRs().getString(7), cn.getRs().getString(8), cn.getRs().getString(9)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pedidos;
    }

    @Override
    public LinkedList<String> obtenerEmpleados() {
        LinkedList<String> Empleados;
        try {
            String sql = "select nombre, apaterno, amaterno from dbo.Empleados";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.setRs(cn.getPs().executeQuery());
            Empleados = new LinkedList<String>();

            while (cn.getRs().next()) {
                Empleados.add(cn.getRs().getString(1) + " " + cn.getRs().getString(2)
                        + " " + cn.getRs().getString(3));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return Empleados;
    }

    @Override
    public LinkedList<Pedidos> pedidosPagados(int pagina) {
        LinkedList<Pedidos> pedidos = null;
        try {
            String sql = "select * from sf_paginarRegistrosPagadosPedidos (?)";
            cn.setPs(cn.getCn().prepareCall(sql));
            cn.getPs().setInt(1, pagina);
            cn.setRs(cn.getPs().executeQuery());
            pedidos = new LinkedList<Pedidos>();
            char estatus;
            while (cn.getRs().next()) {
                estatus = cn.getRs().getString(6).charAt(0);
                pedidos.add(new Pedidos(cn.getRs().getInt(1), cn.getRs().getDate(2), cn.getRs().getDate(3),
                        cn.getRs().getFloat(4), cn.getRs().getFloat(5), estatus,
                        cn.getRs().getString(7), cn.getRs().getString(8), cn.getRs().getString(9)));
            }
            cn.getPs().close();
            cn.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pedidos;
    }

    @Override
    public int contarRegistros() {
        int cantRegistros = 0;
        try {
            String sql = "select count(idPedido) as registros from dbo.Pedidos ";
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
    public int contarRegistroPagados() {
        int cantRegistros = 0;
        try {
            String sql = "select count(idPedido) as registros from dbo.Pedidos where totalPagar = cantidadPagada";
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
    public int pagarAbono(int id, float abono) {
        String sql = "{call sp_pagarAbonoPedido (?,?)}";
        try {

            cn.setPs(cn.getCn().prepareStatement(sql));
            cn.getPs().setInt(1, id);
            cn.getPs().setFloat(2, abono);
            cn.getPs().execute();

            JOptionPane.showMessageDialog(null, "Pago exitoso", "Pagando", JOptionPane.INFORMATION_MESSAGE);

            cn.getPs().close();
            cn.getRs().close();
            return 0;
        } catch (SQLException e) {
            return 1;
        }
    }
}
