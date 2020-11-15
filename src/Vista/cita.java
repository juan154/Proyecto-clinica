package Vista;

import Controlador.Lista_cita;
import Modelo.Conexion;
import javax.swing.*;

public class cita extends javax.swing.JPanel {

    Conexion BD;
    int cod_cita;
    public cita() {
        initComponents();
        bloqueo();
    }
    public void bloqueo(){
        paciente.setEnabled(false);
        doctor.setEnabled(false);
        correo.setEnabled(false);
        fecha.setEnabled(false);
        hora.setEnabled(false);
        Actualizar.setEnabled(false);
        paciente.setText("");
        doctor.setText("");
        correo.setText("");
        fecha.setText("");
        hora.setText("");
    }
    public void getBD(Conexion BD) {
        this.BD = BD;
    }

    public void mostrar_datos(String filtro) {
        Lista_cita lista = new Lista_cita();
        String titulos[] = {"CODIGO", "PACIENTE", "DOCTOR", "CORREO", "FECHA", "HORA"};
        String info[][] = lista.tabla(BD, filtro);
        tabla = new JTable(info, titulos);
        contenedor.setViewportView(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fitro = new javax.swing.JTextField();
        contenedor = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        paciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        doctor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        Consultar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("CITAS ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Filtrar ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 19, -1, -1));

        fitro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fitroKeyReleased(evt);
            }
        });
        add(fitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 21, 189, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        contenedor.setViewportView(tabla);

        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 950, 132));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE PACIENTE ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        add(paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 250, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("NOMBRE DOCTOR ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));
        add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 208, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("CORREO PACIENTE ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 290, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("FECHA");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 117, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("HORA ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));
        add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 85, -1));

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 130, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 130, -1));

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fitroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fitroKeyReleased
        mostrar_datos(fitro.getText().trim());
    }//GEN-LAST:event_fitroKeyReleased

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        if (tabla.getSelectedRow() >= 0) {
            paciente.setEnabled(true);
            doctor.setEnabled(true);
            correo.setEnabled(true);
            fecha.setEnabled(true);
            hora.setEnabled(true);
            Actualizar.setEnabled(true);
            paciente.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
            doctor.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
            correo.setText(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
            fecha.setText(tabla.getValueAt(tabla.getSelectedRow(), 4).toString());
            cod_cita = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
            hora.setText(tabla.getValueAt(tabla.getSelectedRow(), 5).toString());
        } else {
            JOptionPane.showMessageDialog(null, "tiene que escojer una fila para modificarla");
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if (tabla.getSelectedRow() >= 0) {
            BD.eliminar_c(Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString()));
            mostrar_datos("");
        } else {
            JOptionPane.showMessageDialog(null, "tiene que escojer una fila para eliminarla");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        if(vacio(correo)+vacio(doctor)+vacio(fecha)+vacio(hora)!=4){
            JOptionPane.showMessageDialog(null, "no se ha podido modificar los datos");
        } else {
            BD.actualizar_c(cod_cita, doctor.getText().trim(), correo.getText().trim(), fecha.getText().trim(), hora.getText().trim());
            mostrar_datos("");
            bloqueo();

        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Agregar_cita a1 = new Agregar_cita();
        a1.setBD(BD);
        a1.setVisible(true);
    }//GEN-LAST:event_AgregarActionPerformed
    public int vacio(JTextField x) {
        if (x.getText().trim() == "") {
            return 0;
        } else {
            return 1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JScrollPane contenedor;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField doctor;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField fitro;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField paciente;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
