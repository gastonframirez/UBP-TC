/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.clasesAux;

/**
 *
 * @author gframirez
 */
public class Simbolo {
    String tipoDato;
    String nombre;
    Boolean inicializada;
    Boolean usada;

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getInicializada() {
        return inicializada;
    }

    public void setInicializada(Boolean inicializada) {
        this.inicializada = inicializada;
    }

    public Boolean getUsada() {
        return usada;
    }

    public void setUsada(Boolean usada) {
        this.usada = usada;
    }
    
    @Override
    public String toString() {
        return "Tipo:" + this.tipoDato + ", " + "Nombre:" + this.nombre;
    }
    
}
