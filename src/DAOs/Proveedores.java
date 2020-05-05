
package DAOs;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Proveedores {
    private int idProvedor;
    private String nombre;
    private String email;
    private String direccion;
    private String colonia;
    private String codPostall;
    //esta parte la use como cadena para poder obtener el nombre en vez del numero
    // Cualquier cosa Me avisan. 
    private String ciudad; 
    private char status;

    /**
     * Método para agregar un nuevo proveedor, el estatus no se coloca porque
     * en el método de ponerse como 'A'
     * @param idProvedor
     * @param nombre
     * @param email
     * @param direccion
     * @param colonia
     * @param codPostall
     * @param ciudad 
     */
    public Proveedores(int idProvedor, String nombre, String email, String direccion, String colonia, String codPostall, String ciudad) {
        this.idProvedor = idProvedor;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.colonia = colonia;
        this.codPostall = codPostall;
        this.ciudad = ciudad;
    }

    /**
     * Metodo usado para obtener el nombre del proveedor
     * NOTA: Es implementado para la interfaz agregar pedido
     * @param nombre 
     */
    public Proveedores(String nombre) {
        this.nombre = nombre;
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

    public String getDireccion() {
        return direccion;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCodPostall() {
        return codPostall;
    }

    public String getCiudad() {
        return ciudad;
    }

    public char getStatus() {
        return status;
    }
    
    
    
    
}
