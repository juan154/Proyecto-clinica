package Vista;

import Controlador.Lista_farmacia;
import Modelo.Conexion;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class farmacia extends javax.swing.JPanel {

    Conexion BD;
    int id_farmacia;

    public farmacia() {
        initComponents();
        bloqueo();
    }

    public void bloqueo(){
     jTextArea1.setEnabled(false);
     jTextField2.setEnabled(false);
     jTextField3.setEnabled(false);
     actualizar.setEnabled(false);  
     jTextArea1.setText("");
     jTextField2.setText("");
     jTextField3.setText("");
    }

    public void setBD(Conexion BD) {
        this.BD = BD;
    }
    
    
    
    public void mostrar_datos(String filtro){
        Lista_farmacia lista = new Lista_farmacia();
        String cabecera[] = {"ID FARMACO","DESCRIPCIÓN","CANTIDAD","NOMBRE"};
        String info [][] = lista.tabla(BD, filtro);
        jTable1 = new JTable(info,cabecera);
        jScrollPane1.setViewportView(jTable1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("FARMACIA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Filtrar");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 19, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 20, 181, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 969, 122));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("DESCRIPCION ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 179, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 207, 335, 205));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("CANTIDAD ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 250, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("NOMBRE ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 250, -1));

        eliminar.setText("Eliminar ");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, -1));

        jButton3.setText("Agregar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, -1));

        actualizar.setText("Actualizar ");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, -1, -1));

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));
        consultar.getAccessibleContext().setAccessibleName("Consultar ");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        mostrar_datos(jTextField1.getText().trim());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        
        if(vacio(jTextArea1)+vacio(jTextField2)+vacio(jTextField3) != 3){
            JOptionPane.showMessageDialog(null,"Error al modificar los datos");
        }else{
            BD.actualizar_farmaco(id_farmacia, jTextArea1.getText().trim(), Integer.parseInt(jTextField2.getText().trim()), jTextField3.getText().trim());
            mostrar_datos("");
            bloqueo();
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: Agregar
        Agregar_Farmaco f1 = new Agregar_Farmaco();
        f1.getBD(BD, this);
        f1.setVisible(true);      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(jTable1.getSelectedRow() >= 0){
            BD.eliminar_farmaco(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString()));
            mostrar_datos("");
        }else{
            JOptionPane.showMessageDialog(null,"Tiene que escoger una fila para eliminarla");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() >= 0){
        jTextArea1.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        actualizar.setEnabled(true);
        jTextArea1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        id_farmacia = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Tiene que escoger una fila para modificarla");
        }
    }//GEN-LAST:event_consultarActionPerformed

    public int vacio(JTextArea x) {
        if(x.getText().trim() == ""){
            return 0;
        }else{
            return 1;
        }
    }
    
    public int vacio (JTextField x){
        if(x.getText().trim() == ""){
            return 0;
        }else{
            return 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
