
package DAOs;

import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;

public interface DAOPedidos extends CRUDgenerico<Pedidos> {
    LinkedList<Pedidos> busquedaPorID(int id);
    LinkedList<String> obtenerEmpleados();
    LinkedList<Pedidos> pedidosPagados(int pagina);
    int contarRegistros();
    int contarRegistroPagados();
    int pagarAbono(int id, float abono);
    
}
