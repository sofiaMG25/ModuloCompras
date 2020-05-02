/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.PedidoDetalle;

import DAOs.DAOPedidoDetalleImp;
import DAOs.PedidoDetalle;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import MainPrincipal.Main;

/**
 *
 * @author 52351
 */
public class agregarPedidoDetalle extends javax.swing.JPanel {

    /**
     * Creates new form agregarEmpaque
     */
    public agregarPedidoDetalle() {
        initComponents();
        mostrarLaboratorios();
        mostrarCategorias();
        
    }

    private void mostrarLaboratorios() {
        LinkedList<PedidoDetalle> productosLab = new DAOPedidoDetalleImp().obternerIdPedido();
        DefaultComboBoxModel model = (DefaultComboBoxModel) txtPedido.getModel();
        for (int i = 0; i < productosLab.size(); i++) {
            model.addElement(productosLab.get(i).getIdPedido());
            System.out.println(productosLab.get(i).getIdPedido());
        }
        txtPedido.setModel(model);
    }
    
    private void mostrarCategorias() {
        LinkedList<PedidoDetalle> productosCat = new DAOPedidoDetalleImp().obternerIdPresentacion();
        DefaultComboBoxModel model = (DefaultComboBoxModel) txtPresentacion.getModel();
        for (int i = 0; i < productosCat.size(); i++) {
            model.addElement(productosCat.get(i).getIdPresentacion());
        }
        txtPresentacion.setModel(model);
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
        cancelarAPediDet = new javax.swing.JLabel();
        guardarAPediDet = new javax.swing.JLabel();
        txtCantPedido = new javax.swing.JTextField();
        origenUEmp1 = new javax.swing.JLabel();
        origenUEmp2 = new javax.swing.JLabel();
        nombreUEmp = new javax.swing.JLabel();
        origenUEmp3 = new javax.swing.JLabel();
        origenUEmp = new javax.swing.JLabel();
        origenUEmp5 = new javax.swing.JLabel();
        origenUEmp8 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtPresentacion = new javax.swing.JComboBox<>();
        estatusUEmp = new javax.swing.JLabel();
        txtCantRech = new javax.swing.JTextField();
        txtPedido = new javax.swing.JComboBox<>();
        txtCantAcep = new javax.swing.JTextField();
        txtCantReci = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Agregar un nuevo empaque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        opcionesAEmp.setBackground(new java.awt.Color(48, 45, 45));

        cancelarAPediDet.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarAPediDet.setForeground(new java.awt.Color(255, 255, 255));
        cancelarAPediDet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cancelarAPediDet.setText("CANCELAR");
        cancelarAPediDet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarAPediDet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarAPediDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarAPediDetMouseClicked(evt);
            }
        });

        guardarAPediDet.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        guardarAPediDet.setForeground(new java.awt.Color(255, 255, 255));
        guardarAPediDet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        guardarAPediDet.setText("GUARDAR ");
        guardarAPediDet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        guardarAPediDet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarAPediDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarAPediDetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarAPediDetMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout opcionesAEmpLayout = new javax.swing.GroupLayout(opcionesAEmp);
        opcionesAEmp.setLayout(opcionesAEmpLayout);
        opcionesAEmpLayout.setHorizontalGroup(
            opcionesAEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesAEmpLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(guardarAPediDet, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(cancelarAPediDet, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        opcionesAEmpLayout.setVerticalGroup(
            opcionesAEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesAEmpLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(opcionesAEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarAPediDet)
                    .addComponent(cancelarAPediDet))
                .addContainerGap())
        );

        origenUEmp1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp1.setText("SUBTOTAL:");

        origenUEmp2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp2.setText("CANT RECIBIDA:");

        nombreUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreUEmp.setText("CANT PEDIDA:");

        origenUEmp3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp3.setText("CANT RECHAZADA:");

        origenUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp.setText("PRECIOCOMPRA:");

        origenUEmp5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp5.setText("CANT ACEPTADA:");

        origenUEmp8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp8.setText("ID PRESENTACIÓN:");

        txtPresentacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPresentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        estatusUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusUEmp.setText("ID PEDIDO:");

        txtPedido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        txtPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcionesAEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreUEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(origenUEmp5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(origenUEmp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(origenUEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(origenUEmp3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(origenUEmp2)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantRech, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(txtCantAcep)
                            .addComponent(txtCantReci))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estatusUEmp)
                    .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origenUEmp8)
                    .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreUEmp)
                            .addComponent(estatusUEmp)
                            .addComponent(txtCantPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(origenUEmp)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(origenUEmp1)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(origenUEmp8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(origenUEmp3)
                        .addComponent(txtCantRech, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp2)
                    .addComponent(txtCantReci, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp5)
                    .addComponent(txtCantAcep, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(opcionesAEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarAPediDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarAPediDetMouseClicked
        if (txtCantPedido.getText().equals("") || Float.parseFloat(txtCantPedido.getText()) <1000) {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad valida", "Error", JOptionPane.ERROR_MESSAGE);
            txtCantPedido.requestFocus();
        }
            if (txtSubtotal.getText().equals("")||Float.parseFloat(txtCantRech.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese una cantidad valida", "Error", JOptionPane.ERROR_MESSAGE);
                txtSubtotal.requestFocus();
            } else if (txtCantRech.getText().equals("") || Float.parseFloat(txtCantRech.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Ingrese una cantidad valida", "Error", JOptionPane.ERROR_MESSAGE);
                txtCantRech.requestFocus();
            } else if (txtCantReci.getText().equals("") || Float.parseFloat(txtCantReci.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese una cantidad valida", "Error", JOptionPane.ERROR_MESSAGE);
                txtCantReci.requestFocus();
            } else if (txtCantAcep.getText().equals("") || Float.parseFloat(txtCantAcep.getText())< 0) {
                JOptionPane.showMessageDialog(this, "Ingrese una cantidad valida", "Error", JOptionPane.ERROR_MESSAGE);
                txtCantAcep.requestFocus();
            } else if (txtPedido.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Elija un pedido válido ", "Error", JOptionPane.ERROR_MESSAGE);
                txtPedido.requestFocus();
            } else if (txtPresentacion.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Elija una presentación valida ", "Error", JOptionPane.ERROR_MESSAGE);
                txtPresentacion.requestFocus();
            } else {
            
                new DAOPedidoDetalleImp().Insert(new PedidoDetalle(
                Integer.parseInt(txtCantPedido.getText()),Float.parseFloat(txtPrecioCompra.getText()),
                Float.parseFloat(txtSubtotal.getText()),Integer.parseInt(txtCantReci.getText()),
                Integer.parseInt(txtCantRech.getText()),Float.parseFloat(txtCantAcep.getText()),
                txtPedido.getSelectedItem().toString(),txtPresentacion.getSelectedItem().toString()
                ));
                
                limpiarVariables();
            
        }

    }//GEN-LAST:event_guardarAPediDetMouseClicked

    private void cancelarAPediDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarAPediDetMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarPedidoDetalle mostrarPro = new mostrarPedidoDetalle();
        mostrarPro.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarPro.setVisible(true);
        mostrarPro.setMostrarPedidoDetalle(mainPrincipal);
        mostrarPro.MostrarDatosPedidoDetalle();
        mainPrincipal.getworkSpace().add(mostrarPro, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();

    }//GEN-LAST:event_cancelarAPediDetMouseClicked

    private void limpiarVariables(){
        txtCantPedido.setText("");
        txtSubtotal.setText("");
        txtCantRech.setText("");
        txtCantReci.setText("");
        txtCantAcep.setText("");
        txtCantAcep.setText("");
        txtPresentacion.setSelectedIndex(0);
        txtPedido.setSelectedIndex(0);      
    }
    
    
    
    private void guardarAPediDetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarAPediDetMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarAPediDetMouseEntered

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelarAPediDet;
    private javax.swing.JLabel estatusUEmp;
    private javax.swing.JLabel guardarAPediDet;
    private javax.swing.JLabel nombreUEmp;
    private javax.swing.JPanel opcionesAEmp;
    private javax.swing.JLabel origenUEmp;
    private javax.swing.JLabel origenUEmp1;
    private javax.swing.JLabel origenUEmp2;
    private javax.swing.JLabel origenUEmp3;
    private javax.swing.JLabel origenUEmp5;
    private javax.swing.JLabel origenUEmp8;
    private javax.swing.JTextField txtCantAcep;
    private javax.swing.JTextField txtCantPedido;
    private javax.swing.JTextField txtCantRech;
    private javax.swing.JTextField txtCantReci;
    private javax.swing.JComboBox<String> txtPedido;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JComboBox<String> txtPresentacion;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables

}
