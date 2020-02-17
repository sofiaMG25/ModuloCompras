
package Vistas.UnidadMedida;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import MainPrincipal.Main;
import java.util.LinkedList;
import DAOs.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 52351
 */
public class mostrarUnidadMedida extends javax.swing.JPanel {

    /**
     * Creates new form mostrarLaboratorios
     */
    public void setMostrarUnidadMedida(Main workspace) {
        mainPrincipal = workspace;
    }
    
    public mostrarUnidadMedida() {
        initComponents();
    }
    
    private Main mainPrincipal;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        mainMostrarLab = new javax.swing.JPanel();
        tablaMostrarUnidad = new javax.swing.JScrollPane();
        jTableMUM = new javax.swing.JTable();
        opcionesMostrarLab = new javax.swing.JPanel();
        nuevoUnidad = new javax.swing.JLabel();
        cancelarMUM = new javax.swing.JLabel();
        buscartxtMUM = new javax.swing.JTextField();
        buscarMUM = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Mostrar laboratorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        mainMostrarLab.setBackground(new java.awt.Color(233, 231, 231));

        jTableMUM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "SIGLAS", "ESTATUS", "", ""
            }
        ));
        jTableMUM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMUMMouseClicked(evt);
            }
        });
        tablaMostrarUnidad.setViewportView(jTableMUM);

        opcionesMostrarLab.setBackground(new java.awt.Color(48, 45, 45));

        nuevoUnidad.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        nuevoUnidad.setForeground(new java.awt.Color(255, 255, 255));
        nuevoUnidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        nuevoUnidad.setText("NUEVA UNIDAD");
        nuevoUnidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        nuevoUnidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoUnidadMouseClicked(evt);
            }
        });

        cancelarMUM.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarMUM.setForeground(new java.awt.Color(255, 255, 255));
        cancelarMUM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        cancelarMUM.setText("CANCELAR");
        cancelarMUM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarMUM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarMUM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMUMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesMostrarLabLayout = new javax.swing.GroupLayout(opcionesMostrarLab);
        opcionesMostrarLab.setLayout(opcionesMostrarLabLayout);
        opcionesMostrarLabLayout.setHorizontalGroup(
            opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarLabLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(nuevoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarMUM, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        opcionesMostrarLabLayout.setVerticalGroup(
            opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarLabLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarMUM)
                    .addComponent(nuevoUnidad))
                .addGap(35, 35, 35))
        );

        buscarMUM.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        buscarMUM.setForeground(new java.awt.Color(102, 102, 102));
        buscarMUM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/most.png"))); // NOI18N
        buscarMUM.setText("BUSCAR UNIDAD");
        buscarMUM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buscarMUM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarMUM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMUMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainMostrarLabLayout = new javax.swing.GroupLayout(mainMostrarLab);
        mainMostrarLab.setLayout(mainMostrarLabLayout);
        mainMostrarLabLayout.setHorizontalGroup(
            mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablaMostrarUnidad)
                    .addComponent(opcionesMostrarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMostrarLabLayout.createSequentialGroup()
                        .addGap(0, 197, Short.MAX_VALUE)
                        .addComponent(buscartxtMUM, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarMUM, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainMostrarLabLayout.setVerticalGroup(
            mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarMUM)
                    .addComponent(buscartxtMUM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablaMostrarUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionesMostrarLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(mainMostrarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMostrarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Mostrar Unidad Medida");
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUnidadMouseClicked
       mainPrincipal.getworkSpace().removeAll();
       agregarUnidadMedida nuevaUnid = new agregarUnidadMedida();
       nuevaUnid.setSize(mainPrincipal.getworkSpace().getSize());
       nuevaUnid.setVisible(true);
       nuevaUnid.setMain(mainPrincipal);
       //agregarLaboratorio.setMain(mainPrincipal);
       //nuevolab.getEnableComponents();
       mainPrincipal.getworkSpace().add(nuevaUnid,BorderLayout.CENTER);
       mainPrincipal.getworkSpace().revalidate();
       mainPrincipal.getworkSpace().repaint();
        
        
    }//GEN-LAST:event_nuevoUnidadMouseClicked

    private void cancelarMUMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMUMMouseClicked
       mainPrincipal.getworkSpace().removeAll();
       mainPrincipal.getworkSpace().revalidate();
       mainPrincipal.getworkSpace().repaint();
    }//GEN-LAST:event_cancelarMUMMouseClicked

    private void jTableMUMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMUMMouseClicked
        int row;
        row = jTableMUM.getSelectedRow();
        
        //Verificamos que el evento este en el rango de la tabla.
        if (row > -1 && row <= jTableMUM.getSelectedRow()) {
            //creamos la ventana modificar
            modificarUnidadMedida modificarUni = new modificarUnidadMedida();
            this.mainPrincipal.getworkSpace().removeAll();
            modificarUni.setSize(mainPrincipal.getworkSpace().getSize());
            modificarUni.setVisible(true);
            modificarUni.setMainPrincipal(mainPrincipal);
            //Datos de la tabla, selecionar un row
            int id = Integer.parseInt(String.valueOf(this.jTableMUM.getValueAt(row, 0)));
            String nombre = String.valueOf(this.jTableMUM.getValueAt(row, 1));
            String capacidad = String.valueOf(this.jTableMUM.getValueAt(row, 2));
            char estatus = String.valueOf(this.jTableMUM.getValueAt(row, 3)).charAt(0);
            //Ingresan los datos de la tabla a la interfaz Modificar Laboratorio
            modificarUni.ObtenerLaboratoriModificar(
                    new UnidadMedida(id,nombre,Float.parseFloat(capacidad),estatus));
            
            this.mainPrincipal.getworkSpace().add(modificarUni,BorderLayout.CENTER);
            this.mainPrincipal.getworkSpace().revalidate();
            this.mainPrincipal.getworkSpace().repaint();
        }
    }//GEN-LAST:event_jTableMUMMouseClicked

    private void buscarMUMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMUMMouseClicked
        if (buscartxtMUM.getText() == "" || buscartxtMUM.getText() == null) {
            JOptionPane.showMessageDialog(null, "Debes escribir algo para filtrar...",
                    "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else {
            LinkedList<UnidadMedida> uni = new DAOUnidadImp().consultaInd(buscartxtMUM.getText());
            Object listaDatos[][] = new Object[uni.size()][4];
            for (int i = 0; i < uni.size(); i++) {
                listaDatos[i][0] = uni.get(i).getId();
                listaDatos[i][1] = uni.get(i).getNombre();
                listaDatos[i][2] = uni.get(i).getEstatus();
                listaDatos[i][3] = uni.get(i).getEstatus();
            }

            DefaultTableModel modelTable = new DefaultTableModel(
                    listaDatos,
                    new Object[]{"ID", "NOMBRE","CAPACIDAD" ,"ESTATUS"}) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            this.jTableMUM.setModel(modelTable);
            this.jTableMUM.getColumnModel().getColumn(0).setMinWidth(10);
            this.jTableMUM.getColumnModel().getColumn(0).setMaxWidth(50);

            this.jTableMUM.getColumnModel().getColumn(1).setMinWidth(50);
            this.jTableMUM.getColumnModel().getColumn(1).setMaxWidth(350);

            this.jTableMUM.getColumnModel().getColumn(2).setMinWidth(50);
            this.jTableMUM.getColumnModel().getColumn(2).setMaxWidth(350);

        }
    }//GEN-LAST:event_buscarMUMMouseClicked

    public void MostrarDatosUnidad(){
        
         LinkedList<UnidadMedida> uni = new DAOUnidadImp().show();
        Object listaDatos[][] = new Object[uni.size()][4];
        for (int i = 0; i < uni.size(); i++) {
            listaDatos[i][0] = uni.get(i).getId();
            listaDatos[i][1] = uni.get(i).getNombre();
            listaDatos[i][2] = uni.get(i).getCapacidad();
            listaDatos[i][3] = uni.get(i).getEstatus();
        }

        DefaultTableModel modelTable = new DefaultTableModel(
                listaDatos,
                new Object[]{"ID", "NOMBRE", "CAPACIDAD", "ESTATUS"}) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        this.jTableMUM.setModel(modelTable);
        this.jTableMUM.getColumnModel().getColumn(0).setMinWidth(10);
        this.jTableMUM.getColumnModel().getColumn(0).setMaxWidth(50);

        this.jTableMUM.getColumnModel().getColumn(1).setMinWidth(50);
        this.jTableMUM.getColumnModel().getColumn(1).setMaxWidth(350);

        this.jTableMUM.getColumnModel().getColumn(2).setMinWidth(50);
        this.jTableMUM.getColumnModel().getColumn(2).setMaxWidth(350);

        this.jTableMUM.getColumnModel().getColumn(3).setMinWidth(10);
        this.jTableMUM.getColumnModel().getColumn(3).setMaxWidth(200);

    }
    
    public void activeEventListenerMostrarLab(){
        MostrarDatosUnidad();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarMUM;
    private javax.swing.JTextField buscartxtMUM;
    private javax.swing.JLabel cancelarMUM;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTable jTableMUM;
    private javax.swing.JPanel mainMostrarLab;
    private javax.swing.JLabel nuevoUnidad;
    private javax.swing.JPanel opcionesMostrarLab;
    private javax.swing.JScrollPane tablaMostrarUnidad;
    // End of variables declaration//GEN-END:variables
}
