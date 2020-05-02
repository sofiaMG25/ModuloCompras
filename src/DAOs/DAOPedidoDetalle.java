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
public interface DAOPedidoDetalle extends CRUDgenerico<PedidoDetalle>{
    int contRegistros();
    LinkedList<PedidoDetalle> consultaInd(String nombre);
    LinkedList<PedidoDetalle> obternerIdPedido();
    LinkedList<PedidoDetalle> obternerIdPresentacion();
}
