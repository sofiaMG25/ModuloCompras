
package DAOs;
public class Laboratorios {
    private int id;
    private String nombre;
    private String origen;
    private char estatus;

    public Laboratorios(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
    }

    public Laboratorios(int id, String nombre, String origen, char estatus) {
        this.id = id;
        this.nombre = nombre;
        this.origen = origen;
        this.estatus = estatus;
    }
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }
    
    
}
