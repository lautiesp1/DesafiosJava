/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio11;

/**
 *
 * @author lauta
 */
public class Tarea {
    private String nombre;
    private boolean completada;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }

    public void setCompletada(boolean estado) {
        this.completada = estado;
    }
    
    public boolean isCompletada() {
        return completada;
    }

    // Esto define cómo se ve la tarea en la lista visualmente
    @Override
    public String toString() {
        String estado = completada ? "[X] " : "[ ] ";
        return estado + nombre;
    }
}
