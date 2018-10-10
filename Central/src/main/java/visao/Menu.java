/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;


import com.google.api.services.drive.model.FileList;
import conexao.ConexaoDrive;
import dao.CandidatoDao;
import dao.EleitorDao;
import dao.PartidoDao;
import java.io.File;
import java.util.List;
import javax.swing.JFrame;


/**
 *
 * @author leandro
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    PartidoDao partidoDao = new PartidoDao();
    EleitorDao eleitorDao = new EleitorDao();
    CandidatoDao candidatoDao = new CandidatoDao();
    public Menu() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setLocationRelativeTo(null);
        this.setTitle("Central");
        ConexaoDrive.getInstance();
        List<com.google.api.services.drive.model.File> l = ConexaoDrive.listaArquivos();
        System.out.println(l.get(0).getName() + " " + l.get(0).getId());
        System.out.println(ConexaoDrive.leArquivoGD(l.get(0).getId()));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastros = new javax.swing.JMenu();
        cadEleitor = new javax.swing.JMenuItem();
        cadCandidato = new javax.swing.JMenuItem();
        cadPartido = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        driveEleitor = new javax.swing.JMenuItem();
        driveCandidato = new javax.swing.JMenuItem();
        drivePartido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/eleicoes.png"))); // NOI18N

        Cadastros.setText("Cadastros");

        cadEleitor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cadEleitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/eleitor.png"))); // NOI18N
        cadEleitor.setText("Eleitor");
        cadEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadEleitorActionPerformed(evt);
            }
        });
        Cadastros.add(cadEleitor);

        cadCandidato.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cadCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/candidato.png"))); // NOI18N
        cadCandidato.setText("Candidato");
        cadCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCandidatoActionPerformed(evt);
            }
        });
        Cadastros.add(cadCandidato);

        cadPartido.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cadPartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/partido.png"))); // NOI18N
        cadPartido.setText("Partido");
        cadPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPartidoActionPerformed(evt);
            }
        });
        Cadastros.add(cadPartido);

        jMenuBar1.add(Cadastros);

        jMenu2.setText("Drive");

        driveEleitor.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        driveEleitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/enviarNuvem.png"))); // NOI18N
        driveEleitor.setText("Eleitores");
        driveEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driveEleitorActionPerformed(evt);
            }
        });
        jMenu2.add(driveEleitor);

        driveCandidato.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        driveCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/enviarNuvem.png"))); // NOI18N
        driveCandidato.setText("Candidatos");
        driveCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driveCandidatoActionPerformed(evt);
            }
        });
        jMenu2.add(driveCandidato);

        drivePartido.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        drivePartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/enviarNuvem.png"))); // NOI18N
        drivePartido.setText("Partidos");
        drivePartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drivePartidoActionPerformed(evt);
            }
        });
        jMenu2.add(drivePartido);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadEleitorActionPerformed
        new CadastraEleitor(eleitorDao).setVisible(true);
    }//GEN-LAST:event_cadEleitorActionPerformed

    private void cadCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCandidatoActionPerformed
        new CadastraCandidato(candidatoDao,partidoDao).setVisible(true);
    }//GEN-LAST:event_cadCandidatoActionPerformed

    private void cadPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPartidoActionPerformed
         new CadastraPartido(partidoDao).setVisible(true);
    }//GEN-LAST:event_cadPartidoActionPerformed

    private void drivePartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drivePartidoActionPerformed
        new EnviaPartidos(partidoDao).setVisible(true);
    }//GEN-LAST:event_drivePartidoActionPerformed

    private void driveEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driveEleitorActionPerformed
        new EnviaEleitores(eleitorDao).setVisible(true);
    }//GEN-LAST:event_driveEleitorActionPerformed

    private void driveCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driveCandidatoActionPerformed
        new EnviaCandidatos(candidatoDao).setVisible(true);
    }//GEN-LAST:event_driveCandidatoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastros;
    private javax.swing.JMenuItem cadCandidato;
    private javax.swing.JMenuItem cadEleitor;
    private javax.swing.JMenuItem cadPartido;
    private javax.swing.JMenuItem driveCandidato;
    private javax.swing.JMenuItem driveEleitor;
    private javax.swing.JMenuItem drivePartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
