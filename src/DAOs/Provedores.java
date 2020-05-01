/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOs;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Provedores {
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
    public Provedores(int idProvedor, String nombre, String email, String direccion, String colonia, String codPostall, String ciudad) {
        this.idProvedor = idProvedor;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.colonia = colonia;
        this.codPostall = codPostall;
        this.ciudad = ciudad;
    }

    /** 
     * Este método se utiliza para obtener los datos y colocarlos en la tabla
     * NOTA: no debe usarse para agregar un nuevo proveedor.
     * @param idProvedor
     * @param nombre
     * @param email
     * @param direccion
     * @param colonia
     * @param codPostall
     * @param ciudad
     * @param status 
     */
    public Provedores(int idProvedor, String nombre, String email, String direccion, String colonia, String codPostall, String ciudad, char status) {
        this.idProvedor = idProvedor;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.colonia = colonia;
        this.codPostall = codPostall;
        this.ciudad = ciudad;
        this.status = status;
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
