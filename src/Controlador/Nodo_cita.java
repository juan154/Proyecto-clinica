package Controlador;

import Modelo.Conexion;

public class Nodo_cita {
    Nodo_cita sig;
    int cod_cita;
    String paciente,doctor,correo,fecha,hora;
     public Nodo_cita(int cod_cita, String paciente, String doctor, String correo, String fecha, String hora) {
        this.cod_cita = cod_cita;
        this.paciente = paciente;
        this.doctor = doctor;
        this.correo = correo;
        this.fecha = fecha;
        this.hora = hora;
        this.sig = this;
    }           

    public int getCod_cita() {
        return cod_cita;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setSig(Nodo_cita sig) {
        this.sig = sig;
    }

    public void setCod_cita(int cod_cita) {
        this.cod_cita = cod_cita;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Nodo_cita getSig() {
        return sig;
    }
   
}
