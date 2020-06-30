
package interfaces;
import classes.*;
import conexion.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FrameCompetidor extends javax.swing.JFrame {

    public FrameCompetidor() {
        initComponents();
        rellenarCombo();        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldLicencia = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldApelidos = new javax.swing.JTextField();
        jSpinnerAnoNacemento = new javax.swing.JSpinner();
        jComboBoxEquipos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButtonAceptat = new javax.swing.JButton();
        jButtonAtrás = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número Licencia");

        jLabel2.setText("Nome");

        jLabel3.setText("Apelidos");

        jLabel4.setText("Ano nacemento");

        jLabel5.setText("Equipo");

        jTextFieldLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLicenciaActionPerformed(evt);
            }
        });

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldApelidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApelidosActionPerformed(evt);
            }
        });

        jSpinnerAnoNacemento.setModel(new javax.swing.SpinnerNumberModel(1970, 1970, 2020, 1));

        jComboBoxEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquiposActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("Novo Competidor");

        jButtonAceptat.setText("Aceptar");
        jButtonAceptat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptatActionPerformed(evt);
            }
        });

        jButtonAtrás.setText("Atrás");
        jButtonAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrásActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinnerAnoNacemento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAceptat)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonAtrás)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldApelidos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApelidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerAnoNacemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptat)
                    .addComponent(jButtonAtrás))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldApelidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApelidosActionPerformed
        String apelidos = jTextFieldApelidos.getText();
    }//GEN-LAST:event_jTextFieldApelidosActionPerformed

    private void jComboBoxEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquiposActionPerformed

    }//GEN-LAST:event_jComboBoxEquiposActionPerformed

    private void jTextFieldLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLicenciaActionPerformed
        convertirLicencia(jTextFieldLicencia.getText());
    }//GEN-LAST:event_jTextFieldLicenciaActionPerformed

    private void jButtonAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrásActionPerformed
        FramePrincipal p = new FramePrincipal();
        p.setVisible(true);
    }//GEN-LAST:event_jButtonAtrásActionPerformed

    private void jButtonAceptatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptatActionPerformed
        addCompetidor();
        reset();
    }//GEN-LAST:event_jButtonAceptatActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        String nome = jTextFieldNome.getText();
    }//GEN-LAST:event_jTextFieldNomeActionPerformed
    
    private Integer convertirLicencia(String texto){
        int licencia;
        texto = jTextFieldLicencia.getText();
        licencia = Integer.valueOf(texto);
        return licencia;
    }
    
    
    public void addCompetidor(){
        int licencia = convertirLicencia(jTextFieldLicencia.getText());
        String nomeEquipo = (String)jComboBoxEquipos.getSelectedItem();
        Equipo equipo = seleccionarEquipo(nomeEquipo);
        Competidor competidor = new Competidor (licencia, jTextFieldNome.getText(),
                jTextFieldApelidos.getText(), (Integer)jSpinnerAnoNacemento.getValue(),equipo);
        Transaction tran = null;
        try{
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            tran = session.beginTransaction(); 
            
            session.save(competidor);
            
            tran.commit();
            session.close();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
    }
    
    private void rellenarCombo(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query verEquipos = session.createQuery("Select e from Equipo e");
        List <Equipo> nomeEquipos = verEquipos.list();
        for (int i = 0 ; i < nomeEquipos.size(); i++){
            Equipo equipo = nomeEquipos.get(i);
            String nomeSeleccionado = equipo.getNome();
            jComboBoxEquipos.addItem(nomeSeleccionado);
        }
        session.close();
    }
    
    private void reset(){
        jTextFieldNome.setText("");
        jTextFieldApelidos.setText("");
        jTextFieldLicencia.setText("");
        jSpinnerAnoNacemento.setValue(1970);
    }
    
    private Equipo seleccionarEquipo (String nomeEquipo){
        Equipo e = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query selequipo = session.createQuery("Select e from Equipo e");
        List <Equipo> equipos = selequipo.list();
        for (Equipo eq:equipos){
            if (eq.getNome().equals(nomeEquipo)){
                e = eq;
            }
        }
        return e;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptat;
    private javax.swing.JButton jButtonAtrás;
    private javax.swing.JComboBox<String> jComboBoxEquipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinnerAnoNacemento;
    private javax.swing.JTextField jTextFieldApelidos;
    private javax.swing.JTextField jTextFieldLicencia;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
