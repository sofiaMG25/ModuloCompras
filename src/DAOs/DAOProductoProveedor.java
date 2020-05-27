 package DAOs;

import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;

public interface DAOProductoProveedor extends CRUDgenerico<ProductoProveedor>{
    LinkedList<ProductoProveedor> obtenerIdProveedor();
    LinkedList<ProductoProveedor> obtenerIdPresentaciones();
    LinkedList<ProductoProveedor> busquedaPorNombre(String nombre);
    int contRegistro();
}