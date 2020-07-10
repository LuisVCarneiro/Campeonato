/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Equipo;
import conexion.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class FrameConsultas extends javax.swing.JFrame {

   
    public FrameConsultas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVerCompetidores = new javax.swing.JButton();
        jButtonVerEquipos = new javax.swing.JButton();
        jButtonVerVideos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonVerCompetidores.setText("Ver competidores");
        jButtonVerCompetidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerCompetidoresActionPerformed(evt);
            }
        });

        jButtonVerEquipos.setText("Ver equipos");
        jButtonVerEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerEquiposActionPerformed(evt);
            }
        });

        jButtonVerVideos.setText("Ver videos");
        jButtonVerVideos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerVideosActionPerformed(evt);
            }
        });

        jButton4.setText("Atras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextAreaResultados.setColumns(20);
        jTextAreaResultados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVerCompetidores)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVerEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jButtonVerVideos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVerCompetidores)
                    .addComponent(jButtonVerEquipos)
                    .addComponent(jButtonVerVideos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerCompetidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerCompetidoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerCompetidoresActionPerformed

    private void jButtonVerEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerEquiposActionPerformed
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Query verEquipos = session.createQuery("Select e from Equipo e");
        List <Equipo> equipos = verEquipos.list();
        StringBuilder sb = new StringBuilder();
        for (Equipo equipo:equipos){
            sb.append(equipo.toString());
            sb.append("\n");
        }
        jTextAreaResultados.setText(sb.toString());
        session.close();
    }//GEN-LAST:event_jButtonVerEquiposActionPerformed

    private void jButtonVerVideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerVideosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerVideosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FramePrincipal fp = new FramePrincipal();
        fp.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonVerCompetidores;
    private javax.swing.JButton jButtonVerEquipos;
    private javax.swing.JButton jButtonVerVideos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultados;
    // End of variables declaration//GEN-END:variables
}
