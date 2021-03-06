/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Laboratorios;

import ClasesExtras.CRUDgenerico;
import DAOs.DAOLaboratoriosImp;
import DAOs.Laboratorios;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class modificarLaboratorio extends javax.swing.JPanel {

    /**
     * Creates new form modificarLaboratorio
     */
    public modificarLaboratorio() {
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
        origentxtUL = new javax.swing.JTextField();
        estatusCBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        modificarUL = new javax.swing.JLabel();
        cancelarUL = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Modicar Laboratorio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        idtxtUL.setEnabled(false);
        idtxtUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtULActionPerformed(evt);
            }
        });

        idUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idUL.setText("ID:");

        nombreUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreUL.setText("NOMBRE:");

        origenUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUL.setText("ORIGEN:");

        estatusUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusUL.setText("ESTATUS:");

        estatusCBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        estatusCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN", "ACTIVO", "INACTIVO" }));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarULMouseEntered(evt);
            }
        });

        cancelarUL.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarUL.setForeground(new java.awt.Color(255, 255, 255));
        cancelarUL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cancelarUL.setText("CANCELAR");
        cancelarUL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarUL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarUL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarULMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(modificarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addComponent(cancelarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarUL)
                    .addComponent(modificarUL))
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
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(origenUL)
                    .addComponent(idUL)
                    .addComponent(nombreUL)
                    .addComponent(estatusUL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idtxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origentxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombretxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatusCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(origentxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origenUL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estatusUL)
                    .addComponent(estatusCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Modificar Laboratorio");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método que tiene como función retornar a la ventana MostrarLaboratorios
     *
     * @param evt evento que se activa al dar click
     */
    private void cancelarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarULMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarLaboratorios mostrarLab = new mostrarLaboratorios();
        mostrarLab.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarLab.setVisible(true);
        mostrarLab.activeEventListenerMostrarLab();
        mainPrincipal.getworkSpace().add(mostrarLab, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
        mostrarLab.setMostrarLaboratorios(mainPrincipal);
    }//GEN-LAST:event_cancelarULMouseClicked

    /**
     * Método que funciona para guardar los datos modificados
     *
     * @param evt evento al dar click
     */
    private void modificarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarULMouseClicked
        if (nombretxtUL.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre valido", "Error", JOptionPane.ERROR_MESSAGE);
            nombretxtUL.requestFocus();
        } else if (origentxtUL.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un origen valido", "Error", JOptionPane.ERROR_MESSAGE);
            origentxtUL.requestFocus();
        } else if (estatusCBox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "selecciona un estatus", "Error", JOptionPane.ERROR_MESSAGE);
            estatusCBox.requestFocus();
        } else {

            CRUDgenerico guardarLab = new DAOLaboratoriosImp();
            //Datos obtenidos de los campos 
            int id = Integer.parseInt(this.idtxtUL.getText());
            String nombre = this.nombretxtUL.getText();
            String origen = this.origentxtUL.getText();
            char estatus = String.valueOf(this.estatusCBox.getSelectedItem()).charAt(0);
            //Guardar los datos de laboratorio
            guardarLab.upadate(new Laboratorios(id, nombre, origen, estatus));
        }
    }//GEN-LAST:event_modificarULMouseClicked

    private void modificarULMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarULMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarULMouseEntered

    private void idtxtULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtULActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtULActionPerformed

    /**
     * Método que funciona para abstraer los datos del laboratotio
     */
    public void ObtenerLaboratoriModificar(Laboratorios lab) {
        this.idtxtUL.setText(String.valueOf(lab.getId()));
        this.nombretxtUL.setText(lab.getNombre());
        this.origentxtUL.setText(lab.getOrigen());
        if (lab.getEstatus() == 'A') {
            this.estatusCBox.setSelectedIndex(1);
        } else {
            this.estatusCBox.setSelectedIndex(2);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelarUL;
    private javax.swing.JComboBox<String> estatusCBox;
    private javax.swing.JLabel estatusUL;
    private javax.swing.JLabel idUL;
    private javax.swing.JTextField idtxtUL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel modificarUL;
    private javax.swing.JLabel nombreUL;
    private javax.swing.JTextField nombretxtUL;
    private javax.swing.JLabel origenUL;
    private javax.swing.JTextField origentxtUL;
    // End of variables declaration//GEN-END:variables
}
