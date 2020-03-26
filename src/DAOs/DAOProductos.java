/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;
import ClasesExtras.CRUDgenerico;
import java.util.LinkedList;
/**
 *
 * @author Manuel
 */
public interface DAOProductos extends CRUDgenerico<Productos>{
    int contRegistros();
    LinkedList<Productos> consultaInd(String nombre);
    LinkedList<Productos> obternerIdLaboratorios();
    LinkedList<Productos> obternerIdCategorias();
}
