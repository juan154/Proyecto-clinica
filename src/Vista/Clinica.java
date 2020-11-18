package Vista;
import Modelo.Conexion;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
public class Clinica extends javax.swing.JFrame {
    Conexion BD;
    public Clinica() {
        initComponents();
        this.setSize(950, 550);
        this.setResizable(false);
        setLocationRelativeTo(null);
        this.repaint();
    }

    public void setBD(Conexion BD) {
        this.BD = BD;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        citas = new javax.swing.JButton();
        farmacia = new javax.swing.JButton();
        personal = new javax.swing.JButton();
        sesion = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 0, 255));
        menu.setPreferredSize(new java.awt.Dimension(950, 100));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        citas.setBackground(new java.awt.Color(0, 102, 102));
        citas.setText("CITAS");
        citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citasActionPerformed(evt);
            }
        });
        menu.add(citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 31, 104, -1));

        farmacia.setBackground(new java.awt.Color(0, 102, 102));
        farmacia.setText("FARMACIA ");
        farmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmaciaActionPerformed(evt);
            }
        });
        menu.add(farmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 31, -1, -1));

        personal.setBackground(new java.awt.Color(0, 102, 102));
        personal.setText("PERSONAL");
        personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalActionPerformed(evt);
            }
        });
        menu.add(personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 31, -1, -1));

        sesion.setBackground(new java.awt.Color(0, 102, 102));
        sesion.setText("CERRAR SESION ");
        sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionActionPerformed(evt);
            }
        });
        menu.add(sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 31, -1, -1));

        salir.setBackground(new java.awt.Color(0, 102, 102));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 31, -1, -1));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        contenedor.setBackground(new java.awt.Color(0, 255, 255));
        contenedor.setPreferredSize(new java.awt.Dimension(950, 450));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("BIENVENIDO");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "¿Esta seguro de Cerrar Sesion?", "MENSAJE DE CONFIRMACION", JOptionPane.WARNING_MESSAGE);
        if (n == JOptionPane.YES_OPTION) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            iniciar_sesion login = new iniciar_sesion();
            login.setBD(BD);
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_sesionActionPerformed

    private void citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citasActionPerformed
        cita c1 = new cita();
        c1.setSize(950,450);
        c1.setLocation(0,0);
        c1.setBD(BD);
        c1.mostrar_datos("");
        contenedor.removeAll();
        contenedor.add(c1,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_citasActionPerformed

    private void farmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmaciaActionPerformed
        farmacia f1 = new farmacia();
        f1.setSize(950,450);
        f1.setLocation(0,0);
        f1.setBD(BD);
        f1.mostrar_datos("");
        contenedor.removeAll();
        contenedor.add(f1,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_farmaciaActionPerformed

    private void personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalActionPerformed
        usuario u1 = new usuario();
        u1.setSize(950,450);
        u1.setLocation(0,0);
        u1.getBD(BD);
        u1.mostrar_datos("");
        contenedor.removeAll();
        contenedor.add(u1,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_personalActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir del programa?", "MENSAJE DE CONFIRMACION", JOptionPane.WARNING_MESSAGE);
        if (n == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton citas;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton farmacia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton personal;
    private javax.swing.JButton salir;
    private javax.swing.JButton sesion;
    // End of variables declaration//GEN-END:variables
}
