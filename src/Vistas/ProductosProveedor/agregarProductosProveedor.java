/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ProductosProveedor;

import Vistas.ProductosProveedor.*;
import DAOs.DAOProductoProveedorImp;
import DAOs.Presentaciones;
import DAOs.ProductoProveedor;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import MainPrincipal.Main;

/**
 *
 * @author 52351
 */
public class agregarProductosProveedor extends javax.swing.JPanel {

    /**
     * Creates new form agregarEmpaque
     */
    public agregarProductosProveedor() {
        initComponents();
        mostrarProvedores();
        mostrarPresentaciones();
    }

    private void mostrarProvedores() {
        LinkedList<ProductoProveedor> prov = new DAOProductoProveedorImp().obtenerIdProveedor();
        if (prov != null) {
            DefaultComboBoxModel model = (DefaultComboBoxModel) proveedorCbx.getModel();
            for (int i = 0; i < prov.size(); i++) {
                model.addElement(prov.get(i).getIdProveedor());
            }
            proveedorCbx.setModel(model);
        }
    }

    private void mostrarPresentaciones() {
        LinkedList<ProductoProveedor> pres = new DAOProductoProveedorImp().obtenerIdPresentaciones();
        if (pres != null) {
            DefaultComboBoxModel model2 = (DefaultComboBoxModel) presentacionCbx.getModel();
            for (int i = 0; i < pres.size(); i++) {
                model2.addElement(pres.get(i).getIdPresentaciones());
            }
            presentacionCbx.setModel(model2);
        }
    }

    private Main mainPrincipal;

    public void setMainPrincipal(Main main) {
        mainPrincipal = main;
    }

