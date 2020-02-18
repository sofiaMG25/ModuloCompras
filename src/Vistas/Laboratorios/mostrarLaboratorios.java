package Vistas.Laboratorios;

import DAOs.DAOEmpaquesImp;
import java.awt.BorderLayout;
import DAOs.DAOLaboratoriosImp;
import DAOs.Empaques;
import DAOs.Laboratorios;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import MainPrincipal.Main;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class mostrarLaboratorios extends javax.swing.JPanel {

    /**
     * Creates new form mostrarLaboratorios
     */
    public void setMostrarLaboratorios(Main workspace) {
        mainPrincipal = workspace;
    }

    public mostrarLaboratorios() {
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
        tablaMostrarLab = new javax.swing.JScrollPane();
        jTableML = new javax.swing.JTable();
        opcionesMostrarLab = new javax.swing.JPanel();
        nuevolabML = new javax.swing.JLabel();
        cancelarML = new javax.swing.JLabel();
        buscartxtML = new javax.swing.JTextField();
        buscarML = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Mostrar laboratorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        mainMostrarLab.setBackground(new java.awt.Color(233, 231, 231));

        jTableML.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "ORIGEN", "ESTATUS"
            }
        ));
        jTableML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMLMouseClicked(evt);
            }
        });
        tablaMostrarLab.setViewportView(jTableML);

        opcionesMostrarLab.setBackground(new java.awt.Color(48, 45, 45));

        nuevolabML.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        nuevolabML.setForeground(new java.awt.Color(255, 255, 255));
        nuevolabML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        nuevolabML.setText("NUEVO LABORATORIO");
        nuevolabML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        nuevolabML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevolabML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevolabMLMouseClicked(evt);
            }
        });

        cancelarML.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarML.setForeground(new java.awt.Color(255, 255, 255));
        cancelarML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        cancelarML.setText("CANCELAR");
        cancelarML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesMostrarLabLayout = new javax.swing.GroupLayout(opcionesMostrarLab);
        opcionesMostrarLab.setLayout(opcionesMostrarLabLayout);
        opcionesMostrarLabLayout.setHorizontalGroup(
            opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarLabLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(nuevolabML, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarML, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        opcionesMostrarLabLayout.setVerticalGroup(
            opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarLabLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarML)
                    .addComponent(nuevolabML))
                .addGap(35, 35, 35))
        );

        buscarML.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        buscarML.setForeground(new java.awt.Color(102, 102, 102));
        buscarML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/most.png"))); // NOI18N
        buscarML.setText("BUSCAR LABORATORIO");
        buscarML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buscarML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainMostrarLabLayout = new javax.swing.GroupLayout(mainMostrarLab);
        mainMostrarLab.setLayout(mainMostrarLabLayout);
        mainMostrarLabLayout.setHorizontalGroup(
            mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablaMostrarLab)
                    .addComponent(opcionesMostrarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMostrarLabLayout.createSequentialGroup()
                        .addGap(0, 197, Short.MAX_VALUE)
                        .addComponent(buscartxtML, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarML, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainMostrarLabLayout.setVerticalGroup(
            mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarML)
                    .addComponent(buscartxtML, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablaMostrarLab, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void nuevolabMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevolabMLMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        agregarLaboratorio nuevolab = new agregarLaboratorio();
        nuevolab.setSize(mainPrincipal.getworkSpace().getSize());
        nuevolab.setVisible(true);
        nuevolab.setMain(mainPrincipal);
        //agregarLaboratorio.setMain(mainPrincipal);
        //nuevolab.getEnableComponents();
        mainPrincipal.getworkSpace().add(nuevolab, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();


    }//GEN-LAST:event_nuevolabMLMouseClicked

    private void cancelarMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMLMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
    }//GEN-LAST:event_cancelarMLMouseClicked

    /**
     * Método que funciona para detectar un evento de la tabla Laboratorios.
     *
     * @param evt evento al dar click a la tabla.
     */
    private void jTableMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMLMouseClicked

       
        int row;
        row = jTableML.getSelectedRow();
        
        //Verificamos que el evento este en el rango de la tabla.
        if (row > -1 && row <= jTableML.getSelectedRow()) {
            //creamos la ventana modificar
            modificarLaboratorio modificarLab = new modificarLaboratorio();
            this.mainPrincipal.getworkSpace().removeAll();
            modificarLab.setSize(mainPrincipal.getworkSpace().getSize());
            modificarLab.setVisible(true);
            modificarLab.setMainPrincipal(mainPrincipal);
            //Datos de la tabla, selecionar un row
            int id = Integer.parseInt(String.valueOf(this.jTableML.getValueAt(row, 0)));
            String nombre = String.valueOf(this.jTableML.getValueAt(row, 1));
            String origen = String.valueOf(this.jTableML.getValueAt(row, 2));
            char estatus = String.valueOf(this.jTableML.getValueAt(row, 3)).charAt(0);
            //Ingresan los datos de la tabla a la interfaz Modificar Laboratorio
            modificarLab.ObtenerLaboratoriModificar(
                    new Laboratorios(id,nombre,origen,estatus));
            
            this.mainPrincipal.getworkSpace().add(modificarLab,BorderLayout.CENTER);
            this.mainPrincipal.getworkSpace().revalidate();
            this.mainPrincipal.getworkSpace().repaint();
       
        }
    }//GEN-LAST:event_jTableMLMouseClicked

    private void buscarMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMLMouseClicked
         LinkedList<Laboratorios> lab = new DAOLaboratoriosImp().busquedaPorNombre(buscartxtML.getText());
        Object listaDatos[][] = new Object[lab.size()][4];
        for (int i = 0; i < lab.size(); i++) {
            listaDatos[i][0] = lab.get(i).getId();
            listaDatos[i][1] = lab.get(i).getNombre();
            listaDatos[i][2] = lab.get(i).getOrigen();
            listaDatos[i][3] = lab.get(i).getEstatus();
        }

        DefaultTableModel modelTable = new DefaultTableModel(
                listaDatos,
                new Object[]{"ID", "NOMBRE", "ORIGEN", "ESTATUS"}) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        this.jTableML.setModel(modelTable);
        this.jTableML.getColumnModel().getColumn(0).setMinWidth(10);
        this.jTableML.getColumnModel().getColumn(0).setMaxWidth(50);

        this.jTableML.getColumnModel().getColumn(1).setMinWidth(50);
        this.jTableML.getColumnModel().getColumn(1).setMaxWidth(350);

        this.jTableML.getColumnModel().getColumn(2).setMinWidth(50);
        this.jTableML.getColumnModel().getColumn(2).setMaxWidth(350);

        this.jTableML.getColumnModel().getColumn(3).setMinWidth(10);
        this.jTableML.getColumnModel().getColumn(3).setMaxWidth(200);
    }//GEN-LAST:event_buscarMLMouseClicked

    private void MostrarDatosLaboratorio() {

        LinkedList<Laboratorios> lab = new DAOLaboratoriosImp().show();
        Object listaDatos[][] = new Object[lab.size()][4];
        for (int i = 0; i < lab.size(); i++) {
            listaDatos[i][0] = lab.get(i).getId();
            listaDatos[i][1] = lab.get(i).getNombre();
            listaDatos[i][2] = lab.get(i).getOrigen();
            listaDatos[i][3] = lab.get(i).getEstatus();
        }

        DefaultTableModel modelTable = new DefaultTableModel(
                listaDatos,
                new Object[]{"ID", "NOMBRE", "ORIGEN", "ESTATUS"}) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        this.jTableML.setModel(modelTable);
        this.jTableML.getColumnModel().getColumn(0).setMinWidth(10);
        this.jTableML.getColumnModel().getColumn(0).setMaxWidth(50);

        this.jTableML.getColumnModel().getColumn(1).setMinWidth(50);
        this.jTableML.getColumnModel().getColumn(1).setMaxWidth(350);

        this.jTableML.getColumnModel().getColumn(2).setMinWidth(50);
        this.jTableML.getColumnModel().getColumn(2).setMaxWidth(350);

        this.jTableML.getColumnModel().getColumn(3).setMinWidth(10);
        this.jTableML.getColumnModel().getColumn(3).setMaxWidth(200);

    }

    public void activeEventListenerMostrarLab() {
        MostrarDatosLaboratorio();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarML;
    private javax.swing.JTextField buscartxtML;
    private javax.swing.JLabel cancelarML;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTable jTableML;
    private javax.swing.JPanel mainMostrarLab;
    private javax.swing.JLabel nuevolabML;
    private javax.swing.JPanel opcionesMostrarLab;
    private javax.swing.JScrollPane tablaMostrarLab;
    // End of variables declaration//GEN-END:variables
}
