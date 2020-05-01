/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

/**
 *
 * @author Manuel
 */
public class Productos {
    private int id;
    private String nombre;
    private String descripcion;
    private int puntoReorden;
    private float precioCompra;
    private float precioVenta;
    private String ingredienteActivo;
    private String bandaToxicologica;
    private String aplicacion;
    private String uso;
    private char estatus;
    private String idLab;
    private String idCat;

    public Productos(int id, String nombre, String descripcion, int puntoReorden, float precioCompra, float precioVenta, String ingredienteActivo, String bandaToxicologica, String aplicacion, String uso,char estatus, String idLab, String idCat) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puntoReorden = puntoReorden;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.ingredienteActivo = ingredienteActivo;
        this.bandaToxicologica = bandaToxicologica;
        this.aplicacion = aplicacion;
        this.uso = uso;
        this.estatus = estatus;
        this.idLab = idLab;
        this.idCat = idCat;
    }

    public Productos(String nombre, String descripcion, int puntoReorden, float precioCompra, float precioVenta, String ingredienteActivo, String bandaToxicologica, String aplicacion, String uso,String idLab, String idCat) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puntoReorden = puntoReorden;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.ingredienteActivo = ingredienteActivo;
        this.bandaToxicologica = bandaToxicologica;
        this.aplicacion = aplicacion;
        this.uso = uso;
        this.estatus = estatus;
        this.idLab = idLab;
        this.idCat = idCat;
    }

    public Productos(String nombre) {
        this.idLab = nombre;
    }

    public Productos(String nombre,int a) {
        this.idCat = nombre;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntoReorden() {
        return puntoReorden;
    }

    public void setPuntoReorden(int puntoReorden) {
        this.puntoReorden = puntoReorden;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getIngredienteActivo() {
        return ingredienteActivo;
    }

    public void setIngredienteActivo(String ingredienteActivo) {
        this.ingredienteActivo = ingredienteActivo;
    }

    public String getBandaToxicologica() {
        return bandaToxicologica;
    }

    public void setBandaToxicologica(String bandaToxicologica) {
        this.bandaToxicologica = bandaToxicologica;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

    public String getIdLab() {
        return idLab;
    }

    public void setIdLab(String idLab) {
        this.idLab = idLab;
    }

    public String getIdCat() {
        return idCat;
    }

    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }

    
    
}
