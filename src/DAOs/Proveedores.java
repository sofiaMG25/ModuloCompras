
package DAOs;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Proveedores {
    private int idProvedor;
    private String nombre;
     private String Telefono;
    private String email;
    private String direccion;
    private String colonia;
    private String codPostall;
    private String IdCiudad;
    //esta parte la use como cadena para poder obtener el nombre en vez del numero
    // Cualquier cosa Me avisan. 
    private char status;

    public Proveedores(int idProvedor, String nombre, String Telefono, String email, String direccion, String colonia, String codPostall, String IdCiudad, char status) {
        this.idProvedor = idProvedor;
        this.nombre = nombre;
        this.Telefono = Telefono;
        this.email = email;
        this.direccion = direccion;
        this.colonia = colonia;
        this.codPostall = codPostall;
        this.IdCiudad = IdCiudad;
        this.status = status;
    }

    

    public Proveedores(String nombre, String email, String Telefono, String direccion, String colonia, String codPostall, String IdCiudad) {
        this.nombre = nombre;
        this.email = email;
        this.Telefono = Telefono;
        this.direccion = direccion;
        this.colonia = colonia;
        this.codPostall = codPostall;
        this.IdCiudad = IdCiudad;
        this.status = status;
    }
    
    

    /**
     * Metodo usado para obtener el nombre del proveedor
     * NOTA: Es implementado para la interfaz agregar pedido
     * @param nombre 
     */
    public Proveedores(String nombre) {
        this.nombre = nombre;
    }

    public Proveedores(String nombre, int a){
        this.IdCiudad = nombre;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCodPostall() {
        return codPostall;
    }

    public String getIdCiudad() {
        return IdCiudad;
    }

    public char getStatus() {
        return status;
    }

    

   
    
    
    
    
}
