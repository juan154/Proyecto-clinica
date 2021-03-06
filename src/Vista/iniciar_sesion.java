
package Vista;

import Modelo.Conexion;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class iniciar_sesion extends javax.swing.JFrame {
    Conexion BD;

    public void setBD(Conexion BD) {
        this.BD = BD;
    }
    
    public iniciar_sesion() {
        
        initComponents();
        this.setSize(879,496);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/escojer base de datos.jpg")).getImage());
        ImageIcon IMG = new ImageIcon(getClass().getResource("/Imagenes/escojer base de datos.jpg"));
        Icon fondo1 = new ImageIcon(IMG.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(),Image.SCALE_DEFAULT));
        fondo.setIcon(fondo1);
        
        this.repaint();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        clave = new javax.swing.JPasswordField();
        ingresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicia Sesion ");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 72, 121, -1));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 245, 98, 28));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USUARIO ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 143, 73, 28));

        usuario.setText("Ingrese su usuario");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 176, 180, -1));

        volver.setBackground(new java.awt.Color(102, 204, 255));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        clave.setText("jPasswordField1");
        clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                claveMouseClicked(evt);
            }
        });
        getContentPane().add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 291, 180, -1));

        ingresar.setBackground(new java.awt.Color(102, 204, 255));
        ingresar.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 60));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
    
        usuario.setText("");
    }//GEN-LAST:event_usuarioMouseClicked

    private void claveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claveMouseClicked
       clave.setText("");
    }//GEN-LAST:event_claveMouseClicked

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        String user = usuario.getText().trim();
        String pass = clave.getText().trim();
        if(BD.validar(user, pass)){
            Clinica c1 = new Clinica();
            c1.setBD(BD);
            dispose();
            c1.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "datos incorrectos");
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Está seguro de volver a elegir una base de datos?",
                "MENSAJE DE CONFIRMACION", JOptionPane.WARNING_MESSAGE);
        if (eleccion == JOptionPane.YES_OPTION) {
            Base_de_datos base = new Base_de_datos();
            base.setVisible(true);
            setVisible(false);  
        }
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciar_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField clave;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
