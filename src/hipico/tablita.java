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
public class tablita extends javax.swing.JFrame {

    /**
     * Creates new form tablita
     */
    public tablita() {
        initComponents();
        setLocationRelativeTo(null);//para que la ventana aparezca centrada
        setResizable(false);//no maximizar la ventana
        setTitle("TABLITA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ticket_t = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hipodromo_t = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        CARRERA_T = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tablas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caballo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        generar_ticket = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        inicio = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        Ganador2 = new javax.swing.JMenu();
        tablita = new javax.swing.JMenu();
        Prec_tablita = new javax.swing.JMenu();
        Subasta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ticket_t.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ticket_t.setForeground(new java.awt.Color(0, 0, 102));
        Ticket_t.setText("Ticket");
        getContentPane().add(Ticket_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 50, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        hipodromo_t.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hipodromo_t.setForeground(new java.awt.Color(0, 0, 102));
        hipodromo_t.setText("Hipodromo");
        getContentPane().add(hipodromo_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LA RINCONADA", "OTROS" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 130, -1));

        CARRERA_T.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CARRERA_T.setForeground(new java.awt.Color(0, 0, 102));
        CARRERA_T.setText("Carrera");
        getContentPane().add(CARRERA_T, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Tablas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));
        getContentPane().add(tablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Caballo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));
        getContentPane().add(caballo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("BsF");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        generar_ticket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        generar_ticket.setForeground(new java.awt.Color(0, 0, 0));
        generar_ticket.setText("Gerenerar Ticket");
        generar_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_ticketActionPerformed(evt);
            }
        });
        getContentPane().add(generar_ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 570, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 570, 10));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 10, 370));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 10, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hipico/Diapositiva3.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 628));

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
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_SubastaMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void generar_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_ticketActionPerformed
        Ticket obj= new Ticket();
        Ticket.caballo.setText(caballo.getText());
        Ticket.hipodromo.setText((String) jComboBox1.getSelectedItem());
        Ticket.carrera.setText((String) jComboBox2.getSelectedItem());
        Ticket.tabla.setText(tablas.getText());
        Ticket.ticket.setText(jLabel2.getText());
        
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_generar_ticketActionPerformed

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
            java.util.logging.Logger.getLogger(tablita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CARRERA_T;
    private javax.swing.JMenu Ganador2;
    private javax.swing.JMenu Prec_tablita;
    private javax.swing.JMenu Subasta;
    private javax.swing.JLabel Ticket_t;
    private javax.swing.JTextField caballo;
    private javax.swing.JButton generar_ticket;
    private javax.swing.JLabel hipodromo_t;
    private javax.swing.JMenuItem inicio;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTextField tablas;
    private javax.swing.JMenu tablita;
    // End of variables declaration//GEN-END:variables
}