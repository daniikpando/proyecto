package Capa_Presentacion;
import Capa_Datos.Conexion;
import Capa_Logica.Generar_Codigo;
import Capa_Logica.Registrar_Producto;
import Capa_Logica.Registrar_Material;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Producto_Admin extends javax.swing.JFrame {
    public Producto_Admin() {
        initComponents();
        txbid.setEditable(false);
        txbidmaterial.setEditable(false);
        txbnombre.setEditable(false);
        txbprebordado.setEditable(false);
        txbpreboton.setEditable(false);
        txbprecio.setEditable(false);
        txbpreciotela.setEditable(false);
        txbprecremallera.setEditable(false);
        txbprehilo.setEditable(false);
        txbtipotela.setEditable(false);
        txbgenero.setEditable(false);
        this.setLocationRelativeTo(null);
        btnagregar.setEnabled(false);
        btneditar.setEnabled(false);
        Listar_Producto();
        Listar_Material();
        id_producto();
        id_materiales();
    }
    
    public void Listar_Producto(){
        DefaultTableModel tabla=new DefaultTableModel();
        Registrar_Producto registro = new Registrar_Producto();
        ArrayList<Registrar_Producto> lista=new ArrayList();
        lista = registro.Listar();
        tabla.addColumn("Id_Producto");
        tabla.addColumn("Nombre");
        tabla.addColumn("Precio");
        tabla.addColumn("Genero");
        tabla.setRowCount(lista.size());
        int i=0;
        for(Registrar_Producto x:lista)
        {
            tabla.setValueAt(x.get_ID_Producto(), i, 0);
            tabla.setValueAt(x.get_Nombre(), i, 1);
            tabla.setValueAt(x.get_Precio(), i, 2);
            tabla.setValueAt(x.get_Genero(), i, 3);
            i++;
        }
        this.jTable1.setModel(tabla);
    }
    
    public void Listar_Material(){
        DefaultTableModel tabla2 = new DefaultTableModel();
        Registrar_Material registro = new Registrar_Material();
        ArrayList<Registrar_Material> lista3 = new ArrayList();
        lista3 = registro.Listar_Material();
        tabla2.addColumn("Id_Material");
        tabla2.addColumn("Tipo_Tela");
        tabla2.addColumn("Precio_Tela");
        tabla2.addColumn("Precio_Cremallera");
        tabla2.addColumn("Precio_Bordado");
        tabla2.addColumn("Precio_Boton");
        tabla2.addColumn("Precio_hilo");
        tabla2.setRowCount(lista3.size());
        int i=0;
        for(Registrar_Material k:lista3)
        {
            tabla2.setValueAt(k.get_Id_Material(), i, 0);
            tabla2.setValueAt(k.get_Tipo_Tela(), i, 1);
            tabla2.setValueAt(k.get_Precio_Tela(), i, 2);
            tabla2.setValueAt(k.get_Precio_Cremallera(), i, 3);
            tabla2.setValueAt(k.get_Precio_Bordado(), i, 4);
            tabla2.setValueAt(k.get_Precio_Boton(), i, 5);
            tabla2.setValueAt(k.get_Precio_hilo(), i, 6);
            i++;
        }
        this.jTable2.setModel(tabla2);
    }
    
    public void id_producto(){
        int i;
        String Cap="";
        String Cad="select count(*) from producto";
        try 
        {
            Conexion conex = new Conexion();
            ResultSet rs = conex.Listar(Cad);
            if(rs.next())
            {
                Cap= rs.getString(1);
            }
            i=Integer.parseInt(Cap);
            Generar_Codigo generar = new Generar_Codigo();
            generar.generar(i);
            txbid.setText(generar.get_num());
        } 
        catch (SQLException ex) 
        {
        }
    }
    public void id_materiales(){
        int i;
        String Cap="";
        String Cad="select count(*) from materiales";
        try 
        {
            Conexion conex = new Conexion();
            ResultSet rs = conex.Listar(Cad);
            if(rs.next())
            {
                Cap= rs.getString(1);
            }
            i=Integer.parseInt(Cap);
            Generar_Codigo generar = new Generar_Codigo();
            generar.generar(i);
            txbidmaterial.setText(generar.get_num());
        } 
        catch (SQLException ex) 
        {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        rutaimagen = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txbid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txbnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txbprecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txbgenero = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txbidmaterial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txbtipotela = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txbpreciotela = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txbprecremallera = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txbprebordado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txbpreboton = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txbprehilo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_Producto", "Nombre", "Precio", "Genero"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btncerrar.setText("Cerrar sesion");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Material", "Tipo_Tela", "Precio_Tela", "Precio_Cremallera", "Precio_Bordado", "Precio_Boton", "Precio_hilo"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Id Producto:");

        jLabel2.setText("Nombre :");

        txbnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txbnombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Precio:");

        txbprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txbprecioKeyTyped(evt);
            }
        });

        jLabel6.setText("Genero:");

        txbgenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txbgeneroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(txbid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txbprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txbprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Id Material:");

        jLabel5.setText("Tipo de tela:");

        txbtipotela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txbtipotelaKeyTyped(evt);
            }
        });

        jLabel7.setText("Precio tela:");

        txbpreciotela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txbpreciotelaKeyTyped(evt);
            }
        });

        jLabel9.setText("Pre Cremallera:");

        txbprecremallera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txbprecremalleraKeyTyped(evt);
            }
        });

        jLabel11.setText("Pre bordado:");

        txbprebordado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txbprebordadoKeyTyped(evt);
            }
        });

        jLabel15.setText("Precio boton:");

        txbpreboton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txbprebotonKeyTyped(evt);
            }
        });

        jLabel14.setText("Precio hilo:");

        txbprehilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbprehiloActionPerformed(evt);
            }
        });
        txbprehilo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txbprehiloKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txbprecremallera))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txbtipotela, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(txbidmaterial)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(35, 35, 35)
                                .addComponent(txbpreciotela))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbprehilo)
                            .addComponent(txbprebordado)
                            .addComponent(txbpreboton))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbidmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txbtipotela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txbpreciotela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txbprecremallera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txbprebordado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txbpreboton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txbprehilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rutaimagen)
                .addGap(1095, 1095, 1095))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnagregar)
                        .addGap(10, 10, 10)
                        .addComponent(btnnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btneditar)
                        .addGap(10, 10, 10)
                        .addComponent(btnmostrar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btncerrar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregar)
                            .addComponent(btnnuevo)
                            .addComponent(btneditar)
                            .addComponent(btnmostrar)
                            .addComponent(btneliminar)
                            .addComponent(btncerrar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rutaimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        Listar_Producto();
        Listar_Material();
        btnagregar.setEnabled(false);
        btneditar.setEnabled(true);

    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        txbid.setText("");
        txbnombre.setText("");
        txbprecio.setText("");
        txbidmaterial.setText("");
        txbtipotela.setText("");
        txbpreciotela.setText("");
        txbprebordado.setText("");
        txbprehilo.setText("");
        txbprecremallera.setText("");
        txbpreboton.setText("");
        txbgenero.setText("");
        
        txbnombre.setEditable(true);
        txbprebordado.setEditable(true);
        txbpreboton.setEditable(true);
        txbprecio.setEditable(true);
        txbpreciotela.setEditable(true);
        txbprecremallera.setEditable(true);
        txbprehilo.setEditable(true);
        txbtipotela.setEditable(true);
        txbgenero.setEditable(true);
        
        btnnuevo.setEnabled(false);
        btnagregar.setEnabled(true);
        btneditar.setEnabled(true);
        id_producto();
        id_materiales();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if(txbid.getText().equals(txbidmaterial.getText()))
        {
            int res=JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar el articulo?",
                "Eliminar",JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION)
            {
                Registrar_Producto registro = new Registrar_Producto();
                registro.set_ID_Producto(txbid.getText());
                registro.Eliminar();
                Listar_Producto();
                txbid.setText("");
                txbnombre.setText("");
                txbprecio.setText("");
                txbgenero.setText("");
            
                Registrar_Material registro2 = new Registrar_Material();
                registro2.set_Id_Material(txbidmaterial.getText());
                registro2.Eliminar();
                Listar_Material();
                txbidmaterial.setText("");
                txbtipotela.setText("");
                txbpreciotela.setText("");
                txbprebordado.setText("");
                txbprehilo.setText("");
                txbprecremallera.setText("");
                txbpreboton.setText("");
            
                btnagregar.setEnabled(false);
                btneditar.setEnabled(false);
                btnnuevo.setEnabled(true);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El id producto no es igual al id material");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        if(txbid.getText().equals(txbidmaterial.getText()))
        {
            Registrar_Producto registro = new Registrar_Producto();
            registro.set_ID_Producto(txbid.getText());
            registro.set_Nombre(txbnombre.getText());
            registro.set_Precio(Double.parseDouble(txbprecio.getText()));
            registro.set_genero(txbgenero.getText());
            registro.Editar();
            Listar_Producto();
        
            Registrar_Material registro2 = new Registrar_Material();
            registro2.set_Id_Material(this.txbidmaterial.getText());
            registro2.set_Tipo_Tela(this.txbtipotela.getText());
            registro2.set_Precio_Tela(Double.parseDouble(this.txbpreciotela.getText()));
            registro2.set_Precio_Cremallera(Double.parseDouble(this.txbprecremallera.getText()));
            registro2.set_Precio_Bordado(Double.parseDouble(this.txbprebordado.getText()));
            registro2.set_Precio_Boton(Double.parseDouble(this.txbpreboton.getText()));
            registro2.set_Precio_hilo(Double.parseDouble(this.txbprehilo.getText()));
            registro2.Editar();
            Listar_Material();
        
            btnagregar.setEnabled(true);
            btnmostrar.setEnabled(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El id producto no es igual al id material");
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        //si los campos de texto estan llenos, continuara coon la siguiente accion
        if(!txbnombre.getText().isEmpty() && !txbprecio.getText().isEmpty() && !txbtipotela.getText().isEmpty()
                && !txbpreciotela.getText().isEmpty() && !txbprecremallera.getText().isEmpty() &&
                !txbprebordado.getText().isEmpty() && !txbpreboton.getText().isEmpty() && 
                !txbprehilo.getText().isEmpty() && !txbgenero.getText().isEmpty())
        {
            
            Registrar_Producto registro=new Registrar_Producto();
            registro.set_ID_Producto(this.txbid.getText());
            registro.set_Nombre(this.txbnombre.getText());
            registro.set_Precio(Double.parseDouble(this.txbprecio.getText()));
            registro.set_genero(this.txbgenero.getText());
            registro.Añadir_Producto();
            id_producto();
            
            Registrar_Material registro2 = new Registrar_Material();
            registro2.set_Id_Material(this.txbidmaterial.getText());
            registro2.set_Tipo_Tela(this.txbtipotela.getText());
            registro2.set_Precio_Tela(Double.parseDouble(this.txbpreciotela.getText()));
            registro2.set_Precio_Cremallera(Double.parseDouble(this.txbprecremallera.getText()));
            registro2.set_Precio_Bordado(Double.parseDouble(this.txbprebordado.getText()));
            registro2.set_Precio_Boton(Double.parseDouble(this.txbpreboton.getText()));
            registro2.set_Precio_hilo(Double.parseDouble(this.txbprehilo.getText()));
            registro2.Añadir_Material();
            id_materiales();
            btnnuevo.setEnabled(true);
            btnagregar.setEnabled(false);
            btneditar.setEnabled(true);
            Listar_Producto();
            Listar_Material();
        }
        //si una de los campos de texto esta vacios, imprimira un mensaje por pantalla al usuario
        else
        {
            JOptionPane.showMessageDialog(null,"Llene todos los campos de texto");
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        int rec=this.jTable1.getSelectedRow();
        this.txbid.setText(jTable1.getValueAt(rec, 0).toString());
        this.txbnombre.setText(jTable1.getValueAt(rec, 1).toString());
        this.txbprecio.setText(jTable1.getValueAt(rec, 2).toString());
        this.txbgenero.setText(jTable1.getValueAt(rec, 3).toString());
    }//GEN-LAST:event_jTable1MousePressed

    private void txbprehiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbprehiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbprehiloActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        int rec2=this.jTable2.getSelectedRow();
        this.txbidmaterial.setText(jTable2.getValueAt(rec2, 0).toString());
        this.txbtipotela.setText(jTable2.getValueAt(rec2, 1).toString());
        this.txbpreciotela.setText(jTable2.getValueAt(rec2, 2).toString());
        this.txbprecremallera.setText(jTable2.getValueAt(rec2, 3).toString());
        this.txbprebordado.setText(jTable2.getValueAt(rec2, 4).toString());
        this.txbpreboton.setText(jTable2.getValueAt(rec2, 5).toString());
        this.txbprehilo.setText(jTable2.getValueAt(rec2, 6).toString());
    }//GEN-LAST:event_jTable2MousePressed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        Iniciar_Sesion iniciar = new Iniciar_Sesion();
        iniciar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void txbpreciotelaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbpreciotelaKeyTyped
        char d=evt.getKeyChar();
        if(d<'0'|| d>'9') evt.consume();
    }//GEN-LAST:event_txbpreciotelaKeyTyped

    private void txbprecremalleraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbprecremalleraKeyTyped
        char d=evt.getKeyChar();
        if(d<'0'|| d>'9') evt.consume();
    }//GEN-LAST:event_txbprecremalleraKeyTyped

    private void txbprebordadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbprebordadoKeyTyped
        char d=evt.getKeyChar();
        if(d<'0'|| d>'9') evt.consume();
    }//GEN-LAST:event_txbprebordadoKeyTyped

    private void txbprebotonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbprebotonKeyTyped
        char d=evt.getKeyChar();
        if(d<'0'|| d>'9') evt.consume();
    }//GEN-LAST:event_txbprebotonKeyTyped

    private void txbprehiloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbprehiloKeyTyped
        char d=evt.getKeyChar();
        if(d<'0'|| d>'9') evt.consume();
    }//GEN-LAST:event_txbprehiloKeyTyped

    private void txbprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbprecioKeyTyped
        char d=evt.getKeyChar();
        if(d<'0'|| d>'9') evt.consume();
    }//GEN-LAST:event_txbprecioKeyTyped

    private void txbnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbnombreKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txbnombreKeyTyped

    private void txbgeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbgeneroKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txbgeneroKeyTyped

    private void txbtipotelaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbtipotelaKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txbtipotelaKeyTyped

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
            java.util.logging.Logger.getLogger(Producto_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel rutaimagen;
    private javax.swing.JTextField txbgenero;
    public static javax.swing.JTextField txbid;
    private javax.swing.JTextField txbidmaterial;
    private javax.swing.JTextField txbnombre;
    private javax.swing.JTextField txbprebordado;
    private javax.swing.JTextField txbpreboton;
    private javax.swing.JTextField txbprecio;
    private javax.swing.JTextField txbpreciotela;
    private javax.swing.JTextField txbprecremallera;
    private javax.swing.JTextField txbprehilo;
    private javax.swing.JTextField txbtipotela;
    // End of variables declaration//GEN-END:variables
}
