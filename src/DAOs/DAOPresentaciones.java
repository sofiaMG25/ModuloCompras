 package DAOs;

import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;

public interface DAOPresentaciones extends CRUDgenerico<Presentaciones>{
    LinkedList<Presentaciones> obtenerIdProducto();
    LinkedList<Presentaciones> obtenerIdEmpaque();
    int contRegistro();
}