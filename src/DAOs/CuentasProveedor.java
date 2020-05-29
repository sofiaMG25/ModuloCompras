/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

/**
 *
 * @author adria
 */
public class CuentasProveedor {
    private int  idcuentaProveedor;
    private String proveedor;
    private String noCuenta;
    private String banco;
    private char estatus;

    public CuentasProveedor( String proveedor, String noCuenta, String banco) {
       
        this.proveedor = proveedor;
        this.noCuenta = noCuenta;
        this.banco = banco;
    }

    public CuentasProveedor(int idcuentaProveedor, String proveedor, String noCuenta, String banco, char estatus) {
        this.idcuentaProveedor = idcuentaProveedor;
        this.proveedor = proveedor;
        this.noCuenta = noCuenta;
        this.banco = banco;
        this.estatus = estatus;
    }

    public CuentasProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    

    public int getIdcuentaProveedor() {
        return idcuentaProveedor;
    }

    public void setIdcuentaProveedor(int idcuentaProveedor) {
        this.idcuentaProveedor = idcuentaProveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }
    
    
    
}
