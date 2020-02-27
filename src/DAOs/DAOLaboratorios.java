
package DAOs;

import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;

public interface DAOLaboratorios extends CRUDgenerico<Laboratorios>{
    
    LinkedList<Laboratorios> busquedaPorNombre(String nombre);
    int contarRegistros();
    
}
