/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author daniel
 */
public class Nodo_farmacia {

    Nodo_farmacia sig;
    int id_farmaco;
    String descripcion;
    int cantidad;
    String nombre;

    public Nodo_farmacia(int id_farmaco, String descripcion, int cantidad, String nombre) {
        this.id_farmaco=id_farmaco;
        this.descripcion=descripcion;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.sig=this;
    }

    public void setSig(Nodo_farmacia sig) {
        this.sig = sig;
    }

    public void setId_farmaco(int id_farmaco) {
        this.id_farmaco = id_farmaco;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo_farmacia getSig() {
        return sig;
    }

    public int getId_farmaco() {
        return id_farmaco;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

}
