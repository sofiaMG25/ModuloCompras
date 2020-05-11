
package DAOs;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Proveedores {
    private int idProvedor;
    private String nombre;
    private String email;
    private int Telefono;
    private String direccion;
    private String colonia;
    private String codPostall;
    private String IdCiudad;
    //esta parte la use como cadena para poder obtener el nombre en vez del numero
    // Cualquier cosa Me avisan. 
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
    public Proveedores(int idProvedor, String nombre, String email,int Telefono, String direccion, String colonia, String codPostall, String IdCiudad,char status) {
        this.idProvedor = idProvedor;
        this.nombre = nombre;
        this.email = email;
        this.Telefono = Telefono;
        this.direccion = direccion;
        this.colonia = colonia;
        this.codPostall = codPostall;
        this.IdCiudad = IdCiudad;
        this.status = status;
    }

    public Proveedores(String nombre, String email, int Telefono, String direccion, String colonia, String codPostall, String IdCiudad) {
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

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodPostall() {
        return codPostall;
    }

    public void setCodPostall(String codPostall) {
        this.codPostall = codPostall;
    }

    public String getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(String IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

   
    
    
    
    
}
