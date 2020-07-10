
package interfaces;
import classes.*;
import conexion.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldLicencia = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldApelidos = new javax.swing.JTextField();
        jSpinnerAno = new javax.swing.JSpinner();
        jComboBoxEquipos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonAtrás = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jComboBoxCinturon = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

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

        jSpinnerAno.setModel(new javax.swing.SpinnerNumberModel(2005, 2005, 2020, 1));

        jComboBoxEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquiposActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("Novo Competidor");

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonAtrás.setText("Atrás");
        jButtonAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrásActionPerformed(evt);
            }
        });

        jLabel7.setText("Sexo");

        buttonGroup1.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");

        buttonGroup1.add(jRadioButtonFemenino);
        jRadioButtonFemenino.setText("Femenino");

        jComboBoxCinturon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Blanco-amarillo", "Amarillo", "Amarillo-Naranja", "Naranja", "Naranja-verde", "Verde", "Verde-azul", "Azul", "Azul-rojo", "Rojo", "Rojo-negro", "Negro" }));

        jLabel8.setText("Cinturón");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerAno, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNome)
                                    .addComponent(jTextFieldLicencia, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jTextFieldApelidos))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jRadioButtonMasculino)
                                                    .addComponent(jLabel8))
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addGap(89, 89, 89)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxCinturon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButtonFemenino)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel7)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAceptar)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonAtrás)))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jRadioButtonMasculino)
                        .addComponent(jRadioButtonFemenino))
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApelidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCinturon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAceptar)
                            .addComponent(jButtonAtrás)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldApelidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApelidosActionPerformed
        String apelidos = jTextFieldApelidos.getText();
    }//GEN-LAST:event_jTextFieldApelidosActionPerformed

    private void jComboBoxEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquiposActionPerformed

    }//GEN-LAST:event_jComboBoxEquiposActionPerformed

    private void jTextFieldLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLicenciaActionPerformed
        int licencia = Integer.valueOf(jTextFieldLicencia.getText());
    }//GEN-LAST:event_jTextFieldLicenciaActionPerformed

    private void jButtonAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrásActionPerformed
        FramePrincipal p = new FramePrincipal();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrásActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        addDatos();
        reset();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        String nome = jTextFieldNome.getText();
    }//GEN-LAST:event_jTextFieldNomeActionPerformed
    
    private void addDatos(){
        String nomeEquipo = (String)jComboBoxEquipos.getSelectedItem();
        Equipo equipo = seleccionarEquipo(nomeEquipo);
        System.out.println(equipo.toString());
        int licencia = Integer.valueOf(jTextFieldLicencia.getText());
        String nome = jTextFieldNome.getText();
        String apelidos = jTextFieldApelidos.getText();
        int ano = (Integer)jSpinnerAno.getValue();
        String sexo = sexo();
        String categoria = calcularCategoria();
        String cinturon = cinturon();

        Competidor competidor = new Competidor(licencia, nome, apelidos, ano, sexo, categoria, cinturon, equipo);
        equipo.addCompetidor(competidor);
        
        System.out.println(competidor.toString());
        System.out.println(equipo.toString());
        
        Transaction tran = null;
        
        try{
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            tran = session.beginTransaction(); 
            
            session.saveOrUpdate(equipo);
            
            tran.commit();
            session.close();
            JOptionPane.showMessageDialog(null, "Datos gardados correctamente");
            
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
        jSpinnerAno.setValue(1970);
    }
    
    private String cinturon(){
        String cinturon = (String)jComboBoxCinturon.getSelectedItem(); 
        return cinturon;
    }
    
    private Equipo seleccionarEquipo (String nomeEquipo){
        Equipo e = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query selequipo = session.createQuery("Select e from Equipo e where nome = '" + nomeEquipo + "'");
        List <Equipo> equipos = selequipo.list();
        for (Equipo eq:equipos){
            if (eq.getNome().equals(nomeEquipo)){
                e = eq;
            }
        }
        session.close();
        return e;
    }
    
    private String calcularCategoria(){
        int ano = (Integer)jSpinnerAno.getValue();
        String categoria = "";
        if (ano == 2012 || ano == 2013){
            categoria = "Benjamín";
        }
        if (ano == 2010 || ano == 2011){
            categoria = "Alevín";
        }
        if (ano == 2009 || ano == 2008){
            categoria = "Infantil";
        }
        if (ano == 2007 || ano == 2006){
            categoria = "Cadete";
        }
        if (ano == 2005 || ano == 2004){
            categoria = "Junior";
        }
        return categoria;
    }
    
    public String sexo(){
        String sexo;
        if (jRadioButtonMasculino.isSelected()){
            sexo = "Masculino";
        }else {
            sexo = "Femenino";
        }
        return sexo;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAtrás;
    private javax.swing.JComboBox<String> jComboBoxCinturon;
    private javax.swing.JComboBox<String> jComboBoxEquipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JSpinner jSpinnerAno;
    private javax.swing.JTextField jTextFieldApelidos;
    private javax.swing.JTextField jTextFieldLicencia;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
