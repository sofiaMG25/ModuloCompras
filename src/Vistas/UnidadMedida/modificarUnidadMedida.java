/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.UnidadMedida;

import ClasesExtras.CRUDgenerico;
import MainPrincipal.Main;
import DAOs.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class modificarUnidadMedida extends javax.swing.JPanel {

    /**
     * Creates new form modificarLaboratorio
     */
    public modificarUnidadMedida() {
        initComponents();
    }
    private Main mainPrincipal;

    public void setMainPrincipal(Main main) {
        mainPrincipal = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idtxtUL = new javax.swing.JTextField();
        nombretxtUL = new javax.swing.JTextField();
        idUL = new javax.swing.JLabel();
        nombreUL = new javax.swing.JLabel();
        origenUL = new javax.swing.JLabel();
        estatusUL = new javax.swing.JLabel();
        capacidadtxtUL = new javax.swing.JTextField();
        estatusBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        modificarUL = new javax.swing.JLabel();
        cancelarUL = new javax.swing.JLabel();
        eliminarUL = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Modicar Laboratorio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        idtxtUL.setEnabled(false);

        idUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idUL.setText("ID:");

        nombreUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreUL.setText("NOMBRE:");

        origenUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUL.setText("CAPACIDAD:");

        estatusUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusUL.setText("ESTATUS:");

        estatusBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        estatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN", "ACTIVO", "INACTIVO" }));

        jPanel1.setBackground(new java.awt.Color(48, 45, 45));

        modificarUL.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        modificarUL.setForeground(new java.awt.Color(255, 255, 255));
        modificarUL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        modificarUL.setText("MODIFICAR");
        modificarUL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        modificarUL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarUL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarULMouseClicked(evt);
            }
        });

        cancelarUL.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarUL.setForeground(new java.awt.Color(255, 255, 255));
        cancelarUL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cancelarUL.setText("CANCELAR");
        cancelarUL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarUL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        eliminarUL.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        eliminarUL.setForeground(new java.awt.Color(255, 255, 255));
        eliminarUL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        eliminarUL.setText("Eliminar");
        eliminarUL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        eliminarUL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarUL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarULMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(modificarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(cancelarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(eliminarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarUL)
                    .addComponent(modificarUL)
                    .addComponent(eliminarUL))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreUL)
                    .addComponent(estatusUL)
                    .addComponent(origenUL)
                    .addComponent(idUL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idtxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacidadtxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombretxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idUL)
                    .addComponent(idtxtUL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreUL)
                    .addComponent(nombretxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadtxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origenUL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estatusUL)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Modificar Unidad");
    }// </editor-fold>//GEN-END:initComponents

    private void modificarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarULMouseClicked
        if (nombretxtUL.getText() == "" || nombretxtUL.getText() == null) {
            JOptionPane.showMessageDialog(null, "Debes escribir algo para guardar...",
                    "Mensaje", JOptionPane.WARNING_MESSAGE);
        }else if(capacidadtxtUL.equals(""))
            capacidadtxtUL.requestFocus();
        else{
        CRUDgenerico guardarUni = new DAOUnidadImp();
        //Datos obtenidos de los campos 
        int id = Integer.parseInt(this.idtxtUL.getText());
        String nombre = this.nombretxtUL.getText();
        String capacidad = this.capacidadtxtUL.getText();
        char estatus = String.valueOf(this.estatusBox.getSelectedItem()).charAt(0);
        //Guardar los datos de laboratorio
        guardarUni.upadate(new UnidadMedida(id, nombre, Float.parseFloat(capacidad), estatus));
        }
    }//GEN-LAST:event_modificarULMouseClicked

    private void eliminarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarULMouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (resp == 0) {
            CRUDgenerico eliminarUni = new DAOUnidadImp();
            //Datos obtenidos de los campos 
            int id = Integer.parseInt(this.idtxtUL.getText());
            String nombre = this.nombretxtUL.getText();
            String capacidad = this.capacidadtxtUL.getText();
            char estatus = String.valueOf(this.estatusBox.getSelectedItem()).charAt(0);
            //Guardar los datos de Categorias
            eliminarUni.delete(new UnidadMedida(id, nombre, Float.parseFloat(capacidad), estatus));
        }
    }//GEN-LAST:event_eliminarULMouseClicked
    /**
     * Método que funciona para abstraer los datos del laboratotio
     */
    public void ObtenerLaboratoriModificar(UnidadMedida uni) {
        this.idtxtUL.setText(String.valueOf(uni.getId()));
        this.nombretxtUL.setText(uni.getNombre());
        this.capacidadtxtUL.setText(String.valueOf(uni.getCapacidad()));
        if (uni.getEstatus() == 'A') {
            this.estatusBox.setSelectedIndex(1);
        } else {
            this.estatusBox.setSelectedIndex(2);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelarUL;
    private javax.swing.JTextField capacidadtxtUL;
    private javax.swing.JLabel eliminarUL;
    private javax.swing.JComboBox<String> estatusBox;
    private javax.swing.JLabel estatusUL;
    private javax.swing.JLabel idUL;
    private javax.swing.JTextField idtxtUL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel modificarUL;
    private javax.swing.JLabel nombreUL;
    private javax.swing.JTextField nombretxtUL;
    private javax.swing.JLabel origenUL;
    // End of variables declaration//GEN-END:variables
}
