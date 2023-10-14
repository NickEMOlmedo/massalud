package vista;

public class VistaVerOrdenes extends javax.swing.JFrame {

    public VistaVerOrdenes() {
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
        button_atras = new javax.swing.JButton();
        button_salir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ordenes = new javax.swing.JTable();
        radio_mostrarPorPrestador = new javax.swing.JRadioButton();
        radio_mostrarPorAfiliado = new javax.swing.JRadioButton();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        button_eliminarOrden = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        button_ordenesPorFecha = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("MasSalud");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 230, 10));

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
        getContentPane().add(button_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 90, 60));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Informacion de Ordenes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 230, 10));

        jSeparator6.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 800, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Listado de Ordenes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 230, 10));

        table_ordenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_ordenes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 620, 380));

        radio_mostrarPorPrestador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarPorPrestador.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarPorPrestador.setText("Por Prestador");
        getContentPane().add(radio_mostrarPorPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        radio_mostrarPorAfiliado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio_mostrarPorAfiliado.setForeground(new java.awt.Color(102, 102, 102));
        radio_mostrarPorAfiliado.setText("Por Afiliado");
        getContentPane().add(radio_mostrarPorAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 150, -1));

        jSeparator12.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 150, 10));

        button_eliminarOrden.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_eliminarOrden.setForeground(new java.awt.Color(102, 102, 102));
        button_eliminarOrden.setText("Eliminar Orden");
        getContentPane().add(button_eliminarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 150, 60));

        jSeparator13.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 150, 10));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 150, 30));

        button_ordenesPorFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_ordenesPorFecha.setForeground(new java.awt.Color(102, 102, 102));
        button_ordenesPorFecha.setText("Ir a Fecha");
        getContentPane().add(button_ordenesPorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 150, 50));

        jSeparator14.setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 150, 10));

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
            java.util.logging.Logger.getLogger(VistaVerOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVerOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVerOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVerOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVerOrdenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_atras;
    private javax.swing.JButton button_eliminarOrden;
    private javax.swing.JButton button_ordenesPorFecha;
    private javax.swing.JButton button_salir;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JRadioButton radio_mostrarPorAfiliado;
    private javax.swing.JRadioButton radio_mostrarPorPrestador;
    private javax.swing.JTable table_ordenes;
    // End of variables declaration//GEN-END:variables
}
