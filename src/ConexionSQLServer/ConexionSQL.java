
package ConexionSQLServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
   private String url="jdbc:sqlserver://localhost:1433;" +
			"databaseName=ERP2020;integratedSecurity=true;";
	private String user="root";
	private String password="root";
	static ConexionSQL conexion=null;
	private Connection cn=null;
	private ConexionSQL(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection(url,user,password);
		}
		catch(SQLException e){
			System.out.println("Error al conectar con la BD:"+e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ConexionSQL getInstance(){
		if(conexion==null){
			conexion=new ConexionSQL();
		}
		return conexion;
	}
	public Connection getCn(){
		return cn;
	}
	public void cerrar(){
		try{
			cn.close();
			conexion=null;
		}
		catch(SQLException e){
			System.out.println("Error al cerrar la conexion con la BD:"+e.getMessage());
		}
	}
}
