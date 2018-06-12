/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2tc;

import java.util.ArrayList;

/**import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Funcion {
    ArrayList param;
    String nombre;
    String tipo;
    int declarada;
    
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
    
    void setDeclarada(int dec)
    {
        this.declarada = dec;
    }
    
    int getDeclarada()
    {
        return this.declarada;
    }
    
    ArrayList getParam() // preguntar
    {
        ArrayList retorno = new ArrayList<Variable>();
        return retorno = this.param;
    }
    
    //una funcion que devuelva los parametros (un get) seria deseable =p
}