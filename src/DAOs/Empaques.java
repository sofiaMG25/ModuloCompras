
package DAOs;

public class Empaques {
    private int idEmpaque;
    private String nombre;
    private float capacidad;
    private char estatus;
    private String idUnidad;

    public Empaques(int idEmpaque) {
        this.idEmpaque = idEmpaque;
    }
    
    

    public Empaques(int idEmpaque, String nombre, float capacidad, char estatus, String idUnidad) {
        this.idEmpaque  = idEmpaque;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estatus = estatus;
        this.idUnidad = idUnidad;
    }

    public Empaques(String nombre, float capacidad, String idUnidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.idUnidad = idUnidad;
    }

   

    public Empaques(String idUnidad) {
        this.idUnidad = idUnidad;
    }
    
    

    public int getIdEmpaque() {
        return idEmpaque;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public char getEstatus() {
        return estatus;
    }

    public String getIdUnidad() {
        return idUnidad;
    }
    
    
}
