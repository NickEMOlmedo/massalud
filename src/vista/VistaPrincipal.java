package vista;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button_vistaAfiliados = new javax.swing.JButton();
        button_vistaPrestadores = new javax.swing.JButton();
        button_vistaOrdenes = new javax.swing.JButton();
        button_vistaEspecialidades = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        button_salir = new javax.swing.JButton();
        button_inicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 230, 10));

        jSeparator2.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 230, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Principal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("MasSalud");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        button_vistaAfiliados.setBackground(new java.awt.Color(255, 255, 255));
        button_vistaAfiliados.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button_vistaAfiliados.setForeground(new java.awt.Color(51, 51, 51));
        button_vistaAfiliados.setText("AFILIADOS");
        button_vistaAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_vistaAfiliadosActionPerformed(evt);
            }
        });
        getContentPane().add(button_vistaAfiliados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 280, 70));

        button_vistaPrestadores.setBackground(new java.awt.Color(255, 255, 255));
        button_vistaPrestadores.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button_vistaPrestadores.setForeground(new java.awt.Color(51, 51, 51));
        button_vistaPrestadores.setText("PRESTADORES");
        button_vistaPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_vistaPrestadoresActionPerformed(evt);
            }
        });
        getContentPane().add(button_vistaPrestadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 280, 70));

        button_vistaOrdenes.setBackground(new java.awt.Color(255, 255, 255));
        button_vistaOrdenes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button_vistaOrdenes.setForeground(new java.awt.Color(51, 51, 51));
        button_vistaOrdenes.setText("ORDENES");
        button_vistaOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_vistaOrdenesActionPerformed(evt);
            }
        });
        getContentPane().add(button_vistaOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 280, 70));

        button_vistaEspecialidades.setBackground(new java.awt.Color(255, 255, 255));
        button_vistaEspecialidades.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button_vistaEspecialidades.setForeground(new java.awt.Color(51, 51, 51));
        button_vistaEspecialidades.setText("ESPECIALIDADES");
        button_vistaEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_vistaEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(button_vistaEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 280, 70));

        jSeparator9.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 800, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/female-doctor_fococlipping_removed 1.png"))); // NOI18N
        jLabel1.setAutoscrolls(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 390, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Ellipse 6.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 440, 340));

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 800, 10));

        button_salir.setBackground(new java.awt.Color(255, 255, 255));
        button_salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_salir.setForeground(new java.awt.Color(51, 51, 51));
        button_salir.setText("Salir");
        button_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_salirActionPerformed(evt);
            }
        });
        getContentPane().add(button_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 90, 60));

        button_inicio.setBackground(new java.awt.Color(255, 255, 255));
        button_inicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_inicio.setForeground(new java.awt.Color(51, 51, 51));
        button_inicio.setText("Inicio / Logout");
        button_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_inicioActionPerformed(evt);
            }
        });
        getContentPane().add(button_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_vistaAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_vistaAfiliadosActionPerformed
        VistaAfiliado afiliado = new VistaAfiliado();
        afiliado.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_vistaAfiliadosActionPerformed

    private void button_vistaPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_vistaPrestadoresActionPerformed
        VistaPrestador prestador = new VistaPrestador();
        prestador.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_vistaPrestadoresActionPerformed

    private void button_vistaOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_vistaOrdenesActionPerformed
        VistaOrden orden = new VistaOrden();
        orden.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_vistaOrdenesActionPerformed

    private void button_vistaEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_vistaEspecialidadesActionPerformed
        VistaEspecialidad especialidad = new VistaEspecialidad();
        especialidad.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_vistaEspecialidadesActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed
        dispose();
    }//GEN-LAST:event_button_salirActionPerformed

    private void button_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_inicioActionPerformed
        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_inicioActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_inicio;
    private javax.swing.JButton button_salir;
    private javax.swing.JButton button_vistaAfiliados;
    private javax.swing.JButton button_vistaEspecialidades;
    private javax.swing.JButton button_vistaOrdenes;
    private javax.swing.JButton button_vistaPrestadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
