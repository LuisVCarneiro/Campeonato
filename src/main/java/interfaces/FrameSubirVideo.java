/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.*;
import conexion.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author luisv
 */
public class FrameSubirVideo extends javax.swing.JFrame {

    /**
     * Creates new form FrameSubirVideo
     */
    public FrameSubirVideo() {
        initComponents();
        rellenarCombo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxLicencias = new javax.swing.JComboBox<>();
        jTextFieldVideo = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número licencia");

        jLabel2.setText("Enlace video");

        jComboBoxLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLicenciasActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jComboBoxLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jTextFieldVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButtonAceptar)
                .addGap(88, 88, 88)
                .addComponent(jButtonAtras)
                .addGap(0, 107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonAtras))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        addVideo();
        this.setVisible(false);
        FramePrincipal fp = new FramePrincipal();
        fp.setVisible(true);
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jComboBoxLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLicenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLicenciasActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        FrameVideo fv = new FrameVideo();
        fv.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void rellenarCombo(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query verLicencias = session.createQuery("Select c from Competidor c");
        List <Competidor> licencias = verLicencias.list();
        for (int i = 0 ; i < licencias.size(); i++){
            Competidor comp = licencias.get(i);
            int licenciaSeleccionada = comp.getLicencia();
            String licencia = String.valueOf(licenciaSeleccionada);
            jComboBoxLicencias.addItem(licencia);
        }
        session.close();
    }
    
    private Competidor seleccionarCompetidor(int numLicencia){
        Competidor c = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query selcompet = session.createQuery("Select c from Competidor c where licencia = '" + numLicencia + "'");
        List <Competidor> competidores = selcompet.list();
        for (Competidor cp:competidores){
            if (cp.getLicencia()== numLicencia){
                c = cp;
                System.out.println(cp.toString());
            }
        }
        
        session.close();
        return c;
    }
    
    private void addVideo(){
        String numero = (String)jComboBoxLicencias.getSelectedItem();
        int numLicencia = Integer.valueOf(numero);
        Competidor c = seleccionarCompetidor(numLicencia);
        Video video1 = new Video (numLicencia, jTextFieldVideo.getText(),c); 
        c.addVideo(video1);
        Transaction tran = null;
        
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            tran = session.beginTransaction();
            session.saveOrUpdate(c);
            tran.commit();
            session.close();
            
        }catch (HibernateException e){
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JComboBox<String> jComboBoxLicencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldVideo;
    // End of variables declaration//GEN-END:variables
}
