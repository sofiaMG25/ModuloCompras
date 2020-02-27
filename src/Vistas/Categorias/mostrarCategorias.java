package Vistas.Categorias;

import MainPrincipal.Main;
import java.awt.BorderLayout;
import javax.swing.JButton;
import DAOs.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import MainPrincipal.Main;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class mostrarCategorias extends javax.swing.JPanel {

    /**
     * Creates new form mostrarLaboratorios
     */
    public void setMostrarCategorias(Main workspace) {
        mainPrincipal = workspace;
    }

    public mostrarCategorias() {
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

        jComboBox1 = new javax.swing.JComboBox<String>();
        mainMostrarLab = new javax.swing.JPanel();
        tablaMostrarCat = new javax.swing.JScrollPane();
        jTableMC = new javax.swing.JTable();
        opcionesMostrarLab = new javax.swing.JPanel();
        nuevaCat = new javax.swing.JLabel();
        cancelarMC = new javax.swing.JLabel();
        buscartxtMC = new javax.swing.JTextField();
        buscarMC = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Mostrar laboratorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        mainMostrarLab.setBackground(new java.awt.Color(233, 231, 231));

        jTableMC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "ESTATUS"
            }
        ));
        jTableMC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMCMouseClicked(evt);
            }
        });
        tablaMostrarCat.setViewportView(jTableMC);

        opcionesMostrarLab.setBackground(new java.awt.Color(48, 45, 45));

        nuevaCat.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        nuevaCat.setForeground(new java.awt.Color(255, 255, 255));
        nuevaCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        nuevaCat.setText("NUEVA CATEGORIA");
        nuevaCat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        nuevaCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevaCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevaCatMouseClicked(evt);
            }
        });

        cancelarMC.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarMC.setForeground(new java.awt.Color(255, 255, 255));
        cancelarMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        cancelarMC.setText("CANCELAR");
        cancelarMC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarMC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarMC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesMostrarLabLayout = new javax.swing.GroupLayout(opcionesMostrarLab);
        opcionesMostrarLab.setLayout(opcionesMostrarLabLayout);
        opcionesMostrarLabLayout.setHorizontalGroup(
            opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarLabLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(nuevaCat, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarMC, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        opcionesMostrarLabLayout.setVerticalGroup(
            opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarLabLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarMC)
                    .addComponent(nuevaCat))
                .addGap(35, 35, 35))
        );

        buscarMC.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        buscarMC.setForeground(new java.awt.Color(102, 102, 102));
        buscarMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/most.png"))); // NOI18N
        buscarMC.setText("BUSCAR CATEGORIA");
        buscarMC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buscarMC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarMC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainMostrarLabLayout = new javax.swing.GroupLayout(mainMostrarLab);
        mainMostrarLab.setLayout(mainMostrarLabLayout);
        mainMostrarLabLayout.setHorizontalGroup(
            mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablaMostrarCat)
                    .addComponent(opcionesMostrarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMostrarLabLayout.createSequentialGroup()
                        .addGap(0, 197, Short.MAX_VALUE)
                        .addComponent(buscartxtMC, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarMC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainMostrarLabLayout.setVerticalGroup(
            mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarMC)
                    .addComponent(buscartxtMC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablaMostrarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        getAccessibleContext().setAccessibleName("Mostrar Categorias");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevaCatMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        agregarCategorias nuevaCat = new agregarCategorias();
        nuevaCat.setSize(mainPrincipal.getworkSpace().getSize());
        nuevaCat.setVisible(true);
        nuevaCat.setMain(mainPrincipal);
        //agregarLaboratorio.setMain(mainPrincipal);
        //nuevolab.getEnableComponents();
        mainPrincipal.getworkSpace().add(nuevaCat, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();


    }//GEN-LAST:event_nuevaCatMouseClicked

    private void cancelarMCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMCMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
    }//GEN-LAST:event_cancelarMCMouseClicked

    private void jTableMCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMCMouseClicked
        int row;
        row = jTableMC.getSelectedRow();

        //Verificamos que el evento este en el rango de la tabla.
        if (row > -1 && row <= jTableMC.getSelectedRow()) {
            //creamos la ventana modificar
            modificarCategorias modificarCat = new modificarCategorias();
            this.mainPrincipal.getworkSpace().removeAll();
            modificarCat.setSize(mainPrincipal.getworkSpace().getSize());
            modificarCat.setVisible(true);
            modificarCat.setMainPrincipal(mainPrincipal);
            //Datos de la tabla, selecionar un row
            int id = Integer.parseInt(String.valueOf(this.jTableMC.getValueAt(row, 0)));
            String nombre = String.valueOf(this.jTableMC.getValueAt(row, 1));
            char estatus = String.valueOf(this.jTableMC.getValueAt(row, 2)).charAt(0);
            //Ingresan los datos de la tabla a la interfaz Modificar Laboratorio
            modificarCat.ObtenerLaboratoriModificar(
                    new Categorias(id, nombre, estatus));

            this.mainPrincipal.getworkSpace().add(modificarCat, BorderLayout.CENTER);
            this.mainPrincipal.getworkSpace().revalidate();
            this.mainPrincipal.getworkSpace().repaint();
        }
    }//GEN-LAST:event_jTableMCMouseClicked

    private void buscarMCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMCMouseClicked
        if (buscartxtMC.getText() == "" || buscartxtMC.getText() == null) {
            JOptionPane.showMessageDialog(null, "Debes escribir algo para filtrar...",
                    "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else {
            LinkedList<Categorias> cat = new DAOCategoriasImp().consultaInd(buscartxtMC.getText());
            Object listaDatos[][] = new Object[cat.size()][3];
            for (int i = 0; i < cat.size(); i++) {
                listaDatos[i][0] = cat.get(i).getId();
                listaDatos[i][1] = cat.get(i).getNombre();
                listaDatos[i][2] = cat.get(i).getEstatus();
            }

            DefaultTableModel modelTable = new DefaultTableModel(
                    listaDatos,
                    new Object[]{"ID", "NOMBRE", "ESTATUS"}) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            this.jTableMC.setModel(modelTable);
            this.jTableMC.getColumnModel().getColumn(0).setMinWidth(10);
            this.jTableMC.getColumnModel().getColumn(0).setMaxWidth(50);

            this.jTableMC.getColumnModel().getColumn(1).setMinWidth(50);
            this.jTableMC.getColumnModel().getColumn(1).setMaxWidth(350);

            this.jTableMC.getColumnModel().getColumn(2).setMinWidth(50);
            this.jTableMC.getColumnModel().getColumn(2).setMaxWidth(350);

        }

    }//GEN-LAST:event_buscarMCMouseClicked

    public void MostrarDatosCategorias() {
        LinkedList<Categorias> cat = new DAOCategoriasImp().show(1);
        Object listaDatos[][] = new Object[cat.size()][3];
        for (int i = 0; i < cat.size(); i++) {
            listaDatos[i][0] = cat.get(i).getId();
            listaDatos[i][1] = cat.get(i).getNombre();
            listaDatos[i][2] = cat.get(i).getEstatus();
        }

        DefaultTableModel modelTable = new DefaultTableModel(
                listaDatos,
                new Object[]{"ID", "NOMBRE", "ESTATUS"}) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        this.jTableMC.setModel(modelTable);
        this.jTableMC.getColumnModel().getColumn(0).setMinWidth(10);
        this.jTableMC.getColumnModel().getColumn(0).setMaxWidth(50);

        this.jTableMC.getColumnModel().getColumn(1).setMinWidth(50);
        this.jTableMC.getColumnModel().getColumn(1).setMaxWidth(350);

        this.jTableMC.getColumnModel().getColumn(2).setMinWidth(50);
        this.jTableMC.getColumnModel().getColumn(2).setMaxWidth(350);

    }

    public void activeEventListenerMostrarLab() {
        MostrarDatosCategorias();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarMC;
    private javax.swing.JTextField buscartxtMC;
    private javax.swing.JLabel cancelarMC;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTable jTableMC;
    private javax.swing.JPanel mainMostrarLab;
    private javax.swing.JLabel nuevaCat;
    private javax.swing.JPanel opcionesMostrarLab;
    private javax.swing.JScrollPane tablaMostrarCat;
    // End of variables declaration//GEN-END:variables
}
