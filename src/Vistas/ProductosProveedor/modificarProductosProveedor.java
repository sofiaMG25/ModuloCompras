/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ProductosProveedor;

import Vistas.ProductosProveedor.*;
import ClasesExtras.CRUDgenerico;
import DAOs.DAOProductoProveedorImp;
import DAOs.DAOProductoProveedor;
import DAOs.ProductoProveedor;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class modificarProductosProveedor extends javax.swing.JPanel {

    /**
     * Creates new form modificarEmpaque
     */
    private Main mainPrincipal;

    public modificarProductosProveedor() {
        initComponents();
    }

    public void setMainPrincipal(Main main) {
        mainPrincipal = main;
    }

    public void ObtenerProdProvModificar(ProductoProveedor prodProv) {
        LinkedList<ProductoProveedor> prov = new DAOs.DAOProductoProveedorImp().obtenerIdProveedor();
        DefaultComboBoxModel model = (DefaultComboBoxModel) proveedorCBox.getModel();
        for (int i = 0; i < prov.size(); i++) {
            model.addElement(prov.get(i).getIdProveedor());
        }
        proveedorCBox.setModel(model);
        for (int i = 0; i < proveedorCBox.getItemCount(); i++) {
            if (proveedorCBox.getItemAt(i).equals(prodProv.getIdProveedor())) {
                this.proveedorCBox.setSelectedIndex(i);
                break;
            }
        }
        LinkedList<ProductoProveedor> pres = new DAOs.DAOProductoProveedorImp().obtenerIdPresentaciones();
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) presentacionCBox.getModel();
        for (int i = 0; i < pres.size(); i++) {
            model2.addElement(pres.get(i).getIdPresentaciones());
        }
        presentacionCBox.setModel(model2);
        for (int i = 0; i < presentacionCBox.getItemCount(); i++) {
            if (presentacionCBox.getItemAt(i).equals(prodProv.getIdPresentaciones())) {
                this.presentacionCBox.setSelectedIndex(i);
                break;
            }
        }
        this.dRetardotxt.setText(String.valueOf(prodProv.getDiasRetardo()));
        this.pEstandartxt.setText(String.valueOf(prodProv.getPrecioEstandar()));
        this.pUltimaCompratxt.setText(String.valueOf(prodProv.getPrecioUltCompra()));
        this.cMinPedirtxt.setText(String.valueOf(prodProv.getCantMinPedir()));
        this.cMaxPedirtxt.setText(String.valueOf(prodProv.getCantMaxPedir()));
        if (prodProv.getEstatus() == 'A') {
            this.estatusBox.setSelectedIndex(1);
        } else {
            this.estatusBox.setSelectedIndex(2);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estatusBox = new javax.swing.JComboBox<String>();
        dRetardotxt = new javax.swing.JTextField();
        dRetraso = new javax.swing.JLabel();
        cMinPedir = new javax.swing.JLabel();
        estatus = new javax.swing.JLabel();
        cMinPedirtxt = new javax.swing.JTextField();
        proveedor = new javax.swing.JLabel();
        proveedorCBox = new javax.swing.JComboBox<String>();
        opcionesUEmp = new javax.swing.JPanel();
        modificarUEmp = new javax.swing.JLabel();
        cancelarUEmp = new javax.swing.JLabel();
        presentacion = new javax.swing.JLabel();
        presentacionCBox = new javax.swing.JComboBox<String>();
        pEstandar = new javax.swing.JLabel();
        pUltCompra = new javax.swing.JLabel();
        pEstandartxt = new javax.swing.JTextField();
        pUltimaCompratxt = new javax.swing.JTextField();
        cMaxPedir = new javax.swing.JLabel();
        cMaxPedirtxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Modificar empaque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        estatusBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        estatusBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE UNA OPCIÓN", "ACTIVO", "INACTIVO" }));

        dRetraso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dRetraso.setText("DÍAS RETARDO:");

        cMinPedir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cMinPedir.setText("CANT. MINIMA PEDIR: ");

        estatus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatus.setText("ESTATUS:");

        cMinPedirtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMinPedirtxtActionPerformed(evt);
            }
        });

        proveedor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        proveedor.setText("PROVEEDOR: ");

        proveedorCBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        proveedorCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE UN PROVEEDOR" }));

        opcionesUEmp.setBackground(new java.awt.Color(48, 45, 45));

        modificarUEmp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        modificarUEmp.setForeground(new java.awt.Color(255, 255, 255));
        modificarUEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        modificarUEmp.setText("MODIFICAR");
        modificarUEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        modificarUEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarUEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarUEmpMouseClicked(evt);
            }
        });

        cancelarUEmp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarUEmp.setForeground(new java.awt.Color(255, 255, 255));
        cancelarUEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cancelarUEmp.setText("CANCELAR");
        cancelarUEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarUEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarUEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarUEmpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesUEmpLayout = new javax.swing.GroupLayout(opcionesUEmp);
        opcionesUEmp.setLayout(opcionesUEmpLayout);
        opcionesUEmpLayout.setHorizontalGroup(
            opcionesUEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUEmpLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(modificarUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(cancelarUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        opcionesUEmpLayout.setVerticalGroup(
            opcionesUEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUEmpLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(opcionesUEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarUEmp)
                    .addComponent(modificarUEmp))
                .addGap(45, 45, 45))
        );

        presentacion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        presentacion.setText("PRESENTACIÓN: ");

        presentacionCBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        presentacionCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE UNA PRESENTACIÓN" }));

        pEstandar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pEstandar.setText("PRECIO ESTANDAR:");

        pUltCompra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pUltCompra.setText("PRECIO ULTIMA COMPRA:");

        cMaxPedir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cMaxPedir.setText("CANT. MIXIMA PEDIR: ");

        cMaxPedirtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMaxPedirtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dRetraso)
                            .addComponent(presentacion)
                            .addComponent(proveedor)
                            .addComponent(pEstandar)))
                    .addComponent(estatus)
                    .addComponent(cMaxPedir)
                    .addComponent(pUltCompra)
                    .addComponent(cMinPedir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cMinPedirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dRetardotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedorCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presentacionCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEstandartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pUltimaCompratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cMaxPedirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcionesUEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedor)
                    .addComponent(proveedorCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presentacion)
                    .addComponent(presentacionCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dRetardotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dRetraso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pEstandartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEstandar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pUltimaCompratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pUltCompra))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cMinPedirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cMinPedir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cMaxPedir)
                            .addComponent(cMaxPedirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estatus)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionesUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarUEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarUEmpMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarProductosProveedor mostrarProdProv = new mostrarProductosProveedor();
        mostrarProdProv.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarProdProv.setVisible(true);
        mostrarProdProv.activeEventListenerMostrarPresProv();
        mainPrincipal.getworkSpace().add(mostrarProdProv, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
        mostrarProdProv.setMostrarProdProv(mainPrincipal);


    }//GEN-LAST:event_cancelarUEmpMouseClicked

    private void modificarUEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarUEmpMouseClicked

        try {
            if (proveedorCBox.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un Proveedor", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (presentacionCBox.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Seleccione una presentación", "Error", JOptionPane.ERROR_MESSAGE);
            }else if(dRetardotxt.getText().equals("") || Integer.parseInt(dRetardotxt.getText())<=0){
                JOptionPane.showMessageDialog(this, "Ingresa los dias de retardo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(pEstandartxt.getText().equals("") || Float.parseFloat(pEstandartxt.getText())<=0){
                JOptionPane.showMessageDialog(this, "Ingresa el precio estandar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(pUltimaCompratxt.getText().equals("") || Float.parseFloat(pUltimaCompratxt.getText())<=0){
                JOptionPane.showMessageDialog(this, "Ingresa el precio de ultima compra", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(cMinPedirtxt.getText().equals("") || Integer.parseInt(cMinPedirtxt.getText())<=0){
                JOptionPane.showMessageDialog(this, "Ingresa la cantidad minima a pedir", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(Integer.parseInt(cMinPedirtxt.getText())>Integer.parseInt(cMaxPedirtxt.getText())){
                JOptionPane.showMessageDialog(this, "Cantidad minima debe ser menor a cantidad maxima", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(cMaxPedirtxt.getText().equals("") || Integer.parseInt(cMaxPedirtxt.getText())<=0){
                JOptionPane.showMessageDialog(this, "Ingresa la cantidad maxima a pedir", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(Integer.parseInt(cMaxPedirtxt.getText())< Integer.parseInt(cMinPedirtxt.getText())){
                JOptionPane.showMessageDialog(this, "Cantidad maxima debe ser mayor a cantidad minima", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(estatusBox.getSelectedIndex()<=0){
                JOptionPane.showMessageDialog(this, "Ingresa el estatus", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                CRUDgenerico guardarprodProv = new DAOProductoProveedorImp();
                //Datos obtenidos de los campos 
                String prove = this.proveedorCBox.getSelectedItem().toString();
                String prese = this.presentacionCBox.getSelectedItem().toString();
                int dRetardo = Integer.parseInt(this.dRetardotxt.getText());
                float pEst = Float.parseFloat(this.pEstandartxt.getText());
                float pUltC = Float.parseFloat(this.pUltimaCompratxt.getText());
                int cMinPed = Integer.parseInt(this.cMinPedirtxt.getText());
                int cMaxPed = Integer.parseInt(this.cMaxPedirtxt.getText());
                char est = String.valueOf(this.estatusBox.getSelectedItem()).charAt(0);
                //Guardar los datos de laboratorio
                guardarprodProv.upadate(new ProductoProveedor(prove,
                        prese, dRetardo, pEst, pUltC,
                        cMinPed, cMaxPed,est));
                limpiarVariables();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_modificarUEmpMouseClicked

    private void cMinPedirtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMinPedirtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMinPedirtxtActionPerformed

    private void cMaxPedirtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMaxPedirtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMaxPedirtxtActionPerformed

    private void limpiarVariables() {

        proveedorCBox.setSelectedIndex(0);
        presentacionCBox.setSelectedIndex(0);
        dRetardotxt.setText("");
        pEstandartxt.setText("");
        pUltimaCompratxt.setText("");
        cMinPedirtxt.setText("");
        cMaxPedirtxt.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cMaxPedir;
    private javax.swing.JTextField cMaxPedirtxt;
    private javax.swing.JLabel cMinPedir;
    private javax.swing.JTextField cMinPedirtxt;
    private javax.swing.JLabel cancelarUEmp;
    private javax.swing.JTextField dRetardotxt;
    private javax.swing.JLabel dRetraso;
    private javax.swing.JLabel estatus;
    private javax.swing.JComboBox<String> estatusBox;
    private javax.swing.JLabel modificarUEmp;
    private javax.swing.JPanel opcionesUEmp;
    private javax.swing.JLabel pEstandar;
    private javax.swing.JTextField pEstandartxt;
    private javax.swing.JLabel pUltCompra;
    private javax.swing.JTextField pUltimaCompratxt;
    private javax.swing.JLabel presentacion;
    private javax.swing.JComboBox<String> presentacionCBox;
    private javax.swing.JLabel proveedor;
    private javax.swing.JComboBox<String> proveedorCBox;
    // End of variables declaration//GEN-END:variables
}
