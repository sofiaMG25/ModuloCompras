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
public class ImagenesProducto {
    int idImagen;
    String  nombreImagen;
    byte[] imagen;
    char principal;
    char estatus;
    String idProducto;

    public ImagenesProducto(int idImagen, String nombreImagen, byte[] imagen, char principal, char estatus, String idProducto) {
        this.idImagen = idImagen;
        this.nombreImagen = nombreImagen;
        this.imagen = imagen;
        this.principal = principal;
        this.estatus = estatus;
        this.idProducto = idProducto;
    }

    public ImagenesProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public char getPrincipal() {
        return principal;
    }

    public void setPrincipal(char principal) {
        this.principal = principal;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
