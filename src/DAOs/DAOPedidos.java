
package DAOs;

import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;

public interface DAOPedidos extends CRUDgenerico<Pedidos> {
    LinkedList<Pedidos> busquedaPorID(int id);
}
