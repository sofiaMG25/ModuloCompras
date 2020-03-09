
package DAOs;

import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;

public interface DAOSucursales extends CRUDgenerico<Sucursales>{
    int contRegistros();
    LinkedList<String> obtenerCiudades();
}
