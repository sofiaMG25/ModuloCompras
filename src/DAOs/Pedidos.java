
package DAOs;

import java.util.Date;


public class Pedidos {
    private int idpedido;
    private Date fecharegistro;
    private Date fechaRecepcion;
    private float totalpagar;
    private float cantidadpagada;
    private char estatus;
    private String idproveedor;
    private String idSucursal;
    private String idEmpleado;

    public Pedidos(Date fecharegistro, Date fechaRecepcion, float totalpagar, float cantidadpagada, String idproveedor, String idSucursal, String idEmpleado) {
        this.fecharegistro = fecharegistro;
        this.fechaRecepcion = fechaRecepcion;
        this.totalpagar = totalpagar;
        this.cantidadpagada = cantidadpagada;
        this.idproveedor = idproveedor;
        this.idSucursal = idSucursal;
        this.idEmpleado = idEmpleado;
    }

    public Pedidos(int idpedido, Date fecharegistro, Date fechaRecepcion, float totalpagar, float cantidadpagada, char estatus, String idproveedor, String idSucursal, String idEmpleado) {
        this.idpedido = idpedido;
        this.fecharegistro = fecharegistro;
        this.fechaRecepcion = fechaRecepcion;
        this.totalpagar = totalpagar;
        this.cantidadpagada = cantidadpagada;
        this.estatus = estatus;
        this.idproveedor = idproveedor;
        this.idSucursal = idSucursal;
        this.idEmpleado = idEmpleado;
    }

    public Pedidos(int idpedido, Date fecharegistro, Date fechaRecepcion, float totalpagar, float cantidadpagada) {
        this.idpedido = idpedido;
        this.fecharegistro = fecharegistro;
        this.fechaRecepcion = fechaRecepcion;
        this.totalpagar = totalpagar;
        this.cantidadpagada = cantidadpagada;
    }

    
    
    public int getIdpedido() {
        return idpedido;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public float getTotalpagar() {
        return totalpagar;
    }

    public float getCantidadpagada() {
        return cantidadpagada;
    }

    public char getEstatus() {
        return estatus;
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public String getIdSucursal() {
        return idSucursal;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }
    
    
    
}
