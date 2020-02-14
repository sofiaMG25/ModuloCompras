package ClasesExtras;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 * Clase que facilita el renderizado de tablas
 * @author 52351
 */
public class RenderTable extends DefaultTableCellHeaderRenderer{

    /**
     * Método permite añadir un boton en una tabla.su función es verificar si el parametro value es una instancia de un botón, si lo es lo regresa.
     * @param jtable
     * @param value
     */
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean bln, boolean bln1, int i, int i1) {
        
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            return btn;
        }
      
        return super.getTableCellRendererComponent(jtable, value, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
    
}
