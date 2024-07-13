/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.Pantalla;

    
public class PantallaPrincipal extends javax.swing.JFrame {


    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConductor = new javax.swing.JButton();
        btnPasajero = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblUsted = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConductor.setText("Conductor");
        btnConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConductorActionPerformed(evt);
            }
        });
        getContentPane().add(btnConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 150, 30));

        btnPasajero.setText("Pasajero");
        btnPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasajeroActionPerformed(evt);
            }
        });
        getContentPane().add(btnPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 100, 30));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, 80, 30));

        lblUsted.setText("¿Es usted conductor o pasajero?");
        getContentPane().add(lblUsted, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 177, 49));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/_Red and Grey Minimalist Delivery App Mobile Prototype.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConductorActionPerformed
        Login a = new Login();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConductorActionPerformed

    private void btnPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasajeroActionPerformed
        Login b = new Login();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPasajeroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConductor;
    private javax.swing.JButton btnPasajero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsted;
    // End of variables declaration//GEN-END:variables
}
