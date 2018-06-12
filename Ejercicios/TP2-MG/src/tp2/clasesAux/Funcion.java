/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.clasesAux;

import java.util.ArrayList;

/**
 *
 * @author gframirez
 */
public class Funcion extends Simbolo{
    ArrayList<Variable> argumentos;

    public ArrayList getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(ArrayList<Variable> argumentos) {
        this.argumentos = argumentos;
    }
    
    public void addArgumento(Variable v1)
    {
        if(this.argumentos != null){
            this.argumentos.add(v1);
        }else{
            this.argumentos = new ArrayList<Variable>();
            this.argumentos.add(v1);
        }
        
    }  
    
}