    /**
     * 
     * 
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreAEmp = new javax.swing.JLabel();
        capacidadEmp = new javax.swing.JLabel();
        dRetrasotxt = new javax.swing.JTextField();
        pEstandartxt = new javax.swing.JTextField();
        opcionesAEmp = new javax.swing.JPanel();
        cancelarAEmp = new javax.swing.JLabel();
        guardarAEmp = new javax.swing.JLabel();
        unidadEmp = new javax.swing.JLabel();
        proveedorCbx = new javax.swing.JComboBox();
        unidadEmp1 = new javax.swing.JLabel();
        capacidadEmp1 = new javax.swing.JLabel();
        capacidadEmp2 = new javax.swing.JLabel();
        capacidadEmp3 = new javax.swing.JLabel();
        presentacionCbx = new javax.swing.JComboBox();
        pUltCompratxt = new javax.swing.JTextField();
        cMinPedirtxt = new javax.swing.JTextField();
        cMaxPedirtxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Agregar un nuevo prodcuto proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        nombreAEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreAEmp.setText("DÍA RETRASO:");

        capacidadEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        capacidadEmp.setText("PRECIO ESTANDAR:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        unidadEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        unidadEmp.setText("PROVEEDOR:");

        proveedorCbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        proveedorCbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONA UN PROVEEDOR" }));
        proveedorCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorCbxActionPerformed(evt);
            }
        });

        unidadEmp1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        unidadEmp1.setText("PRESENATCIÓN: ");

        capacidadEmp1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        capacidadEmp1.setText("PRECIO ULTIMA COMPRA:");

        capacidadEmp2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        capacidadEmp2.setText("CANTIDAD MIXIMA PEDIR:");

        capacidadEmp3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        capacidadEmp3.setText("CANTIDAD MINIMA PEDIR:");

        presentacionCbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        presentacionCbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONA UNA PRESENTACION" }));
        presentacionCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentacionCbxActionPerformed(evt);
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
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreAEmp)
                    .addComponent(capacidadEmp)
                    .addComponent(capacidadEmp3)
                    .addComponent(capacidadEmp2)
                    .addComponent(capacidadEmp1)
                    .addComponent(unidadEmp1)
                    .addComponent(unidadEmp))
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proveedorCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dRetrasotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presentacionCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEstandartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pUltCompratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cMinPedirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cMaxPedirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidadEmp)
                    .addComponent(proveedorCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidadEmp1)
                    .addComponent(presentacionCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAEmp)
                    .addComponent(dRetrasotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadEmp)
                    .addComponent(pEstandartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadEmp1)
                    .addComponent(pUltCompratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadEmp3)
                    .addComponent(cMinPedirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadEmp2)
                    .addComponent(cMaxPedirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(opcionesAEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarAEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarAEmpMouseClicked
        try {
            if (proveedorCbx.getSelectedIndex() <= 0) {
                proveedorCbx.requestFocus();
                JOptionPane.showMessageDialog(this, "Seleccione algun proveedor\n, en caso de no tener uno, debe registrar un proveedor", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (presentacionCbx.getSelectedIndex() <= 0) {
                presentacionCbx.requestFocus();
                JOptionPane.showMessageDialog(this, "Seleccione un producto\n, en caso de no tener uno, debe registrar un producto", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (dRetrasotxt.getText().equals("") || Integer.parseInt(dRetrasotxt.getText()) <= 0) {
                dRetrasotxt.requestFocus();
                JOptionPane.showMessageDialog(this, "Ingrese un punto de reorden", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (pEstandartxt.getText().equals("") || Float.parseFloat(pEstandartxt.getText()) <= 0) {
                pEstandartxt.requestFocus();
                JOptionPane.showMessageDialog(this, "Ingrese un precio de compra", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (pUltCompratxt.getText().equals("") || Float.parseFloat(pUltCompratxt.getText()) <= 0) {
                pUltCompratxt.requestFocus();
                JOptionPane.showMessageDialog(this, "Ingrese un precio de compra", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (cMinPedirtxt.getText().equals("") || Integer.parseInt(cMinPedirtxt.getText()) <= 0) {
                cMinPedirtxt.requestFocus();
                JOptionPane.showMessageDialog(this, "Seleccione la cantidad de producto, debe ser mayor a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (Integer.parseInt(cMinPedirtxt.getText()) >Integer.parseInt(cMaxPedirtxt.getText())) {
                cMinPedirtxt.requestFocus();
                JOptionPane.showMessageDialog(this, "Cantidad minima debe ser menor a cantidad maxima", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (cMaxPedirtxt.getText().equals("") || Integer.parseInt(cMaxPedirtxt.getText()) <= 0) {
                cMaxPedirtxt.requestFocus();
                JOptionPane.showMessageDialog(this, "Seleccione la cantidad de producto, debe ser no mayor a la existencia", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ( Integer.parseInt(cMaxPedirtxt.getText()) < Integer.parseInt(cMinPedirtxt.getText()) ) {
                cMaxPedirtxt.requestFocus();
                JOptionPane.showMessageDialog(this, "Cantidad maxima debe ser mayor a cantidad minima", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    new DAOProductoProveedorImp().Insert(new ProductoProveedor(proveedorCbx.getSelectedItem().toString(),
                            presentacionCbx.getSelectedItem().toString(), Integer.parseInt(dRetrasotxt.getText()),
                            Float.parseFloat(pEstandartxt.getText()), Float.parseFloat(pUltCompratxt.getText()),
                            Integer.parseInt(cMinPedirtxt.getText()), Integer.parseInt(cMaxPedirtxt.getText())));
                    limpiarVariables();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, " solo numeros", "Error de tipo de dato", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Capacidad solo numeros", "Error de tipo de dato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarAEmpMouseClicked

    private void cancelarAEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarAEmpMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarProductosProveedor mostrarProdProv = new mostrarProductosProveedor();
        mostrarProdProv.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarProdProv.setVisible(true);
        mostrarProdProv.setMostrarProdProv(mainPrincipal);
        mostrarProdProv.MostrarDatosProdProv();
        mainPrincipal.getworkSpace().add(mostrarProdProv, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();

    }//GEN-LAST:event_cancelarAEmpMouseClicked

    private void limpiarVariables() {
        proveedorCbx.setSelectedIndex(0);
        presentacionCbx.setSelectedIndex(0);
        dRetrasotxt.setText("");
        pEstandartxt.setText("");
        pUltCompratxt.setText("");
        cMinPedirtxt.setText("");
        cMaxPedirtxt.setText("");

    }

    private void guardarAEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarAEmpMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarAEmpMouseEntered

    private void proveedorCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorCbxActionPerformed

    private void presentacionCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentacionCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentacionCbxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cMaxPedirtxt;
    private javax.swing.JTextField cMinPedirtxt;
    private javax.swing.JLabel cancelarAEmp;
    private javax.swing.JLabel capacidadEmp;
    private javax.swing.JLabel capacidadEmp1;
    private javax.swing.JLabel capacidadEmp2;
    private javax.swing.JLabel capacidadEmp3;
    private javax.swing.JTextField dRetrasotxt;
    private javax.swing.JLabel guardarAEmp;
    private javax.swing.JLabel nombreAEmp;
    private javax.swing.JPanel opcionesAEmp;
    private javax.swing.JTextField pEstandartxt;
    private javax.swing.JTextField pUltCompratxt;
    private javax.swing.JComboBox presentacionCbx;
    private javax.swing.JComboBox proveedorCbx;
    private javax.swing.JLabel unidadEmp;
    private javax.swing.JLabel unidadEmp1;
    // End of variables declaration//GEN-END:variables

}
/*
//                    new DAOProductoProveedorImp().Insert(new ProductoProveedor(proveedorCbx.getSelectedItem().toString(),
//                            presentacionCbx.getSelectedItem().toString(), Integer.parseInt(dRetrasotxt.getText()),
//                            Float.parseFloat(pEstandartxt.getText()), Float.parseFloat(pUltCompratxt.getText()),
//                            Integer.parseInt(cMinPedirtxt.getText()), Integer.parseInt(cMaxPedirtxt.getText())));

                    String Proveedor = proveedorCbx.getSelectedItem().toString();
                    String presentacion = presentacionCbx.getSelectedItem().toString();
                    int diasRetardo = Integer.parseInt(dRetrasotxt.getText());
                    float precioEstandar = Float.parseFloat(this.pEstandartxt.getText());
                    float ultimoPrecio = Float.parseFloat(this.pUltCompratxt.getText());
                    int cantMinPedir = Integer.parseInt(cMinPedirtxt.getText());
                    int cantMaxPedir = Integer.parseInt(this.cMaxPedirtxt.getText());
                   // new DAOProductoProveedorImp().Insert(new ProductoProveedor(TOOL_TIP_TEXT_KEY, TOOL_TIP_TEXT_KEY, null, TOP_ALIGNMENT, TOP_ALIGNMENT, SOMEBITS, SOMEBITS, estatus));
                    new DAOProductoProveedorImp().Insert(new ProductoProveedor
                    (Proveedor,presentacion,diasRetardo,precioEstandar,ultimoPrecio,cantMinPedir,cantMaxPedir));
                    limpiarVariables();*/