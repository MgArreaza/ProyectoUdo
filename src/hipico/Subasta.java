/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipico;

/**
 *
 * @author Josber95
 */
public class Subasta extends javax.swing.JFrame {

    /**
     * Creates new form Subasta
     */
    public Subasta() {
        initComponents();
        setLocationRelativeTo(null);//para que la ventana aparezca centrada
        setResizable(false);//no maximizar la ventana
        setTitle("SUBASTA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        inicio = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        Ganador2 = new javax.swing.JMenu();
        tablita = new javax.swing.JMenu();
        Prec_tablita = new javax.swing.JMenu();
        Subasta = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 130, 60));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Iniciar Subasta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 203, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hipico/Diapositiva6.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 640));

        jMenu6.setText("Archivo");

        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jMenu6.add(inicio);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu6.add(salir);

        jMenuBar3.add(jMenu6);

        Ganador2.setText("Ganardor");
        Ganador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ganador2MouseClicked(evt);
            }
        });
        jMenuBar3.add(Ganador2);

        tablita.setText("Tablita");
        tablita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablitaMouseClicked(evt);
            }
        });
        jMenuBar3.add(tablita);

        Prec_tablita.setText("Prec. Tablita");
        Prec_tablita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Prec_tablitaMouseClicked(evt);
            }
        });
        jMenuBar3.add(Prec_tablita);

        Subasta.setText("Subasta");
        Subasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubastaMouseClicked(evt);
            }
        });
        jMenuBar3.add(Subasta);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        pagina_inicio obj= new pagina_inicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_inicioActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void Ganador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ganador2MouseClicked
        Ganador obj= new Ganador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Ganador2MouseClicked

    private void tablitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablitaMouseClicked
        tablita obj = new tablita();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_tablitaMouseClicked

    private void Prec_tablitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Prec_tablitaMouseClicked
        Prec_tablita obj= new Prec_tablita();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Prec_tablitaMouseClicked

    private void SubastaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubastaMouseClicked
        Subasta obj = new Subasta();
        obj.setVisible(false);
        dispose();
    }//GEN-LAST:event_SubastaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       tabla_subasta obj= new tabla_subasta();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Subasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subasta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ganador2;
    private javax.swing.JMenu Prec_tablita;
    private javax.swing.JMenu Subasta;
    private javax.swing.JMenuItem inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenu tablita;
    // End of variables declaration//GEN-END:variables
}