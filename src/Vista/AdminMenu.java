package Vista;

import Controlador.AdminMenuCon;
import Controlador.Hilo1;
import Modelo.Empleado;
import Modelo.Operaciones;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import sistemadeventas.Login;

public class AdminMenu extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private Empleado empleado;
    private Login login;
    private Hilo1 H;
    private Productos productos;

    public AdminMenu(Operaciones op, Login login) {
        this.productos = new Productos();
        initComponents();
        this.login = login;
        Relog();
        AdminMenuCon controlador = new AdminMenuCon(op, login, this);
        controlador.setV(productos);
        //
        System.out.println("6");
        jspPiezas.setValue(1);
        //
        System.out.println("7");
        jbtSalir.addActionListener(controlador);
        jbtBuscar.addActionListener(controlador);
        jbtBuscar.addActionListener(controlador);
        jbtAgregar.addActionListener(controlador);
        jbtCobrar.addActionListener(controlador);
        jbtNueva.addActionListener(controlador);
        //
        System.out.println("8");
        jbtProductos.addActionListener(controlador);

    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
        setDatos();
    }

    private void setDatos() {
        this.jlbNom.setText(empleado.getNom() + " " + empleado.getAPaterno() + " " + empleado.getAMaterno());
        this.jlbEdad.setText(empleado.getEdad());
        this.jlbCargo.setText(empleado.getCargo());
    }

    private void Relog() {
        H = Hilo1.getNodo(jlbRelog);
        H.start();
    }

    public void setAgenda(DefaultTableModel modelo) {
        this.jtCanasta.setModel(modelo);
    }

    public void setProductoInfo(String[] info) {
        jtfNombre.setText(info[0]);
        jtfContenido.setText(info[1]);
        jtfCosto.setText(info[2]);
    }

    public void setJtCanasta(DefaultTableModel t) {
        this.jtCanasta.setModel(t);
    }

    public String getProducto() {
        return jtfProducto.getText().replace(" ", "");
    }

    public int getBusqueda() {
        return jcbBusqueda.getSelectedIndex();
    }

    public int getPiezas() {
        return (int) jspPiezas.getValue();
    }

    public void Empty() {
        jtfProducto.setText("");
        jtfNombre.setText("");
        jtfContenido.setText("");
        jtfCosto.setText("");
        jspPiezas.setValue(1);
        jlbTotal.setText("Total: $0.0");
    }

    public void setTotal(double x) {
        jlbTotal.setText("Total: $" + x);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtCuenta = new javax.swing.JButton();
        jbtProductos = new javax.swing.JButton();
        jbtEmpleados = new javax.swing.JButton();
        jbtAgenda = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlbNom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbEdad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbCargo = new javax.swing.JLabel();
        jlbRelog = new javax.swing.JLabel();
        jlbFecha = new javax.swing.JLabel();
        jtbTabla = new javax.swing.JTabbedPane();
        jpCaja = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jcbBusqueda = new javax.swing.JComboBox<>();
        jtfProducto = new javax.swing.JTextField();
        jbtBuscar = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        txt3 = new javax.swing.JLabel();
        jtfContenido = new javax.swing.JTextField();
        txt4 = new javax.swing.JLabel();
        jtfCosto = new javax.swing.JTextField();
        txt5 = new javax.swing.JLabel();
        jspPiezas = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCanasta = new javax.swing.JTable();
        jbtAgregar = new javax.swing.JButton();
        jbtCobrar = new javax.swing.JButton();
        jbtNueva = new javax.swing.JButton();
        jlbTotal = new javax.swing.JLabel();
        jpTabla = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMenu.setBackground(new java.awt.Color(204, 204, 204));
        jpMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LoginPng (3).png"))); // NOI18N
        jLabel1.setToolTipText("Foto de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 200));

        jbtCuenta.setBackground(new java.awt.Color(153, 0, 255));
        jbtCuenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtCuenta.setForeground(new java.awt.Color(0, 0, 0));
        jbtCuenta.setText("Cuenta");
        jbtCuenta.setToolTipText("info de cuenta");
        jbtCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jbtCuenta.setFocusPainted(false);
        jPanel1.add(jbtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 50));

        jbtProductos.setBackground(new java.awt.Color(153, 0, 255));
        jbtProductos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtProductos.setForeground(new java.awt.Color(0, 0, 0));
        jbtProductos.setText("Productos");
        jbtProductos.setToolTipText("info de cuenta");
        jbtProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jbtProductos.setFocusPainted(false);
        jPanel1.add(jbtProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, 50));

        jbtEmpleados.setBackground(new java.awt.Color(153, 0, 255));
        jbtEmpleados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        jbtEmpleados.setText("Empleados");
        jbtEmpleados.setToolTipText("info de cuenta");
        jbtEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jbtEmpleados.setFocusPainted(false);
        jPanel1.add(jbtEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, 50));

        jbtAgenda.setBackground(new java.awt.Color(153, 0, 255));
        jbtAgenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtAgenda.setForeground(new java.awt.Color(0, 0, 0));
        jbtAgenda.setText("Agenda");
        jbtAgenda.setToolTipText("info de cuenta");
        jbtAgenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jbtAgenda.setFocusPainted(false);
        jPanel1.add(jbtAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 50));

        jbtSalir.setBackground(new java.awt.Color(255, 0, 0));
        jbtSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbtSalir.setText("Salir");
        jbtSalir.setToolTipText("info de cuenta");
        jbtSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtSalir.setFocusPainted(false);
        jPanel1.add(jbtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 300, 50));

        jpMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 600));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        jlbNom.setBackground(new java.awt.Color(0, 0, 0));
        jlbNom.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbNom.setForeground(new java.awt.Color(0, 0, 0));
        jlbNom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbNom.setText("--");
        jlbNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jlbNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 300, 25));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Edad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 25));

        jlbEdad.setBackground(new java.awt.Color(0, 0, 0));
        jlbEdad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbEdad.setForeground(new java.awt.Color(0, 0, 0));
        jlbEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbEdad.setText("--");
        jPanel2.add(jlbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, 25));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Cargo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, 25));

        jlbCargo.setBackground(new java.awt.Color(0, 0, 0));
        jlbCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbCargo.setForeground(new java.awt.Color(0, 0, 0));
        jlbCargo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCargo.setText("--");
        jPanel2.add(jlbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, 25));

        jlbRelog.setBackground(new java.awt.Color(0, 0, 0));
        jlbRelog.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbRelog.setForeground(new java.awt.Color(0, 0, 0));
        jlbRelog.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbRelog.setText("--");
        jlbRelog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jlbRelog, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 150, 25));

        jlbFecha.setBackground(new java.awt.Color(0, 0, 0));
        jlbFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbFecha.setForeground(new java.awt.Color(0, 0, 0));
        jlbFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbFecha.setText("--");
        jlbFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jlbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 150, 25));

        jpMenu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 100));

        jtbTabla.setBackground(new java.awt.Color(255, 255, 255));
        jtbTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbTabla.setForeground(new java.awt.Color(0, 0, 0));
        jtbTabla.setName("Caja"); // NOI18N

        jpCaja.setBackground(new java.awt.Color(204, 204, 204));
        jpCaja.setToolTipText("Cobro");

        txt1.setBackground(new java.awt.Color(0, 0, 0));
        txt1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt1.setText("Buscar");

        jcbBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        jcbBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        jcbBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre" }));
        jcbBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtfProducto.setBackground(new java.awt.Color(255, 255, 255));
        jtfProducto.setForeground(new java.awt.Color(0, 0, 0));
        jtfProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jbtBuscar.setBackground(new java.awt.Color(153, 153, 153));
        jbtBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbtBuscar.setText("Buscar");
        jbtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txt2.setBackground(new java.awt.Color(0, 0, 0));
        txt2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 0, 0));
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt2.setText("Nombre");

        jtfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfNombre.setEnabled(false);

        txt3.setBackground(new java.awt.Color(0, 0, 0));
        txt3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 0));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt3.setText("Contenido");

        jtfContenido.setBackground(new java.awt.Color(255, 255, 255));
        jtfContenido.setForeground(new java.awt.Color(0, 0, 0));
        jtfContenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfContenido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfContenido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfContenido.setEnabled(false);

        txt4.setBackground(new java.awt.Color(0, 0, 0));
        txt4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 0));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt4.setText("Piezas");

        jtfCosto.setBackground(new java.awt.Color(255, 255, 255));
        jtfCosto.setForeground(new java.awt.Color(0, 0, 0));
        jtfCosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfCosto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfCosto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfCosto.setEnabled(false);

        txt5.setBackground(new java.awt.Color(0, 0, 0));
        txt5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt5.setForeground(new java.awt.Color(0, 0, 0));
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt5.setText("Costo");

        jspPiezas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtCanasta.setBackground(new java.awt.Color(255, 255, 255));
        jtCanasta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtCanasta.setForeground(new java.awt.Color(0, 0, 0));
        jtCanasta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtCanasta.setEnabled(false);
        jScrollPane1.setViewportView(jtCanasta);

        jbtAgregar.setBackground(new java.awt.Color(153, 153, 153));
        jbtAgregar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jbtAgregar.setText("Agregar");
        jbtAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jbtCobrar.setBackground(new java.awt.Color(153, 153, 153));
        jbtCobrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtCobrar.setForeground(new java.awt.Color(0, 0, 0));
        jbtCobrar.setText("Cobrar");
        jbtCobrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jbtNueva.setBackground(new java.awt.Color(153, 153, 153));
        jbtNueva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtNueva.setForeground(new java.awt.Color(0, 0, 0));
        jbtNueva.setText("Nueva Cuenta");
        jbtNueva.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jlbTotal.setBackground(new java.awt.Color(0, 0, 0));
        jlbTotal.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jlbTotal.setForeground(new java.awt.Color(0, 0, 0));
        jlbTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTotal.setText("Total : $0.0");

        javax.swing.GroupLayout jpCajaLayout = new javax.swing.GroupLayout(jpCaja);
        jpCaja.setLayout(jpCajaLayout);
        jpCajaLayout.setHorizontalGroup(
            jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCajaLayout.createSequentialGroup()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCajaLayout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCajaLayout.createSequentialGroup()
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCajaLayout.createSequentialGroup()
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCajaLayout.createSequentialGroup()
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpCajaLayout.createSequentialGroup()
                                .addComponent(jbtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jspPiezas, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                    .addComponent(jlbTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jpCajaLayout.setVerticalGroup(
            jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCajaLayout.createSequentialGroup()
                .addGroup(jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addGroup(jpCajaLayout.createSequentialGroup()
                        .addGroup(jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jspPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jbtNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        jtbTabla.addTab("Caja", jpCaja);

        jpTabla.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpTablaLayout = new javax.swing.GroupLayout(jpTabla);
        jpTabla.setLayout(jpTablaLayout);
        jpTablaLayout.setHorizontalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        jpTablaLayout.setVerticalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jtbTabla.addTab("Agenda", jpTabla);

        jpMenu.add(jtbTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 900, 500));
        jtbTabla.getAccessibleContext().setAccessibleName("Caja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAgenda;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtCobrar;
    private javax.swing.JButton jbtCuenta;
    private javax.swing.JButton jbtEmpleados;
    private javax.swing.JButton jbtNueva;
    private javax.swing.JButton jbtProductos;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JComboBox<String> jcbBusqueda;
    private javax.swing.JLabel jlbCargo;
    private javax.swing.JLabel jlbEdad;
    private javax.swing.JLabel jlbFecha;
    private javax.swing.JLabel jlbNom;
    private javax.swing.JLabel jlbRelog;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JPanel jpCaja;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JSpinner jspPiezas;
    private javax.swing.JTable jtCanasta;
    private javax.swing.JTabbedPane jtbTabla;
    private javax.swing.JTextField jtfContenido;
    private javax.swing.JTextField jtfCosto;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfProducto;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(AdminMenu.class.getName());
}
