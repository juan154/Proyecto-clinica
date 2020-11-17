package Controlador;

import Modelo.Conexion;

/*
 * @author daniel
 */
public class Lista_farmacia {

    Nodo_farmacia ultimo;
    int tamanio;

    public Lista_farmacia() {
        ultimo = null;
        tamanio = 0;
    }

    public Nodo_farmacia getUltimo() {
        return ultimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setUltimo(Nodo_farmacia ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean vacio() {
        return ultimo == null;

    }

    public Lista_farmacia add(int id_farmaco, String descripcion, int cantidad, String nombre) {
        Nodo_farmacia pull = new Nodo_farmacia(id_farmaco, descripcion, cantidad, nombre);
        if (!vacio()) {
            pull.sig = ultimo.sig;
            ultimo.sig = pull;
        } else {
            ultimo = pull;
        }
        tamanio++;
        return this;
    }

    public String[][] tabla(Conexion BD, String filtro) {
        Lista_farmacia lista = new Lista_farmacia();
        lista = BD.mostrar_farmacos(filtro);
        if (!lista.vacio()) {
            String[][] datos = new String[lista.getTamanio()][6];
            Nodo_farmacia primero = lista.ultimo.sig;
            int i = 0;
            do {
                datos[i][0] = "" + primero.getId_farmaco();
                datos[i][1] = primero.getDescripcion();
                datos[i][2] = "" + primero.getCantidad();
                datos[i][3] = primero.getNombre();
                i++;
                primero = primero.sig;
            } while (primero != lista.ultimo.sig);
            return datos;
        } else {
            String Nada[][] = new String[0][0];
            return Nada;
        }
    }
}
