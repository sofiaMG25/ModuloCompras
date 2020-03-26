/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ExistenciaSucursal;

import DAOs.DAOExistenciaSucursalImp;
import DAOs.ExistenciaSucursal;
import DAOs.Presentaciones;
import DAOs.Sucursales;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AgregarExistenciaSucursal extends javax.swing.JPanel {

    /**
     * Creates new form AgregarExistenciaSucursal
     */
    public AgregarExistenciaSucursal() {
        initComponents();
        exSuc = new DAOExistenciaSucursalImp().getsIDSU();
        exPre = new DAOExistenciaSucursalImp().getsIDPR();
        if ((exSuc == null || exSuc.size() < 0) && (exPre == null || exPre.size() < 0)) {

            JOptionPane.showMessageDialog(this, "Sucursal o presentación, no esta registrado", "Error",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            DefaultComboBoxModel modelo1 = (DefaultComboBoxModel) idPresentacionBox.getModel();
            DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) idSucursalBox.getModel();
            for (int i = 0; i < exSuc.size(); i++) {
                modelo1.addElement(exSuc.get(i).getIdSucursal());
            }

            for (int i = 0; i < exPre.size(); i++) {
                modelo2.addElement(exPre.get(i).getIdPP());
            }

            idSucursalBox.setModel(modelo1);
            idPresentacionBox.setModel(modelo2);
        }

    }

    LinkedList<Sucursales> exSuc;
    LinkedList<Presentaciones> exPre;
    private Main mainPrincipal;
    private int cambioPagina = 1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        opcionesMostrarSuc = new javax.swing.JPanel();
        nuevaSuc = new javax.swing.JLabel();
        cancelarMS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        idPresentacion = new javax.swing.JLabel();
        idSucursal = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        cantidadTxt = new javax.swing.JTextField();
        idPresentacionBox = new javax.swing.JComboBox<>();
        idSucursalBox = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(233, 231, 231));

        opcionesMostrarSuc.setBackground(new java.awt.Color(48, 45, 45));

        nuevaSuc.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        nuevaSuc.setForeground(new java.awt.Color(255, 255, 255));
        nuevaSuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        nuevaSuc.setText("GURDAR ");
        nuevaSuc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        nuevaSuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevaSuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevaSucMouseClicked(evt);
            }
        });

        cancelarMS.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarMS.setForeground(new java.awt.Color(255, 255, 255));
        cancelarMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        cancelarMS.setText("CANCELAR");
        cancelarMS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarMS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesMostrarSucLayout = new javax.swing.GroupLayout(opcionesMostrarSuc);
        opcionesMostrarSuc.setLayout(opcionesMostrarSucLayout);
        opcionesMostrarSucLayout.setHorizontalGroup(
            opcionesMostrarSucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarSucLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(nuevaSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarMS, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        opcionesMostrarSucLayout.setVerticalGroup(
            opcionesMostrarSucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesMostrarSucLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(opcionesMostrarSucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarMS)
                    .addComponent(nuevaSuc))
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(233, 231, 231));

        idPresentacion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idPresentacion.setText("ID PRESENTACIÓN:");

        idSucursal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idSucursal.setText("ID SUCURSAL:");

        cantidad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cantidad.setText("CANTIDAD:");

        cantidadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadTxtActionPerformed(evt);
            }
        });

        idPresentacionBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        idPresentacionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        idSucursalBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        idSucursalBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idSucursal)
                    .addComponent(idPresentacion)
                    .addComponent(cantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idSucursalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idPresentacionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPresentacion)
                    .addComponent(idPresentacionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSucursal)
                    .addComponent(idSucursalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionesMostrarSuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(opcionesMostrarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaSucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevaSucMouseClicked
        try {
            if (idPresentacionBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecciona una idPresentacion", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (idSucursalBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecciona una idSucursal", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (cantidadTxt.getText().equals("") || Integer.parseInt(cantidadTxt.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "Número invalido", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                   new DAOExistenciaSucursalImp().Insert(new ExistenciaSucursal
                                                (Integer.parseInt(idPresentacionBox.getSelectedItem().toString()), 
                                                 Integer.parseInt(idSucursalBox.getSelectedItem().toString()), 
                                                 Integer.parseInt(cantidadTxt.getText().toString())));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Solo numeros enteros en catidad", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nuevaSucMouseClicked

    private void cancelarMSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMSMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        MostrarExistenciaSucursal mostrarExiSuc = new MostrarExistenciaSucursal();
        mostrarExiSuc.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarExiSuc.setVisible(true);
        mostrarExiSuc.MostrarDatosExistenciasSucursal();
        mainPrincipal.getworkSpace().add(mostrarExiSuc, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
        mostrarExiSuc.setMostrarPresentaciones(mainPrincipal);
    }//GEN-LAST:event_cancelarMSMouseClicked

    private void cantidadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelarMS;
    private javax.swing.JLabel cantidad;
    private javax.swing.JTextField cantidadTxt;
    private javax.swing.JLabel idPresentacion;
    private javax.swing.JComboBox<String> idPresentacionBox;
    private javax.swing.JLabel idSucursal;
    private javax.swing.JComboBox<String> idSucursalBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nuevaSuc;
    private javax.swing.JPanel opcionesMostrarSuc;
    // End of variables declaration//GEN-END:variables

    void setMain(Main main) {

        mainPrincipal = main;
    }
}
