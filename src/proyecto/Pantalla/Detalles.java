/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.Pantalla ;
import javax.swing.JOptionPane;


public class Detalles extends javax.swing.JFrame {

    private boolean infoBasicaCompleta = false;
    private boolean licenciaCompleta = false;
    private boolean soatCompleta = false;

    public Detalles() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInformacionBasica = new javax.swing.JButton();
        btnLicenciaConducir = new javax.swing.JButton();
        btnSOAT = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInformacionBasica.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnInformacionBasica.setText("INFORMACION BASICA");
        btnInformacionBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionBasicaActionPerformed(evt);
            }
        });

        btnLicenciaConducir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnLicenciaConducir.setText("LICENCIA DE CONDUCIR");
        btnLicenciaConducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicenciaConducirActionPerformed(evt);
            }
        });

        btnSOAT.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnSOAT.setText("SOAT");
        btnSOAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSOATActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLicenciaConducir, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAceptar)))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInformacionBasica)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSOAT)
                        .addGap(146, 146, 146))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnInformacionBasica)
                .addGap(40, 40, 40)
                .addComponent(btnLicenciaConducir)
                .addGap(31, 31, 31)
                .addComponent(btnSOAT)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnAceptar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformacionBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionBasicaActionPerformed
        // TODO add your handling code here:
        InfoBasico f = new InfoBasico();
        f.setVisible(true);
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                infoBasicaCompleta = true;
                checkCompletion();
            }
        });
    }//GEN-LAST:event_btnInformacionBasicaActionPerformed

    private void btnLicenciaConducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicenciaConducirActionPerformed
        // TODO add your handling code here:
        Licencia g = new Licencia();
        g.setVisible(true);
        g.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                licenciaCompleta = true;
                checkCompletion();
            }
        });
    }//GEN-LAST:event_btnLicenciaConducirActionPerformed

    private void btnSOATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSOATActionPerformed
        // TODO add your handling code here:
         SOAT h = new SOAT();
         h.setVisible(true);
         h.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            soatCompleta = true;
            checkCompletion();
            dispose(); // Cerrar la ventana Detalles después de completar SOAT
        }
        });     
    }//GEN-LAST:event_btnSOATActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        PantallaPrincipal i = new PantallaPrincipal();
        i.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if (infoBasicaCompleta && licenciaCompleta && soatCompleta) {
            // Si todas las partes están completas, abrir la ventana de sesión y cerrar esta
            PantallaPrincipal o = new PantallaPrincipal();
            o.setVisible(true);
            this.dispose();
        } else {
            // Mostrar un mensaje de error si no todas las partes están completas
            JOptionPane.showMessageDialog(this, "Complete todos los pasos antes de continuar.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void checkCompletion() {
        if (infoBasicaCompleta && licenciaCompleta && soatCompleta) {
            btnAceptar.setEnabled(true);
        }
    }
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
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detalles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnInformacionBasica;
    private javax.swing.JButton btnLicenciaConducir;
    private javax.swing.JButton btnSOAT;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables
}
