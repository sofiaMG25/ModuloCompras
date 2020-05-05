/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.util.LinkedList;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOProveedoresImp implements DAOProveedores {

    ConexionSQL cn = ConexionSQL.getInstance();

    @Override
    public void Insert(Proveedores nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upadate(Proveedores nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Proveedores nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Proveedores> show(int pagina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return proveedores;
    }

}
