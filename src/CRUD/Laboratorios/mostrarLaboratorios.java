
package CRUD.Laboratorios;
import MainPrincipal.Main;
import java.awt.BorderLayout;
import RenderizadoDetablas.RenderTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import MainPrincipal.Main;
/**
 *
 * @author 52351
 */
public class mostrarLaboratorios extends javax.swing.JPanel {

    /**
     * Creates new form mostrarLaboratorios
     */
    public void setMostrarLaboratorios(Main workspace) {
        mainPrincipal = workspace;
    }
    
    public mostrarLaboratorios() {
        initComponents();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        mainMostrarLab = new javax.swing.JPanel();
        tablaMostrarLab = new javax.swing.JScrollPane();
        jTableML = new javax.swing.JTable();
        opcionesMostrarLab = new javax.swing.JPanel();
        nuevolabML = new javax.swing.JLabel();
        cancelarML = new javax.swing.JLabel();
        buscartxtML = new javax.swing.JTextField();
        buscarML = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(228, 225, 225));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Mostrar laboratorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        mainMostrarLab.setBackground(new java.awt.Color(233, 231, 231));

        jTableML.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "ORIGEN", "ESTATUS", "", ""
            }
        ));
        tablaMostrarLab.setViewportView(jTableML);

        opcionesMostrarLab.setBackground(new java.awt.Color(48, 45, 45));

        nuevolabML.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        nuevolabML.setForeground(new java.awt.Color(255, 255, 255));
        nuevolabML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        nuevolabML.setText("NUEVO LABORATORIO");
        nuevolabML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        nuevolabML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevolabML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevolabMLMouseClicked(evt);
            }
        });

        cancelarML.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        cancelarML.setForeground(new java.awt.Color(255, 255, 255));
        cancelarML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        cancelarML.setText("CANCELAR");
        cancelarML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cancelarML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesMostrarLabLayout = new javax.swing.GroupLayout(opcionesMostrarLab);
        opcionesMostrarLab.setLayout(opcionesMostrarLabLayout);
        opcionesMostrarLabLayout.setHorizontalGroup(
            opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarLabLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(nuevolabML, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarML, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        opcionesMostrarLabLayout.setVerticalGroup(
            opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesMostrarLabLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(opcionesMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarML)
                    .addComponent(nuevolabML))
                .addGap(35, 35, 35))
        );

        buscarML.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        buscarML.setForeground(new java.awt.Color(102, 102, 102));
        buscarML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/most.png"))); // NOI18N
        buscarML.setText("BUSCAR LABORATORIO");
        buscarML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        buscarML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout mainMostrarLabLayout = new javax.swing.GroupLayout(mainMostrarLab);
        mainMostrarLab.setLayout(mainMostrarLabLayout);
        mainMostrarLabLayout.setHorizontalGroup(
            mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablaMostrarLab)
                    .addComponent(opcionesMostrarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMostrarLabLayout.createSequentialGroup()
                        .addGap(0, 197, Short.MAX_VALUE)
                        .addComponent(buscartxtML, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarML, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainMostrarLabLayout.setVerticalGroup(
            mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMostrarLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMostrarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarML)
                    .addComponent(buscartxtML, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablaMostrarLab, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionesMostrarLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(mainMostrarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMostrarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevolabMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevolabMLMouseClicked
       mainPrincipal.getworkSpace().removeAll();
       agregarLaboratorio nuevolab = new agregarLaboratorio();
       nuevolab.setSize(mainPrincipal.getworkSpace().getSize());
       nuevolab.setVisible(true);
       nuevolab.setMain(mainPrincipal);
       //agregarLaboratorio.setMain(mainPrincipal);
       //nuevolab.getEnableComponents();
       mainPrincipal.getworkSpace().add(nuevolab,BorderLayout.CENTER);
       mainPrincipal.getworkSpace().revalidate();
       mainPrincipal.getworkSpace().repaint();
        
        
    }//GEN-LAST:event_nuevolabMLMouseClicked

    private void cancelarMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMLMouseClicked
       mainPrincipal.getworkSpace().removeAll();
       mainPrincipal.getworkSpace().revalidate();
       mainPrincipal.getworkSpace().repaint();
    }//GEN-LAST:event_cancelarMLMouseClicked

    public void MostrarDatosLaboratorio(){
        
        JButton btnModificar = new JButton();
        JButton btnEliminar = new JButton();
        
        this.jTableML.setDefaultRenderer(Object.class, new RenderTable());
        DefaultTableModel modelTable = new DefaultTableModel(
                new Object[][]{{"1","juan",btnModificar,btnEliminar},{"2","David",btnModificar,btnEliminar}}
                , new Object[]{"Codigo","Nombre","Modificar","Eliminar"}){
                  public boolean isCellEditable(int row,int column){
                      return false;
                  }
                };
        
        this.jTableML.setModel(modelTable);
        this.jTableML.setRowHeight(30);
    }
    
    public void activeEventListenerMostrarLab(){
        MostrarDatosLaboratorio();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarML;
    private javax.swing.JTextField buscartxtML;
    private javax.swing.JLabel cancelarML;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTable jTableML;
    private javax.swing.JPanel mainMostrarLab;
    private javax.swing.JLabel nuevolabML;
    private javax.swing.JPanel opcionesMostrarLab;
    private javax.swing.JScrollPane tablaMostrarLab;
    // End of variables declaration//GEN-END:variables
}
