package sistemadeventas;

import Controlador.LoginCon;
import Modelo.Operaciones;
import Vista.AdminMenu;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    private final Operaciones operaciones;
    private final LoginCon controlador;
    private AdminMenu admin;

    public Login(Operaciones operaciones) {
        initComponents();
        this.operaciones = operaciones;
        //
        controlador = new LoginCon(operaciones, this, admin);
        this.jbtInicio.addActionListener(controlador);
        this.jtfUsuario.addKeyListener(controlador);
        this.jpfContraseña.addKeyListener(controlador);
    }

    public String getUsuario() {
        return jtfUsuario.getText();
    }

    public String getPassWord() {
        return String.copyValueOf(jpfContraseña.getPassword());
    }

    public void Empty() {
        jtfUsuario.setText("");
        jpfContraseña.setText("");
    }

    public JPasswordField getJpfContraseña() {
        return jpfContraseña;
    }

    public JTextField getJtfUsuario() {
        return jtfUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jpfContraseña = new javax.swing.JPasswordField();
        jbtInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LoginPng (3).png"))); // NOI18N
        jPanel1.add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 140));

        txt1.setBackground(new java.awt.Color(0, 0, 0));
        txt1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Login");
        txt1.setOpaque(true);
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        txt2.setBackground(new java.awt.Color(255, 255, 255));
        txt2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 0, 0));
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt2.setText("Usuario");
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, 25));

        txt3.setBackground(new java.awt.Color(255, 255, 255));
        txt3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 0));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt3.setText("Contraseña");
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 355, 100, 25));

        jtfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jtfUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfUsuario.setToolTipText("Nombre de usuario");
        jtfUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 200, 25));

        jpfContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jpfContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jpfContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpfContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jpfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 355, 200, 25));

        jbtInicio.setBackground(new java.awt.Color(204, 204, 204));
        jbtInicio.setForeground(new java.awt.Color(0, 0, 0));
        jbtInicio.setText("Inicio");
        jbtInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jbtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 300, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtInicio;
    private javax.swing.JPasswordField jpfContraseña;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables
}
