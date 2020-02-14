package DAOLaboratorios;

import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
import java.util.LinkedList;


public class DAOLaboratoriosImp implements DAOLaboratorios {

    ConexionSQL conexion = ConexionSQL.getInstance();

    @Override
    public void Insert(Laboratorios nuevo) {
        String sql = "{call sp_insertarLaboratorio (?,?)}";
        try {
            conexion.setPs(conexion.getCn().prepareCall(sql));
            conexion.getPs().setString(1, nuevo.getNombre());
            conexion.getPs().setString(2, nuevo.getOrigen());
            conexion.setRs(conexion.getPs().executeQuery());
            while (conexion.getRs().next()) {
                System.out.println(conexion.getRs().getString(1).toString());
            }
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
           
        }

    }

    @Override
    public void upadate(Laboratorios nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Laboratorios nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Laboratorios> show() {
        LinkedList<Laboratorios> laboratorios;
        try {
            String sql = "SELECT * FROM laboratorios";
            conexion.setPs(conexion.getCn().prepareCall(sql));
            conexion.setRs(conexion.getPs().executeQuery());
            laboratorios = new LinkedList<Laboratorios>();
            while(conexion.getRs().next()){
                laboratorios.add(new Laboratorios(conexion.getRs().getInt("idLaboratorio")
                        ,conexion.getRs().getString("nombre"),conexion.getRs().getString("origen"),
                                                                                                    'A'));
            }
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return laboratorios;
    }

    
}
