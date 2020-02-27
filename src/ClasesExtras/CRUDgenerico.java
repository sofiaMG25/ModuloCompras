
package ClasesExtras;

import java.util.LinkedList;

/**
 * Clase genérica que contiene todos los metodos del CRUD.
 * @author Reyes Duarte Jesus David
 */
public interface CRUDgenerico<T> {
    void Insert(T nuevo);
    void upadate(T nuevo);
    void delete(T nuevo);
    LinkedList<T> show(int pagina);
}
