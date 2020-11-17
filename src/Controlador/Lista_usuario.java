package Controlador;

import Modelo.Conexion;

/*
 * @author daniel
 */
public class Lista_usuario {

    Nodo_usuario ultimo;
    int tamanio;

    public Lista_usuario() {
        ultimo = null;
        tamanio = 0;
    }

    public void setUltimo(Nodo_usuario ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Nodo_usuario getUltimo() {
        return ultimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public boolean vacio() {
        return ultimo == null;
    }

    public Lista_usuario add(int dni, String nombre, String correo, int telefono, String tipo_usuario, String estado) {
        Nodo_usuario pull = new Nodo_usuario(dni,nombre,correo,telefono,tipo_usuario,estado);
        if(!vacio()){
            pull.sig = ultimo.sig;
            ultimo.sig = pull;
        }else{
            ultimo = pull;
        }
        tamanio++;
        return this;
    }
    
    public String[][] tabla(Conexion BD, String filtro){
        Lista_usuario lista = new Lista_usuario();
        lista = BD.mostrar_usuario(filtro);
        if(!lista.vacio()){
            String [][] datos = new String[lista.getTamanio()][6];
            Nodo_usuario primero = lista.ultimo.sig;
            int i=0;
            do{
                datos[i][0]=""+primero.getDni();
                datos[i][1] = primero.getNombre();
                datos[i][2] = primero.getCorreo();
                datos[i][3] = ""+primero.getTelefono();
                datos[i][4] = primero.getTipo_usuario();
                datos[i][5] = primero.getEstado();
                i++;
                primero = primero.sig;
            }while(primero != lista.ultimo.sig);
            return datos;
        }else{
            String Nada[][]= new String[0][0];
            return Nada;
        }
    }
}
