/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Empaques;

import ClasesExtras.CRUDgenerico;
import DAOs.DAOEmpaquesImp;
import DAOs.Empaques;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class modificarEmpaque extends javax.swing.JPanel {

    /**
     * Creates new form modificarEmpaque
     */
    
    private Main mainPrincipal;
    public modificarEmpaque() {
        initComponents();
    }
    
    public void setMainPrincipal(Main main) {
        mainPrincipal = main;
    }
    
    public void ObtenerLaboratoriModificar(Empaques emp){
        this.idtxtUEmp.setText(String.valueOf(emp.getIdEmpaque()));
        this.nombretxtEmp.setText(emp.getNombre());
        this.capacidadtxtEmp.setText(String.valueOf(emp.getCapacidad()));
       if (emp.getEstatus() == 'A') {
            this.jCBoxestatusUEmp.setSelectedIndex(1);
        } else {
            this.jCBoxestatusUEmp.setSelectedIndex(2);
        }
        LinkedList<Empaques> listaEmp = new DAOs.DAOEmpaquesImp().obternerIdunidades();
        DefaultComboBoxModel model = (DefaultComboBoxModel) JCBoxunidadUEmp.getModel();
        for (int i = 0; i < listaEmp.size(); i++) {
            model.addElement(listaEmp.get(i).getIdUnidad());
        }
        JCBoxunidadUEmp.setModel(model);
        for (int i = 0; i < JCBoxunidadUEmp.getItemCount(); i++) {
            if(JCBoxunidadUEmp.getItemAt(i).equals(emp.getIdUnidad())){
                this.JCBoxunidadUEmp.setSelectedIndex(i);
                break;
            }
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

        jCBoxestatusUEmp = new javax.swing.JComboBox<String>();
        idtxtUEmp = new javax.swing.JTextField();
        nombretxtEmp = new javax.swing.JTextField();
        idUEmp = new javax.swing.JLabel();
        nombreUEmp = new javax.swing.JLabel();
        origenUEmp = new javax.swing.JLabel();
        estatusEmp = new javax.swing.JLabel();
        capacidadtxtEmp = new javax.swing.JTextField();
        estatusUEmp = new javax.swing.JLabel();
        JCBoxunidadUEmp = new javax.swing.JComboBox<String>();
        opcionesUEmp = new javax.swing.JPanel();
        modificarUEmp = new javax.swing.JLabel();
        cancelarUEmp = new javax.swing.JLabel();
        eliminarEmp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Modificar empaque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jCBoxestatusUEmp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCBoxestatusUEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE UNA OPCIÓN", "ACTIVO", "INACTIVO" }));

        idtxtUEmp.setEnabled(false);

        idUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idUEmp.setText("ID:");

        nombreUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreUEmp.setText("NOMBRE:");

        origenUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp.setText("CAPACIDAD:");

        estatusEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusEmp.setText("ESTATUS:");

        estatusUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusUEmp.setText("UNIDAD:");

        JCBoxunidadUEmp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JCBoxunidadUEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE UNA OPCIÓN" }));

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

        eliminarEmp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        eliminarEmp.setForeground(new java.awt.Color(255, 255, 255));
        eliminarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        eliminarEmp.setText("Eliminar");
        eliminarEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        eliminarEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarEmpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesUEmpLayout = new javax.swing.GroupLayout(opcionesUEmp);
        opcionesUEmp.setLayout(opcionesUEmpLayout);
        opcionesUEmpLayout.setHorizontalGroup(
            opcionesUEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUEmpLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(modificarUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(eliminarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        opcionesUEmpLayout.setVerticalGroup(
            opcionesUEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUEmpLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(opcionesUEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarUEmp)
                    .addComponent(modificarUEmp)
                    .addComponent(eliminarEmp))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(origenUEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(capacidadtxtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idUEmp)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreUEmp)
                            .addComponent(estatusEmp)
                            .addComponent(estatusUEmp))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idtxtUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombretxtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JCBoxunidadUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCBoxestatusUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcionesUEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idUEmp)
                    .addComponent(idtxtUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUEmp)
                    .addComponent(nombretxtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp)
                    .addComponent(capacidadtxtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estatusEmp)
                    .addComponent(jCBoxestatusUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estatusUEmp)
                    .addComponent(JCBoxunidadUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(opcionesUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarUEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarUEmpMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarEmpaques mostrarEmp = new mostrarEmpaques();
        mostrarEmp.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarEmp.setVisible(true);
        mostrarEmp.activeEventListenerMostrarEmp();
        mainPrincipal.getworkSpace().add(mostrarEmp, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
        mostrarEmp.setMostrarEmpaques(mainPrincipal);
        
        
    }//GEN-LAST:event_cancelarUEmpMouseClicked

    private void eliminarEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarEmpMouseClicked
        if(JOptionPane.showConfirmDialog(this,"¿Seguro que quiere eliminar?","Eliminación"
                ,JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
        {  
        DAOEmpaquesImp eliminarEmp = new DAOEmpaquesImp();
        //Datos obtenidos de los campos 
        int id = Integer.parseInt(this.idtxtUEmp.getText());
        //Guardar los datos de Categorias
        eliminarEmp.delete(new Empaques(id));
        }          
        
        
    }//GEN-LAST:event_eliminarEmpMouseClicked

    private void modificarUEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarUEmpMouseClicked
       CRUDgenerico guardarEmp = new DAOEmpaquesImp();
      //Datos obtenidos de los campos 
      int id = Integer.parseInt(this.idtxtUEmp.getText());
      String nombre = this.nombretxtEmp.getText();
      String capacidad = this.capacidadtxtEmp.getText();
      char estatus = String.valueOf(this.jCBoxestatusUEmp.getSelectedItem()).charAt(0);
      String unidad = this.JCBoxunidadUEmp.getSelectedItem().toString();
      //Guardar los datos de laboratorio
      guardarEmp.upadate(new Empaques(id, nombre, Float.parseFloat(capacidad), estatus,unidad));
        
    }//GEN-LAST:event_modificarUEmpMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBoxunidadUEmp;
    private javax.swing.JLabel cancelarUEmp;
    private javax.swing.JTextField capacidadtxtEmp;
    private javax.swing.JLabel eliminarEmp;
    private javax.swing.JLabel estatusEmp;
    private javax.swing.JLabel estatusUEmp;
    private javax.swing.JLabel idUEmp;
    private javax.swing.JTextField idtxtUEmp;
    private javax.swing.JComboBox<String> jCBoxestatusUEmp;
    private javax.swing.JLabel modificarUEmp;
    private javax.swing.JLabel nombreUEmp;
    private javax.swing.JTextField nombretxtEmp;
    private javax.swing.JPanel opcionesUEmp;
    private javax.swing.JLabel origenUEmp;
    // End of variables declaration//GEN-END:variables
}
