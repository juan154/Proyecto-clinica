/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Sebastian
 */
public class cita extends javax.swing.JPanel {

    /**
     * Creates new form cita
     */
    public cita() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("CITAS ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Filtrar ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 19, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 21, 189, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 950, 132));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE PACIENTE ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 194, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("NOMBRE DOCTOR ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 208, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("CORREO PACIENTE ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 259, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("FECHA");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 117, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("HORA ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, -1, -1));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 85, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("CODIGO DE CITA");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 210, -1));

        jButton1.setText("Actualizar");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, -1));

        jButton2.setText("Eliminar");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, -1, -1));

        jButton3.setText("Agregar");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        jButton4.setText("Eliminar");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
