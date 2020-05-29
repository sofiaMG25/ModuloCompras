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
public class ModificarExistenciasSucursal extends javax.swing.JPanel {
 LinkedList<Sucursales> exSuc;
  LinkedList<Presentaciones> exPre;
    /**
     * Creates new form ModificarExistenciasSucursal
     */
    public ModificarExistenciasSucursal() {
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
    
    private Main mainPrincipal;
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        idUL = new javax.swing.JLabel();
        idUL1 = new javax.swing.JLabel();
        idUL2 = new javax.swing.JLabel();
        idUL3 = new javax.swing.JLabel();
        idPresentacionBox = new javax.swing.JComboBox<>();
        idSucursalBox = new javax.swing.JComboBox<>();
        estatusBox = new javax.swing.JComboBox<>();
        cantidadTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        modificarUL = new javax.swing.JLabel();
        cancelarUL = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Modificar Sucursal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        idUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idUL.setText("ID PRESENTACIÓN:");

        idUL1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idUL1.setText("ID SUCURSAL:");

        idUL2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idUL2.setText("CANTIDAD:");

        idUL3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idUL3.setText("ESTATUS:");

        idPresentacionBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        idPresentacionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        idSucursalBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        idSucursalBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        estatusBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        estatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN", "ACTIVO", "INACTIVO" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idUL)
                    .addComponent(idUL1)
                    .addComponent(idUL2)
                    .addComponent(idUL3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idSucursalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPresentacionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idUL)
                    .addComponent(idPresentacionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idUL1)
                    .addComponent(idSucursalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idUL2)
                    .addComponent(cantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idUL3)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(48, 45, 45));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(modificarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarUL)
                    .addComponent(cancelarUL))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void modificarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarULMouseClicked
        new DAOExistenciaSucursalImp().upadate(new ExistenciaSucursal
        (Integer.parseInt(idPresentacionBox.getSelectedItem().toString()),
                Integer.parseInt(idSucursalBox.getSelectedItem().toString()),
                Integer.parseInt(cantidadTxt.getText()),estatusBox.getSelectedItem().toString().charAt(0)));
        
    }//GEN-LAST:event_modificarULMouseClicked

    private void modificarULMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarULMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarULMouseEntered

    private void cancelarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarULMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        MostrarExistenciaSucursal mostrarLab = new MostrarExistenciaSucursal();
        mostrarLab.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarLab.setVisible(true);
        mostrarLab.MostrarDatosExistenciasSucursal();
        mainPrincipal.getworkSpace().add(mostrarLab, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
        mostrarLab.setMostrarCuentasProv(mainPrincipal);
    }//GEN-LAST:event_cancelarULMouseClicked

    public void obtenerDatos(ExistenciaSucursal ex){
       for (int i = 0; i < idSucursalBox.getModel().getSize(); i++) {
                idSucursalBox.setSelectedIndex(i);
                if(String.valueOf(ex.getIdSucursal()).equals(idSucursalBox.getSelectedItem().toString()))
                    break;
            }
            
            for (int i = 0; i < idPresentacionBox.getModel().getSize(); i++) {
                idPresentacionBox.setSelectedIndex(i);
                if(String.valueOf(ex.getIdPresentacion()).equals(idPresentacionBox.getSelectedItem().toString()))
                    break;
            }
            
            if(ex.getEstado() == 'A')
                estatusBox.setSelectedIndex(1);
            else 
                estatusBox.setSelectedIndex(2);
            
            cantidadTxt.setText(""+ex.getCantidad());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelarUL;
    private javax.swing.JTextField cantidadTxt;
    private javax.swing.JComboBox<String> estatusBox;
    private javax.swing.JComboBox<String> idPresentacionBox;
    private javax.swing.JComboBox<String> idSucursalBox;
    private javax.swing.JLabel idUL;
    private javax.swing.JLabel idUL1;
    private javax.swing.JLabel idUL2;
    private javax.swing.JLabel idUL3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel modificarUL;
    // End of variables declaration//GEN-END:variables

    void setMainPrincipal(Main mainPrincipal) {
        this.mainPrincipal = mainPrincipal;
    }
}
