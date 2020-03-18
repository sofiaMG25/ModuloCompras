package DAOs;

public class Presentaciones {
    private int idPP;
    private float pCompra;
    private float pVenta;
    private float pReorden;
    private String idProducto;
    private String idEmpaque;
    private char estatus;

    public Presentaciones(int idPP, float pCompra, float pVenta, float pReorden, String idProducto, String idEmpaque, char estatus) {
        this.idPP = idPP;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
        this.pReorden = pReorden;
        this.idProducto = idProducto;
        this.idEmpaque = idEmpaque;
        this.estatus = estatus;
    }

    public Presentaciones(float pCompra, float pVenta, float pReorden, String idProducto, String idEmpaque) {
        this.pCompra = pCompra;
        this.pVenta = pVenta;
        this.pReorden = pReorden;
        this.idProducto = idProducto;
        this.idEmpaque = idEmpaque;
    }
    

    public Presentaciones(String idProducto) {
        this.idProducto = idProducto;
    }

    public Presentaciones(int e, String idEmpaque) {
        this.idEmpaque = idEmpaque;
    }

    public int getIdPP() {
        return idPP;
    }

    public void setIdPP(int idPP) {
        this.idPP = idPP;
    }

    public float getpCompra() {
        return pCompra;
    }

    public void setpCompra(float pCompra) {
        this.pCompra = pCompra;
    }

    public float getpVenta() {
        return pVenta;
    }

    public void setpVenta(float pVenta) {
        this.pVenta = pVenta;
    }

    public float getpReorden() {
        return pReorden;
    }

    public void setpReorden(float pReorden) {
        this.pReorden = pReorden;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdEmpaque() {
        return idEmpaque;
    }

    public void setIdEmpaque(String idEmpaque) {
        this.idEmpaque = idEmpaque;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }
    
    
}
