/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Productos;

import ClasesExtras.CRUDgenerico;
import DAOs.DAOProductosImp;
import DAOs.Productos;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class modificarProducto extends javax.swing.JPanel {

    /**
     * Creates new form modificarEmpaque
     */
    private Main mainPrincipal;

    public modificarProducto() {
        initComponents();
    }

    public void setMainPrincipal(Main main) {
        mainPrincipal = main;
    }

    public void ObtenerLaboratoriModificar(Productos pro) {
        idtxtUPro.setText("" + pro.getId());
        nombretxtPro.setText(pro.getNombre());
        descripTxt.setText(pro.getDescripcion());
        pReordenTxt.setText("" + pro.getPuntoReorden());
        pCompreTxt.setText("" + pro.getPrecioCompra());
        pVentaTxt.setText("" + pro.getPrecioVenta());
        iActivoTxt.setText(pro.getIngredienteActivo());
        aplicaTxt.setText(pro.getAplicacion());
        usoTxt.setText(pro.getUso());
        if (pro.getEstatus() == 'A') {
            this.estus.setSelectedIndex(1);
        } else {
            this.estus.setSelectedIndex(2);
        }
        LinkedList<Productos> listaPro = new DAOs.DAOProductosImp().obternerIdLaboratorios();
        DefaultComboBoxModel model = (DefaultComboBoxModel) laboratorio.getModel();
        for (int i = 0; i < listaPro.size(); i++) {
            model.addElement(listaPro.get(i).getIdLab());
        }
        laboratorio.setModel(model);
        for (int i = 0; i < listaPro.size(); i++) {
            laboratorio.setSelectedIndex(i);
            if (laboratorio.getSelectedItem().toString().equals(pro.getIdLab())) {
                this.laboratorio.setSelectedIndex(i);
                break;
            }
        }
        LinkedList<Productos> listaPro2 = new DAOs.DAOProductosImp().obternerIdCategorias();
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) categ.getModel();
        for (int i = 0; i < listaPro2.size(); i++) {
            model2.addElement(listaPro2.get(i).getIdCat());
        }
        categ.setModel(model2);
        for (int i = 0; i < listaPro2.size(); i++) {
            categ.setSelectedIndex(i);
            if (pro.getIdCat().equals(categ.getSelectedItem().toString())) {
                break;
            }
        }

        switch (pro.getBandaToxicologica()) {
            case "l a - Producto Sumamente Peligro (Muy tóxico)":
                bToxic.setSelectedIndex(1);
                break;
            case "l b - Producto Muy Peligroso (Tóxico)":
                bToxic.setSelectedIndex(2);
                break;
            case "ll - Producto Moderadamente Peligroso (Nocivo)":
                bToxic.setSelectedIndex(3);
                break;
            case "lll - Producto Poco Peligroso (Cuidado)":
                bToxic.setSelectedIndex(4);
                break;
            case "lV - Producto que no Ofrece Peligro (Cuidado)":
                bToxic.setSelectedIndex(5);
                break;
            default:
                bToxic.setSelectedIndex(0);
                break;
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

        estus = new javax.swing.JComboBox<>();
        idtxtUPro = new javax.swing.JTextField();
        nombretxtPro = new javax.swing.JTextField();
        idUEmp = new javax.swing.JLabel();
        nombreUEmp = new javax.swing.JLabel();
        origenUEmp = new javax.swing.JLabel();
        estatusEmp = new javax.swing.JLabel();
        pReordenTxt = new javax.swing.JTextField();
        estatusUEmp = new javax.swing.JLabel();
        laboratorio = new javax.swing.JComboBox<>();
        opcionesUEmp = new javax.swing.JPanel();
        modificarUPro = new javax.swing.JLabel();
        cancelarUPro = new javax.swing.JLabel();
        origenUEmp1 = new javax.swing.JLabel();
        origenUEmp2 = new javax.swing.JLabel();
        origenUEmp3 = new javax.swing.JLabel();
        origenUEmp4 = new javax.swing.JLabel();
        origenUEmp5 = new javax.swing.JLabel();
        origenUEmp6 = new javax.swing.JLabel();
        origenUEmp7 = new javax.swing.JLabel();
        origenUEmp8 = new javax.swing.JLabel();
        categ = new javax.swing.JComboBox<>();
        pCompreTxt = new javax.swing.JTextField();
        iActivoTxt = new javax.swing.JTextField();
        pVentaTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripTxt = new javax.swing.JTextArea();
        bToxic = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        aplicaTxt = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        usoTxt = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Modificar producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        estus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        estus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN", "ACTIVO", "INACTIVO" }));

        idtxtUPro.setEnabled(false);

        idUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idUEmp.setText("ID:");

        nombreUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreUEmp.setText("NOMBRE:");

        origenUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp.setText("DESCRIPCIÓN:");

        estatusEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusEmp.setText("ESTATUS:");

        estatusUEmp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        estatusUEmp.setText("ID LABORATORIO:");

        laboratorio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        laboratorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        opcionesUEmp.setBackground(new java.awt.Color(48, 45, 45));

        modificarUPro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        modificarUPro.setForeground(new java.awt.Color(255, 255, 255));
        modificarUPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        modificarUPro.setText("MODIFICAR");
        modificarUPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        modificarUPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarUPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarUProMouseClicked(evt);
            }
        });

        cancelarUPro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarUPro.setForeground(new java.awt.Color(255, 255, 255));
        cancelarUPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cancelarUPro.setText("CANCELAR");
        cancelarUPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarUPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarUPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarUProMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesUEmpLayout = new javax.swing.GroupLayout(opcionesUEmp);
        opcionesUEmp.setLayout(opcionesUEmpLayout);
        opcionesUEmpLayout.setHorizontalGroup(
            opcionesUEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modificarUPro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarUPro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        opcionesUEmpLayout.setVerticalGroup(
            opcionesUEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUEmpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(opcionesUEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarUPro)
                    .addComponent(cancelarUPro))
                .addContainerGap())
        );

        origenUEmp1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp1.setText("PUNTO REORDEN:");

        origenUEmp2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp2.setText("PRECIO VENTA:");

        origenUEmp3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp3.setText("PRECIO COMPRA:");

        origenUEmp4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp4.setText("BANDA TOXICOLÓGICA:");

        origenUEmp5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp5.setText("INGREDIENTE ACTIVO:");

        origenUEmp6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp6.setText("APLICACIÓN:");

        origenUEmp7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp7.setText("USO:");

        origenUEmp8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        origenUEmp8.setText("ID CATEGORIA:");

        categ.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN" }));

        descripTxt.setColumns(20);
        descripTxt.setRows(5);
        jScrollPane1.setViewportView(descripTxt);

        bToxic.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bToxic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN", "l a - Producto Sumamente Peligro (Muy tóxico)", "l b - Producto Muy Peligroso (Tóxico)", "ll - Producto Moderadamente Peligroso (Nocivo)", "lll - Producto Poco Peligroso (Cuidado)", "lV - Producto que no Ofrece Peligro (Cuidado)" }));

        aplicaTxt.setColumns(20);
        aplicaTxt.setRows(5);
        jScrollPane3.setViewportView(aplicaTxt);

        usoTxt.setColumns(20);
        usoTxt.setRows(5);
        jScrollPane4.setViewportView(usoTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(origenUEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreUEmp)
                            .addComponent(idUEmp))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombretxtPro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idtxtUPro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(origenUEmp2)
                            .addGap(24, 24, 24)
                            .addComponent(pVentaTxt))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(origenUEmp3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pCompreTxt))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(origenUEmp1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pReordenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estatusUEmp)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(estatusEmp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(estus, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(origenUEmp8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(categ, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(laboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(213, 213, 213))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(origenUEmp4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bToxic, 0, 1, Short.MAX_VALUE)
                .addGap(271, 271, 271))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcionesUEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(origenUEmp5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iActivoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(origenUEmp7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(origenUEmp6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idUEmp)
                    .addComponent(idtxtUPro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatusEmp)
                    .addComponent(estus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUEmp)
                    .addComponent(nombretxtPro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatusUEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(laboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(origenUEmp8)
                        .addGap(0, 0, 0)
                        .addComponent(categ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(origenUEmp)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(origenUEmp1)
                            .addComponent(pReordenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp3)
                    .addComponent(pCompreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp2)
                    .addComponent(pVentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp5)
                    .addComponent(iActivoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenUEmp4)
                    .addComponent(bToxic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(origenUEmp6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(origenUEmp7)
                        .addGap(28, 28, 28)))
                .addComponent(opcionesUEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Modificar Productos");
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarUProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarUProMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mostrarProductos mostrarPro = new mostrarProductos();
        mostrarPro.setSize(mainPrincipal.getworkSpace().getSize());
        mostrarPro.setVisible(true);
        mostrarPro.activeEventListenerMostrarEmp();
        mainPrincipal.getworkSpace().add(mostrarPro, BorderLayout.CENTER);
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
        mostrarPro.setMostrarProductos(mainPrincipal);


    }//GEN-LAST:event_cancelarUProMouseClicked

    private void modificarUProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarUProMouseClicked
        if (nombretxtPro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre válido", "Error", JOptionPane.ERROR_MESSAGE);
            nombretxtPro.requestFocus();
        }
        try {
            if (pReordenTxt.getText().equals("")||Float.parseFloat(pCompreTxt.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                pReordenTxt.requestFocus();
            } else if (pCompreTxt.getText().equals("") || Float.parseFloat(pCompreTxt.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un precio válido ", "Error", JOptionPane.ERROR_MESSAGE);
                pCompreTxt.requestFocus();
            } else if (pVentaTxt.getText().equals("") || Float.parseFloat(pVentaTxt.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un precio válido ", "Error", JOptionPane.ERROR_MESSAGE);
                pVentaTxt.requestFocus();
            } else if (iActivoTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese una ingrediente activo ", "Error", JOptionPane.ERROR_MESSAGE);
                iActivoTxt.requestFocus();
            } else if (bToxic.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese una banda toxicológica válida ", "Error", JOptionPane.ERROR_MESSAGE);
                bToxic.requestFocus();
            } else if (aplicaTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese una aplicación válida ", "Error", JOptionPane.ERROR_MESSAGE);
                aplicaTxt.requestFocus();
            } else if (usoTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese un uso válido ", "Error", JOptionPane.ERROR_MESSAGE);
                usoTxt.requestFocus();
            } else if (laboratorio.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Elija un laboratorio válido ", "Error", JOptionPane.ERROR_MESSAGE);
                laboratorio.requestFocus();
            } else if (categ.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Elija una categoria válido ", "Error", JOptionPane.ERROR_MESSAGE);
                categ.requestFocus();
            } else {
                DAOProductosImp guardarPro = new DAOProductosImp();
                //Datos obtenidos de los campos 
                int id = Integer.parseInt(this.idtxtUPro.getText());
                String nombre = this.nombretxtPro.getText();
                String descripcion = this.descripTxt.getText();
                int puntoreorden = Integer.parseInt(this.pReordenTxt.getText());
                float precioventa = Float.parseFloat(this.pVentaTxt.getText());
                float preciocompra = Float.parseFloat(this.pCompreTxt.getText());
                String ingrediente = this.iActivoTxt.getText();
                String banda = this.bToxic.getSelectedItem().toString();
                String aplicacion = this.aplicaTxt.getText();
                String uso = this.usoTxt.getText();
                char estatus = String.valueOf(this.estus.getSelectedItem()).charAt(0);
                String laboratorio = this.laboratorio.getSelectedItem().toString();
                String categoria = this.categ.getSelectedItem().toString();
                //Guardar los datos de laboratorio
                guardarPro.upadate(new Productos(id, nombre, descripcion, puntoreorden, preciocompra, precioventa,
                        ingrediente, banda, aplicacion, uso, estatus, laboratorio, categoria));
                limpiarVariables();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_modificarUProMouseClicked

    private void limpiarVariables() {
        idtxtUPro.setText("");
        nombretxtPro.setText("");
        pReordenTxt.setText("");
        pCompreTxt.setText("");
        pVentaTxt.setText("");
        iActivoTxt.setText("");
        iActivoTxt.setText("");
        bToxic.setSelectedIndex(0);
        aplicaTxt.setText("");
        usoTxt.setText("");
        estus.setSelectedIndex(0);
        categ.setSelectedIndex(0);
        laboratorio.setSelectedIndex(0);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aplicaTxt;
    private javax.swing.JComboBox<String> bToxic;
    private javax.swing.JLabel cancelarUPro;
    private javax.swing.JComboBox<String> categ;
    private javax.swing.JTextArea descripTxt;
    private javax.swing.JLabel estatusEmp;
    private javax.swing.JLabel estatusUEmp;
    private javax.swing.JComboBox<String> estus;
    private javax.swing.JTextField iActivoTxt;
    private javax.swing.JLabel idUEmp;
    private javax.swing.JTextField idtxtUPro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> laboratorio;
    private javax.swing.JLabel modificarUPro;
    private javax.swing.JLabel nombreUEmp;
    private javax.swing.JTextField nombretxtPro;
    private javax.swing.JPanel opcionesUEmp;
    private javax.swing.JLabel origenUEmp;
    private javax.swing.JLabel origenUEmp1;
    private javax.swing.JLabel origenUEmp2;
    private javax.swing.JLabel origenUEmp3;
    private javax.swing.JLabel origenUEmp4;
    private javax.swing.JLabel origenUEmp5;
    private javax.swing.JLabel origenUEmp6;
    private javax.swing.JLabel origenUEmp7;
    private javax.swing.JLabel origenUEmp8;
    private javax.swing.JTextField pCompreTxt;
    private javax.swing.JTextField pReordenTxt;
    private javax.swing.JTextField pVentaTxt;
    private javax.swing.JTextArea usoTxt;
    // End of variables declaration//GEN-END:variables
}
