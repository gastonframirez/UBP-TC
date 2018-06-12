/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2v3;

/**
 *
 * @author Ramiro
 */
public class Variable {
    String tipo;
    int inicializado;
    String id;
    
    Variable(String id,String tipo)
    {
        this.tipo=tipo;
        this.id = id;
        this.inicializado = 0;
    }
    
    String gettipo()
    {
        return tipo;
    }
    
    void settipo(String tipo)
    {
        this.tipo=tipo;
    }
    
    String getid()
    {
        return id;
    }
    
    void setid(String tipo)
    {
        this.id=tipo;
    }
    
    int getInicializado()
    {
        return inicializado;
    }
    
    void setInicializado(int inicializado)
    {
        this.inicializado = inicializado;
    }
    
    boolean isFuncion()
    {
        return false;
    }
    
}
