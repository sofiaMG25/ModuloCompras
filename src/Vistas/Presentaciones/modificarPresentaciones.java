/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Presentaciones;

import DAOs.Presentaciones;
import DAOs.DAOPresentacionesImp;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class modificarPresentaciones extends javax.swing.JPanel {

    /**
     * Creates new form modificarLaboratorio
     */
    public modificarPresentaciones() {
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

        idtxtPRE = new javax.swing.JTextField();
        txtpCompra = new javax.swing.JTextField();
        idPre = new javax.swing.JLabel();
        pCompra = new javax.swing.JLabel();
        estatusUL = new javax.swing.JLabel();
        estatusBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        modificarUL = new javax.swing.JLabel();
        cancelarUL = new javax.swing.JLabel();
        pVenta = new javax.swing.JLabel();
        pReorden = new javax.swing.JLabel();
        txtpReorden = new javax.swing.JTextField();
        txtpVenta = new javax.swing.JTextField();
        empaque = new javax.swing.JLabel();
        producto = new javax.swing.JLabel();
        productoBox = new javax.swing.JComboBox<>();
        empaqueBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Modicar Presentacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        idtxtPRE.setEnabled(false);

        idPre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idPre.setText("ID:");

        pCompra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pCompra.setText("PRECIO COMPRA: ");

        estatusUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusUL.setText("ESTATUS:");

        estatusBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        estatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE EL ESTATUS", "ACTIVO", "INACTIVO" }));

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
                .addGap(54, 54, 54)
                .addComponent(modificarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(cancelarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
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

        pVenta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pVenta.setText("PRECIO VENTA: ");

        pReorden.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pReorden.setText("PUNTO REORDEN: ");

        empaque.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        empaque.setText("EMPAQUE: ");

        producto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        producto.setText("PRODCUTO: ");

        productoBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        productoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UN PRODUCTO" }));

        empaqueBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        empaqueBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UN EMPAQUE" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCompra)
                    .addComponent(idPre)
                    .addComponent(pVenta)
                    .addComponent(pReorden)
                    .addComponent(empaque)
                    .addComponent(producto)
                    .addComponent(estatusUL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idtxtPRE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpReorden, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empaqueBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPre)
                    .addComponent(idtxtPRE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pCompra)
                    .addComponent(txtpCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pVenta)
                    .addComponent(txtpVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pReorden)
                    .addComponent(txtpReorden, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto)
                    .addComponent(productoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empaque)
                    .addComponent(empaqueBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estatusUL)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Modificar Categoria ");
    }// </editor-fold>//GEN-END:initComponents

    private void modificarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarULMouseClicked
        if (txtpCompra.getText().equals("") || Float.parseFloat(txtpCompra.getText()) <=0) {
            JOptionPane.showMessageDialog(this, "Ingrese el precio compra, cantidad debe ser mayorar a 0", "Error", JOptionPane.ERROR_MESSAGE);
            txtpCompra.requestFocus();
        } else if (txtpVenta.getText().equals("") || Float.parseFloat(txtpVenta.getText()) <=0) {
            JOptionPane.showMessageDialog(this, "Ingrese el precio venta, cantidad debe ser mayorar a 0", "Error", JOptionPane.ERROR_MESSAGE);
            txtpVenta.requestFocus();
        } else if (txtpReorden.getText().equals("") || Float.parseFloat(txtpReorden.getText()) <=0) {
            JOptionPane.showMessageDialog(this, "Ingrese el precio de reorden, cantidad debe ser mayorar a 0", "Error", JOptionPane.ERROR_MESSAGE);
            txtpReorden.requestFocus();
        } else if (productoBox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una producto", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (empaqueBox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un empaque", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (estatusBox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una opción valida", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            DAOPresentacionesImp guardarPre = new DAOPresentacionesImp();
            //Datos obtenidos de los campos 
            int id = Integer.parseInt(this.idtxtPRE.getText());
            float precioC =Float.parseFloat(this.txtpCompra.getText());
            float precioV =Float.parseFloat(this.txtpVenta.getText());
            float puntoR = Float.parseFloat(this.txtpReorden.getText());
            String productos = this.productoBox.getSelectedItem().toString();
            String empaques = this.empaqueBox.getSelectedItem().toString();
            char estatus = String.valueOf(this.estatusBox.getSelectedItem()).charAt(0);
            //Guardar los datos de laboratorio
            guardarPre.upadate(new Presentaciones(id, precioC, precioV, puntoR, productos, empaques, estatus));
            limpiarVariables();
        }
    }//GEN-LAST:event_modificarULMouseClicked
    
    private void cancelarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarULMouseClicked

        //Quitas el jpanel principal que esta en el centro
        mainPrincipal.getworkSpace().removeAll();
        //Instaciamos el nuevo jpanel a reemplazar
        mostrarPresentaciones mPre = new mostrarPresentaciones();
        //Redimensionamos el jpanel nuevo
        mPre.setSize(mainPrincipal.getworkSpace().getSize());
        //Hacemos visible
        mPre.setVisible(true);
        //Seleccionamos la función para mostrar el jpanel
        mPre.setMostrarPresentaciones(mainPrincipal);
        //Cargamos el jpanel
        mPre.MostrarDatosPresentaciones();
        //Agregamos el jpanel y centramos
        mainPrincipal.getworkSpace().add(mPre, BorderLayout.CENTER);
        //Validamos el jpanel
        mainPrincipal.getworkSpace().revalidate();
        //Dibujamos el jpanel
        mainPrincipal.getworkSpace().repaint();
    }//GEN-LAST:event_cancelarULMouseClicked
    /**
     * Método que funciona para abstraer los datos de la categoria
     * @param pres
     */
    public void ObtenerPresentacionModificar(Presentaciones pres) {
        this.idtxtPRE.setText(String.valueOf(pres.getIdPP()));
       this.txtpCompra.setText(String.valueOf(pres.getpCompra()));
       this.txtpVenta.setText(String.valueOf(pres.getpVenta()));
       this.txtpReorden.setText(String.valueOf(pres.getpReorden()));
       
        LinkedList<Presentaciones> listaPre = new DAOs.DAOPresentacionesImp().obtenerIdProducto();
        DefaultComboBoxModel model = (DefaultComboBoxModel) productoBox.getModel();
        for (int i = 0; i < listaPre.size(); i++) {
            model.addElement(listaPre.get(i).getIdProducto());
        }
        productoBox.setModel(model);
        for (int i = 0; i < productoBox.getItemCount(); i++) {
            if (productoBox.getItemAt(i).equals(pres.getIdProducto())) {
                this.productoBox.setSelectedIndex(i);
                break;
            }
        }
       
        LinkedList<Presentaciones> listaEmp2 = new DAOs.DAOPresentacionesImp().obtenerIdEmpaque();
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) empaqueBox.getModel();
        for (int i = 0; i < listaEmp2.size(); i++) {
            model2.addElement(listaEmp2.get(i).getIdEmpaque());
        }
        empaqueBox.setModel(model2);
        for (int i = 0; i < empaqueBox.getItemCount(); i++) {
            if (empaqueBox.getItemAt(i).equals(pres.getIdEmpaque())) {
                this.empaqueBox.setSelectedIndex(i);
                break;
            }
        }
        
        if (pres.getEstatus() == 'A') {
            this.estatusBox.setSelectedIndex(1);
        } else {
            this.estatusBox.setSelectedIndex(2);
        }
    }

    private void limpiarVariables() {
        txtpCompra.setText("");
        txtpVenta.setText("");
        txtpReorden.setText("");
        productoBox.setSelectedIndex(0);
        empaqueBox.setSelectedIndex(0);
        estatusBox.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelarUL;
    private javax.swing.JLabel empaque;
    private javax.swing.JComboBox<String> empaqueBox;
    private javax.swing.JComboBox<String> estatusBox;
    private javax.swing.JLabel estatusUL;
    private javax.swing.JLabel idPre;
    private javax.swing.JTextField idtxtPRE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel modificarUL;
    private javax.swing.JLabel pCompra;
    private javax.swing.JLabel pReorden;
    private javax.swing.JLabel pVenta;
    private javax.swing.JLabel producto;
    private javax.swing.JComboBox<String> productoBox;
    private javax.swing.JTextField txtpCompra;
    private javax.swing.JTextField txtpReorden;
    private javax.swing.JTextField txtpVenta;
    // End of variables declaration//GEN-END:variables
}
