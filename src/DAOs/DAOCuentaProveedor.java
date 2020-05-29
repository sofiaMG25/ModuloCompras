 package DAOs;

import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;

public interface DAOCuentaProveedor extends CRUDgenerico<CuentasProveedor>{
    LinkedList<CuentasProveedor> obtenerIdProveedores();
    LinkedList<CuentasProveedor> busquedaPorNombre(int id);
    int contRegistro();
}