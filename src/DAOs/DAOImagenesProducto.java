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
public interface DAOImagenesProducto extends CRUDgenerico<ImagenesProducto> {
    int contRegistros();
    LinkedList<ImagenesProducto> consultaInd(String nombre);
    LinkedList<ImagenesProducto> obternerIdProducto();
}
