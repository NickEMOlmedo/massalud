package vista;

import controlador.EspecialidadData;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Especialidad;

/**
 *
 * @author Nickolas
 */
public class VistaVerEspecialidades extends javax.swing.JFrame {

    EspecialidadData especialidad_data = new EspecialidadData();
    private final DefaultTableModel modelo;

    public VistaVerEspecialidades() {
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
        cabecera.add("Especialidad");

        for (Object lector : cabecera) {

            modelo.addColumn(lector);

        }

        table_especialidades.setModel(modelo);
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

        button_altaAfiliado = new javax.swing.JButton();
        button_bajaAfiliado = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        button_salir = new javax.swing.JButton();
        button_principal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_especialidades = new javax.swing.JTable();
        radio_mostrarInactivos = new javax.swing.JRadioButton();
        radio_mostrarActivos = new javax.swing.JRadioButton();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        button_altaEspecialidad = new javax.swing.JButton();
        button_guardarEspecialidad = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        button_bajaEspecialidad = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();

        button_altaAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_altaAfiliado.setForeground(new java.awt.Color(102, 102, 102));
        button_altaAfiliado.setText("Alta Afiliado");
        button_altaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_altaAfiliadoActionPerformed(evt);
            }
        });

        button_bajaAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_bajaAfiliado.setForeground(new java.awt.Color(102, 102, 102));
        button_bajaAfiliado.setText("Baja Afiliado");
        button_bajaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bajaAfiliadoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 640, 20));

        jSeparator5.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 230, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Informacion de Especialidades");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("MasSalud");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 230, 10));

        button_salir.setBackground(new java.awt.Color(255, 255, 255));
        button_salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_salir.setForeground(new java.awt.Color(51, 51, 51));
        button_salir.setText("Salir");
        button_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_salirActionPerformed(evt);
            }
        });
        getContentPane().add(button_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 90, 60));

        button_principal.setBackground(new java.awt.Color(255, 255, 255));
        button_principal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button_principal.setForeground(new java.awt.Color(51, 51, 51));
        button_principal.setText("Principal");
        button_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_principalActionPerformed(evt);
            }
        });
        getContentPane().add(button_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 60));

        table_especialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_especialidades.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(table_especialidades);
        table_especialidades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (table_especialidades.getColumnModel().getColumnCount() > 0) {
            table_especialidades.getColumnModel().getColumn(0).setPreferredWidth(120);
            table_especialidades.getColumnModel().getColumn(0).setMaxWidth(120);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 440, 420));

        radio_mostrarInactivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarInactivos.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarInactivos.setText("Mostrar Inactivos");
        radio_mostrarInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mostrarInactivosActionPerformed(evt);
            }
        });
        getContentPane().add(radio_mostrarInactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        radio_mostrarActivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarActivos.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarActivos.setText("Mostrar Activos");
        radio_mostrarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mostrarActivosActionPerformed(evt);
            }
        });
        getContentPane().add(radio_mostrarActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 150, 10));

        jSeparator14.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 150, -1));

        button_altaEspecialidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_altaEspecialidad.setForeground(new java.awt.Color(102, 102, 102));
        button_altaEspecialidad.setText("Alta Especialidad");
        button_altaEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_altaEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(button_altaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 160, 60));

        button_guardarEspecialidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_guardarEspecialidad.setForeground(new java.awt.Color(102, 102, 102));
        button_guardarEspecialidad.setText("Guardar");
        button_guardarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardarEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(button_guardarEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 150, 60));

        jSeparator15.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 150, 10));

        button_bajaEspecialidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_bajaEspecialidad.setForeground(new java.awt.Color(102, 102, 102));
        button_bajaEspecialidad.setText("Baja Especialidad");
        button_bajaEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bajaEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(button_bajaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 160, 60));

        jSeparator16.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 150, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_salirActionPerformed
        dispose();
    }//GEN-LAST:event_button_salirActionPerformed

    private void button_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_principalActionPerformed
        VistaPrincipal principal = new VistaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_principalActionPerformed

    private void button_altaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_altaAfiliadoActionPerformed


    }//GEN-LAST:event_button_altaAfiliadoActionPerformed

    private void button_bajaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bajaAfiliadoActionPerformed


    }//GEN-LAST:event_button_bajaAfiliadoActionPerformed

    private void radio_mostrarInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mostrarInactivosActionPerformed

        borrarFilas();

        ArrayList<Especialidad> listaEspecialidades_activas = especialidad_data.listarInActivos();

        for (Especialidad especialidades : listaEspecialidades_activas) {

            modelo.addRow(new Object[]{especialidades.getIdEspecialidad(), especialidades.getEspecialidad()});

        }

        button_altaEspecialidad.setEnabled(false);
        button_bajaEspecialidad.setEnabled(true);
        button_altaEspecialidad.setEnabled(true);
        button_bajaEspecialidad.setEnabled(false);

    }//GEN-LAST:event_radio_mostrarInactivosActionPerformed

    private void radio_mostrarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mostrarActivosActionPerformed

        borrarFilas();

        ArrayList<Especialidad> listaEspecialidades_activas = especialidad_data.listarActivos();

        for (Especialidad especialidades : listaEspecialidades_activas) {

            modelo.addRow(new Object[]{especialidades.getIdEspecialidad(), especialidades.getEspecialidad()});

        }

        button_altaEspecialidad.setEnabled(false);
        button_bajaEspecialidad.setEnabled(true);
    }//GEN-LAST:event_radio_mostrarActivosActionPerformed

    private void button_altaEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_altaEspecialidadActionPerformed

        int filaSeleccionada = table_especialidades.getSelectedRow();

        if (filaSeleccionada != -1) {

            Especialidad especialidad_id;

            TableModel model = table_especialidades.getModel();

            int idFila = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());

            Object valorId = model.getValueAt(filaSeleccionada, 0);

            int id = Integer.parseInt(valorId.toString());

            especialidad_data.recuperarEspecialidad(id);

            modelo.removeRow(filaSeleccionada);

        }

        modelo.fireTableDataChanged();

    }//GEN-LAST:event_button_altaEspecialidadActionPerformed

    private void button_guardarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardarEspecialidadActionPerformed

        String especialidad = null;

        int filaSeleccionada = table_especialidades.getSelectedRow();

        int id = Integer.parseInt((modelo.getValueAt(filaSeleccionada, 0).toString()));

        if (filaSeleccionada != -1) {

            if (VerificarInputs.soloLetras(modelo.getValueAt(filaSeleccionada, 1).toString())) {

                especialidad = modelo.getValueAt(filaSeleccionada, 1).toString();
            }
        }

        Especialidad modificarEspecialidad = especialidad_data.buscarEspecialidad(id);

        modificarEspecialidad.setEspecialidad(especialidad);

        especialidad_data.modificarEspecialidad(modificarEspecialidad);
    }//GEN-LAST:event_button_guardarEspecialidadActionPerformed

    private void button_bajaEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bajaEspecialidadActionPerformed

        int filaSeleccionada = table_especialidades.getSelectedRow();

        if (filaSeleccionada != -1) {

            Especialidad especialidad_id;

            TableModel model = table_especialidades.getModel();

            int idFila = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());

            Object valorId = model.getValueAt(filaSeleccionada, 0);

            int id = Integer.parseInt(valorId.toString());

            especialidad_data.eliminarEspecialidad(id);

            modelo.removeRow(filaSeleccionada);

        }

        modelo.fireTableDataChanged();


    }//GEN-LAST:event_button_bajaEspecialidadActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVerEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVerEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVerEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVerEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVerEspecialidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_altaAfiliado;
    private javax.swing.JButton button_altaEspecialidad;
    private javax.swing.JButton button_bajaAfiliado;
    private javax.swing.JButton button_bajaEspecialidad;
    private javax.swing.JButton button_guardarEspecialidad;
    private javax.swing.JButton button_principal;
    private javax.swing.JButton button_salir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton radio_mostrarActivos;
    private javax.swing.JRadioButton radio_mostrarInactivos;
    private javax.swing.JTable table_especialidades;
    // End of variables declaration//GEN-END:variables
}
