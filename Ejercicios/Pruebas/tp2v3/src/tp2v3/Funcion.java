/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2v3;

import java.util.ArrayList;

/**
 *
 * @author Ramiro
 */
public class Funcion {
    ArrayList param;
    String nombre;
    String tipo;
    int declarada;
    public static final String atributo_no_nombrado = "9xily3GQ4oDi0xdziZAq"; 
    // para atributos, por ejemplo: void* thread(void*);
    
    Funcion(String tip,String nom)
    {
        tipo = tip;
        nombre = nom;
        param = new ArrayList<Variable>();
        this.declarada = 0;
    }
    
    void addparam(Variable v1)
    {
        param.add(v1);
    }
    
    void setDefinida()
    {
        this.declarada = 1;
    }
    
    int getDefinida()
    {
        return this.declarada;
    }
    
    ArrayList getParam() 
    {
        return this.param;
    }
    
    String getNombre()
    {
        return nombre;
    }

    boolean isFuncion()
    {
        return true;
    }
    
}
