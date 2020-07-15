package interfaces;

import classes.*;
import conexion.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class FrameEliminarVideo extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    
    public FrameEliminarVideo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxOpcions = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListOpcions = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Atrás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione o video a eliminar:");

        jLabel2.setText("Filtrar por:");

        jComboBoxOpcions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licencia", "Equipo", "Enlace" }));
        jComboBoxOpcions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionsActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListOpcions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(40, 40, 40)
                                    .addComponent(jComboBoxOpcions, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(8, 8, 8))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxOpcions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOpcionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionsActionPerformed
        modelo.removeAllElements();
        rellenarLista();
    }//GEN-LAST:event_jComboBoxOpcionsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrameVideo fv = new FrameVideo();
        fv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rellenarLista(){
        String opcion = (String)jComboBoxOpcions.getSelectedItem();
        Session session = HibernateUtil.getSessionFactory().openSession();
        int numero = 0;
        if (opcion == "Licencia"){
            numero = 1;
        }if (opcion == "Equipo"){
            numero = 2;
        }if (opcion == "Enlace"){
            numero = 3;
        }
        switch (numero){
            case 1:
                Query q1 = session.createQuery("Select c from Competidor c");
                List <Competidor> licencias = q1.list();
                for (Competidor lic:licencias){
                    modelo.addElement(lic.getLicencia());
                }
                jListOpcions.setModel(modelo);
                break;
            case 2:
                Query q2 = session.createQuery("Select e from Equipo e");
                List <Equipo> nomeEquipo = q2.list();
                for (Equipo equi:nomeEquipo){
                    modelo.addElement(equi.getNome());
                }
                jListOpcions.setModel(modelo);
                break;
            case 3:
                Query q3 = session.createQuery("Select v from Video v");
                List <Video> videos = q3.list();
                for (Video vid:videos){
                    modelo.addElement(vid.getEnlace());
                }
                jListOpcions.setModel(modelo);
                break;
        }
                 
        session.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxOpcions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListOpcions;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
