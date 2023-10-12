package vista;

public class VistaPrestador extends javax.swing.JFrame {

    public VistaPrestador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        button_verPrestadores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        text_apellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text_dni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        text_domicilio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        text_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        button_salir = new javax.swing.JButton();
        button_principal = new javax.swing.JButton();
        button_limpiar = new javax.swing.JButton();
        button_guardar = new javax.swing.JButton();
        combobox_especialidad = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("MasSalud");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 230, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Prestadores");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 230, 10));

        button_verPrestadores.setBackground(new java.awt.Color(255, 255, 255));
        button_verPrestadores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_verPrestadores.setForeground(new java.awt.Color(51, 51, 51));
        button_verPrestadores.setText("Ver Prestadores");
        button_verPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_verPrestadoresActionPerformed(evt);
            }
        });
        getContentPane().add(button_verPrestadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 130, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/female doctor_fococlipping_removed 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 480, 440));

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Ellipse 6.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 440, 340));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        text_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(text_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 280, 30));

        text_apellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("DNI:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        text_dni.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 280, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Domicilio de Atencion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        text_domicilio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 280, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Especialidad:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        text_telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 280, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Apellido:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Cargar Nuevo Prestador:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 200, 10));

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

        button_principal.setBackground(new java.awt.Color(255, 255, 255));
        button_principal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_principal.setForeground(new java.awt.Color(51, 51, 51));
        button_principal.setText("Principal");
        button_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_principalActionPerformed(evt);
            }
        });
        getContentPane().add(button_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 60));

        button_limpiar.setBackground(new java.awt.Color(255, 255, 255));
        button_limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_limpiar.setForeground(new java.awt.Color(51, 51, 51));
        button_limpiar.setText("Limpiar");
        button_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(button_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 110, 30));

        button_guardar.setBackground(new java.awt.Color(255, 255, 255));
        button_guardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_guardar.setForeground(new java.awt.Color(51, 51, 51));
        button_guardar.setText("Guardar");
        button_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(button_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 110, 30));

        combobox_especialidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combobox_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 280, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Telefono:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_verPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_verPrestadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_verPrestadoresActionPerformed

    private void text_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombreActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed

        dispose();

    }//GEN-LAST:event_button_salirActionPerformed

    private void button_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_principalActionPerformed

        VistaPrincipal ppal = new VistaPrincipal();
        ppal.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_principalActionPerformed

    private void button_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_limpiarActionPerformed

    private void button_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrestador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrestador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrestador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrestador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrestador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_guardar;
    private javax.swing.JButton button_limpiar;
    private javax.swing.JButton button_principal;
    private javax.swing.JButton button_salir;
    private javax.swing.JButton button_verPrestadores;
    private javax.swing.JComboBox combobox_especialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField text_apellido;
    private javax.swing.JTextField text_dni;
    private javax.swing.JTextField text_domicilio;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JTextField text_telefono;
    // End of variables declaration//GEN-END:variables
}
