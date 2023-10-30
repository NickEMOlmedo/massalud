package vista;

import controlador.AfiliadoData;
import controlador.EspecialidadData;
import controlador.OrdenData;
import controlador.PrestadorData;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Afiliado;
import modelo.Especialidad;
import modelo.Orden;
import modelo.Prestador;

public class VistaOrden extends javax.swing.JFrame {

    private AfiliadoData afiliado_data;
    private PrestadorData prestador_data;
    private EspecialidadData especialidad_data;
    
    public VistaOrden() {
        initComponents();
        setResizable(false);
        cargarComboBox();
        cargarComboBox1();
        
        afiliado_data=new AfiliadoData();
        prestador_data=new PrestadorData();
        especialidad_data=new EspecialidadData();
    }
    OrdenData orden_data=new OrdenData();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_verOrdenes = new javax.swing.JButton();
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
        combobox_formaPago = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        date_fechaOrden = new com.toedter.calendar.JDateChooser();
        txt_importeOrden = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_afiliadoOrden = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        button_buscarAfiliado_ordenes = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        button_guardarOrden = new javax.swing.JButton();
        button_limpiarOrden = new javax.swing.JButton();
        jComboBox1_especialidad = new javax.swing.JComboBox<>();
        jComboBox2_prestador = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_verOrdenes.setBackground(new java.awt.Color(255, 255, 255));
        button_verOrdenes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_verOrdenes.setForeground(new java.awt.Color(51, 51, 51));
        button_verOrdenes.setText("Ver Ordenes");
        button_verOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_verOrdenesActionPerformed(evt);
            }
        });
        getContentPane().add(button_verOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 130, 70));

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

        getContentPane().add(combobox_formaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Fecha:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Forma de Pago:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        date_fechaOrden.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_fechaOrdenPropertyChange(evt);
            }
        });
        getContentPane().add(date_fechaOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 280, 30));

        txt_importeOrden.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txt_importeOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 280, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Importe:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txt_afiliadoOrden.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txt_afiliadoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 220, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Afiliado:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        button_buscarAfiliado_ordenes.setText("Buscar");
        button_buscarAfiliado_ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscarAfiliado_ordenesActionPerformed(evt);
            }
        });
        getContentPane().add(button_buscarAfiliado_ordenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Prestador:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        button_guardarOrden.setBackground(new java.awt.Color(255, 255, 255));
        button_guardarOrden.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_guardarOrden.setForeground(new java.awt.Color(51, 51, 51));
        button_guardarOrden.setText("Guardar");
        button_guardarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(button_guardarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 110, 30));

        button_limpiarOrden.setBackground(new java.awt.Color(255, 255, 255));
        button_limpiarOrden.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_limpiarOrden.setForeground(new java.awt.Color(51, 51, 51));
        button_limpiarOrden.setText("Limpiar");
        button_limpiarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_limpiarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(button_limpiarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 110, 30));

        jComboBox1_especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_especialidadActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 290, 30));

        getContentPane().add(jComboBox2_prestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 290, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_principalActionPerformed
        VistaPrincipal principal = new VistaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_principalActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed
        dispose();
    }//GEN-LAST:event_button_salirActionPerformed

    private void button_guardarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardarOrdenActionPerformed
        // TODO add your handling code here:
         
        try {
            LocalDate fecha = date_fechaOrden.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String formaPago = (String) combobox_formaPago.getSelectedItem();
            Double importe = Double.valueOf(txt_importeOrden.getText());
            Afiliado idAfiliado = afiliado_data.buscarAfiliado_id(Integer.valueOf(txt_afiliadoOrden.getText()));
            Prestador idPrestador = prestador_data.buscarPrestador_id(Integer.valueOf(jComboBox2_prestador.getItemAt(jComboBox2_prestador.getSelectedIndex()).getIdPrestador()));

            Orden nuevaOrden = new Orden(fecha, formaPago, importe, idAfiliado, idPrestador);
            orden_data.cargarOrden(nuevaOrden);
        } catch (NumberFormatException nf) { 
            JOptionPane.showMessageDialog(null, "Vrifique los campos");
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "¡No se permiten campos vacios, verifique los datos!");
        }
    }//GEN-LAST:event_button_guardarOrdenActionPerformed

    private void button_limpiarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_limpiarOrdenActionPerformed
        // TODO add your handling code here:
        txt_importeOrden.setText("");
        txt_afiliadoOrden.setText("");
    }//GEN-LAST:event_button_limpiarOrdenActionPerformed

    private void button_verOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_verOrdenesActionPerformed
        VistaVerOrdenes verordenes = new VistaVerOrdenes();
        verordenes.setVisible(true);
        dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_button_verOrdenesActionPerformed

    private void date_fechaOrdenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_fechaOrdenPropertyChange
        // TODO add your handling code here:
        if(date_fechaOrden.getDate()!=null){
        
            LocalDate fechaN=date_fechaOrden.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
    }//GEN-LAST:event_date_fechaOrdenPropertyChange

    private void button_buscarAfiliado_ordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buscarAfiliado_ordenesActionPerformed
        // TODO add your handling code here:
        try{
        Afiliado afiliado_Encontrado=afiliado_data.buscarAfiliado_dni(Integer.valueOf(txt_afiliadoOrden.getText()));
         txt_afiliadoOrden.setText(String.valueOf(afiliado_Encontrado.getIdAfiliado()));
          } catch (NumberFormatException nf) { 
            JOptionPane.showMessageDialog(null, "Vrifique los campos");
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el dni del afiliado para buscar");
        }
    }//GEN-LAST:event_button_buscarAfiliado_ordenesActionPerformed

    private void jComboBox1_especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_especialidadActionPerformed
        // TODO add your handling code here:
        Especialidad seleccionado = (Especialidad) jComboBox1_especialidad.getSelectedItem();
        PrestadorData prestador_data=new PrestadorData();
        ArrayList<Prestador> listaPrestador = prestador_data.listarActivosPorEspecialidad(seleccionado.getIdEspecialidad());
        jComboBox2_prestador.removeAllItems();

        for (Prestador prestador : listaPrestador) {

            jComboBox2_prestador.addItem(prestador);
        }
    }//GEN-LAST:event_jComboBox1_especialidadActionPerformed

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
    private javax.swing.JButton button_buscarAfiliado_ordenes;
    private javax.swing.JButton button_guardarOrden;
    private javax.swing.JButton button_limpiarOrden;
    private javax.swing.JButton button_principal;
    private javax.swing.JButton button_salir;
    private javax.swing.JButton button_verOrdenes;
    private javax.swing.JComboBox<String> combobox_formaPago;
    private com.toedter.calendar.JDateChooser date_fechaOrden;
    private javax.swing.JComboBox<Especialidad> jComboBox1_especialidad;
    private javax.swing.JComboBox<Prestador> jComboBox2_prestador;
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
    private javax.swing.JTextField txt_afiliadoOrden;
    private javax.swing.JTextField txt_importeOrden;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox(){
        combobox_formaPago.addItem("Efectivo");
        combobox_formaPago.addItem("Débito");
    }
    
    private void cargarComboBox1() {
        EspecialidadData especialidad_data = new EspecialidadData();
        ArrayList<Especialidad> listaEspecialidad = especialidad_data.listarActivos();
        jComboBox1_especialidad.removeAllItems();
        for (Especialidad especialidad : listaEspecialidad) {
            jComboBox1_especialidad.addItem(especialidad);
        }

    }
}
