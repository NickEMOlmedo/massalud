package vista;

import controlador.PrestadorData;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Prestador;

public class VistaVerPrestadores extends javax.swing.JFrame {

    PrestadorData prestador_data = new PrestadorData();
    private final DefaultTableModel modelo;

    public VistaVerPrestadores() {
        initComponents();
        setResizable(false);
        ButtonGroup grupoDeBotones = new ButtonGroup();
        grupoDeBotones.add(radio_mostrarActivos);
        grupoDeBotones.add(radio_mostrarInactivos);
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {

                return column != 0;

            }
        };
        armarCabecera();
    }

    private void armarCabecera() {

        ArrayList<Object> cabecera = new ArrayList<>();
        cabecera.add("ID");
        cabecera.add("Nombre");
        cabecera.add("Apellido");
        cabecera.add("DNI");
        cabecera.add("Domicilio");
        cabecera.add("Telefono");
        cabecera.add("Especialidad");
        for (Object lector : cabecera) {

            modelo.addColumn(lector);

        }

        table_prestadores.setModel(modelo);
    }

    private void borrarFilas() {

        int rowCount = modelo.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {

            modelo.removeRow(i);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        button_atras = new javax.swing.JButton();
        button_salir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_prestadores = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        radio_mostrarInactivos = new javax.swing.JRadioButton();
        radio_mostrarActivos = new javax.swing.JRadioButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        button_guardarPrestador = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        button_bajaPrestador = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        button_altaPrestador = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("MasSalud");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 230, 10));

        button_atras.setBackground(new java.awt.Color(255, 255, 255));
        button_atras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_atras.setForeground(new java.awt.Color(51, 51, 51));
        button_atras.setText("Atras");
        button_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(button_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 60));

        button_salir.setBackground(new java.awt.Color(255, 255, 255));
        button_salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_salir.setForeground(new java.awt.Color(51, 51, 51));
        button_salir.setText("Salir");
        button_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_salirActionPerformed(evt);
            }
        });
        getContentPane().add(button_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 90, 60));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Informacion de Prestadores");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 230, 10));

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 870, 10));

        table_prestadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "DNI", "Domicilio", "Telefono", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(table_prestadores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 690, 380));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Listado de Prestadores");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        radio_mostrarInactivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarInactivos.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarInactivos.setText("Mostrar Inactivos");
        radio_mostrarInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mostrarInactivosActionPerformed(evt);
            }
        });
        getContentPane().add(radio_mostrarInactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        radio_mostrarActivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarActivos.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarActivos.setText("Mostrar Activos");
        radio_mostrarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mostrarActivosActionPerformed(evt);
            }
        });
        getContentPane().add(radio_mostrarActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 150, 10));

        jSeparator11.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 150, 10));

        button_guardarPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_guardarPrestador.setForeground(new java.awt.Color(102, 102, 102));
        button_guardarPrestador.setText("Guardar");
        button_guardarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardarPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(button_guardarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 150, 60));

        jSeparator12.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 150, 10));

        button_bajaPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_bajaPrestador.setForeground(new java.awt.Color(102, 102, 102));
        button_bajaPrestador.setText("Baja Prestador");
        button_bajaPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bajaPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(button_bajaPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 150, 60));

        jSeparator13.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 150, 20));

        jSeparator10.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 260, 10));

        button_altaPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_altaPrestador.setForeground(new java.awt.Color(102, 102, 102));
        button_altaPrestador.setText("Alta Prestador");
        button_altaPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_altaPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(button_altaPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 150, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 150, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Ver Por Especialidad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 160, 40));

        jSeparator14.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 150, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atrasActionPerformed
        VistaPrestador prestador = new VistaPrestador();
        prestador.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_atrasActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed
        dispose();
    }//GEN-LAST:event_button_salirActionPerformed

    private void button_guardarPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardarPrestadorActionPerformed
        int filaSeleccionada = table_prestadores.getSelectedRow();

        String nombre = null;
        String apellido = null;
        int dni = 0;
        String domicilio = modelo.getValueAt(filaSeleccionada, 4).toString();
        long telefono = 0;

        if (filaSeleccionada != -1) {

            if (VerificarInputs.soloLetras(modelo.getValueAt(filaSeleccionada, 1).toString())) {

                nombre = modelo.getValueAt(filaSeleccionada, 1).toString();
            }

            if (VerificarInputs.soloLetras(modelo.getValueAt(filaSeleccionada, 2).toString())) {

                apellido = modelo.getValueAt(filaSeleccionada, 2).toString();
            }

            if (VerificarInputs.soloNumeros(modelo.getValueAt(filaSeleccionada, 3).toString())) {

                dni = Integer.valueOf(modelo.getValueAt(filaSeleccionada, 3).toString());
            }

            if (VerificarInputs.soloNumeros(modelo.getValueAt(filaSeleccionada, 5).toString())) {

                telefono = Long.parseLong(modelo.getValueAt(filaSeleccionada, 5).toString());
            }

            Prestador modificarPrestador = prestador_data.buscarPrestadorApellido(apellido);

            modificarPrestador.setNombre(nombre);
            modificarPrestador.setApellido(apellido);
            modificarPrestador.setDni(dni);
            modificarPrestador.setDomicilio(domicilio);
            modificarPrestador.setTelefono(telefono);

            prestador_data.modificarPrestador(modificarPrestador);

        }


    }//GEN-LAST:event_button_guardarPrestadorActionPerformed

    private void radio_mostrarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mostrarActivosActionPerformed
        borrarFilas();

        ArrayList<Prestador> listadoPrestadores_activos = prestador_data.listarActivos();

        for (Prestador prestadores : listadoPrestadores_activos) {

            modelo.addRow(new Object[]{prestadores.getIdPrestador(), prestadores.getNombre(), prestadores.getApellido(), prestadores.getDni(), prestadores.getDomicilio(), prestadores.getTelefono()});

        }

        button_altaPrestador.setEnabled(false);
        button_bajaPrestador.setEnabled(true);
    }//GEN-LAST:event_radio_mostrarActivosActionPerformed

    private void radio_mostrarInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mostrarInactivosActionPerformed
        borrarFilas();

        ArrayList<Prestador> listadoPrestadores_inActivos = prestador_data.listarInActivos();

        for (Prestador prestadores : listadoPrestadores_inActivos) {

            modelo.addRow(new Object[]{prestadores.getIdPrestador(), prestadores.getNombre(), prestadores.getApellido(), prestadores.getDni(), prestadores.getDomicilio(), prestadores.getTelefono()});

        }

        button_altaPrestador.setEnabled(true);
        button_bajaPrestador.setEnabled(false);


    }//GEN-LAST:event_radio_mostrarInactivosActionPerformed

    private void button_bajaPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bajaPrestadorActionPerformed
        int filaSeleccionada = table_prestadores.getSelectedRow();

        if (filaSeleccionada != -1) {

           Prestador prestador_apellido;

            TableModel model = table_prestadores.getModel();

            int idFila = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());

            Object valorApellido = model.getValueAt(filaSeleccionada, 2);

           // int dni = Integer.parseInt(valorDni.toString());

            prestador_apellido = prestador_data.buscarPrestadorApellido("apellido");

            int id = prestador_apellido.getIdPrestador();

            prestador_data.eliminarPrestador(id);

            modelo.removeRow(filaSeleccionada);

        }

        modelo.fireTableDataChanged();

    }//GEN-LAST:event_button_bajaPrestadorActionPerformed

    private void button_altaPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_altaPrestadorActionPerformed
         int filaSeleccionada = table_prestadores.getSelectedRow();

        if (filaSeleccionada != -1) {

            Prestador prestador_apellido;

            TableModel model = table_prestadores.getModel();

            int idFila = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());

            Object valorApellido = model.getValueAt(filaSeleccionada, 2);

          

            prestador_apellido = prestador_data.buscarPrestadorApellido("apellido");

            int id = prestador_apellido.getIdPrestador();

            prestador_data.recuperarPrestador(id);

            modelo.removeRow(filaSeleccionada);

        }

        modelo.fireTableDataChanged();


    }//GEN-LAST:event_button_altaPrestadorActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVerPrestadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVerPrestadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVerPrestadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVerPrestadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVerPrestadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_altaPrestador;
    private javax.swing.JButton button_atras;
    private javax.swing.JButton button_bajaPrestador;
    private javax.swing.JButton button_guardarPrestador;
    private javax.swing.JButton button_salir;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JRadioButton radio_mostrarActivos;
    private javax.swing.JRadioButton radio_mostrarInactivos;
    private javax.swing.JTable table_prestadores;
    // End of variables declaration//GEN-END:variables
}
