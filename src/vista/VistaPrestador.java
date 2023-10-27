package vista;

import controlador.PrestadorData;
import javax.swing.JOptionPane;
import modelo.Prestador;
import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;
import controlador.EspecialidadData;
import modelo.Especialidad;

public class VistaPrestador extends javax.swing.JFrame {

    private final DefaultComboBoxModel modeloComboPrestador;
    EspecialidadData especialidad_data = new EspecialidadData();

    public VistaPrestador() {
        initComponents();
        setResizable(false);
        modeloComboPrestador = new DefaultComboBoxModel<>(); // Crea el modelo de ComboBox

        combobox_especialidadPrestador.setModel(modeloComboPrestador); // Asigna el modelo al JComboBox
        cargarCombo(); // Llena el modelo con datos
    }

    PrestadorData prestador_data = new PrestadorData();

    public void cargarCombo() {
        //lista las especialidades activas
        ArrayList<Especialidad> listarActivos = especialidad_data.listarActivos();

        // Limpia el modelo actual si es necesario
        modeloComboPrestador.removeAllElements();

        // Agrega los objetos Especialidad al modelo del ComboBox
        for (Especialidad especialidad : listarActivos) {

            modeloComboPrestador.addElement(especialidad);
        }
    }

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
        text_nombrePrestador = new javax.swing.JTextField();
        text_apellidoPrestador = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text_dniPrestador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        text_domicilioPrestador = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        text_telefonoPrestador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        button_salir = new javax.swing.JButton();
        button_principal = new javax.swing.JButton();
        button_limpiarPrestador = new javax.swing.JButton();
        button_guardarPrestador = new javax.swing.JButton();
        combobox_especialidadPrestador = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        checkbox_prestadorActivo = new javax.swing.JCheckBox();

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
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        text_nombrePrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text_nombrePrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombrePrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(text_nombrePrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 280, 30));

        text_apellidoPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_apellidoPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 280, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("DNI:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        text_dniPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_dniPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 280, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Domicilio de Atencion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        text_domicilioPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_domicilioPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 280, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Especialidad:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        text_telefonoPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(text_telefonoPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 280, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Apellido:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Cargar Nuevo Prestador:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

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

        button_limpiarPrestador.setBackground(new java.awt.Color(255, 255, 255));
        button_limpiarPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_limpiarPrestador.setForeground(new java.awt.Color(51, 51, 51));
        button_limpiarPrestador.setText("Limpiar");
        button_limpiarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_limpiarPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(button_limpiarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 110, 30));

        button_guardarPrestador.setBackground(new java.awt.Color(255, 255, 255));
        button_guardarPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_guardarPrestador.setForeground(new java.awt.Color(51, 51, 51));
        button_guardarPrestador.setText("Guardar");
        button_guardarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardarPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(button_guardarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 110, 30));

        combobox_especialidadPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_especialidadPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(combobox_especialidadPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 280, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Telefono:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        checkbox_prestadorActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkbox_prestadorActivo.setForeground(new java.awt.Color(102, 102, 102));
        checkbox_prestadorActivo.setText("  Activo");
        checkbox_prestadorActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_prestadorActivoActionPerformed(evt);
            }
        });
        getContentPane().add(checkbox_prestadorActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_verPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_verPrestadoresActionPerformed
        VistaVerPrestadores verprestadores = new VistaVerPrestadores();
        verprestadores.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_verPrestadoresActionPerformed

    private void text_nombrePrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombrePrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombrePrestadorActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed
        dispose();
    }//GEN-LAST:event_button_salirActionPerformed

    private void button_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_principalActionPerformed
        VistaPrincipal principal = new VistaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_principalActionPerformed

    private void button_limpiarPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_limpiarPrestadorActionPerformed
        text_nombrePrestador.setText("");
        text_apellidoPrestador.setText("");
        text_dniPrestador.setText("");
        text_domicilioPrestador.setText("");
        text_telefonoPrestador.setText("");

        checkbox_prestadorActivo.setSelected(false);

    }//GEN-LAST:event_button_limpiarPrestadorActionPerformed

    private void button_guardarPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardarPrestadorActionPerformed

        String nombre = null;
        String apellido = null;
        int dni = 0;
        String domicilio = null;
        long telefono = 0;

        Especialidad seleccionado = (Especialidad) combobox_especialidadPrestador.getSelectedItem();

        if (!text_nombrePrestador.getText().isEmpty() && !text_apellidoPrestador.getText().isEmpty() && !text_dniPrestador.getText().isEmpty() && !text_domicilioPrestador.getText().isEmpty() && !text_telefonoPrestador.getText().isEmpty()) {

            try {

                if (!prestador_data.prestadorExiste(Integer.parseInt(text_dniPrestador.getText()))) {

                    if (VerificarInputs.soloLetras(text_nombrePrestador.getText())) {

                        nombre = text_nombrePrestador.getText();

                    } else {

                        JOptionPane.showMessageDialog(this, "¡Solo se permiten letras en el campo NOMBRE, verifique los datos!");

                    }

                    if (VerificarInputs.soloLetras(text_apellidoPrestador.getText())) {

                        apellido = text_apellidoPrestador.getText();

                    } else {

                        JOptionPane.showMessageDialog(this, "¡Solo se permiten letras en el campo APELLIDO, verifique los datos!");

                    }

                    if (VerificarInputs.soloNumeros(text_dniPrestador.getText())) {

                        dni = Integer.valueOf(text_dniPrestador.getText());

                    } else {

                        JOptionPane.showMessageDialog(this, "¡Solo se permiten numeros en el campo DNI , verifique los datos!");

                    }

                    domicilio = text_domicilioPrestador.getText();

                    if (VerificarInputs.soloNumeros(text_telefonoPrestador.getText())) {

                        telefono = Long.parseLong(text_telefonoPrestador.getText());

                    } else {

                        JOptionPane.showMessageDialog(this, "¡Solo se permiten numeros en el campo TELEFONO , verifique los datos!");

                    }

                    Prestador prestador = new Prestador(nombre, apellido, dni, domicilio, telefono, checkbox_prestadorActivo.isSelected(), seleccionado);

                    prestador_data.guardarPrestador(prestador);

                } else {

                    JOptionPane.showMessageDialog(null, "¡El prestador ya existe!");

                }

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(this, "¡Solo se permiten numeros, verifique los datos!");

            }

        }


    }//GEN-LAST:event_button_guardarPrestadorActionPerformed

    private void checkbox_prestadorActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_prestadorActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_prestadorActivoActionPerformed

    private void combobox_especialidadPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_especialidadPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_especialidadPrestadorActionPerformed

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
    private javax.swing.JButton button_guardarPrestador;
    private javax.swing.JButton button_limpiarPrestador;
    private javax.swing.JButton button_principal;
    private javax.swing.JButton button_salir;
    private javax.swing.JButton button_verPrestadores;
    private javax.swing.JCheckBox checkbox_prestadorActivo;
    private javax.swing.JComboBox combobox_especialidadPrestador;
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
    private javax.swing.JTextField text_apellidoPrestador;
    private javax.swing.JTextField text_dniPrestador;
    private javax.swing.JTextField text_domicilioPrestador;
    private javax.swing.JTextField text_nombrePrestador;
    private javax.swing.JTextField text_telefonoPrestador;
    // End of variables declaration//GEN-END:variables
}
