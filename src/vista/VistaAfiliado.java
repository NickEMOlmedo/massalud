package vista;

import controlador.AfiliadoData;
import javax.swing.JOptionPane;
import modelo.Afiliado;

public class VistaAfiliado extends javax.swing.JFrame {

    public VistaAfiliado() {
        initComponents();
        setResizable(false);
    }

    AfiliadoData afiliado_data = new AfiliadoData();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button_verAfiliados = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        text_nombreAfiliado = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text_apellidoAfiliado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text_dniAfiliado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        text_domicilioAfiliado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        text_telefonoAfiliado = new javax.swing.JTextField();
        button_limpiarAfiliado = new javax.swing.JButton();
        button_principal = new javax.swing.JButton();
        button_guardarAfiliado = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        button_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        checkbox_afiliadoActivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("MasSalud");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Cargar Nuevo Afiliado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        button_verAfiliados.setBackground(new java.awt.Color(255, 255, 255));
        button_verAfiliados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_verAfiliados.setForeground(new java.awt.Color(51, 51, 51));
        button_verAfiliados.setText("Ver Afiliados");
        button_verAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_verAfiliadosActionPerformed(evt);
            }
        });
        getContentPane().add(button_verAfiliados, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 120, 70));

        jSeparator2.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 230, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/female doctor_fococlipping_removed 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 470, 440));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Afiliados");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 200, 10));

        jSeparator5.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 230, 10));

        text_nombreAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text_nombreAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombreAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(text_nombreAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 280, 30));

        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 230, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Apellido:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        text_apellidoAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_apellidoAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("DNI:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        text_dniAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_dniAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 280, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Domicilio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        text_domicilioAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_domicilioAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 280, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Telefono:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        text_telefonoAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text_telefonoAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_telefonoAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(text_telefonoAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 280, 30));

        button_limpiarAfiliado.setBackground(new java.awt.Color(255, 255, 255));
        button_limpiarAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_limpiarAfiliado.setForeground(new java.awt.Color(51, 51, 51));
        button_limpiarAfiliado.setText("Limpiar");
        button_limpiarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_limpiarAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(button_limpiarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 110, 30));

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

        button_guardarAfiliado.setBackground(new java.awt.Color(255, 255, 255));
        button_guardarAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_guardarAfiliado.setForeground(new java.awt.Color(51, 51, 51));
        button_guardarAfiliado.setText("Guardar");
        button_guardarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardarAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(button_guardarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 110, 30));

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 10));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Ellipse 6.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 440, 340));

        checkbox_afiliadoActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkbox_afiliadoActivo.setForeground(new java.awt.Color(102, 102, 102));
        checkbox_afiliadoActivo.setText("  Activo");
        getContentPane().add(checkbox_afiliadoActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_limpiarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_limpiarAfiliadoActionPerformed
        text_nombreAfiliado.setText("");
        text_apellidoAfiliado.setText("");
        text_dniAfiliado.setText("");
        text_domicilioAfiliado.setText("");
        text_telefonoAfiliado.setText("");
        checkbox_afiliadoActivo.setSelected(false);


    }//GEN-LAST:event_button_limpiarAfiliadoActionPerformed

    private void text_nombreAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreAfiliadoActionPerformed

    }//GEN-LAST:event_text_nombreAfiliadoActionPerformed

    private void button_guardarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardarAfiliadoActionPerformed

        String nombre = null;
        String apellido = null;
        int dni = 0;
        String domicilio = text_domicilioAfiliado.getText();
        long telefono = 0;

        if (!afiliado_data.afiliadoExiste(Integer.parseInt(text_dniAfiliado.getText()))) {

            if (VerificarInputs.soloLetras(text_nombreAfiliado.getText())) {

                nombre = text_nombreAfiliado.getText();
            }

            if (VerificarInputs.soloLetras(text_apellidoAfiliado.getText())) {

                apellido = text_apellidoAfiliado.getText();
            }

            if (VerificarInputs.soloNumeros(text_dniAfiliado.getText())) {

                dni = Integer.valueOf(text_dniAfiliado.getText());
            }

            if (VerificarInputs.soloNumeros(text_telefonoAfiliado.getText())) {

                telefono = Long.parseLong(text_telefonoAfiliado.getText());
            }

            Afiliado afiliado = new Afiliado(nombre, apellido, dni, domicilio, telefono, checkbox_afiliadoActivo.isSelected());

            afiliado_data.guardarAfiliado(afiliado);

        } else {

            JOptionPane.showMessageDialog(null, "¡El afiliado ya existe!");

        }


    }//GEN-LAST:event_button_guardarAfiliadoActionPerformed

    private void button_verAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_verAfiliadosActionPerformed
        VistaVerAfiliados verafiliados = new VistaVerAfiliados();
        verafiliados.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_verAfiliadosActionPerformed

    private void button_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_principalActionPerformed
        VistaPrincipal principal = new VistaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_principalActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed
        dispose();
    }//GEN-LAST:event_button_salirActionPerformed

    private void text_telefonoAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_telefonoAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_telefonoAfiliadoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAfiliado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_guardarAfiliado;
    private javax.swing.JButton button_limpiarAfiliado;
    private javax.swing.JButton button_principal;
    private javax.swing.JButton button_salir;
    private javax.swing.JButton button_verAfiliados;
    private javax.swing.JCheckBox checkbox_afiliadoActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField text_apellidoAfiliado;
    private javax.swing.JTextField text_dniAfiliado;
    private javax.swing.JTextField text_domicilioAfiliado;
    private javax.swing.JTextField text_nombreAfiliado;
    private javax.swing.JTextField text_telefonoAfiliado;
    // End of variables declaration//GEN-END:variables
}
