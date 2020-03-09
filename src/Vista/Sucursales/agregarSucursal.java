/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Sucursales;

import Vistas.Categorias.*;
import DAOs.Categorias;
import DAOs.DAOCategoriasImp;
import DAOs.DAOSucursalesImp;
import DAOs.Sucursales;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javafx.scene.input.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class agregarSucursal extends javax.swing.JPanel {

    /**
     * Creates new form agregarLaboratorio
     */
    public agregarSucursal() {
        initComponents();
        ConsultarCiudades();

    }

    public void setMain(Main main) {
        mainPrincipal = main;
    }

    private Main mainPrincipal;
    private LinkedList<String> ciudades;

//    public static void setMain(Main main){
//        mainPrincipal = main;
//    }
//    private static Main mainPrincipal;
//    
//    public static void getEnableComponents(){
//        mainPrincipal.getLabelComponents(false);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        opciones = new javax.swing.JPanel();
        cancelar = new javax.swing.JLabel();
        guardar = new javax.swing.JLabel();
        telef = new javax.swing.JLabel();
        direc = new javax.swing.JLabel();
        telefTxt = new javax.swing.JTextField();
        direcTxt = new javax.swing.JTextField();
        colon = new javax.swing.JLabel();
        colonTxt = new javax.swing.JTextField();
        cp = new javax.swing.JLabel();
        cpTxt = new javax.swing.JTextField();
        presup = new javax.swing.JLabel();
        presupTxt = new javax.swing.JTextField();
        cd = new javax.swing.JLabel();
        comboxCiudad = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Agregar una sucursal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        setPreferredSize(new java.awt.Dimension(789, 450));

        nombreLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreLabel.setText("NOMBRE:");

        opciones.setBackground(new java.awt.Color(48, 45, 45));

        cancelar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
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
                .addGap(110, 110, 110)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(cancelar))
                .addGap(24, 24, 24))
        );

        telef.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        telef.setText("TELÉFONO:");

        direc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        direc.setText("DIRECCIÓN:");

        telefTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefTxtKeyTyped(evt);
            }
        });

        colon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        colon.setText("COLONIA:");

        cp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cp.setText("CP:");

        cpTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpTxtMouseEntered(evt);
            }
        });
        cpTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpTxtKeyTyped(evt);
            }
        });

        presup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        presup.setText("PRESUPUESTO:");

        presupTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                presupTxtKeyTyped(evt);
            }
        });

        cd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cd.setText("CIUDAD:");

        comboxCiudad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        comboxCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONA UNA CIUDAD" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(telef)
                            .addComponent(direc)
                            .addComponent(colon)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cp)
                                .addGap(6, 6, 6))
                            .addComponent(presup)
                            .addComponent(cd))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direcTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(presupTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 229, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telef)
                    .addComponent(telefTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direc)
                    .addComponent(direcTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colon)
                    .addComponent(colonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presup)
                    .addComponent(presupTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd)
                    .addComponent(comboxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Agregar un nueva categoria");
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarSucursales mostrarSuc = new mostrarSucursales();
        mostrarSuc.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarSuc.setVisible(true);
        mostrarSuc.MostrarDatosSucursal();
        mainPrincipal.getworkSpace().add(mostrarSuc, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
        mostrarSuc.setMostrarSucursales(mainPrincipal);
    }//GEN-LAST:event_cancelarMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        if (nombretxt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre valido", "Error", JOptionPane.ERROR_MESSAGE);
            nombretxt.requestFocus();
        }if (telefTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un telefono valido", "Error", JOptionPane.ERROR_MESSAGE);
            telefTxt.requestFocus();
        }if (direcTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese una dirección valida", "Error", JOptionPane.ERROR_MESSAGE);
            direcTxt.requestFocus();
        }if (colonTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un colonia valido", "Error", JOptionPane.ERROR_MESSAGE);
            colonTxt.requestFocus();
        }if (cpTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un copdigo postal valido", "Error", JOptionPane.ERROR_MESSAGE);
            cpTxt.requestFocus();
        }if (presupTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese presupuesto valido", "Error", JOptionPane.ERROR_MESSAGE);
            presupTxt.requestFocus();
        }if (comboxCiudad.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione una ciudad", "Error", JOptionPane.ERROR_MESSAGE);
            comboxCiudad.requestFocus();
        }
        else {
            DAOSucursalesImp suc = new DAOSucursalesImp();
            suc.Insert(new Sucursales(nombretxt.getText(), 
                    telefTxt.getText(),direcTxt.getText(),colonTxt.getText(),cpTxt.getText(),
                    Float.parseFloat(presupTxt.getText()), comboxCiudad.getSelectedItem().toString()));
            LimpiarVariables();
        }
    }//GEN-LAST:event_guardarMouseClicked

    private void telefTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefTxtKeyTyped
        if(!Character.isLetter(evt.getKeyChar())){
        }else{
            JOptionPane.showMessageDialog(this, "Solo números","Error",JOptionPane.ERROR_MESSAGE);
            telefTxt.setText("");
        }
    }//GEN-LAST:event_telefTxtKeyTyped

    private void cpTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpTxtMouseEntered
        
    }//GEN-LAST:event_cpTxtMouseEntered

    private void cpTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpTxtKeyTyped
        if(Character.isLetter(evt.getKeyChar())){
            JOptionPane.showMessageDialog(this, "Solo números","Error",JOptionPane.ERROR_MESSAGE);
            cpTxt.setText("");
        }
    }//GEN-LAST:event_cpTxtKeyTyped

    private void presupTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_presupTxtKeyTyped
        if(Character.isLetter(evt.getKeyChar())){
            JOptionPane.showMessageDialog(this, "Solo números","Error",JOptionPane.ERROR_MESSAGE);
            presupTxt.setText("");
        }
    }//GEN-LAST:event_presupTxtKeyTyped

    private void LimpiarVariables() {
        nombretxt.setText("");
        telefTxt.setText("");
        direcTxt.setText("");
        colonTxt.setText("");
        cpTxt.setText("");
        presupTxt.setText("");
        comboxCiudad.setSelectedIndex(0);
    }
    
    private void ConsultarCiudades(){
         ciudades = new DAOSucursalesImp().obtenerCiudades();
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         modelo.addElement("SELECCIONE UNA CIUDAD");
         for (int i = 0; i < ciudades.size(); i++) {
            modelo.addElement(ciudades.get(i));
        }
         comboxCiudad.setModel(modelo);
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel cd;
    private javax.swing.JLabel colon;
    private javax.swing.JTextField colonTxt;
    private javax.swing.JComboBox comboxCiudad;
    private javax.swing.JLabel cp;
    private javax.swing.JTextField cpTxt;
    private javax.swing.JLabel direc;
    private javax.swing.JTextField direcTxt;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JPanel opciones;
    private javax.swing.JLabel presup;
    private javax.swing.JTextField presupTxt;
    private javax.swing.JLabel telef;
    private javax.swing.JTextField telefTxt;
    // End of variables declaration//GEN-END:variables
}
