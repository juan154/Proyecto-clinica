package Controlador;

/*
 * @author daniel
 */
public class Nodo_usuario {

    Nodo_usuario sig;
    int dni;
    String nombre;
    String correo;
    String telefono;
    String tipo_usuario;
    String estado;

    public Nodo_usuario(int dni, String nombre, String correo, String telefono, String tipo_usuario, String estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.tipo_usuario = tipo_usuario;
        this.estado = estado;
        this.sig = this;
    }

    public Nodo_usuario getSig() {
        return sig;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setSig(Nodo_usuario sig) {
        this.sig = sig;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
