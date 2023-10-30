package vista;

import controlador.EspecialidadData;
import controlador.PrestadorData;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Especialidad;
import modelo.Prestador;

public class VistaVerPrestadores extends javax.swing.JFrame {

    PrestadorData prestador_data = new PrestadorData();
    EspecialidadData especialidad_data = new EspecialidadData();
    private final DefaultComboBoxModel modeloComboEspecialidades;
    private final DefaultTableModel modelo;

    public VistaVerPrestadores() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        ButtonGroup grupoDeBotones = new ButtonGroup();
        grupoDeBotones.add(radio_mostrarActivos);
        grupoDeBotones.add(radio_mostrarInactivos);
        modeloComboEspecialidades = new DefaultComboBoxModel<>();
        cargarCombo();
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {

                return column != 0 && column != 6 ;

            }
        };

        combobox_EspecialidadesPrestador.setModel(modeloComboEspecialidades);
        armarCabecera();
    }

    public void cargarCombo() {

        ArrayList<Especialidad> listarEspecialidad = especialidad_data.listarActivos();

        modeloComboEspecialidades.removeAllElements();

        for (Especialidad especialidad : listarEspecialidad) {

            modeloComboEspecialidades.addElement(especialidad);

        }

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
        button_guardarPrestador = new javax.swing.JButton();
        button_bajaPrestador = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        button_altaPrestador = new javax.swing.JButton();
        combobox_EspecialidadesPrestador = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();

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
        getContentPane().add(button_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 90, 60));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Informacion de Prestadores");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 230, 10));

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 920, 10));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 700, 410));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Listado de Prestadores");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        radio_mostrarInactivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarInactivos.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarInactivos.setText("Mostrar Inactivos");
        radio_mostrarInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mostrarInactivosActionPerformed(evt);
            }
        });
        getContentPane().add(radio_mostrarInactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        radio_mostrarActivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarActivos.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarActivos.setText("Mostrar Activos");
        radio_mostrarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mostrarActivosActionPerformed(evt);
            }
        });
        getContentPane().add(radio_mostrarActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, -1, -1));

        button_guardarPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_guardarPrestador.setForeground(new java.awt.Color(102, 102, 102));
        button_guardarPrestador.setText("Guardar");
        button_guardarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardarPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(button_guardarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, 150, 60));

        button_bajaPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_bajaPrestador.setForeground(new java.awt.Color(102, 102, 102));
        button_bajaPrestador.setText("Baja Prestador");
        button_bajaPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bajaPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(button_bajaPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 150, 60));

        jSeparator10.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 260, 10));

        button_altaPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_altaPrestador.setForeground(new java.awt.Color(102, 102, 102));
        button_altaPrestador.setText("Alta Prestador");
        button_altaPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_altaPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(button_altaPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 150, 60));

        combobox_EspecialidadesPrestador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        combobox_EspecialidadesPrestador.setForeground(new java.awt.Color(102, 102, 102));
        combobox_EspecialidadesPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_EspecialidadesPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(combobox_EspecialidadesPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 180, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Ver Por Especialidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 160, 40));

        jSeparator14.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 180, 10));

        jSeparator16.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, 180, 20));

        jSeparator18.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 180, 10));

        jSeparator17.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 180, 20));

        jSeparator19.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 180, 20));

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

        if (filaSeleccionada != -1) {

            int id = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());

            String nombre = "";
            String apellido = "";
            int dni = 0;
            String domicilio = "";
            long telefono = 0;

            boolean v_nombre = false;
            boolean v_apellido = false;
            boolean v_dni = false;
            boolean v_domicilio = false;
            boolean v_telefono = false;

            Prestador modificarPrestador = new Prestador();
            modificarPrestador = prestador_data.buscarPrestador_id(id);

            if (!modelo.getValueAt(filaSeleccionada, 1).toString().isEmpty() && VerificarInputs.soloLetras(modelo.getValueAt(filaSeleccionada, 1).toString())) {

                nombre = modelo.getValueAt(filaSeleccionada, 1).toString();
                v_nombre = true;

            } else {

                JOptionPane.showMessageDialog(this, "¡Solo se permiten letras en el campo NOMBRE y no puede estar vacio!");

            }

            if (!modelo.getValueAt(filaSeleccionada, 2).toString().isEmpty() && VerificarInputs.soloLetras(modelo.getValueAt(filaSeleccionada, 2).toString())) {

                apellido = modelo.getValueAt(filaSeleccionada, 2).toString();
                v_apellido = true;

            } else {

                JOptionPane.showMessageDialog(this, "¡Solo se permiten letras en el campo APELLIDO y no puede estar vacio");

            }

            if (!modelo.getValueAt(filaSeleccionada, 3).toString().isEmpty() && VerificarInputs.soloNumeros(modelo.getValueAt(filaSeleccionada, 3).toString())) {

                dni = Integer.valueOf(modelo.getValueAt(filaSeleccionada, 3).toString());
                v_dni = true;

            } else {

                JOptionPane.showMessageDialog(this, "¡Solo se permiten numeros en el campo DNI y no puede estar vacio!");
            }

            if (!modelo.getValueAt(filaSeleccionada, 4).toString().isEmpty()) {

                domicilio = modelo.getValueAt(filaSeleccionada, 4).toString();
                v_domicilio = true;

            } else {

                JOptionPane.showMessageDialog(this, "¡El campo DOMICILIO no puede estar vacio!");

            }

            if (!modelo.getValueAt(filaSeleccionada, 5).toString().isEmpty() && VerificarInputs.soloNumeros(modelo.getValueAt(filaSeleccionada, 5).toString())) {

                telefono = Long.parseLong(modelo.getValueAt(filaSeleccionada, 5).toString());
                v_telefono = true;

            } else {

                JOptionPane.showMessageDialog(this, "¡Solo se permiten numeros en el campo TELEFONO y no puede estar vacio!");

            }

            if (v_nombre == true) {

                modificarPrestador.setNombre(nombre);
            }

            if (v_apellido == true) {

                modificarPrestador.setApellido(apellido);

            }

            if (v_dni == true) {

                modificarPrestador.setDni(dni);

            }

            if (v_domicilio) {

                modificarPrestador.setDomicilio(domicilio);

            }

            if (v_telefono == true) {

                modificarPrestador.setTelefono(telefono);

            }

            prestador_data.modificarPrestador(modificarPrestador);

        } else {

            JOptionPane.showMessageDialog(this, "¡No se ha seleccionado ninguna fila!");
        }

    }//GEN-LAST:event_button_guardarPrestadorActionPerformed

    private void radio_mostrarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mostrarActivosActionPerformed

        borrarFilas();

        ArrayList<Prestador> listadoPrestadores_activos = prestador_data.listarActivos();

        for (Prestador prestadores : listadoPrestadores_activos) {

            modelo.addRow(new Object[]{prestadores.getIdPrestador(), prestadores.getNombre(), prestadores.getApellido(), prestadores.getDni(), prestadores.getDomicilio(), prestadores.getTelefono(), prestadores.getEspecialidad()});

        }

        button_altaPrestador.setEnabled(false);
        button_bajaPrestador.setEnabled(true);
    }//GEN-LAST:event_radio_mostrarActivosActionPerformed

    private void radio_mostrarInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mostrarInactivosActionPerformed

        borrarFilas();

        ArrayList<Prestador> listadoPrestadores_inActivos = prestador_data.listarInActivos();

        for (Prestador prestadores : listadoPrestadores_inActivos) {

            modelo.addRow(new Object[]{prestadores.getIdPrestador(), prestadores.getNombre(), prestadores.getApellido(), prestadores.getDni(), prestadores.getDomicilio(), prestadores.getTelefono(), prestadores.getEspecialidad()});

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

            String valor_apellido = (String) model.getValueAt(filaSeleccionada, 2);

            prestador_apellido = prestador_data.buscarPrestadorApellido(valor_apellido);

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

            String valor_apellido = (String) model.getValueAt(filaSeleccionada, 2);

            prestador_apellido = prestador_data.buscarPrestadorApellido_inactivo(valor_apellido);

            int id = prestador_apellido.getIdPrestador();

            prestador_data.recuperarPrestador(id);

            modelo.removeRow(filaSeleccionada);

        }

        modelo.fireTableDataChanged();


    }//GEN-LAST:event_button_altaPrestadorActionPerformed

    private void combobox_EspecialidadesPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_EspecialidadesPrestadorActionPerformed

        Especialidad seleccionado = (Especialidad) combobox_EspecialidadesPrestador.getSelectedItem();

        if (radio_mostrarActivos.isSelected()) {

            borrarFilas();

            ArrayList<Prestador> listadoPrestadores_activosEspecialidad = prestador_data.listarActivosPorEspecialidad(seleccionado.getIdEspecialidad());

            for (Prestador prestador : listadoPrestadores_activosEspecialidad) {

                modelo.addRow(new Object[]{prestador.getIdPrestador(), prestador.getNombre(), prestador.getApellido(), prestador.getDni(), prestador.getDomicilio(), prestador.getTelefono(), prestador.getEspecialidad()});

            }

        } else if (radio_mostrarInactivos.isSelected()) {

            borrarFilas();

            ArrayList<Prestador> listadoPrestadores_inActivosEspecialidad = prestador_data.listarInActivosPorEspecialidad(seleccionado.getIdEspecialidad());

            for (Prestador prestador : listadoPrestadores_inActivosEspecialidad) {

                modelo.addRow(new Object[]{prestador.getIdPrestador(), prestador.getNombre(), prestador.getApellido(), prestador.getDni(), prestador.getDomicilio(), prestador.getTelefono(), prestador.getEspecialidad()});

            }

        }


    }//GEN-LAST:event_combobox_EspecialidadesPrestadorActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVerPrestadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVerPrestadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVerPrestadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVerPrestadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox combobox_EspecialidadesPrestador;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JRadioButton radio_mostrarActivos;
    private javax.swing.JRadioButton radio_mostrarInactivos;
    private javax.swing.JTable table_prestadores;
    // End of variables declaration//GEN-END:variables
}
