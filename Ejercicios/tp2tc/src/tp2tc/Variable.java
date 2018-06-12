package tp2tc;

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
    
    
}