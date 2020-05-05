
package DAOs;

public class Sucursales {
    private int idSucursal;
    private String nombre;
    private String telefono;
    private String direccion;
    private String colonia;
    private String codPostal;
    private float presupuesto;
    private char estatus;
    private String ciudad;

    public Sucursales(int idSucursal, String nombre, String telefono, String direccion, String colonia, String codPostal, float presupuesto, char estatus, String ciudad) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.colonia = colonia;
        this.codPostal = codPostal;
        this.presupuesto = presupuesto;
        this.estatus = estatus;
        this.ciudad = ciudad;
    }

    public Sucursales(String nombre, String telefono, String direccion, String colonia, String codPostal, float presupuesto, String ciudad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.colonia = colonia;
        this.codPostal = codPostal;
        this.presupuesto = presupuesto;
        this.ciudad = ciudad;
    }

    public Sucursales(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Sucursales(String nombre) {
        this.nombre = nombre;
    }
    
    
    

    public int getIdSucursal() {
        return idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public char getEstatus() {
        return estatus;
    }

    public String getCiudad() {
        return ciudad;
    }
    
}
