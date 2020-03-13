/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Productos;

import Vistas.Empaques.*;
import DAOs.DAOEmpaquesImp;
import DAOs.DAOProductosImp;
import DAOs.Empaques;
import DAOs.Productos;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import MainPrincipal.Main;

/**
 *
 * @author 52351
 */
public class agregarProducto extends javax.swing.JPanel {

    /**
     * Creates new form agregarEmpaque
     */
    public agregarProducto() {
        initComponents();
        mostrarLaboratorios();
        mostrarCategorias();
    }

    private void mostrarLaboratorios() {
        LinkedList<Productos> productosLab = new DAOProductosImp().obternerIdLaboratorios();
        DefaultComboBoxModel model = (DefaultComboBoxModel) JCBoxLaboUPro.getModel();
        for (int i = 0; i < productosLab.size(); i++) {
            model.addElement(productosLab.get(i).getIdLab());
        }
        JCBoxLaboUPro.setModel(model);
    }
    
    private void mostrarCategorias() {
        LinkedList<Productos> productosCat = new DAOProductosImp().obternerIdCategorias();
        DefaultComboBoxModel model = (DefaultComboBoxModel) JCBoxCateUPro.getModel();
        for (int i = 0; i < productosCat.size(); i++) {
            model.addElement(productosCat.get(i).getIdCat());
        }
        JCBoxCateUPro.setModel(model);
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

        opcionesAEmp = new javax.swing.JPanel();
        cancelarAPro = new javax.swing.JLabel();
        guardarAPro = new javax.swing.JLabel();
        PreComtxt = new javax.swing.JTextField();
        PunReotxt = new javax.swing.JTextField();
        origenUEmp = new javax.swing.JLabel();
        origenUEmp7 = new javax.swing.JLabel();
        origenUEmp6 = new javax.swing.JLabel();
        IngActtxt = new javax.swing.JTextField();
        BanToxitxt = new javax.swing.JTextField();
        origenUEmp3 = new javax.swing.JLabel();
        PreVentxt = new javax.swing.JTextField();
        origenUEmp2 = new javax.swing.JLabel();
        Desctxt = new javax.swing.JTextField();
        JCBoxLaboUPro = new javax.swing.JComboBox<>();
        Usotxt = new javax.swing.JTextField();
        JCBoxCateUPro = new javax.swing.JComboBox<>();
        estatusUEmp = new javax.swing.JLabel();
        nombretxtPro = new javax.swing.JTextField();
        origenUEmp1 = new javax.swing.JLabel();
        Aplictxt = new javax.swing.JTextField();
        origenUEmp4 = new javax.swing.JLabel();
        nombreUEmp = new javax.swing.JLabel();
        origenUEmp8 = new javax.swing.JLabel();
        origenUEmp5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Agregar un nuevo empaque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        opcionesAEmp.setBackground(new java.awt.Color(48, 45, 45));

        cancelarAPro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarAPro.setForeground(new java.awt.Color(255, 255, 255));
        cancelarAPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cancelarAPro.setText("CANCELAR");
        cancelarAPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarAPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarAPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarAProMouseClicked(evt);
            }
        });

        guardarAPro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        guardarAPro.setForeground(new java.awt.Color(255, 255, 255));
        guardarAPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        guardarAPro.setText("GUARDAR ");
        guardarAPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        guardarAPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarAPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarAProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarAProMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout opcionesAEmpLayout = new javax.swing.GroupLayout(opcionesAEmp);
        opcionesAEmp.setLayout(opcionesAEmpLayout);
        opcionesAEmpLayout.setHorizontalGroup(
            opcionesAEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesAEmpLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(guardarAPro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(cancelarAPro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        opcionesAEmpLayout.setVerticalGroup(
            opcionesAEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesAEmpLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(opcionesAEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarAPro)
                    .addComponent(guardarAPro))
                .addGap(45, 45, 45))
        );

        origenUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp.setText("DESCRIPCIÓN:");

        origenUEmp7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp7.setText("USO:");

        origenUEmp6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp6.setText("APLICACIÓN:");

        BanToxitxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanToxitxtActionPerformed(evt);
            }
        });

        origenUEmp3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp3.setText("PRECIO COMPRA:");

        origenUEmp2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp2.setText("PRECIO VENTA:");

        JCBoxLaboUPro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JCBoxLaboUPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        JCBoxCateUPro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JCBoxCateUPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        estatusUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusUEmp.setText("ID LABORATORIO:");

        origenUEmp1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp1.setText("PUNTO REORDEN:");

        origenUEmp4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp4.setText("BANDA TOXICOLÓGICA:");

        nombreUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreUEmp.setText("NOMBRE:");

        origenUEmp8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp8.setText("ID CATEGORIA:");

        origenUEmp5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp5.setText("INGREDIENTE ACTIVO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionesAEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(origenUEmp2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PreVentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(origenUEmp5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IngActtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreUEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombretxtPro, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(origenUEmp6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Aplictxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(origenUEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Desctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(origenUEmp7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Usotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(origenUEmp1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PunReotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(origenUEmp3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PreComtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(origenUEmp8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCBoxCateUPro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(estatusUEmp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCBoxLaboUPro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(origenUEmp4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BanToxitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUEmp)
                    .addComponent(nombretxtPro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origenUEmp6)
                    .addComponent(Aplictxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp)
                    .addComponent(Desctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origenUEmp7)
                    .addComponent(Usotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp1)
                    .addComponent(PunReotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatusUEmp)
                    .addComponent(JCBoxLaboUPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp8)
                    .addComponent(JCBoxCateUPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origenUEmp3)
                    .addComponent(PreComtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp2)
                    .addComponent(PreVentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp5)
                    .addComponent(IngActtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp4)
                    .addComponent(BanToxitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(opcionesAEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarAProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarAProMouseClicked
        if (nombretxtPro.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Ingrese un nombre válido","Error",JOptionPane.ERROR_MESSAGE);
            nombretxtPro.requestFocus();
        }else if(Desctxt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese una descripción válido","Error",JOptionPane.ERROR_MESSAGE);
         Desctxt.requestFocus();
        } else if (PunReotxt.getText().equals("") || Integer.parseInt(PunReotxt.getText()) <= 0) {
            JOptionPane.showMessageDialog(this,"Ingrese un entero válido ","Error",JOptionPane.ERROR_MESSAGE);
            PunReotxt.requestFocus();
        } else if (PreComtxt.getText().equals("") || Integer.parseInt(PreComtxt.getText()) <= 0) {
            JOptionPane.showMessageDialog(this,"Ingrese un precio válido ","Error",JOptionPane.ERROR_MESSAGE);
            PreComtxt.requestFocus();
        } else if (PreVentxt.getText().equals("") || Integer.parseInt(PreVentxt.getText()) <= 0) {
            JOptionPane.showMessageDialog(this,"Ingrese un precio válido ","Error",JOptionPane.ERROR_MESSAGE);
            PreVentxt.requestFocus();
        }else if(IngActtxt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese un ingrediente válido ","Error",JOptionPane.ERROR_MESSAGE);
         IngActtxt.requestFocus();
        }else if(BanToxitxt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese una banda toxicológica válida ","Error",JOptionPane.ERROR_MESSAGE);
         BanToxitxt.requestFocus();
        }else if(Aplictxt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese una aplicación válida ","Error",JOptionPane.ERROR_MESSAGE);
         Aplictxt.requestFocus();
        }else if(Usotxt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingrese un uso válido ","Error",JOptionPane.ERROR_MESSAGE);
         Usotxt.requestFocus();
        } else if (JCBoxLaboUPro.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this,"Elija un laboratorio válido ","Error",JOptionPane.ERROR_MESSAGE);
            JCBoxLaboUPro.requestFocus();
        } else if (JCBoxCateUPro.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this,"Elija una categoria válido ","Error",JOptionPane.ERROR_MESSAGE);
            JCBoxCateUPro.requestFocus();
        } else {
            try {
                new DAOProductosImp().Insert(new Productos(0,nombretxtPro.getText(),
        Desctxt.getText(),
        Integer.parseInt(PunReotxt.getText()),
        Float.parseFloat(PreComtxt.getText()),
        Float.parseFloat(PreVentxt.getText()),
        IngActtxt.getText(),
        BanToxitxt.getText(),
        Aplictxt.getText(),
        Usotxt.getText(),
        'A',                
        JCBoxCateUPro.getSelectedItem().toString(),
        JCBoxLaboUPro.getSelectedItem().toString()));
                limpiarVariables();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Capacidad solo numeros", "Error de tipo de dato", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_guardarAProMouseClicked

    private void cancelarAProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarAProMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarProductos mostrarPro = new mostrarProductos();
        mostrarPro.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarPro.setVisible(true);
        mostrarPro.setMostrarEmpaques(mainPrincipal);
        mostrarPro.MostrarDatosProductos();
        mainPrincipal.getworkSpace().add(mostrarPro, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();

    }//GEN-LAST:event_cancelarAProMouseClicked

    private void limpiarVariables(){
        nombretxtPro.setText("");
        Desctxt.setText("");
        PunReotxt.setText("");
        PreComtxt.setText("");
        PreVentxt.setText("");
        IngActtxt.setText("");
        BanToxitxt.setText("");
        Aplictxt.setText("");
        Usotxt.setText("");
        JCBoxCateUPro.setSelectedIndex(0);
        JCBoxLaboUPro.setSelectedIndex(0);   
    }
    
    private void guardarAProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarAProMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarAProMouseEntered

    private void BanToxitxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanToxitxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BanToxitxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aplictxt;
    private javax.swing.JTextField BanToxitxt;
    private javax.swing.JTextField Desctxt;
    private javax.swing.JTextField IngActtxt;
    private javax.swing.JComboBox<String> JCBoxCateUPro;
    private javax.swing.JComboBox<String> JCBoxLaboUPro;
    private javax.swing.JTextField PreComtxt;
    private javax.swing.JTextField PreVentxt;
    private javax.swing.JTextField PunReotxt;
    private javax.swing.JTextField Usotxt;
    private javax.swing.JLabel cancelarAPro;
    private javax.swing.JLabel estatusUEmp;
    private javax.swing.JLabel guardarAPro;
    private javax.swing.JLabel nombreUEmp;
    private javax.swing.JTextField nombretxtPro;
    private javax.swing.JPanel opcionesAEmp;
    private javax.swing.JLabel origenUEmp;
    private javax.swing.JLabel origenUEmp1;
    private javax.swing.JLabel origenUEmp2;
    private javax.swing.JLabel origenUEmp3;
    private javax.swing.JLabel origenUEmp4;
    private javax.swing.JLabel origenUEmp5;
    private javax.swing.JLabel origenUEmp6;
    private javax.swing.JLabel origenUEmp7;
    private javax.swing.JLabel origenUEmp8;
    // End of variables declaration//GEN-END:variables

}