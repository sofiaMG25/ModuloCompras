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
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface DAOProveedores extends CRUDgenerico<Proveedores>{
    LinkedList<Proveedores> obtenerProveedores();
}
