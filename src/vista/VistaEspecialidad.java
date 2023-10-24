package vista;

import controlador.EspecialidadData;
import javax.swing.JOptionPane;
import modelo.Especialidad;

public class VistaEspecialidad extends javax.swing.JFrame {
    
    EspecialidadData especialidad_data = new EspecialidadData();
    
    public VistaEspecialidad() {
        initComponents();
        setResizable(false);
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
        button_principal = new javax.swing.JButton();
        button_verEspecialidades = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_nombreEspecialidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        button_salir = new javax.swing.JButton();
        button_cargarEspecialidad = new javax.swing.JButton();
        button_limpiarEspecialidad = new javax.swing.JButton();
        checkbox_aespecialidadActivo = new javax.swing.JCheckBox();

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
        jLabel4.setText("Especialidades");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

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

        button_verEspecialidades.setBackground(new java.awt.Color(255, 255, 255));
        button_verEspecialidades.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_verEspecialidades.setForeground(new java.awt.Color(51, 51, 51));
        button_verEspecialidades.setText("Ver Especialidades");
        button_verEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_verEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(button_verEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 170, 60));

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 10));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Cargar Especialidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 180, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/female doctor_fococlipping_removed 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 480, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Ellipse 6.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 440, 340));

        text_nombreEspecialidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text_nombreEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombreEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(text_nombreEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 280, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nombre de Especialidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

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

        button_cargarEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        button_cargarEspecialidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_cargarEspecialidad.setForeground(new java.awt.Color(51, 51, 51));
        button_cargarEspecialidad.setText("Cargar");
        button_cargarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cargarEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(button_cargarEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 120, 60));

        button_limpiarEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        button_limpiarEspecialidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_limpiarEspecialidad.setForeground(new java.awt.Color(51, 51, 51));
        button_limpiarEspecialidad.setText("Limpiar");
        button_limpiarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_limpiarEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(button_limpiarEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 120, 60));

        checkbox_aespecialidadActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkbox_aespecialidadActivo.setForeground(new java.awt.Color(102, 102, 102));
        checkbox_aespecialidadActivo.setText("  Activo");
        checkbox_aespecialidadActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_aespecialidadActivoActionPerformed(evt);
            }
        });
        getContentPane().add(checkbox_aespecialidadActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_principalActionPerformed
        VistaPrincipal principal = new VistaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_principalActionPerformed

    private void button_verEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_verEspecialidadesActionPerformed
        VistaVerEspecialidades verEspecialidades = new VistaVerEspecialidades();
        verEspecialidades.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_verEspecialidadesActionPerformed

    private void text_nombreEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombreEspecialidadActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed
        dispose();
    }//GEN-LAST:event_button_salirActionPerformed

    private void button_cargarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cargarEspecialidadActionPerformed
        
        String nombre = null;
        
        if (!especialidad_data.especialidadExiste(text_nombreEspecialidad.getText())) {
            
            if (VerificarInputs.soloLetras(text_nombreEspecialidad.getText())) {
                
                nombre = text_nombreEspecialidad.getText();
                
            }
            
            Especialidad especialidad = new Especialidad(nombre, checkbox_aespecialidadActivo.isSelected());
            especialidad_data.guardarEspecialidad(especialidad);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "¡La especialidad ya existe!");
        }
        

    }//GEN-LAST:event_button_cargarEspecialidadActionPerformed

    private void button_limpiarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_limpiarEspecialidadActionPerformed
        
        text_nombreEspecialidad.setText("");
        checkbox_aespecialidadActivo.setSelected(false);

    }//GEN-LAST:event_button_limpiarEspecialidadActionPerformed

    private void checkbox_aespecialidadActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_aespecialidadActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_aespecialidadActivoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEspecialidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cargarEspecialidad;
    private javax.swing.JButton button_limpiarEspecialidad;
    private javax.swing.JButton button_principal;
    private javax.swing.JButton button_salir;
    private javax.swing.JButton button_verEspecialidades;
    private javax.swing.JCheckBox checkbox_aespecialidadActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField text_nombreEspecialidad;
    // End of variables declaration//GEN-END:variables
}
