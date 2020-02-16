package ConexionSQLServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionSQL {

    private String url = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=ERP2020;";
    private String user = "sa";
    private String password = "admin";
    //private String user = "DavidR";
    //private String password = "Hola.123"; 
    //private String user = "Parra";
    //private String password = "Hola.123"; 
    static ConexionSQL conexion = null;
    private Connection cn = null;
    private PreparedStatement ps;
    private Statement s;
    private ResultSet rs;

    public ConexionSQL() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(url, user, password);
            System.out.println("conectado..");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la BD:" + e.getMessage());
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }

    public static ConexionSQL getInstance() {
        if (conexion == null) {
            conexion = new ConexionSQL();
        }
        return conexion;
    }

    public Connection getCn() {
        return cn;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public Statement getS() {
        return s;
    }

    public void setS(Statement s) {
        this.s = s;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
    

    public void cerrar() {
        try {
            cn.close();
            conexion = null;
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion con la BD:" + e.getMessage());
        }
    }
}
