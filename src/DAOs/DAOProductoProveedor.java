 package DAOs;

import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;

public interface DAOProductoProveedor extends CRUDgenerico<ProductoProveedor>{
    LinkedList<ProductoProveedor> obtenerIdProveedor();
    LinkedList<ProductoProveedor> obtenerIdProducto();
    int contRegistro();
}