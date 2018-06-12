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
public class Variable extends Simbolo{
    @Override
    public boolean equals(Object o) {
        if (o instanceof Variable) {
            if (nombre.equals(((Variable) o).nombre) && tipoDato.equals(((Variable) o).tipoDato)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
}
