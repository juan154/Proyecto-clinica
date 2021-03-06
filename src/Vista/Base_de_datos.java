package Vista;

import Modelo.Conexion;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Base_de_datos extends javax.swing.JFrame {

    Conexion BD;

    public Base_de_datos() {
        initComponents();
        this.setSize(1000, 596);
        setLocationRelativeTo(null);
        ImageIcon IMG = new ImageIcon(getClass().getResource("/Imagenes/iniciar sesion.jpg"));
        Icon fondo1 = new ImageIcon(IMG.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(fondo1);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mysql = new javax.swing.JButton();
        postgres = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escoja una Base de Datos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 590, 60));

        mysql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xampp.png"))); // NOI18N
        mysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysqlActionPerformed(evt);
            }
        });
        getContentPane().add(mysql, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 255, 140, 93));

        postgres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PostgreSQL.jpg"))); // NOI18N
        postgres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PostgreSQL.jpg"))); // NOI18N
        postgres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgresActionPerformed(evt);
            }
        });
        getContentPane().add(postgres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 255, 144, 93));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysqlActionPerformed
        BD = new Conexion("mysql");
        BD.conectar();
        inicio();
    }//GEN-LAST:event_mysqlActionPerformed

    private void postgresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgresActionPerformed
        BD = new Conexion("postgres");
        BD.conectar();
        inicio();
    }//GEN-LAST:event_postgresActionPerformed
    public void inicio() {
        iniciar_sesion run = new iniciar_sesion();
        run.setBD(BD);
        run.setVisible(true);
        dispose();
    }

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
            java.util.logging.Logger.getLogger(Base_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Base_de_datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mysql;
    private javax.swing.JButton postgres;
    // End of variables declaration//GEN-END:variables
}
