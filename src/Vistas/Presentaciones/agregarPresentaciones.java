/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Presentaciones;

import Vistas.Empaques.*;
import DAOs.DAOEmpaquesImp;
import DAOs.DAOPresentacionesImp;
import DAOs.Empaques;
import DAOs.Presentaciones;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import MainPrincipal.Main;

/**
 *
 * @author 52351
 */
public class agregarPresentaciones extends javax.swing.JPanel {

    /**
     * Creates new form agregarEmpaque
     */
    public agregarPresentaciones() {
        initComponents();
        mostrarEmpaques();
        mostrarProductos();
    }

    private void mostrarEmpaques() {
        LinkedList<Presentaciones> empaquesUnidad = new DAOPresentacionesImp().obtenerIdEmpaque();
        DefaultComboBoxModel model = (DefaultComboBoxModel) comboxEmpaque.getModel();
        for (int i = 0; i < empaquesUnidad.size(); i++) {
            model.addElement(empaquesUnidad.get(i).getIdEmpaque());
        }
        comboxEmpaque.setModel(model);
    }
    private void mostrarProductos() {
        LinkedList<Presentaciones> productosUnidad = new DAOPresentacionesImp().obtenerIdProducto();
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) comboxProducto.getModel();
        for (int i = 0; i < productosUnidad.size(); i++) {
            model2.addElement(productosUnidad.get(i).getIdProducto());
        }
        comboxProducto.setModel(model2);
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

        pCompras = new javax.swing.JLabel();
        precioVentas = new javax.swing.JLabel();
        pCompratxtPre = new javax.swing.JTextField();
        pVentatxtPre = new javax.swing.JTextField();
        opcionesAEmp = new javax.swing.JPanel();
        cancelarAEmp = new javax.swing.JLabel();
        guardarAEmp = new javax.swing.JLabel();
        prodcutos = new javax.swing.JLabel();
        comboxProducto = new javax.swing.JComboBox();
        puntoReordenn = new javax.swing.JLabel();
        pReordentxtPre = new javax.swing.JTextField();
        empaques = new javax.swing.JLabel();
        comboxEmpaque = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Agregar nueva Presentacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        pCompras.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pCompras.setText("PRECIO COMPRA: ");

        precioVentas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        precioVentas.setText("PRECIO VENTA: ");

        pCompratxtPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pCompratxtPreActionPerformed(evt);
            }
        });

        opcionesAEmp.setBackground(new java.awt.Color(48, 45, 45));

        cancelarAEmp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarAEmp.setForeground(new java.awt.Color(255, 255, 255));
        cancelarAEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cancelarAEmp.setText("CANCELAR");
        cancelarAEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarAEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarAEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarAEmpMouseClicked(evt);
            }
        });

        guardarAEmp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        guardarAEmp.setForeground(new java.awt.Color(255, 255, 255));
        guardarAEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        guardarAEmp.setText("GUARDAR ");
        guardarAEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        guardarAEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarAEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarAEmpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarAEmpMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout opcionesAEmpLayout = new javax.swing.GroupLayout(opcionesAEmp);
        opcionesAEmp.setLayout(opcionesAEmpLayout);
        opcionesAEmpLayout.setHorizontalGroup(
            opcionesAEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesAEmpLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(guardarAEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addComponent(cancelarAEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        opcionesAEmpLayout.setVerticalGroup(
            opcionesAEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesAEmpLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(opcionesAEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarAEmp)
                    .addComponent(guardarAEmp))
                .addGap(45, 45, 45))
        );

        prodcutos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prodcutos.setText("PRODUCTO:");

        comboxProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        comboxProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONA UN PRODUCTO" }));

        puntoReordenn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        puntoReordenn.setText("PUNTO REORDEN: ");

        empaques.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        empaques.setText("EMPAQUE");

        comboxEmpaque.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        comboxEmpaque.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONA UN EMPAQUE" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcionesAEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prodcutos)
                    .addComponent(pCompras)
                    .addComponent(precioVentas)
                    .addComponent(puntoReordenn)
                    .addComponent(empaques))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pVentatxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCompratxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pReordentxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxEmpaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pCompras)
                    .addComponent(pCompratxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pVentatxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntoReordenn)
                    .addComponent(pReordentxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodcutos)
                    .addComponent(comboxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empaques)
                    .addComponent(comboxEmpaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(opcionesAEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarAEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarAEmpMouseClicked
        if (pCompratxtPre.getText().equals("") || Float.parseFloat(pCompratxtPre.getText()) <= 0) {
            pCompratxtPre.requestFocus();
        } else if (pVentatxtPre.getText().equals("") || Float.parseFloat(pVentatxtPre.getText()) <= 0) {
            pVentatxtPre.requestFocus();
        } else if (pReordentxtPre.getText().equals("") || Float.parseFloat(pReordentxtPre.getText()) <= 0) {
            pReordentxtPre.requestFocus();
        } else if (comboxProducto.getSelectedIndex() <= 0) {
            comboxProducto.requestFocus();
        } else if (comboxEmpaque.getSelectedIndex() <= 0) {
            comboxEmpaque.requestFocus();
        } else {
            try {
                new DAOPresentacionesImp().Insert(new Presentaciones( Float.parseFloat(pCompratxtPre.getText()),
                        Float.parseFloat(pVentatxtPre.getText()), Float.parseFloat(pReordentxtPre.getText()),
                        comboxProducto.getSelectedItem().toString(), comboxEmpaque.getSelectedItem().toString()));
                limpiarVariables();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Capacidad solo numeros", "Error de tipo de dato", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_guardarAEmpMouseClicked

    private void cancelarAEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarAEmpMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarPresentaciones mostrarPre = new mostrarPresentaciones();
        mostrarPre.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarPre.setVisible(true);
        mostrarPre.setMostrarPresentaciones(mainPrincipal);
        mostrarPre.MostrarDatosPresentaciones();
        mainPrincipal.getworkSpace().add(mostrarPre, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();

    }//GEN-LAST:event_cancelarAEmpMouseClicked

    private void limpiarVariables(){
        pCompratxtPre.setText("");
        pVentatxtPre.setText("");
        pReordentxtPre.setText("");
        comboxProducto.setSelectedIndex(0);
        comboxEmpaque.setSelectedIndex(0);
    }
    
    private void guardarAEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarAEmpMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarAEmpMouseEntered

    private void pCompratxtPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pCompratxtPreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pCompratxtPreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelarAEmp;
    private javax.swing.JComboBox comboxEmpaque;
    private javax.swing.JComboBox comboxProducto;
    private javax.swing.JLabel empaques;
    private javax.swing.JLabel guardarAEmp;
    private javax.swing.JPanel opcionesAEmp;
    private javax.swing.JLabel pCompras;
    private javax.swing.JTextField pCompratxtPre;
    private javax.swing.JTextField pReordentxtPre;
    private javax.swing.JTextField pVentatxtPre;
    private javax.swing.JLabel precioVentas;
    private javax.swing.JLabel prodcutos;
    private javax.swing.JLabel puntoReordenn;
    // End of variables declaration//GEN-END:variables

}