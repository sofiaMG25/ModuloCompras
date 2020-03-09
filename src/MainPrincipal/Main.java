package MainPrincipal;

import ConexionSQLServer.ConexionSQL;
import Vista.Sucursales.mostrarSucursales;
import Vistas.Laboratorios.mostrarLaboratorios;
import Vistas.Empaques.mostrarEmpaques;
import Vistas.Categorias.mostrarCategorias;
import Vistas.UnidadMedida.mostrarUnidadMedida;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 52351
 */
public class Main extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Main
     */
    protected static String user;

    public Main() {
        initComponents();
        footer.repaint();
        workSpace.repaint();
        this.pack();
        System.out.println(workSpace.getSize());
        usuario.setText(user);
        iniciarHilo();

    }

    private Thread hiloFecha;

    public void iniciarHilo() {
        hiloFecha = new Thread(this);
        hiloFecha.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        Separador1 = new javax.swing.JSeparator();
        listaMenu = new javax.swing.JPanel();
        laboratorios = new javax.swing.JLabel();
        categorias = new javax.swing.JLabel();
        empaques = new javax.swing.JLabel();
        unidadMedidas = new javax.swing.JLabel();
        sucursales = new javax.swing.JLabel();
        presentProductos = new javax.swing.JLabel();
        imgProductos = new javax.swing.JLabel();
        productos = new javax.swing.JLabel();
        existenciaSuc = new javax.swing.JLabel();
        pedidos = new javax.swing.JLabel();
        pedidoDetalles = new javax.swing.JLabel();
        pagos = new javax.swing.JLabel();
        provedores = new javax.swing.JLabel();
        contactosProv = new javax.swing.JLabel();
        productosProv = new javax.swing.JLabel();
        cuentasProv = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        opcionesMenu = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        saludo = new javax.swing.JLabel();
        cerraSesion = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        footer = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        fecha_hora = new javax.swing.JLabel();
        workSpace = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        main.setBackground(new java.awt.Color(0, 51, 51));

        menu.setBackground(new java.awt.Color(0, 51, 51));
        menu.setLayout(new java.awt.BorderLayout());

        Separador1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        menu.add(Separador1, java.awt.BorderLayout.PAGE_START);

        listaMenu.setBackground(new java.awt.Color(0, 102, 102));
        listaMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 51))); // NOI18N

        laboratorios.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        laboratorios.setForeground(new java.awt.Color(255, 255, 255));
        laboratorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lab.png"))); // NOI18N
        laboratorios.setText("Laboratorio");
        laboratorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laboratorios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                laboratoriosMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                laboratoriosMouseMoved(evt);
            }
        });
        laboratorios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                laboratoriosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                laboratoriosFocusLost(evt);
            }
        });
        laboratorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laboratoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                laboratoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                laboratoriosMouseExited(evt);
            }
        });

        categorias.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        categorias.setForeground(new java.awt.Color(255, 255, 255));
        categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cate.png"))); // NOI18N
        categorias.setText("Categoria");
        categorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categorias.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                categoriasMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                categoriasMouseMoved(evt);
            }
        });
        categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoriasMouseExited(evt);
            }
        });

        empaques.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        empaques.setForeground(new java.awt.Color(255, 255, 255));
        empaques.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orden.png"))); // NOI18N
        empaques.setText("Empaques");
        empaques.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empaques.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                empaquesMouseMoved(evt);
            }
        });
        empaques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empaquesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empaquesMouseExited(evt);
            }
        });

        unidadMedidas.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        unidadMedidas.setForeground(new java.awt.Color(255, 255, 255));
        unidadMedidas.setText("Unidad  de medida");
        unidadMedidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unidadMedidas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                unidadMedidasMouseMoved(evt);
            }
        });
        unidadMedidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unidadMedidasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unidadMedidasMouseExited(evt);
            }
        });

        sucursales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        sucursales.setForeground(new java.awt.Color(255, 255, 255));
        sucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sucu.png"))); // NOI18N
        sucursales.setText("Sucursales");
        sucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sucursales.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                sucursalesMouseMoved(evt);
            }
        });
        sucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sucursalesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sucursalesMouseExited(evt);
            }
        });

        presentProductos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        presentProductos.setForeground(new java.awt.Color(255, 255, 255));
        presentProductos.setText("Presentaciones de productos");
        presentProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        presentProductos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                presentProductosMouseMoved(evt);
            }
        });
        presentProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                presentProductosMouseExited(evt);
            }
        });

        imgProductos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        imgProductos.setForeground(new java.awt.Color(255, 255, 255));
        imgProductos.setText("Imagenes de producto");
        imgProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgProductos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imgProductosMouseMoved(evt);
            }
        });
        imgProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgProductosMouseExited(evt);
            }
        });

        productos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        productos.setForeground(new java.awt.Color(255, 255, 255));
        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prod.png"))); // NOI18N
        productos.setText("Productos");
        productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                productosMouseMoved(evt);
            }
        });
        productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productosMouseExited(evt);
            }
        });

        existenciaSuc.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        existenciaSuc.setForeground(new java.awt.Color(255, 255, 255));
        existenciaSuc.setText("Existencia de sucursal");
        existenciaSuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        existenciaSuc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                existenciaSucMouseMoved(evt);
            }
        });
        existenciaSuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                existenciaSucMouseExited(evt);
            }
        });

        pedidos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        pedidos.setForeground(new java.awt.Color(255, 255, 255));
        pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedi.png"))); // NOI18N
        pedidos.setText("Pedidos");
        pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedidos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pedidosMouseMoved(evt);
            }
        });
        pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pedidosMouseExited(evt);
            }
        });

        pedidoDetalles.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        pedidoDetalles.setForeground(new java.awt.Color(255, 255, 255));
        pedidoDetalles.setText("Pedido detalle");
        pedidoDetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedidoDetalles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pedidoDetallesMouseMoved(evt);
            }
        });
        pedidoDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pedidoDetallesMouseExited(evt);
            }
        });

        pagos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        pagos.setForeground(new java.awt.Color(255, 255, 255));
        pagos.setText("pagos");
        pagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pagosMouseMoved(evt);
            }
        });
        pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagosMouseExited(evt);
            }
        });

        provedores.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        provedores.setForeground(new java.awt.Color(255, 255, 255));
        provedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prov.png"))); // NOI18N
        provedores.setText("Proveedores");
        provedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        provedores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                provedoresMouseMoved(evt);
            }
        });
        provedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                provedoresMouseExited(evt);
            }
        });

        contactosProv.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        contactosProv.setForeground(new java.awt.Color(255, 255, 255));
        contactosProv.setText("Contactos Proveedor");
        contactosProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactosProv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                contactosProvMouseMoved(evt);
            }
        });
        contactosProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactosProvMouseExited(evt);
            }
        });

        productosProv.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        productosProv.setForeground(new java.awt.Color(255, 255, 255));
        productosProv.setText("Productos proveedores");
        productosProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productosProv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                productosProvMouseMoved(evt);
            }
        });
        productosProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productosProvMouseExited(evt);
            }
        });

        cuentasProv.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cuentasProv.setForeground(new java.awt.Color(255, 255, 255));
        cuentasProv.setText("Cuentas proveedor");
        cuentasProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuentasProv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cuentasProvMouseMoved(evt);
            }
        });
        cuentasProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cuentasProvMouseExited(evt);
            }
        });

        javax.swing.GroupLayout listaMenuLayout = new javax.swing.GroupLayout(listaMenu);
        listaMenu.setLayout(listaMenuLayout);
        listaMenuLayout.setHorizontalGroup(
            listaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator6)
            .addComponent(jSeparator8)
            .addGroup(listaMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laboratorios, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empaques, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provedores, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(listaMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(listaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactosProv, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidadMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(presentProductos)
                            .addComponent(productosProv, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuentasProv, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pedidoDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(existenciaSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(listaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listaMenuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        listaMenuLayout.setVerticalGroup(
            listaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(laboratorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empaques)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unidadMedidas)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presentProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sucursales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existenciaSuc)
                .addGap(22, 22, 22)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pedidoDetalles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(provedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactosProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productosProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuentasProv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(listaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listaMenuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menu.add(listaMenu, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        opcionesMenu.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        opcionesMenu.setForeground(new java.awt.Color(255, 255, 255));
        opcionesMenu.setText("Opciones ");
        jPanel1.add(opcionesMenu, java.awt.BorderLayout.CENTER);

        menu.add(jPanel1, java.awt.BorderLayout.CENTER);

        header.setBackground(new java.awt.Color(0, 0, 51));

        titulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("AGRONEGOCIOS");

        saludo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        saludo.setForeground(new java.awt.Color(255, 255, 255));
        saludo.setText("BIENVENIDO");

        cerraSesion.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        cerraSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerraSesion.setText("CERRAR SESIÓN");
        cerraSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerraSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(cerraSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saludo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerraSesion)
                    .addComponent(titulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(saludo))
        );

        body.setBackground(new java.awt.Color(0, 51, 51));

        footer.setBackground(new java.awt.Color(0, 102, 102));

        usuario.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("REYES DUARTE JESUS DAVID");

        fecha_hora.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        fecha_hora.setForeground(new java.awt.Color(255, 255, 255));
        fecha_hora.setText("10:40 AM, 07/02/2020");
        fecha_hora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecha_horaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecha_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario)
                    .addComponent(fecha_hora))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        workSpace.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout workSpaceLayout = new javax.swing.GroupLayout(workSpace);
        workSpace.setLayout(workSpaceLayout);
        workSpaceLayout.setHorizontalGroup(
            workSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        workSpaceLayout.setVerticalGroup(
            workSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(workSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addComponent(workSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que muestra la interfaz de agregar un laboratorio
     *
     * @param evt
     */
    private void laboratoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laboratoriosMouseClicked

        workSpace.removeAll();
        mostrarLaboratorios mostrarlab = new mostrarLaboratorios();
        mostrarlab.setSize(workSpace.getSize());
        mostrarlab.setVisible(true);
        mostrarlab.activeEventListenerMostrarLab();
        workSpace.add(mostrarlab, BorderLayout.CENTER);
        workSpace.revalidate();
        workSpace.repaint();
        mostrarlab.setMostrarLaboratorios(this);


    }//GEN-LAST:event_laboratoriosMouseClicked

    private void laboratoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laboratoriosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_laboratoriosMouseEntered

    private void empaquesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empaquesMouseClicked
        workSpace.removeAll();
        mostrarEmpaques mostrarEmp = new mostrarEmpaques();
        mostrarEmp.setSize(workSpace.getSize());
        mostrarEmp.setVisible(true);
        mostrarEmp.setMostrarEmpaques(this);
        mostrarEmp.MostrarDatosEmpaque();
        workSpace.add(mostrarEmp, BorderLayout.CENTER);
        workSpace.revalidate();
        workSpace.repaint();


    }//GEN-LAST:event_empaquesMouseClicked

    private void categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriasMouseClicked
        //Quitas el jpanel principal que esta en el centro
        workSpace.removeAll();
        //Instaciamos el nuevo jpanel a reemplazar
        mostrarCategorias mc = new mostrarCategorias();
        //Redimensionamos el jpanel nuevo
        mc.setSize(workSpace.getSize());
        //Hacemos visible
        mc.setVisible(true);
        //Seleccionamos la función para mostrar el jpanel
        mc.setMostrarCategorias(this);
        //Cargamos el jpanel
        mc.MostrarDatosCategorias();
        //Agregamos el jpanel y centramos
        workSpace.add(mc, BorderLayout.CENTER);
        //Validamos el jpanel
        workSpace.revalidate();
        //Dibujamos el jpanel
        workSpace.repaint();
    }//GEN-LAST:event_categoriasMouseClicked

    private void unidadMedidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unidadMedidasMouseClicked
        //Quitas el jpanel principal que esta en el centro
        workSpace.removeAll();
        //Instaciamos el nuevo jpanel a reemplazar
        mostrarUnidadMedida mum = new mostrarUnidadMedida();
        //Redimensionamos el jpanel nuevo
        mum.setSize(workSpace.getSize());
        //Hacemos visible
        mum.setVisible(true);
        //Seleccionamos la función para mostrar el jpanel
        mum.setMostrarUnidadMedida(this);
        //Cargamos el jpanel
        mum.MostrarDatosUnidad();
        //Agregamos el jpanel y centramos
        workSpace.add(mum, BorderLayout.CENTER);
        //Validamos el jpanel
        workSpace.revalidate();
        //Dibujamos el jpanel
        workSpace.repaint();
    }//GEN-LAST:event_unidadMedidasMouseClicked

    private void fecha_horaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecha_horaMouseClicked


    }//GEN-LAST:event_fecha_horaMouseClicked

    private void cerraSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerraSesionMouseClicked
        if (JOptionPane.showConfirmDialog(this, "Cerraras sesión, quieres continuar", "Cerrar sesión", JOptionPane.WARNING_MESSAGE)
                == JOptionPane.YES_OPTION) {
            con.cerrar();
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_cerraSesionMouseClicked

    private void laboratoriosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_laboratoriosFocusGained
        this.laboratorios.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_laboratoriosFocusGained

    private void laboratoriosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_laboratoriosFocusLost
        this.laboratorios.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_laboratoriosFocusLost

    private void laboratoriosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laboratoriosMouseMoved
        this.laboratorios.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_laboratoriosMouseMoved

    private void laboratoriosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laboratoriosMouseDragged
        this.laboratorios.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_laboratoriosMouseDragged

    private void laboratoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laboratoriosMouseExited
        this.laboratorios.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_laboratoriosMouseExited

    private void categoriasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriasMouseMoved
        this.categorias.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_categoriasMouseMoved

    private void categoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriasMouseExited
        this.categorias.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_categoriasMouseExited

    private void empaquesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empaquesMouseExited
        this.empaques.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_empaquesMouseExited

    private void empaquesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empaquesMouseMoved
        this.empaques.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_empaquesMouseMoved

    private void unidadMedidasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unidadMedidasMouseMoved
        this.unidadMedidas.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_unidadMedidasMouseMoved

    private void unidadMedidasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unidadMedidasMouseExited
        this.unidadMedidas.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_unidadMedidasMouseExited

    private void productosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMouseExited
        this.productos.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_productosMouseExited

    private void productosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMouseMoved
        this.productos.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_productosMouseMoved

    private void presentProductosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presentProductosMouseMoved
        this.presentProductos.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_presentProductosMouseMoved

    private void presentProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presentProductosMouseExited
        this.presentProductos.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_presentProductosMouseExited

    private void imgProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgProductosMouseExited
        this.imgProductos.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_imgProductosMouseExited

    private void imgProductosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgProductosMouseMoved
        this.imgProductos.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_imgProductosMouseMoved

    private void sucursalesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sucursalesMouseMoved
        this.sucursales.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_sucursalesMouseMoved

    private void sucursalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sucursalesMouseExited
        this.sucursales.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_sucursalesMouseExited

    private void existenciaSucMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_existenciaSucMouseExited
        this.existenciaSuc.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_existenciaSucMouseExited

    private void existenciaSucMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_existenciaSucMouseMoved
        this.existenciaSuc.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_existenciaSucMouseMoved

    private void pedidosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidosMouseMoved
        this.pedidos.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_pedidosMouseMoved

    private void pedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidosMouseExited
        this.pedidos.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_pedidosMouseExited

    private void pedidoDetallesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidoDetallesMouseMoved
        this.pedidoDetalles.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_pedidoDetallesMouseMoved

    private void pedidoDetallesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidoDetallesMouseExited
        this.pedidoDetalles.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_pedidoDetallesMouseExited

    private void pagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagosMouseExited
        this.pagos.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_pagosMouseExited

    private void pagosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagosMouseMoved
        this.pagos.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_pagosMouseMoved

    private void provedoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provedoresMouseMoved
        this.provedores.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_provedoresMouseMoved

    private void provedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provedoresMouseExited
        this.provedores.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_provedoresMouseExited

    private void contactosProvMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactosProvMouseMoved
        this.contactosProv.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_contactosProvMouseMoved

    private void contactosProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactosProvMouseExited
        this.contactosProv.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_contactosProvMouseExited

    private void productosProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosProvMouseExited
        this.productosProv.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_productosProvMouseExited

    private void productosProvMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosProvMouseMoved
        this.productosProv.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_productosProvMouseMoved

    private void cuentasProvMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentasProvMouseMoved
        this.cuentasProv.setForeground(new Color(142, 153, 242, 255));
    }//GEN-LAST:event_cuentasProvMouseMoved

    private void cuentasProvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentasProvMouseExited
        this.cuentasProv.setForeground(new Color(255, 255, 255, 255));

    }//GEN-LAST:event_cuentasProvMouseExited

    private void categoriasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriasMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasMouseDragged

    private void sucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sucursalesMouseClicked
        workSpace.removeAll();
        mostrarSucursales mostrarSuc = new mostrarSucursales();
        mostrarSuc.setSize(workSpace.getSize());
        mostrarSuc.setVisible(true);
        mostrarSuc.MostrarDatosSucursal();
        workSpace.add(mostrarSuc, BorderLayout.CENTER);
        workSpace.revalidate();
        workSpace.repaint();
        mostrarSuc.setMostrarSucursales(this);


    }//GEN-LAST:event_sucursalesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador1;
    private javax.swing.JPanel body;
    private javax.swing.JLabel categorias;
    private javax.swing.JLabel cerraSesion;
    private javax.swing.JLabel contactosProv;
    private javax.swing.JLabel cuentasProv;
    private javax.swing.JLabel empaques;
    private javax.swing.JLabel existenciaSuc;
    private javax.swing.JLabel fecha_hora;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imgProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel laboratorios;
    private javax.swing.JPanel listaMenu;
    private javax.swing.JPanel main;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel opcionesMenu;
    private javax.swing.JLabel pagos;
    private javax.swing.JLabel pedidoDetalles;
    private javax.swing.JLabel pedidos;
    private javax.swing.JLabel presentProductos;
    private javax.swing.JLabel productos;
    private javax.swing.JLabel productosProv;
    private javax.swing.JLabel provedores;
    private javax.swing.JLabel saludo;
    private javax.swing.JLabel sucursales;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel unidadMedidas;
    private javax.swing.JLabel usuario;
    private javax.swing.JPanel workSpace;
    // End of variables declaration//GEN-END:variables
    private ConexionSQL con = ConexionSQL.getInstance();

    public JPanel getworkSpace() {
        return workSpace;
    }

    public void getLabelComponents(boolean bandera) {
        this.laboratorios.setEnabled(bandera);
    }

    @Override
    public void run() {
        for (;;) {
            Calendar fecha = new GregorianCalendar();

            int anio = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            int hora = fecha.get(Calendar.HOUR_OF_DAY);
            int minuto = fecha.get(Calendar.MINUTE);
            int segundo = fecha.get(Calendar.SECOND);

            String fechaCompleta = "" + dia + "/ " + mes + "/ " + anio + "  " + hora + ":" + minuto + ":" + segundo;

            fecha_hora.setText(fechaCompleta);
        }
    }

}
