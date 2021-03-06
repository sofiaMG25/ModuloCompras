package DAOs;


public class ProductoProveedor {
  private String idProveedor; 
  private String idPresentaciones;
  private int diasRetardo;
  private float precioEstandar;
  private float precioUltCompra;
  private int cantMinPedir;
  private int cantMaxPedir;
  private char estatus;

    public ProductoProveedor(String idProveedor, String idPresentaciones, int diasRetardo, float precioEstandar, float precioUltCompra, int cantMinPedir, int cantMaxPedir, char estatus) {
        this.idProveedor = idProveedor;
        this.idPresentaciones = idPresentaciones;
        this.diasRetardo = diasRetardo;
        this.precioEstandar = precioEstandar;
        this.precioUltCompra = precioUltCompra;
        this.cantMinPedir = cantMinPedir;
        this.cantMaxPedir = cantMaxPedir;
        this.estatus = estatus;
    }

    public ProductoProveedor(String idProveedor, String idPresentaciones, int diasRetardo, float precioEstandar, float precioUltCompra, int cantMinPedir, int cantMaxPedir) {
        this.idProveedor = idProveedor;
        this.idPresentaciones = idPresentaciones;
        this.diasRetardo = diasRetardo;
        this.precioEstandar = precioEstandar;
        this.precioUltCompra = precioUltCompra;
        this.cantMinPedir = cantMinPedir;
        this.cantMaxPedir = cantMaxPedir;
    }
    

    public ProductoProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public ProductoProveedor(int p, String idPresentaciones) {
        this.idPresentaciones = idPresentaciones;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdPresentaciones() {
        return idPresentaciones;
    }

    public void setIdPresentaciones(String idPresentaciones) {
        this.idPresentaciones = idPresentaciones;
    }

    public int getDiasRetardo() {
        return diasRetardo;
    }

    public void setDiasRetardo(int diasRetardo) {
        this.diasRetardo = diasRetardo;
    }

    public float getPrecioEstandar() {
        return precioEstandar;
    }

    public void setPrecioEstandar(float precioEstandar) {
        this.precioEstandar = precioEstandar;
    }

    public float getPrecioUltCompra() {
        return precioUltCompra;
    }

    public void setPrecioUltCompra(float precioUltCompra) {
        this.precioUltCompra = precioUltCompra;
    }

    public int getCantMinPedir() {
        return cantMinPedir;
    }

    public void setCantMinPedir(int cantMinPedir) {
        this.cantMinPedir = cantMinPedir;
    }

    public int getCantMaxPedir() {
        return cantMaxPedir;
    }

    public void setCantMaxPedir(int cantMaxPedir) {
        this.cantMaxPedir = cantMaxPedir;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

    

  }
