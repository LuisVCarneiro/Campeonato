
package interfaces;

import java.util.HashSet;
import java.util.Set;

public class FrameCompetidor extends javax.swing.JFrame {

    public FrameCompetidor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAñadir = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Competidor");

        jButtonAñadir.setText("Engadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAñadir)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonEliminar)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAtras)
                            .addComponent(jButtonListar))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadir)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonListar))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButtonAtras)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
       FrameNovoCompetidor fnc = new FrameNovoCompetidor();
       fnc.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        FrameListarCompetidor flc = new FrameListarCompetidor();
        flc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        FrameSeleccionarCompetidor fec = new FrameSeleccionarCompetidor();
        fec.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        FramePrincipal fp = new FramePrincipal();
        fp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameSeleccionarCompetidor fsc = new FrameSeleccionarCompetidor();
        fsc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
