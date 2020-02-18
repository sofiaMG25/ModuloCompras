package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class DAOLaboratoriosImp implements DAOLaboratorios {

    ConexionSQL conexion = ConexionSQL.getInstance();

    @Override
    public void Insert(Laboratorios nuevo) {
        String sql = "{call sp_insertarLaboratorio (?,?)}";
        try {
            conexion.setPs(conexion.getCn().prepareCall(sql));
            conexion.getPs().setString(1, nuevo.getNombre());
            conexion.getPs().setString(2, nuevo.getOrigen());
            conexion.getPs().execute();
                JOptionPane.showMessageDialog(null,"El registro fué exitoso."
                        ,"Iniciando registro", JOptionPane.INFORMATION_MESSAGE);
                
//            conexion.setRs(conexion.getPs().executeQuery());
//            while (conexion.getRs().next()) {
//                System.out.println(conexion.getRs().getString(1).toString());
//            }
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
           
        }

    }

    @Override
    public void upadate(Laboratorios nuevo) {
        try {
            conexion.setPs(conexion.getCn().prepareCall("{call sp_actualizarLaboratorio (?,?,?,?)}"));
            conexion.getPs().setInt(1, nuevo.getId());
            conexion.getPs().setString(2, nuevo.getNombre());
            conexion.getPs().setString(3, nuevo.getOrigen());
            conexion.getPs().setString(4, String.valueOf(nuevo.getEstatus()));
            
            conexion.getPs().execute();
                JOptionPane.showMessageDialog(null,"Los datos se han actualizado con exito..."
                        ,"Actualizando", JOptionPane.INFORMATION_MESSAGE);
                
            conexion.getPs().close();
            conexion.getRs().close();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Laboratorios nuevo) {
        try {
            conexion.setPs(conexion.getCn().prepareCall("{call sp_eliminarLaboratorio (?)}"));
            conexion.getPs().setInt(1, nuevo.getId());
            conexion.getPs().execute();
                JOptionPane.showMessageDialog(null,"El registro fué eliminado."
                        ,"Eliminando", JOptionPane.INFORMATION_MESSAGE);
                
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error con el servidor",JOptionPane.ERROR_MESSAGE);
        }finally{
           
        }
        
    }

    @Override
    public LinkedList<Laboratorios> show() {
        LinkedList<Laboratorios> laboratorios;
        try {
            String sql = "SELECT * FROM laboratorios";
            conexion.setPs(conexion.getCn().prepareCall(sql));
            conexion.setRs(conexion.getPs().executeQuery());
            laboratorios = new LinkedList<Laboratorios>();
            char estatus;
            while (conexion.getRs().next()) {
                estatus = conexion.getRs().getString("estatus").charAt(0);
                laboratorios.add(new Laboratorios(conexion.getRs().getInt("idLaboratorio"),
                        conexion.getRs().getString("nombre"), conexion.getRs().getString("origen"),
                        estatus));
            }
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return laboratorios;
    }

    @Override
    public LinkedList<Laboratorios> busquedaPorNombre(String nombre) {
        try {
            conexion.setPs(conexion.getCn().prepareCall("{call sp_busquedaPorNombreLaboratorio (?) }"));
            conexion.getPs().setString(1, nombre);
            conexion.setRs(conexion.getPs().executeQuery());
            LinkedList<Laboratorios> lab = new LinkedList<Laboratorios>();
            char estatus;
            while(conexion.getRs().next()){
                estatus = conexion.getRs().getString("estatus").charAt(0);
                lab.add(new Laboratorios(conexion.getRs().getInt(1),conexion.getRs().getString(2)
                        , conexion.getRs().getString(3), estatus));
            }
            conexion.getPs().close();
            conexion.getRs().close();
            return lab;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error con servidor",e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }


    

}
