/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Productos;

import DAOs.DAOProductosImp;
import DAOs.Productos;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 52351
 */
public class mostrarProductos extends javax.swing.JPanel {

    /**
     * Creates new form mostrarEmpaques
     */
    public mostrarProductos() {
        initComponents();
        ContRegistro = new DAOProductosImp().contRegistros();
        ContRegistro = Math.ceil((ContRegistro / 10));
        leyenda.setVisible(false);
    }

    private double ContRegistro;
    private int cambioPagina = 1;

    public void activeEventListenerMostrarEmp() {
        MostrarDatosProductos();
    }

    public void setMostrarProductos(Main worksapce) {
        mainPrincipal = worksapce;
    }

    public void MostrarDatosProductos() {
        LinkedList<Productos> emp = new DAOProductosImp().show(cambioPagina);
        if (ContRegistro <= 0) {
            next.setVisible(false);
            preview.setVisible(false);
            return;
        } else {
            next.setVisible(true);
            preview.setVisible(true);
            this.segmentacion.setText("Página " + cambioPagina + " de " + (int) ContRegistro + " Páginas en total");
            Object listaDatos[][] = new Object[emp.size()][13];
            this.segmentacion.setText("Página " + cambioPagina + " de " + (int) ContRegistro + " Páginas en total");
            for (int i = 0; i < emp.size(); i++) {
                listaDatos[i][0] = emp.get(i).getId();
                listaDatos[i][1] = emp.get(i).getNombre();
                listaDatos[i][2] = emp.get(i).getDescripcion();
                listaDatos[i][3] = emp.get(i).getPuntoReorden();
                listaDatos[i][4] = emp.get(i).getPrecioCompra();
                listaDatos[i][5] = emp.get(i).getPrecioVenta();
                listaDatos[i][6] = emp.get(i).getIngredienteActivo();
                listaDatos[i][7] = emp.get(i).getBandaToxicologica();
                listaDatos[i][8] = emp.get(i).getAplicacion();
                listaDatos[i][9] = emp.get(i).getUso();
                listaDatos[i][10] = emp.get(i).getEstatus();
                listaDatos[i][11] = emp.get(i).getIdLab();
                listaDatos[i][12] = emp.get(i).getIdCat();
            }

            DefaultTableModel modelTable = new DefaultTableModel(
                    listaDatos,
                    new Object[]{"ID", "NOMBRE", "DESCRIPCI+ON",
                        "PUNTOREORDEN", "PRECIOCOMPRA", "PRECIOVENTA",
                        "INGREDIENTEACTIVO", "BANDATOXICOLÓGICA",
                        "APLICACIÓN", "USO", "ESTATUS", "LABORATORIOS", "CATEGORIAS"}) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            this.jTableMPro.setModel(modelTable);
            this.jTableMPro.getColumnModel().getColumn(0).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(0).setMaxWidth(50);

            this.jTableMPro.getColumnModel().getColumn(1).setMinWidth(50);
            this.jTableMPro.getColumnModel().getColumn(1).setMaxWidth(350);

            this.jTableMPro.getColumnModel().getColumn(2).setMinWidth(50);
            this.jTableMPro.getColumnModel().getColumn(2).setMaxWidth(350);

            this.jTableMPro.getColumnModel().getColumn(3).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(3).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(4).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(4).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(5).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(5).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(6).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(6).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(7).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(7).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(8).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(8).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(9).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(9).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(10).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(10).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(11).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(11).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(12).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(12).setMaxWidth(200);

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

        mainMostrarPro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMPro = new javax.swing.JTable();
        buscartxtMPro = new javax.swing.JTextField();
        buscarMPro = new javax.swing.JLabel();
        opcionesMostrarEmp = new javax.swing.JPanel();
        nuevoMPro = new javax.swing.JLabel();
        cancelarMPro = new javax.swing.JLabel();
        opcionesMostrarLab3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        segmentacion = new javax.swing.JLabel();
        preview = new javax.swing.JButton();
        next = new javax.swing.JButton();
        leyenda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 231, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Mostrar productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        mainMostrarPro.setBackground(new java.awt.Color(233, 231, 231));

        jTableMPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "PUNTREORD", "PRECIOCOM", "PRECIOVENTA", "INGREACTI", "BANTOXICOLO", "APLICACION", "USO", "ESTATUS", "IDLAB", "IDCAT"
            }
        ));
        jTableMPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMProMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMPro);

        buscarMPro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        buscarMPro.setForeground(new java.awt.Color(102, 102, 102));
        buscarMPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/most.png"))); // NOI18N
        buscarMPro.setText("BUSCAR PRODUCTO");
        buscarMPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buscarMPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarMPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMProMouseClicked(evt);
            }
        });

        opcionesMostrarEmp.setBackground(new java.awt.Color(48, 45, 45));

        nuevoMPro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        nuevoMPro.setForeground(new java.awt.Color(255, 255, 255));
        nuevoMPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        nuevoMPro.setText("NUEVO PRODUCTO");
        nuevoMPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        nuevoMPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoMPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoMProMouseClicked(evt);
            }
        });

        cancelarMPro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarMPro.setForeground(new java.awt.Color(255, 255, 255));
        cancelarMPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        cancelarMPro.setText("CANCELAR");
        cancelarMPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarMPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarMPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMProMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesMostrarEmpLayout = new javax.swing.GroupLayout(opcionesMostrarEmp);
        opcionesMostrarEmp.setLayout(opcionesMostrarEmpLayout);
        opcionesMostrarEmpLayout.setHorizontalGroup(
            opcionesMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarEmpLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(nuevoMPro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarMPro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        opcionesMostrarEmpLayout.setVerticalGroup(
            opcionesMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesMostrarEmpLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(opcionesMostrarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoMPro)
                    .addComponent(cancelarMPro))
                .addGap(21, 21, 21))
        );

        opcionesMostrarLab3.setBackground(java.awt.Color.lightGray);

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Cambio pagina \"cada página contiene 10 registros.");

        segmentacion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        preview.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        preview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regreso.png"))); // NOI18N
        preview.setText("Anterior");
        preview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previewMouseClicked(evt);
            }
        });

        next.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        next.setText("Siguiente");
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesMostrarLab3Layout = new javax.swing.GroupLayout(opcionesMostrarLab3);
        opcionesMostrarLab3.setLayout(opcionesMostrarLab3Layout);
        opcionesMostrarLab3Layout.setHorizontalGroup(
            opcionesMostrarLab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesMostrarLab3Layout.createSequentialGroup()
                .addGroup(opcionesMostrarLab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionesMostrarLab3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(preview)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segmentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(next))
                    .addGroup(opcionesMostrarLab3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        opcionesMostrarLab3Layout.setVerticalGroup(
            opcionesMostrarLab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesMostrarLab3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionesMostrarLab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preview)
                    .addComponent(segmentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        leyenda.setBackground(new java.awt.Color(255, 0, 51));
        leyenda.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        leyenda.setForeground(new java.awt.Color(255, 51, 51));
        leyenda.setText("No se encuentran mas registros en paginas.");

        javax.swing.GroupLayout mainMostrarProLayout = new javax.swing.GroupLayout(mainMostrarPro);
        mainMostrarPro.setLayout(mainMostrarProLayout);
        mainMostrarProLayout.setHorizontalGroup(
            mainMostrarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMostrarProLayout.createSequentialGroup()
                        .addGap(0, 232, Short.MAX_VALUE)
                        .addComponent(buscartxtMPro, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarMPro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(opcionesMostrarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(mainMostrarProLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(leyenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMostrarProLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opcionesMostrarLab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        mainMostrarProLayout.setVerticalGroup(
            mainMostrarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarProLayout.createSequentialGroup()
                .addGroup(mainMostrarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarMPro)
                    .addComponent(buscartxtMPro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionesMostrarLab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(leyenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(opcionesMostrarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMostrarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMostrarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoMProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMProMouseClicked
        if (new DAOProductosImp().obternerIdLaboratorios() != null && new DAOProductosImp().obternerIdCategorias() != null) {
            mainPrincipal.getworkSpace().removeAll();
            agregarProducto nuevoEmp = new agregarProducto();
            nuevoEmp.setSize(mainPrincipal.getworkSpace().getSize());
            nuevoEmp.setVisible(true);
            nuevoEmp.setMainPrincipal(mainPrincipal);
            mainPrincipal.getworkSpace().add(nuevoEmp, BorderLayout.CENTER);
            mainPrincipal.getworkSpace().revalidate();
            mainPrincipal.getworkSpace().repaint();

        } else {
            JOptionPane.showMessageDialog(this, "Laboratorios  y categorias no disponibles, registre por lo menos una "
                    + "categoria y laboratorio en el sistema", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_nuevoMProMouseClicked

    private void cancelarMProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMProMouseClicked
        mainPrincipal.getworkSpace().removeAll();
        mainPrincipal.getworkSpace().revalidate();
        mainPrincipal.getworkSpace().repaint();
    }//GEN-LAST:event_cancelarMProMouseClicked

    private void jTableMProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMProMouseClicked
        int row;
        row = jTableMPro.getSelectedRow();
        //Verificamos que el evento este en el rango de la tabla.
        if (row > -1 && row <= jTableMPro.getSelectedRow()) {
            //creamos la ventana modificar
            modificarProducto modificarEmpaque = new modificarProducto();
            this.mainPrincipal.getworkSpace().removeAll();
            modificarEmpaque.setSize(mainPrincipal.getworkSpace().getSize());
            modificarEmpaque.setVisible(true);
            modificarEmpaque.setMainPrincipal(mainPrincipal);
            //Datos de la tabla, selecionar un row
            int id = Integer.parseInt(String.valueOf(this.jTableMPro.getValueAt(row, 0)));
            String nombre = String.valueOf(this.jTableMPro.getValueAt(row, 1));
            String descripcion = String.valueOf(this.jTableMPro.getValueAt(row, 2));
            int puntoreorden = Integer.parseInt(String.valueOf(this.jTableMPro.getValueAt(row, 3)));
            float precioventa = Float.parseFloat(String.valueOf(this.jTableMPro.getValueAt(row, 4)));
            float preciocompra = Float.parseFloat(String.valueOf(this.jTableMPro.getValueAt(row, 5)));
            String ingrediente = String.valueOf(this.jTableMPro.getValueAt(row, 6));
            String banda = String.valueOf(this.jTableMPro.getValueAt(row, 7));
            String aplicacion = String.valueOf(this.jTableMPro.getValueAt(row, 8));
            String uso = String.valueOf(this.jTableMPro.getValueAt(row, 9));
            char estatus = String.valueOf(this.jTableMPro.getValueAt(row, 10)).charAt(0);
            String laboratorio = String.valueOf(this.jTableMPro.getValueAt(row, 11));
            String categoria = String.valueOf(this.jTableMPro.getValueAt(row, 12));
            //Ingresan los datos de la tabla a la interfaz Modificar Laboratorio
            modificarEmpaque.ObtenerLaboratoriModificar(new Productos(id, nombre,
                    descripcion, puntoreorden, preciocompra, precioventa, ingrediente,
                    banda, aplicacion, uso, estatus, laboratorio, categoria));

            this.mainPrincipal.getworkSpace().add(modificarEmpaque, BorderLayout.CENTER);
            this.mainPrincipal.getworkSpace().revalidate();
            this.mainPrincipal.getworkSpace().repaint();
        }
    }//GEN-LAST:event_jTableMProMouseClicked

    private void buscarMProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMProMouseClicked
        if (buscartxtMPro.getText() == "" || buscartxtMPro.getText() == null) {
            JOptionPane.showMessageDialog(null, "Debes escribir algo para filtrar...",
                    "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else {
            LinkedList<Productos> cat = new DAOProductosImp().consultaInd(buscartxtMPro.getText());
            Object listaDatos[][] = new Object[cat.size()][13];
            for (int i = 0; i < cat.size(); i++) {
                listaDatos[i][0] = cat.get(i).getId();
                listaDatos[i][1] = cat.get(i).getNombre();
                listaDatos[i][2] = cat.get(i).getDescripcion();
                listaDatos[i][3] = cat.get(i).getPuntoReorden();
                listaDatos[i][4] = cat.get(i).getPrecioCompra();
                listaDatos[i][5] = cat.get(i).getPrecioVenta();
                listaDatos[i][6] = cat.get(i).getIngredienteActivo();
                listaDatos[i][7] = cat.get(i).getBandaToxicologica();
                listaDatos[i][8] = cat.get(i).getAplicacion();
                listaDatos[i][9] = cat.get(i).getUso();
                listaDatos[i][10] = cat.get(i).getEstatus();
                listaDatos[i][11] = cat.get(i).getIdLab();
                listaDatos[i][12] = cat.get(i).getIdCat();
            }

            DefaultTableModel modelTable = new DefaultTableModel(
                    listaDatos,
                    new Object[]{"ID", "NOMBRE", "DESCRIPCI+ON",
                        "PUNTOREORDEN", "PRECIOCOMPRA", "PRECIOVENTA",
                        "INGREDIENTEACTIVO", "BANDATOXICOLÓGICA",
                        "APLICACIÓN", "USO", "ESTATUS", "LABORATORIOS", "CATEGORIAS"}) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            this.jTableMPro.setModel(modelTable);
            this.jTableMPro.getColumnModel().getColumn(0).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(0).setMaxWidth(50);

            this.jTableMPro.getColumnModel().getColumn(1).setMinWidth(50);
            this.jTableMPro.getColumnModel().getColumn(1).setMaxWidth(350);

            this.jTableMPro.getColumnModel().getColumn(2).setMinWidth(50);
            this.jTableMPro.getColumnModel().getColumn(2).setMaxWidth(350);

            this.jTableMPro.getColumnModel().getColumn(3).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(3).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(4).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(4).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(5).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(5).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(6).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(6).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(7).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(7).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(8).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(8).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(9).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(9).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(10).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(10).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(11).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(11).setMaxWidth(200);

            this.jTableMPro.getColumnModel().getColumn(12).setMinWidth(10);
            this.jTableMPro.getColumnModel().getColumn(12).setMaxWidth(200);

        }

    }//GEN-LAST:event_buscarMProMouseClicked

    private void previewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewMouseClicked
        if (cambioPagina == 1) {
            preview.setVisible(false);
            next.setVisible(true);
            leyenda.setVisible(true);
            MostrarDatosProductos();
        } else {
            next.setVisible(true);
            cambioPagina--;
            MostrarDatosProductos();
            leyenda.setVisible(false);

        }
    }//GEN-LAST:event_previewMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        if (cambioPagina >= ContRegistro) {
            next.setVisible(false);
            preview.setVisible(true);
            leyenda.setVisible(true);
            MostrarDatosProductos();
        } else {
            cambioPagina++;
            preview.setVisible(true);
            MostrarDatosProductos();
            leyenda.setVisible(false);
        }
    }//GEN-LAST:event_nextMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarMPro;
    private javax.swing.JTextField buscartxtMPro;
    private javax.swing.JLabel cancelarMPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMPro;
    private javax.swing.JLabel leyenda;
    private javax.swing.JPanel mainMostrarPro;
    private javax.swing.JButton next;
    private javax.swing.JLabel nuevoMPro;
    private javax.swing.JPanel opcionesMostrarEmp;
    private javax.swing.JPanel opcionesMostrarLab3;
    private javax.swing.JButton preview;
    private javax.swing.JLabel segmentacion;
    // End of variables declaration//GEN-END:variables
    private Main mainPrincipal;

}
