package Modelo;

import Controlador.Lista_cita;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    Connection cn;
    private String url;
    private String user;
    private String password;
    private String opcion;
    Statement st;
    ResultSet rs;

    public Conexion(String opcion) {
        this.opcion = opcion;
    }

    public void conectar() {
        switch (opcion) {
            case "postgres":
                url = "jdbc:postgresql://localhost:5432/clinica";
                user = "postgres";
                password = "CLAVE POSTGRES";
                try {
                    cn = DriverManager.getConnection(url, user, password);
                    if (cn != null) {
                        JOptionPane.showMessageDialog(null, "Base de Datos conectada. \n" + cn.toString());
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error" + e.toString());
                    System.exit(0);
                }
                break;
            case "mysql":
                url = "jdbc:mysql://localhost/clinica?useSSL=false&useTimezone=true&serverTimezone=UTC";
                user = "root";
                password = "CLAVE MYSQL";
                try {
                    cn = DriverManager.getConnection(url, user, password);
                    JOptionPane.showMessageDialog(null, "Conectado a MySql. \n" + cn.toString());
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.toString());
                    System.exit(0);
                }
                break;
        }
    }
    //validar usuario
    public boolean validar(String usuario, String clave){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("select nombre,dni from usuario");
            while (rs.next()) {
                if (rs.getString(1).equals(usuario) && rs.getString(2).equals(clave)) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    //// cita
    public Lista_cita mostrar_citas(String filtro){
        Lista_cita lista = new Lista_cita();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("select * from cita where nom_paciente like '"+filtro+"%'");
            while (rs.next()) {
                lista.add(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en mostrar las citas." + e.getMessage());
        }
        return lista;
    }
    public void eliminar_c(int codigo){
        try {
            st = cn.createStatement();
            st.executeUpdate("DELETE FROM  cita where cod_cita=" + codigo);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void actualizar_c(int cod_cita, String doctor, String correo, String fecha, String hora){
        try {
            st = cn.createStatement();
            st.executeUpdate("update cita set nom_doctor= '" + doctor + "', correo='" + correo + "', fecha='" + fecha + "', hora='" + hora + "' where cod_cita=" + cod_cita);
        } catch (Exception e) {
            System.out.println("error al actualizar el personal" + e);
        }
    }
    public void agregar_c(int cod_cita, String paciente,String doctor, String correo, String fecha, String hora){
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO cita VALUES("+cod_cita+",'" + paciente + "','" + doctor + "','" + correo + "','" + fecha + "','" + hora + "')");
        } catch (SQLException e) {
            System.out.println("error al agregar una cita " + e);
        }
    }
}
