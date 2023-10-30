package vista;

import controlador.AfiliadoData;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Afiliado;

public class VistaVerAfiliados extends javax.swing.JFrame {

    AfiliadoData afiliado_data = new AfiliadoData();
    private final DefaultTableModel modelo;

    public VistaVerAfiliados() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        ButtonGroup grupoDeBotones = new ButtonGroup();
        grupoDeBotones.add(radio_mostrarActivos);
        grupoDeBotones.add(radio_mostrarInactivos);
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {

                return column != 0 ;

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

        for (Object lector : cabecera) {

            modelo.addColumn(lector);

        }

        table_afiliados.setModel(modelo);
    }

    private void borrarFilas() {

        int rowCount = modelo.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {

            modelo.removeRow(i);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        button_atras = new javax.swing.JButton();
        button_salir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_afiliados = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        radio_mostrarInactivos = new javax.swing.JRadioButton();
        radio_mostrarActivos = new javax.swing.JRadioButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        button_altaAfiliado = new javax.swing.JButton();
        button_guardarAfiliado = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        button_bajaAfiliado = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();

        jButton1.setText("jButton1");

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
        jLabel4.setText("Listado de Afiliados ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

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
        jLabel6.setText("Informacion de Afiliados");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        table_afiliados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "DNI", "Domicilio", "Telefono"
            }
        ));
        table_afiliados.setColumnSelectionAllowed(false);
        jScrollPane1.setViewportView(table_afiliados);
        table_afiliados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 670, 380));

        jSeparator8.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 230, 10));

        radio_mostrarInactivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarInactivos.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarInactivos.setText("Mostrar Inactivos");
        radio_mostrarInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mostrarInactivosActionPerformed(evt);
            }
        });
        getContentPane().add(radio_mostrarInactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, -1, -1));

        radio_mostrarActivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarActivos.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarActivos.setText("Mostrar Activos");
        radio_mostrarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mostrarActivosActionPerformed(evt);
            }
        });
        getContentPane().add(radio_mostrarActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 870, 10));

        jSeparator9.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 150, 10));

        jSeparator10.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 230, 10));

        jSeparator11.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 150, -1));

        button_altaAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_altaAfiliado.setForeground(new java.awt.Color(102, 102, 102));
        button_altaAfiliado.setText("Alta Afiliado");
        button_altaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_altaAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(button_altaAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 150, 60));

        button_guardarAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_guardarAfiliado.setForeground(new java.awt.Color(102, 102, 102));
        button_guardarAfiliado.setText("Guardar");
        button_guardarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardarAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(button_guardarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 150, 60));

        jSeparator12.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 150, 10));

        button_bajaAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_bajaAfiliado.setForeground(new java.awt.Color(102, 102, 102));
        button_bajaAfiliado.setText("Baja Afiliado");
        button_bajaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bajaAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(button_bajaAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 150, 60));

        jSeparator13.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 150, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atrasActionPerformed
        VistaAfiliado afiliado = new VistaAfiliado();
        afiliado.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_atrasActionPerformed

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed
        dispose();
    }//GEN-LAST:event_button_salirActionPerformed

    private void button_guardarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardarAfiliadoActionPerformed

        int filaSeleccionada = table_afiliados.getSelectedRow();

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

            Afiliado modificarAfiliado = new Afiliado();
            modificarAfiliado = afiliado_data.buscarAfiliado_id(id);

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

                modificarAfiliado.setNombre(nombre);
            }

            if (v_apellido == true) {

                modificarAfiliado.setApellido(apellido);
            }

            if (v_dni == true) {

                
                modificarAfiliado.setDni(dni);

            }

            if (v_domicilio) {

                modificarAfiliado.setDomicilio(domicilio);

            }

            if (v_telefono == true) {

                modificarAfiliado.setTelefono(telefono);

            }

            afiliado_data.modificarAfiliado(modificarAfiliado);

        } else {

            JOptionPane.showMessageDialog(this, "¡No se ha seleccionado ninguna fila!");
        }


    }//GEN-LAST:event_button_guardarAfiliadoActionPerformed

    private void radio_mostrarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mostrarActivosActionPerformed

        borrarFilas();

        ArrayList<Afiliado> listadoAfiliados_activos = afiliado_data.listarActivos();

        for (Afiliado afiliados : listadoAfiliados_activos) {

            modelo.addRow(new Object[]{afiliados.getIdAfiliado(), afiliados.getNombre(), afiliados.getApellido(), afiliados.getDni(), afiliados.getDomicilio(), afiliados.getTelefono()});

        }

        button_altaAfiliado.setEnabled(false);
        button_bajaAfiliado.setEnabled(true);

    }//GEN-LAST:event_radio_mostrarActivosActionPerformed

    private void radio_mostrarInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mostrarInactivosActionPerformed

        borrarFilas();

        ArrayList<Afiliado> listadoAfiliados_inActivos = afiliado_data.listarInActivos();

        for (Afiliado afiliados : listadoAfiliados_inActivos) {

            modelo.addRow(new Object[]{afiliados.getIdAfiliado(), afiliados.getNombre(), afiliados.getApellido(), afiliados.getDni(), afiliados.getDomicilio(), afiliados.getTelefono()});

        }

        button_altaAfiliado.setEnabled(true);
        button_bajaAfiliado.setEnabled(false);


    }//GEN-LAST:event_radio_mostrarInactivosActionPerformed

    private void button_bajaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bajaAfiliadoActionPerformed

        int filaSeleccionada = table_afiliados.getSelectedRow();

        if (filaSeleccionada != -1) {

            Afiliado afiliado_dni;

            TableModel model = table_afiliados.getModel();

            int idFila = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());

            Object valorDni = model.getValueAt(filaSeleccionada, 3);

            int dni = Integer.parseInt(valorDni.toString());

            afiliado_dni = afiliado_data.buscarAfiliado_dni(dni);

            int id = afiliado_dni.getIdAfiliado();

            afiliado_data.eliminarAfiliado(id);

            modelo.removeRow(filaSeleccionada);

        }

        modelo.fireTableDataChanged();

    }//GEN-LAST:event_button_bajaAfiliadoActionPerformed

    private void button_altaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_altaAfiliadoActionPerformed

        int filaSeleccionada = table_afiliados.getSelectedRow();

        if (filaSeleccionada != -1) {

            Afiliado afiliado_dni;

            TableModel model = table_afiliados.getModel();

            int idFila = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());

            Object valorDni = model.getValueAt(filaSeleccionada, 3);

            int dni = Integer.parseInt(valorDni.toString());

            afiliado_dni = afiliado_data.buscarAfiliado_dni(dni);

            int id = afiliado_dni.getIdAfiliado();

            afiliado_data.recuperarAfiliado(id);

            modelo.removeRow(filaSeleccionada);

        }

        modelo.fireTableDataChanged();


    }//GEN-LAST:event_button_altaAfiliadoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVerAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVerAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVerAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVerAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVerAfiliados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_altaAfiliado;
    private javax.swing.JButton button_atras;
    private javax.swing.JButton button_bajaAfiliado;
    private javax.swing.JButton button_guardarAfiliado;
    private javax.swing.JButton button_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JRadioButton radio_mostrarActivos;
    private javax.swing.JRadioButton radio_mostrarInactivos;
    private javax.swing.JTable table_afiliados;
    // End of variables declaration//GEN-END:variables
}
