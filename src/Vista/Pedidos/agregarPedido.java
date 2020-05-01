/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Pedidos;


import DAOs.DAOPedidosImp;
import DAOs.Pedidos;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class agregarPedido extends javax.swing.JPanel {

    /**
     * Creates new form agregarLaboratorio
     */
    public agregarPedido() {
        initComponents();

    }
    //private LinkedList<Prove>
    
    public void activarComboxs(){
        
    }

    public void setMain(Main main) {
        mainPrincipal = main;
    }

    private Main mainPrincipal;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        origenLabel = new javax.swing.JLabel();
        opciones = new javax.swing.JPanel();
        cancelar = new javax.swing.JLabel();
        guardar = new javax.swing.JLabel();
        nombreLabel1 = new javax.swing.JLabel();
        nombreLabel2 = new javax.swing.JLabel();
        nombreLabel4 = new javax.swing.JLabel();
        EMPLEADO = new javax.swing.JLabel();
        nombreLabel7 = new javax.swing.JLabel();
        fechaRegistro = new com.toedter.calendar.JDateChooser();
        fechaRecepcion = new com.toedter.calendar.JDateChooser();
        empleado = new javax.swing.JComboBox<>();
        sucursal = new javax.swing.JComboBox<>();
        proveedor = new javax.swing.JComboBox<>();
        totalPag = new javax.swing.JTextField();
        cantPag = new javax.swing.JTextField();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Agregar nuevo pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        setPreferredSize(new java.awt.Dimension(789, 450));

        nombreLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreLabel.setText("FECHA REGISTRO:");

        origenLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenLabel.setText("FECHA RECEPCIÓN:");

        opciones.setBackground(new java.awt.Color(48, 45, 45));

        cancelar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cancelar.setText("VOLVER ");
        cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        guardar.setText("GUARDAR ");
        guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(cancelar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        nombreLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreLabel1.setText("PROVEEDOR:");

        nombreLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreLabel2.setText("CANTIDAD PAGADA:");

        nombreLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreLabel4.setText("TOTAL A PAGAR:");

        EMPLEADO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EMPLEADO.setText("EMPLEADO:");

        nombreLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreLabel7.setText("SUCURSAL:");

        empleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        empleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UN EMPLEADO" }));

        sucursal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA SUCURSAL" }));
        sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalActionPerformed(evt);
            }
        });

        proveedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UN PROVEEDOR" }));
        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel4)
                            .addComponent(origenLabel)
                            .addComponent(nombreLabel2)
                            .addComponent(nombreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cantPag, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(totalPag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EMPLEADO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel)
                    .addComponent(fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(origenLabel)
                    .addComponent(fechaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel4)
                    .addComponent(totalPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel2)
                    .addComponent(cantPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel1)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel7)
                    .addComponent(sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EMPLEADO)
                    .addComponent(empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarPedidos mostrarlab = new mostrarPedidos();
        mostrarlab.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarlab.setVisible(true);
        mostrarlab.MostrarDatosPedidos();
        mainPrincipal.getworkSpace().add(mostrarlab, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
        mostrarlab.setMostrarPedidos(mainPrincipal);
    }//GEN-LAST:event_cancelarMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked

        if (fechaRegistro.getCalendar() == null) {
            JOptionPane.showMessageDialog(this, "Ingresa un fecha de registro valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            fechaRegistro.requestFocus();

        } else if (fechaRecepcion.getCalendar() == null) {
            JOptionPane.showMessageDialog(this, "Ingresa un fecha de recpcion valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            fechaRecepcion.requestFocus();
        } else if (fechaRecepcion.getCalendar().compareTo(fechaRegistro.getCalendar()) <= 0) {
            JOptionPane.showMessageDialog(this, "La fecha de recepcion tiene que ser mayor\n a la fecha de registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            fechaRecepcion.requestFocus();
        } else if (!totalPag.getText().equals("")) {
            try {
                if (Float.parseFloat(totalPag.getText()) <= 0) {
                    JOptionPane.showMessageDialog(this, "Total a solo puede ser mayor a cero",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    totalPag.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Solo numeros!!",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                totalPag.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad a total a pagar",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            totalPag.requestFocus();
        }

        if (!cantPag.getText().equals("")) {
            try {
                if (Float.parseFloat(cantPag.getText()) <= 0) {
                    JOptionPane.showMessageDialog(this, "Total a solo puede ser mayor a cero",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    cantPag.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Solo numeros!!",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                cantPag.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad a total a pagar",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            cantPag.requestFocus();
        }
        
        if(proveedor.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Seleccione un proveedor",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            proveedor.requestFocus();
        }else if(sucursal.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Seleccione una sucursal",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            sucursal.requestFocus();
        }else if(empleado.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Seleccione un empleado",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            empleado.requestFocus();
        }else{
            new DAOPedidosImp().Insert(new Pedidos
                (fechaRegistro.getDate(), fechaRecepcion.getDate(), 
                 Float.parseFloat(totalPag.getText()),Float.parseFloat(cantPag.getText()),
                 proveedor.getSelectedItem().toString(),sucursal.getSelectedItem().toString(),
                 empleado.getSelectedItem().toString()));
            LimpiarVariables();
        }
    }//GEN-LAST:event_guardarMouseClicked

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorActionPerformed

    private void sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sucursalActionPerformed

    private void LimpiarVariables() {
        fechaRegistro.setCalendar(null);
        fechaRecepcion.setCalendar(null);
        totalPag.setText("");
        cantPag.setText("");
        proveedor.setSelectedIndex(0);
        sucursal.setSelectedIndex(0);
        empleado.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EMPLEADO;
    private javax.swing.JLabel cancelar;
    private javax.swing.JTextField cantPag;
    private javax.swing.JComboBox<String> empleado;
    private com.toedter.calendar.JDateChooser fechaRecepcion;
    private com.toedter.calendar.JDateChooser fechaRegistro;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JLabel nombreLabel2;
    private javax.swing.JLabel nombreLabel4;
    private javax.swing.JLabel nombreLabel7;
    private javax.swing.JPanel opciones;
    private javax.swing.JLabel origenLabel;
    private javax.swing.JComboBox<String> proveedor;
    private javax.swing.JComboBox<String> sucursal;
    private javax.swing.JTextField totalPag;
    // End of variables declaration//GEN-END:variables
}
