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
    String idPedido;
    String idPresentacion;

    public PedidoDetalle(int idPedidoDetalle, int CantPedida, float precioCompra, float subtotal, int cantRecibida, int cantRechazada, float cantAceptada, char estatus, String idPedido, String idPresentacion) {
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

    public PedidoDetalle(int CantPedida, float precioCompra, float subtotal, int cantRecibida, int cantRechazada, float cantAceptada, String idPedido, String idPresentacion) {
        this.CantPedida = CantPedida;
        this.precioCompra = precioCompra;
        this.subtotal = subtotal;
        this.cantRecibida = cantRecibida;
        this.cantRechazada = cantRechazada;
        this.cantAceptada = cantAceptada;
        this.idPedido = idPedido;
        this.idPresentacion = idPresentacion;
    }

    public PedidoDetalle(String idPedido) {
        this.idPedido = idPedido;
    }
    
    public PedidoDetalle(String idPresentacion, int a) {
        this.idPresentacion = idPresentacion;
    }
    
    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(String idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

    

    public int getIdPedidoDetalle() {
        return idPedidoDetalle;
    }

    public void setIdPedidoDetalle(int idPedidoDetalle) {
        this.idPedidoDetalle = idPedidoDetalle;
    }

    public int getCantPedida() {
        return CantPedida;
    }

    public void setCantPedida(int CantPedida) {
        this.CantPedida = CantPedida;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int getCantRecibida() {
        return cantRecibida;
    }

    public void setCantRecibida(int cantRecibida) {
        this.cantRecibida = cantRecibida;
    }

    public int getCantRechazada() {
        return cantRechazada;
    }

    public void setCantRechazada(int cantRechazada) {
        this.cantRechazada = cantRechazada;
    }

    public float getCantAceptada() {
        return cantAceptada;
    }

    public void setCantAceptada(float cantAceptada) {
        this.cantAceptada = cantAceptada;
    }

   
    
    
}
