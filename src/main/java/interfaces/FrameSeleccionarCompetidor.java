
package interfaces;

import javax.swing.DefaultListModel;
import classes.*;
import conexion.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class FrameSeleccionarCompetidor extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    
    public FrameSeleccionarCompetidor() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxOpcions = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCompetidores = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Seleccionar Competidor");

        jLabel2.setText("Elexir competidor:");

        jComboBoxOpcions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolle unha opción", "Licencia", "Nome", "Equipo" }));
        jComboBoxOpcions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionsActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListCompetidores);

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jComboBoxOpcions, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxOpcions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOpcionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionsActionPerformed
        modelo.removeAllElements();
        rellenarLista();
    }//GEN-LAST:event_jComboBoxOpcionsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameCompetidor fc = new FrameCompetidor();
        fc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void rellenarLista(){
        String opcion = (String)jComboBoxOpcions.getSelectedItem();
        Session session = HibernateUtil.getSessionFactory().openSession();
        int numero = 0;
        if (opcion == "Escolle unha opción"){
            numero = 0;
        }
        if (opcion == "Licencia"){
            numero = 1;
        }if (opcion == "Nome"){
            numero = 2;
        }if (opcion == "Equipo"){
            numero = 3;
        }
       
          switch (numero){
              case 0:
                  modelo.removeAllElements();
                  break;
              case 1:
                  Query q1 = session.createQuery("Select c from Competidor c");
                  List <Competidor> datos = q1.list();
                  for (Competidor comp:datos){
                  modelo.addElement(comp.getLicencia());
                  jListCompetidores.setModel(modelo);
                  }
                  session.close();
                  break;
              case 2:
                  Query q2 = session.createQuery("Select c from Competidor c");
                  List <Competidor> dat = q2.list();
                for (Competidor comp:dat){
                  modelo.addElement(comp.getNome() + " " +  comp.getApelidos());
                  jListCompetidores.setModel(modelo);
                  }
                session.close();
                  break;
              case 3:
                  Query q3 = session.createQuery("Select e from Equipo e");
                  List <Equipo> equipos =q3.list();
                  for (Equipo e:equipos){
                  modelo.addElement(e.getNome());
                  jListCompetidores.setModel(modelo);
                  }
                  session.close();
                  break;
            }
    }
    
    private Competidor seleccionarCompetidor(String seleccionado){
        Competidor c = null;
        seleccionado = String.valueOf(jListCompetidores.getSelectedIndex());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q1 = session.createQuery("Select c from Competidor c");
        List <Competidor> competidores = q1.list();
        for (Competidor comp:competidores){
            
        }
        return c;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxOpcions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListCompetidores;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
