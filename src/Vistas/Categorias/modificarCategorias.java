/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Categorias;

import ClasesExtras.CRUDgenerico;
import DAOs.Categorias;
import DAOs.DAOCategorias;
import DAOs.DAOCategoriasImp;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author 52351
 */
public class modificarCategorias extends javax.swing.JPanel {

    /**
     * Creates new form modificarLaboratorio
     */
    public modificarCategorias() {
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

        idtxtUL = new javax.swing.JTextField();
        nombretxtUL = new javax.swing.JTextField();
        idUL = new javax.swing.JLabel();
        nombreUL = new javax.swing.JLabel();
        estatusUL = new javax.swing.JLabel();
        estatusBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        modificarUL = new javax.swing.JLabel();
        cancelarUL = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Modicar categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        idtxtUL.setEnabled(false);

        idUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idUL.setText("ID:");

        nombreUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreUL.setText("NOMBRE:");

        estatusUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusUL.setText("ESTATUS:");

        estatusBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        estatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN", "ACTIVO", "INACTIVO" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idUL)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nombreUL)
                        .addComponent(estatusUL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idtxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombretxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idUL)
                    .addComponent(idtxtUL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreUL)
                    .addComponent(nombretxtUL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estatusUL)
                    .addComponent(estatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Modificar Categoria ");
    }// </editor-fold>//GEN-END:initComponents

    private void modificarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarULMouseClicked
        if (nombretxtUL.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre valido", "Error", JOptionPane.ERROR_MESSAGE);
            nombretxtUL.requestFocus();
        } else if (estatusBox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una opción valida", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            DAOCategoriasImp guardarCat = new DAOCategoriasImp();
            //Datos obtenidos de los campos 
            int id = Integer.parseInt(this.idtxtUL.getText());
            String nombre = this.nombretxtUL.getText();
            char estatus = String.valueOf(this.estatusBox.getSelectedItem()).charAt(0);
            //Guardar los datos de laboratorio
            guardarCat.upadate(new Categorias(id, nombre, estatus));
            limpiarVariables();
        }
    }//GEN-LAST:event_modificarULMouseClicked

    private void cancelarULMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarULMouseClicked
     
         //Quitas el jpanel principal que esta en el centro
        mainPrincipal.getworkSpace().removeAll();
        //Instaciamos el nuevo jpanel a reemplazar
        mostrarCategorias mc = new mostrarCategorias();
        //Redimensionamos el jpanel nuevo
        mc.setSize(mainPrincipal.getworkSpace().getSize());
        //Hacemos visible
        mc.setVisible(true);
        //Seleccionamos la función para mostrar el jpanel
        mc.setMostrarCategorias(mainPrincipal);
        //Cargamos el jpanel
        mc.MostrarDatosCategorias();
        //Agregamos el jpanel y centramos
        mainPrincipal.getworkSpace().add(mc, BorderLayout.CENTER);
        //Validamos el jpanel
        mainPrincipal.getworkSpace().revalidate();
        //Dibujamos el jpanel
        mainPrincipal.getworkSpace().repaint();
    }//GEN-LAST:event_cancelarULMouseClicked
    /**
     * Método que funciona para abstraer los datos de la categoria
     */
    public void ObtenerLaboratoriModificar(Categorias cat) {
        this.idtxtUL.setText(String.valueOf(cat.getId()));
        this.nombretxtUL.setText(cat.getNombre());
        if (cat.getEstatus() == 'A') {
            this.estatusBox.setSelectedIndex(1);
        } else {
            this.estatusBox.setSelectedIndex(2);
        }
    }
    
    private void limpiarVariables(){
        nombretxtUL.setText("");
        estatusBox.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelarUL;
    private javax.swing.JComboBox<String> estatusBox;
    private javax.swing.JLabel estatusUL;
    private javax.swing.JLabel idUL;
    private javax.swing.JTextField idtxtUL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel modificarUL;
    private javax.swing.JLabel nombreUL;
    private javax.swing.JTextField nombretxtUL;
    // End of variables declaration//GEN-END:variables
}
