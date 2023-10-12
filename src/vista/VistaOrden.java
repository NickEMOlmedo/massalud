/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

/**
 *
 * @author Nickolas
 */
public class VistaOrden extends javax.swing.JFrame {

    /**
     * Creates new form VistaOrden
     */
    public VistaOrden() {
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

        button_verPrestadores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        button_principal = new javax.swing.JButton();
        button_salir = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        combobox_formaPago = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        date_fechaOrden = new com.toedter.calendar.JDateChooser();
        txt_importeOrden = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_importeOrden2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_importeOrden3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        button_guardar = new javax.swing.JButton();
        button_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_verPrestadores.setBackground(new java.awt.Color(255, 255, 255));
        button_verPrestadores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_verPrestadores.setForeground(new java.awt.Color(51, 51, 51));
        button_verPrestadores.setText("Ver Ordenes");
        button_verPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_verPrestadoresActionPerformed(evt);
            }
        });
        getContentPane().add(button_verPrestadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 130, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/female doctor_fococlipping_removed 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 470, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Ellipse 6.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 440, 340));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("MasSalud");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 230, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Ordenes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 230, 10));

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

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 10));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Cargar Nueva Orden:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 200, 10));

        combobox_formaPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combobox_formaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Fecha:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Forma de Pago:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        getContentPane().add(date_fechaOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 280, 30));

        txt_importeOrden.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txt_importeOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 280, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Importe:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txt_importeOrden2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txt_importeOrden2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 220, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Afiliado:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jButton1.setText("Buscar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, 30));

        txt_importeOrden3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txt_importeOrden3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 220, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Prestador:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jButton2.setText("Buscar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, 30));

        button_guardar.setBackground(new java.awt.Color(255, 255, 255));
        button_guardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_guardar.setForeground(new java.awt.Color(51, 51, 51));
        button_guardar.setText("Guardar");
        button_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(button_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 110, 30));

        button_limpiar.setBackground(new java.awt.Color(255, 255, 255));
        button_limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_limpiar.setForeground(new java.awt.Color(51, 51, 51));
        button_limpiar.setText("Limpiar");
        button_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(button_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_principalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_principalActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_salirActionPerformed

    private void button_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_guardarActionPerformed

    private void button_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_limpiarActionPerformed

    private void button_verPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_verPrestadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_verPrestadoresActionPerformed

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
            java.util.logging.Logger.getLogger(VistaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_guardar;
    private javax.swing.JButton button_limpiar;
    private javax.swing.JButton button_principal;
    private javax.swing.JButton button_salir;
    private javax.swing.JButton button_verPrestadores;
    private javax.swing.JComboBox combobox_formaPago;
    private com.toedter.calendar.JDateChooser date_fechaOrden;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txt_importeOrden;
    private javax.swing.JTextField txt_importeOrden2;
    private javax.swing.JTextField txt_importeOrden3;
    // End of variables declaration//GEN-END:variables
}
