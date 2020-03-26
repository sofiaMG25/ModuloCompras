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
public class ExistenciaSucursal {

    private int idPresentacion;
    private int idSucursal;
    private int cantidad;
    private char estado;

    public ExistenciaSucursal(int idPresentacion, int idSucursal, int cantidad) {
        this.idPresentacion = idPresentacion;
        this.idSucursal = idSucursal;
        this.cantidad = cantidad;
    }

    public ExistenciaSucursal(int idPresentacion, int idSucursal, int cantidad, char estado) {
        this.idPresentacion = idPresentacion;
        this.idSucursal = idSucursal;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public ExistenciaSucursal(int idPresentacion, int idSucursal) {
        this.idPresentacion = idPresentacion;
        this.idSucursal = idSucursal;
    }

    
    public int getIdPresentacion() {
        return idPresentacion;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public char getEstado() {
        return estado;
    }

    
    
    

   
    
    
}
