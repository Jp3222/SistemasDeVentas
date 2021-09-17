package Vista;

import Controlador.ProductosCon;

public class Productos extends javax.swing.JFrame {

    private ProductosCon controlador;
    //
    private BDProductos bd;

    public Productos() {
        this.initComponents();
        this.init();
        this.adds();
        jbtProductos.addActionListener(controlador);
        
    }

    public void init() {
        controlador = new ProductosCon();
        //
        bd = new BDProductos();
        bd.setSize(900, 600);
        bd.setLocation(300, 0);
        bd.setVisible(false);
        //
        controlador.setVistas(bd);
    }

    public void adds() {
        this.add(bd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtProductos = new javax.swing.JButton();
        jbtInventario = new javax.swing.JButton();
        jbtEmpleados = new javax.swing.JButton();
        jbtAgenda = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LoginPng (3).png"))); // NOI18N
        jLabel1.setToolTipText("Foto de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 200));

        jbtProductos.setBackground(new java.awt.Color(153, 0, 255));
        jbtProductos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtProductos.setForeground(new java.awt.Color(0, 0, 0));
        jbtProductos.setText("Productos");
        jbtProductos.setToolTipText("info de cuenta");
        jbtProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jbtProductos.setFocusPainted(false);
        jPanel1.add(jbtProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 50));

        jbtInventario.setBackground(new java.awt.Color(153, 0, 255));
        jbtInventario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtInventario.setForeground(new java.awt.Color(0, 0, 0));
        jbtInventario.setText("Inventario");
        jbtInventario.setToolTipText("info de cuenta");
        jbtInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jbtInventario.setFocusPainted(false);
        jPanel1.add(jbtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, 50));

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
        jbtAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgendaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 50));

        jbtSalir.setBackground(new java.awt.Color(255, 0, 0));
        jbtSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbtSalir.setText("Salir");
        jbtSalir.setToolTipText("info de cuenta");
        jbtSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtSalir.setFocusPainted(false);
        jPanel1.add(jbtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 300, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(900, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgendaActionPerformed

    }//GEN-LAST:event_jbtAgendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtAgenda;
    private javax.swing.JButton jbtEmpleados;
    private javax.swing.JButton jbtInventario;
    private javax.swing.JButton jbtProductos;
    private javax.swing.JButton jbtSalir;
    // End of variables declaration//GEN-END:variables
}
