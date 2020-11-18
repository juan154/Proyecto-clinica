/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Lista_cita;
import Controlador.Lista_usuario;
import Modelo.Conexion;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Sebastian
 */
public class usuario extends javax.swing.JPanel {

    Conexion BD;
    int dni;

    public usuario() {
        initComponents();
        bloqueo();
    }

    public void bloqueo() {
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(true);
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }

    public void getBD(Conexion BD) {
        this.BD = BD;
    }

    public void mostrar_datos(String filtro) {
        Lista_usuario lista = new Lista_usuario();
        String titulos[] = {"DNI", "NOMBRE","CORREO", "TELEFONO", "TIPO_USUARIO", "ESTADO"};
        String info[][] = lista.tabla(BD, filtro);
        jTable1 = new JTable(info, titulos);
        jScrollPane1.setViewportView(jTable1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 450));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 59, 950, 124));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("USUARIO ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 17, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 216, -1, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 217, 205, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("CORREO");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 267, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("TELEFONO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 178, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("tipo de usuario ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico", "Enfermero", "Recepcionista" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Estatus");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 110, -1));

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, -1, -1));

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 367, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Filtrar ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 23, -1, -1));

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 24, 142, -1));

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 367, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: Consultar
        if (jTable1.getSelectedRow() >= 0) {
            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(true);
            jTextField2.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "tiene que escojer una fila para modificarla");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: Actualizar
        if (vacio(jTextField2) + vacio(jTextField3) + vacio(jTextField4) != 3) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos");
        } else {
            BD.actualizar_usuario(dni, jTextField2.getText().trim(), jTextField3.getText().trim(), jTextField4.getText().trim(), jComboBox1.getSelectedItem().toString(), jComboBox2.getSelectedItem().toString());
            mostrar_datos("");
            bloqueo();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        mostrar_datos(jTextField5.getText().trim());
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: Agregar
        Agregar_usuario u1 = new Agregar_usuario();
        u1.setBD(BD, this);
        u1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: Eliminar
        if(jTable1.getSelectedRow() >= 0){
            BD.eliminar_usuario(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString()));
            mostrar_datos("");
        }else{
            JOptionPane.showMessageDialog(null, "tiene que escojer una fila para eliminarla");            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public int vacio(JTextField x) {
        if (x.getText().trim() == "") {
            return 0;
        } else {
            return 1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
