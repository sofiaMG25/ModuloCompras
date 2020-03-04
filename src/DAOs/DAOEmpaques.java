
package DAOs;

import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;

public interface DAOEmpaques extends CRUDgenerico<Empaques>{
    LinkedList<Empaques> obternerIdunidades();
    LinkedList<Empaques> busquedaPorNombre(String nombre);
    int contRegistro();
}