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
public interface DAOExistenciaSucursal extends CRUDgenerico<ExistenciaSucursal>{
    LinkedList<ExistenciaSucursal> busquedaPorID(int id);
    LinkedList<Sucursales> getsIDSU();
    LinkedList<Presentaciones> getsIDPR();

    int contRegistros(int num);
}
