package DAOs;

import ConexionSQLServer.ConexionSQL;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class DAOEmpaquesImp implements DAOEmpaques {

    ConexionSQL conexion = ConexionSQL.getInstance();

    @Override
    public void Insert(Empaques nuevo) {
        String sql = "{call sp_insertarEmpaque (?,?,?)}";
        try {
            conexion.setPs(conexion.getCn().prepareCall(sql));
            conexion.getPs().setString(1, nuevo.getNombre());
            conexion.getPs().setFloat(2, nuevo.getCapacidad());
            conexion.getPs().setString(3,nuevo.getIdUnidad());
            conexion.getPs().execute();
                JOptionPane.showMessageDialog(null,"El registro fué exitoso."
                        ,"Iniciando registro", JOptionPane.INFORMATION_MESSAGE);
                
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error con el servidor",JOptionPane.ERROR_MESSAGE);
        }finally{
           
        }
    }

    @Override
    public void upadate(Empaques nuevo) {
       try {
            conexion.setPs(conexion.getCn().prepareCall("{call actualizarEmpaque(?,?,?,?,?)}"));
            conexion.getPs().setInt(1, nuevo.getIdEmpaque());
            conexion.getPs().setString(2, nuevo.getNombre());
            conexion.getPs().setFloat(3, nuevo.getCapacidad());
            conexion.getPs().setString(4, String.valueOf(nuevo.getEstatus()));
            conexion.getPs().setString(5, nuevo.getIdUnidad());
            
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
    public void delete(Empaques nuevo) {
        try {
            conexion.setPs(conexion.getCn().prepareCall("{call sp_eliminarEmpaque (?)}"));
            conexion.getPs().setInt(1, nuevo.getIdEmpaque());
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
    public LinkedList<Empaques> show(int pagina) {
        LinkedList<Empaques> empaques;
        try {
            conexion.setPs(conexion.getCn().prepareCall("{call sp_busquedaEmpaques ()}"));
            conexion.setRs(conexion.getPs().executeQuery());
            empaques = new LinkedList<Empaques>();
            char estatus;
            while (conexion.getRs().next()) {
                estatus = conexion.getRs().getString(4).charAt(0);
                empaques.add(new Empaques(conexion.getRs().getInt(1), 
                        conexion.getRs().getString(2), 
                        conexion.getRs().getFloat(3), 
                        estatus, conexion.getRs().getString(5)));
            }
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return empaques;
    }

    @Override
    public LinkedList<Empaques> obternerIdunidades() {
        LinkedList<Empaques> empaques;
        try {
            conexion.setPs(conexion.getCn().prepareStatement("select nombre from UnidadMedida"));
            conexion.setRs(conexion.getPs().executeQuery());
            empaques = new LinkedList<Empaques>();
            
            while (conexion.getRs().next()) {
                empaques.add(new Empaques(conexion.getRs().getString(1)));
            }
            
            if(empaques.size() <= 0){
                return null;
            }
                
            conexion.getPs().close();
            conexion.getRs().close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return empaques;
    }

    @Override
    public LinkedList<Empaques> busquedaPorNombre(String nombre) {
        try {
            conexion.setPs(conexion.getCn().prepareCall("{call sp_busquedaPorNombreEmpaque (?) }"));
            conexion.getPs().setString(1, nombre);
            conexion.setRs(conexion.getPs().executeQuery());
            LinkedList<Empaques> emp = new LinkedList<Empaques>();
            char estatus;
            while(conexion.getRs().next()){
                estatus = conexion.getRs().getString(4).charAt(0);
                emp.add(new Empaques(conexion.getRs().getInt(1), 
                        conexion.getRs().getString(2),conexion.getRs().getFloat(3), 
                        estatus,conexion.getRs().getString(5)));
            }
            conexion.getPs().close();
            conexion.getRs().close();
            return emp;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error con servidor",e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    

}
