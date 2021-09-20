package Vista;

import Controlador.BDProductosCon;
import java.util.logging.Logger;

public class BDProductos extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    private final BDProductosCon controlador;

    public BDProductos() {
        initComponents();
        controlador = new BDProductosCon(this);
        jbtAgregar.addActionListener(controlador);
    }

    public String[] info() {
        String[] info = new String[7];
        info[0] = jtfID.getText();
        info[1] = jtfNombre.getText();
        info[2] = (String) jcbMarca.getSelectedItem();
        info[3] = jtfCon.getText();
        info[4] = (String) jcbUM.getSelectedItem();
        info[5] = jtfPrecio.getText();
        info[6] = (String) jcbMonedA.getSelectedItem();
        return info;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbTabla = new javax.swing.JTabbedPane();
        jpAltas = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        jbtAgregar = new javax.swing.JButton();
        jtfID = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCon = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox<>();
        jcbUM = new javax.swing.JComboBox<>();
        jcbMonedA = new javax.swing.JComboBox<>();
        jpBajas = new javax.swing.JPanel();
        txt22 = new javax.swing.JLabel();
        txt23 = new javax.swing.JLabel();
        txt24 = new javax.swing.JLabel();
        txt25 = new javax.swing.JLabel();
        txt26 = new javax.swing.JLabel();
        jbtAgregar3 = new javax.swing.JButton();
        jtfNombre13 = new javax.swing.JTextField();
        jtfNombre14 = new javax.swing.JTextField();
        jtfNombre15 = new javax.swing.JTextField();
        jtfNombre16 = new javax.swing.JTextField();
        txt27 = new javax.swing.JLabel();
        txt28 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jpConsultas = new javax.swing.JPanel();
        txt15 = new javax.swing.JLabel();
        txt16 = new javax.swing.JLabel();
        txt17 = new javax.swing.JLabel();
        txt18 = new javax.swing.JLabel();
        txt19 = new javax.swing.JLabel();
        jbtAgregar2 = new javax.swing.JButton();
        jtfNombre9 = new javax.swing.JTextField();
        jtfNombre10 = new javax.swing.JTextField();
        jtfNombre11 = new javax.swing.JTextField();
        jtfNombre12 = new javax.swing.JTextField();
        txt20 = new javax.swing.JLabel();
        txt21 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jpModificaciones = new javax.swing.JPanel();
        txt8 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();
        txt10 = new javax.swing.JLabel();
        txt11 = new javax.swing.JLabel();
        txt12 = new javax.swing.JLabel();
        jbtAgregar1 = new javax.swing.JButton();
        jtfNombre5 = new javax.swing.JTextField();
        jtfNombre6 = new javax.swing.JTextField();
        jtfNombre7 = new javax.swing.JTextField();
        jtfNombre8 = new javax.swing.JTextField();
        txt13 = new javax.swing.JLabel();
        txt14 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbTabla.setBackground(new java.awt.Color(255, 255, 255));
        jtbTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbTabla.setForeground(new java.awt.Color(0, 0, 0));
        jtbTabla.setName("Caja"); // NOI18N

        jpAltas.setBackground(new java.awt.Color(204, 204, 204));
        jpAltas.setToolTipText("Cobro");

        txt1.setBackground(new java.awt.Color(0, 0, 0));
        txt1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt1.setText("ID");

        txt2.setBackground(new java.awt.Color(0, 0, 0));
        txt2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 0, 0));
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt2.setText("Nombre");

        txt3.setBackground(new java.awt.Color(0, 0, 0));
        txt3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 0));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt3.setText("Marca");

        txt4.setBackground(new java.awt.Color(0, 0, 0));
        txt4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 0));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt4.setText("UM");

        txt5.setBackground(new java.awt.Color(0, 0, 0));
        txt5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt5.setForeground(new java.awt.Color(0, 0, 0));
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt5.setText("Contenido");

        jbtAgregar.setBackground(new java.awt.Color(153, 153, 153));
        jbtAgregar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jbtAgregar.setText("Agregar");
        jbtAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jtfID.setBackground(new java.awt.Color(255, 255, 255));
        jtfID.setForeground(new java.awt.Color(0, 0, 0));
        jtfID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfID.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfID.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfCon.setBackground(new java.awt.Color(255, 255, 255));
        jtfCon.setForeground(new java.awt.Color(0, 0, 0));
        jtfCon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfCon.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfCon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfCon.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jtfPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jtfPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfPrecio.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txt6.setBackground(new java.awt.Color(0, 0, 0));
        txt6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt6.setForeground(new java.awt.Color(0, 0, 0));
        txt6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt6.setText("Precio");

        txt7.setBackground(new java.awt.Color(0, 0, 0));
        txt7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt7.setForeground(new java.awt.Color(0, 0, 0));
        txt7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt7.setText("Moneda");

        jcbMarca.setBackground(new java.awt.Color(255, 255, 255));
        jcbMarca.setForeground(new java.awt.Color(0, 0, 0));
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Selecione una Marca ---", "Sabritas", "Coca Cola", "Pepsi", "Gamesa", "Lara" }));
        jcbMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jcbUM.setBackground(new java.awt.Color(255, 255, 255));
        jcbUM.setForeground(new java.awt.Color(0, 0, 0));
        jcbUM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Selecione una UM ---", "ML", "L", "Gr", "K" }));
        jcbUM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jcbMonedA.setBackground(new java.awt.Color(255, 255, 255));
        jcbMonedA.setForeground(new java.awt.Color(0, 0, 0));
        jcbMonedA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso MX", "Dolar US", " " }));
        jcbMonedA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpAltasLayout = new javax.swing.GroupLayout(jpAltas);
        jpAltas.setLayout(jpAltasLayout);
        jpAltasLayout.setHorizontalGroup(
            jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltasLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltasLayout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltasLayout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltasLayout.createSequentialGroup()
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltasLayout.createSequentialGroup()
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbUM, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltasLayout.createSequentialGroup()
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltasLayout.createSequentialGroup()
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltasLayout.createSequentialGroup()
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbMonedA, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jpAltasLayout.setVerticalGroup(
            jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbUM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMonedA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jbtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jtbTabla.addTab("Altas", jpAltas);

        jpBajas.setBackground(new java.awt.Color(255, 255, 255));

        txt22.setBackground(new java.awt.Color(0, 0, 0));
        txt22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt22.setForeground(new java.awt.Color(0, 0, 0));
        txt22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt22.setText("ID");

        txt23.setBackground(new java.awt.Color(0, 0, 0));
        txt23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt23.setForeground(new java.awt.Color(0, 0, 0));
        txt23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt23.setText("Nombre");

        txt24.setBackground(new java.awt.Color(0, 0, 0));
        txt24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt24.setForeground(new java.awt.Color(0, 0, 0));
        txt24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt24.setText("Marca");

        txt25.setBackground(new java.awt.Color(0, 0, 0));
        txt25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt25.setForeground(new java.awt.Color(0, 0, 0));
        txt25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt25.setText("UM");

        txt26.setBackground(new java.awt.Color(0, 0, 0));
        txt26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt26.setForeground(new java.awt.Color(0, 0, 0));
        txt26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt26.setText("Contenido");

        jbtAgregar3.setBackground(new java.awt.Color(153, 153, 153));
        jbtAgregar3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtAgregar3.setForeground(new java.awt.Color(0, 0, 0));
        jbtAgregar3.setText("Agregar");
        jbtAgregar3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jtfNombre13.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre13.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre13.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre13.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre14.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre14.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre14.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre14.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre15.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre15.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre15.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre15.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre16.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre16.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre16.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre16.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txt27.setBackground(new java.awt.Color(0, 0, 0));
        txt27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt27.setForeground(new java.awt.Color(0, 0, 0));
        txt27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt27.setText("Precio");

        txt28.setBackground(new java.awt.Color(0, 0, 0));
        txt28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt28.setForeground(new java.awt.Color(0, 0, 0));
        txt28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt28.setText("Moneda");

        jComboBox10.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox10.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Selecione una Marca ---", "Sabritas", "Coca Cola", "Pepsi", "Gamesa", "Lara" }));
        jComboBox10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox11.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox11.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Selecione una UM ---", "ML", "L", "Gr", "K" }));
        jComboBox11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox12.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox12.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso MX", "Dolar US", " " }));
        jComboBox12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpBajasLayout = new javax.swing.GroupLayout(jpBajas);
        jpBajas.setLayout(jpBajasLayout);
        jpBajasLayout.setHorizontalGroup(
            jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajasLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBajasLayout.createSequentialGroup()
                        .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre13, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBajasLayout.createSequentialGroup()
                        .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre14, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBajasLayout.createSequentialGroup()
                        .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBajasLayout.createSequentialGroup()
                        .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBajasLayout.createSequentialGroup()
                        .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBajasLayout.createSequentialGroup()
                        .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBajasLayout.createSequentialGroup()
                        .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtAgregar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jpBajasLayout.setVerticalGroup(
            jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jbtAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jtbTabla.addTab("Bajas", jpBajas);

        jpConsultas.setBackground(new java.awt.Color(255, 255, 255));

        txt15.setBackground(new java.awt.Color(0, 0, 0));
        txt15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt15.setForeground(new java.awt.Color(0, 0, 0));
        txt15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt15.setText("ID");

        txt16.setBackground(new java.awt.Color(0, 0, 0));
        txt16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt16.setForeground(new java.awt.Color(0, 0, 0));
        txt16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt16.setText("Nombre");

        txt17.setBackground(new java.awt.Color(0, 0, 0));
        txt17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt17.setForeground(new java.awt.Color(0, 0, 0));
        txt17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt17.setText("Marca");

        txt18.setBackground(new java.awt.Color(0, 0, 0));
        txt18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt18.setForeground(new java.awt.Color(0, 0, 0));
        txt18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt18.setText("UM");

        txt19.setBackground(new java.awt.Color(0, 0, 0));
        txt19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt19.setForeground(new java.awt.Color(0, 0, 0));
        txt19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt19.setText("Contenido");

        jbtAgregar2.setBackground(new java.awt.Color(153, 153, 153));
        jbtAgregar2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtAgregar2.setForeground(new java.awt.Color(0, 0, 0));
        jbtAgregar2.setText("Agregar");
        jbtAgregar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jtfNombre9.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre9.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre9.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre9.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre10.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre10.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre10.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre10.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre11.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre11.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre11.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre11.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre12.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre12.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre12.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre12.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txt20.setBackground(new java.awt.Color(0, 0, 0));
        txt20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt20.setForeground(new java.awt.Color(0, 0, 0));
        txt20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt20.setText("Precio");

        txt21.setBackground(new java.awt.Color(0, 0, 0));
        txt21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt21.setForeground(new java.awt.Color(0, 0, 0));
        txt21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt21.setText("Moneda");

        jComboBox7.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox7.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Selecione una Marca ---", "Sabritas", "Coca Cola", "Pepsi", "Gamesa", "Lara" }));
        jComboBox7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox8.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox8.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Selecione una UM ---", "ML", "L", "Gr", "K" }));
        jComboBox8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox9.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox9.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso MX", "Dolar US", " " }));
        jComboBox9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpConsultasLayout = new javax.swing.GroupLayout(jpConsultas);
        jpConsultas.setLayout(jpConsultasLayout);
        jpConsultasLayout.setHorizontalGroup(
            jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultasLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultasLayout.createSequentialGroup()
                        .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultasLayout.createSequentialGroup()
                        .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultasLayout.createSequentialGroup()
                        .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultasLayout.createSequentialGroup()
                        .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultasLayout.createSequentialGroup()
                        .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultasLayout.createSequentialGroup()
                        .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultasLayout.createSequentialGroup()
                        .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtAgregar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jpConsultasLayout.setVerticalGroup(
            jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jbtAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jtbTabla.addTab("Consultas", jpConsultas);

        txt8.setBackground(new java.awt.Color(0, 0, 0));
        txt8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt8.setForeground(new java.awt.Color(0, 0, 0));
        txt8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt8.setText("ID");

        txt9.setBackground(new java.awt.Color(0, 0, 0));
        txt9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt9.setForeground(new java.awt.Color(0, 0, 0));
        txt9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt9.setText("Nombre");

        txt10.setBackground(new java.awt.Color(0, 0, 0));
        txt10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt10.setForeground(new java.awt.Color(0, 0, 0));
        txt10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt10.setText("Marca");

        txt11.setBackground(new java.awt.Color(0, 0, 0));
        txt11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt11.setForeground(new java.awt.Color(0, 0, 0));
        txt11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt11.setText("UM");

        txt12.setBackground(new java.awt.Color(0, 0, 0));
        txt12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt12.setForeground(new java.awt.Color(0, 0, 0));
        txt12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt12.setText("Contenido");

        jbtAgregar1.setBackground(new java.awt.Color(153, 153, 153));
        jbtAgregar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtAgregar1.setForeground(new java.awt.Color(0, 0, 0));
        jbtAgregar1.setText("Agregar");
        jbtAgregar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jtfNombre5.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre5.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre5.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre5.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre6.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre6.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre6.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre6.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre7.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre7.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre7.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre7.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jtfNombre8.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre8.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfNombre8.setCaretColor(new java.awt.Color(0, 0, 0));
        jtfNombre8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfNombre8.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txt13.setBackground(new java.awt.Color(0, 0, 0));
        txt13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt13.setForeground(new java.awt.Color(0, 0, 0));
        txt13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt13.setText("Precio");

        txt14.setBackground(new java.awt.Color(0, 0, 0));
        txt14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt14.setForeground(new java.awt.Color(0, 0, 0));
        txt14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt14.setText("Moneda");

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Selecione una Marca ---", "Sabritas", "Coca Cola", "Pepsi", "Gamesa", "Lara" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox5.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox5.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Selecione una UM ---", "ML", "L", "Gr", "K" }));
        jComboBox5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox6.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox6.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso MX", "Dolar US", " " }));
        jComboBox6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpModificacionesLayout = new javax.swing.GroupLayout(jpModificaciones);
        jpModificaciones.setLayout(jpModificacionesLayout);
        jpModificacionesLayout.setHorizontalGroup(
            jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificacionesLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jpModificacionesLayout.setVerticalGroup(
            jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jbtAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jtbTabla.addTab("Modificaciones", jpModificaciones);

        add(jtbTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtAgregar1;
    private javax.swing.JButton jbtAgregar2;
    private javax.swing.JButton jbtAgregar3;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JComboBox<String> jcbMonedA;
    private javax.swing.JComboBox<String> jcbUM;
    private javax.swing.JPanel jpAltas;
    private javax.swing.JPanel jpBajas;
    private javax.swing.JPanel jpConsultas;
    private javax.swing.JPanel jpModificaciones;
    private javax.swing.JTabbedPane jtbTabla;
    private javax.swing.JTextField jtfCon;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombre10;
    private javax.swing.JTextField jtfNombre11;
    private javax.swing.JTextField jtfNombre12;
    private javax.swing.JTextField jtfNombre13;
    private javax.swing.JTextField jtfNombre14;
    private javax.swing.JTextField jtfNombre15;
    private javax.swing.JTextField jtfNombre16;
    private javax.swing.JTextField jtfNombre5;
    private javax.swing.JTextField jtfNombre6;
    private javax.swing.JTextField jtfNombre7;
    private javax.swing.JTextField jtfNombre8;
    private javax.swing.JTextField jtfNombre9;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt10;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt12;
    private javax.swing.JLabel txt13;
    private javax.swing.JLabel txt14;
    private javax.swing.JLabel txt15;
    private javax.swing.JLabel txt16;
    private javax.swing.JLabel txt17;
    private javax.swing.JLabel txt18;
    private javax.swing.JLabel txt19;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt20;
    private javax.swing.JLabel txt21;
    private javax.swing.JLabel txt22;
    private javax.swing.JLabel txt23;
    private javax.swing.JLabel txt24;
    private javax.swing.JLabel txt25;
    private javax.swing.JLabel txt26;
    private javax.swing.JLabel txt27;
    private javax.swing.JLabel txt28;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JLabel txt9;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(BDProductos.class.getName());
}
