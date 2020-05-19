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
public class PedidoDetalle {
    int idPedidoDetalle;
    int CantPedida;
    float precioCompra;
    float subtotal;
    int cantRecibida;
    int cantRechazada;
    float cantAceptada;
    char estatus;
    int idPedido;
    int idPresentacion;

    public PedidoDetalle(int idPedidoDetalle, int CantPedida, float precioCompra, float subtotal, int cantRecibida, int cantRechazada, float cantAceptada, char estatus, int idPedido, int idPresentacion) {
        this.idPedidoDetalle = idPedidoDetalle;
        this.CantPedida = CantPedida;
        this.precioCompra = precioCompra;
        this.subtotal = subtotal;
        this.cantRecibida = cantRecibida;
        this.cantRechazada = cantRechazada;
        this.cantAceptada = cantAceptada;
        this.estatus = estatus;
        this.idPedido = idPedido;
        this.idPresentacion = idPresentacion;
    }

    public PedidoDetalle(int CantPedida, float precioCompra, float subtotal, int cantRecibida, int cantRechazada, float cantAceptada, int idPedido, int idPresentacion) {
        this.CantPedida = CantPedida;
        this.precioCompra = precioCompra;
        this.subtotal = subtotal;
        this.cantRecibida = cantRecibida;
        this.cantRechazada = cantRechazada;
        this.cantAceptada = cantAceptada;
        this.idPedido = idPedido;
        this.idPresentacion = idPresentacion;
    }
    
   public PedidoDetalle(int idPedido){
       this.idPedido = idPedido;
   }
   
   public PedidoDetalle(int idPresentacion,int nothing){
       this.idPresentacion = idPresentacion;
   }
    
    
    
    
    public int getIdPedidoDetalle() {
        return idPedidoDetalle;
    }

    public int getCantPedida() {
        return CantPedida;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public int getCantRecibida() {
        return cantRecibida;
    }

    public int getCantRechazada() {
        return cantRechazada;
    }

    public float getCantAceptada() {
        return cantAceptada;
    }

    public char getEstatus() {
        return estatus;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public int getIdPresentacion() {
        return idPresentacion;
    }

  

   
    
    
}
