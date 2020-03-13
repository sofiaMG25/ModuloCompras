/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;
import ClasesExtras.CRUDgenerico;
/**
 *
 * @author Manuel
 */
public interface DAOProductos extends CRUDgenerico<Productos>{
    int contRegistros();
}
