package Controlador;

import Modelo.Conexion;

public class Lista_cita {
    Nodo_cita ultimo;
    int tamanio;

    public Lista_cita(){
        ultimo = null;
        tamanio = 0;
    }
    public Nodo_cita getUltimo() {
        return ultimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setUltimo(Nodo_cita ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    public boolean vacio(){
        return ultimo == null;
    }
    public Lista_cita add(int cod_cita, String paciente, String doctor, String correo, String fecha, String hora){
        Nodo_cita p = new Nodo_cita(cod_cita,paciente,doctor,correo,fecha,hora);
        if(!vacio()){
            p.sig = ultimo.sig;
            ultimo.sig = p;
        } else {
            ultimo = p;
        }
        tamanio++;
        return this;
    }
    public String[][] tabla(Conexion BD,String filtro){
        Lista_cita lista = BD.mostrar_citas(filtro);
        if(!lista.vacio()){
            String [][] datos = new String[lista.getTamanio()][6];
            Nodo_cita primero = lista.ultimo.sig;
            int i = 0;
            do {
                datos[i][0] = "" + primero.getCod_cita();
                datos[i][1] = primero.getPaciente();
                datos[i][2] = primero.getDoctor();
                datos[i][3] = primero.getCorreo();
                datos[i][4] = primero.getFecha();
                datos[i][5] = primero.getHora();
                i++;
                primero = primero.sig;
            } while (primero != lista.ultimo.sig);
            return datos;
        } else {
            String Sin_datos[][] = new String [0][0];
            return Sin_datos;
        }
    }
}
