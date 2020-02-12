/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Empaques;

import MainPrincipal.Main;
import RenderizadoDetablas.RenderTable;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author 52351
 */
public class mostrarEmpaques extends javax.swing.JPanel {

    /**
     * Creates new form mostrarEmpaques
     */
    public mostrarEmpaques() {
        initComponents();
    }
    public void setMostrarEmpaques(Main worksapce){
        mainPrincipal = worksapce;
    }
    public void MostrarDatosEmpaque(){
        
        JButton btnModificar = new JButton();
        JButton btnEliminar = new JButton();
        TableCellRenderer tcr = new DefaultTableCellHeaderRenderer();
        this.jTableMEmp.setDefaultRenderer(Object.class, tcr);
        DefaultTableModel modelTable = new DefaultTableModel(
                new Object[][]{{"1","juan",btnModificar,btnEliminar},{"2","David",btnModificar,btnEliminar}}
                , new Object[]{"Codigo","Nombre","Modificar","Eliminar"}){
                  public boolean isCellEditable(int row,int column){
                      return false;
                  }
                };
        
        this.jTableMEmp.setModel(modelTable);
        this.jTableMEmp.setRowHeight(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMostrarEmp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMEmp = new javax.swing.JTable();
        buscartxtMEmp = new javax.swing.JTextField();
        buscarMEmp = new javax.swing.JLabel();
        opcionesMostrarEmp = new javax.swing.JPanel();
        nuevoMEmp = new javax.swing.JLabel();
        cancelarMEmp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 231, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Mostrar empaques", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        mainMostrarEmp.setBackground(new java.awt.Color(233, 231, 231));

        jTableMEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "CAPACIDAD", "ESTATUS", "UNIDAD"
            }
        ));
        jScrollPane1.setViewportView(jTableMEmp);

        buscarMEmp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        buscarMEmp.setForeground(new java.awt.Color(102, 102, 102));
        buscarMEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/most.png"))); // NOI18N
        buscarMEmp.setText("BUSCAR EMPAQUE");
        buscarMEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buscarMEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        opcionesMostrarEmp.setBackground(new java.awt.Color(48, 45, 45));

        nuevoMEmp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        nuevoMEmp.setForeground(new java.awt.Color(255, 255, 255));
        nuevoMEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        nuevoMEmp.setText("NUEVO EMPAQUE");
        nuevoMEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        nuevoMEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoMEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoMEmpMouseClicked(evt);
            }
        });

        cancelarMEmp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarMEmp.setForeground(new java.awt.Color(255, 255, 255));
        cancelarMEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        cancelarMEmp.setText("CANCELAR");
        cancelarMEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarMEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout opcionesMostrarEmpLayout = new javax.swing.GroupLayout(opcionesMostrarEmp);
        opcionesMostrarEmp.setLayout(opcionesMostrarEmpLayout);
        opcionesMostrarEmpLayout.setHorizontalGroup(
            opcionesMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarEmpLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(nuevoMEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarMEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        opcionesMostrarEmpLayout.setVerticalGroup(
            opcionesMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarEmpLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(opcionesMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarMEmp)
                    .addComponent(nuevoMEmp))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout mainMostrarEmpLayout = new javax.swing.GroupLayout(mainMostrarEmp);
        mainMostrarEmp.setLayout(mainMostrarEmpLayout);
        mainMostrarEmpLayout.setHorizontalGroup(
            mainMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(mainMostrarEmpLayout.createSequentialGroup()
                        .addGap(0, 232, Short.MAX_VALUE)
                        .addComponent(buscartxtMEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarMEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(opcionesMostrarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainMostrarEmpLayout.setVerticalGroup(
            mainMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarEmpLayout.createSequentialGroup()
                .addGroup(mainMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarMEmp)
                    .addComponent(buscartxtMEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(opcionesMostrarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMostrarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMostrarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoMEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMEmpMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        agregarEmpaque nuevoEmp = new agregarEmpaque();
        nuevoEmp.setSize(mainPrincipal.getworkSpace().getSize());
        nuevoEmp.setVisible(true);
        mainPrincipal.getworkSpace().add(nuevoEmp,BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
    }//GEN-LAST:event_nuevoMEmpMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarMEmp;
    private javax.swing.JTextField buscartxtMEmp;
    private javax.swing.JLabel cancelarMEmp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMEmp;
    private javax.swing.JPanel mainMostrarEmp;
    private javax.swing.JLabel nuevoMEmp;
    private javax.swing.JPanel opcionesMostrarEmp;
    // End of variables declaration//GEN-END:variables
    private Main mainPrincipal;
    
}
