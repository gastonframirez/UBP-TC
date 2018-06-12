// Generated from C:\Users\Ramiro\Desktop\tp2tc\src\tp2tc\tp2tc.g4 by ANTLR 4.5.3
package tp2tc;

import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link tp2tcListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class tp2tcBaseListener implements tp2tcListener {
    
        Map tabla;
        
        tp2tcBaseListener()
        {
            tabla= new HashMap();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumero(tp2tcParser.NumeroContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumero(tp2tcParser.NumeroContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperando(tp2tcParser.OperandoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperando(tp2tcParser.OperandoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTipodato(tp2tcParser.TipodatoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTipodato(tp2tcParser.TipodatoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDefinicionv(tp2tcParser.DefinicionvContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDefinicionv(tp2tcParser.DefinicionvContext ctx) 
        { 
            Variable var= new Variable("i","i");
            if(ctx.INT()!= null)
            {
                var.setid(ctx.ID(0).toString());
                var.settipo("int");
            }
            
            if(ctx.FLOAT()!= null)
            {
                var.setid(ctx.ID(0).toString());
                var.settipo("float");
            }
            
            if(ctx.CHAR()!= null)
            {
                var.setid(ctx.ID(0).toString());
                var.settipo("char");
            }
            
            if(ctx.IGUAL() != null)
            {
                var.setInicializado(1);
            }
            
            if(tabla.get(var.getid()) == null) /*PREGUNTAR SI ESTA BIEN */ //lalalala - RAMIRO
            {
                tabla.put(ctx.ID(0), var);
            }
            else
            {
                System.out.println("Error semantico: variable ya existente");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTipofuncion(tp2tcParser.TipofuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTipofuncion(tp2tcParser.TipofuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEntrepa1(tp2tcParser.Entrepa1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEntrepa1(tp2tcParser.Entrepa1Context ctx) //falta recursividad
        { 
            Variable var = (Variable)tabla.get(ctx.ID().toString());
            if(var.getInicializado()==0)
            {
                System.out.println("Error semantico: variable no inicilializada");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEntrepa2(tp2tcParser.Entrepa2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEntrepa2(tp2tcParser.Entrepa2Context ctx) 
        { 
            String tipo = ctx.tipodato().toString();
            
            
            
            
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEntrepa3(tp2tcParser.Entrepa3Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEntrepa3(tp2tcParser.Entrepa3Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLlamadofunc(tp2tcParser.LlamadofuncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLlamadofunc(tp2tcParser.LlamadofuncContext ctx) 
        { 
            Funcion func = (Funcion)tabla.get(ctx.ID().toString());
            if(func.getDeclarada()==0)
            {
                System.out.println("Error semantico: funcion no declarada");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDefinicionfunc(tp2tcParser.DefinicionfuncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDefinicionfunc(tp2tcParser.DefinicionfuncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclaracionfunc(tp2tcParser.DeclaracionfuncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclaracionfunc(tp2tcParser.DeclaracionfuncContext ctx) 
        { 
            String id = ctx.func().ID().toString();
            String tipofunc= "";
            
            if(!"main".equals(id)) // bandaid: entra multiples veces a "main" y termina creando un
            {                      // error. no se por que hace eso. hay que arreglarlo
                if(ctx.tipofuncion().CHAR() != null)tipofunc = ctx.tipofuncion().CHAR().toString();
                if(ctx.tipofuncion().INT() != null)tipofunc = ctx.tipofuncion().INT().toString();
                if(ctx.tipofuncion().FLOAT() != null)tipofunc = ctx.tipofuncion().FLOAT().toString();
                if(ctx.tipofuncion().VOID() != null)tipofunc = ctx.tipofuncion().VOID().toString();
                Funcion func = new Funcion(id,tipofunc);
                String tipoparam = "a"; 
                String idparam = "";
                
                tp2tcParser.Entrepa2Context var = ctx.func().entrepa2();
                while(var != null)
                {
                    if(var.tipodato().CHAR() != null)tipoparam = var.tipodato().CHAR().toString();
                    if(var.tipodato().FLOAT() != null)tipoparam =var.tipodato().FLOAT().toString();
                    if(var.tipodato().INT() != null)tipoparam =var.tipodato().INT().toString();
                    if("a".equals(tipoparam)) tipoparam = "void";
                    // rant time: en "entrepa" puede ir un ID solo, como si estubiese llamando
                    // una funcion, o puede ir un tipo de dato seguido de una ID, como si 
                    // estubiece declarandola. problemas de comunicacion del grupo. hay que
                    // arreglar ese problema. como solucion "band-aid", simplemente si el parametro
                    // no tiene tipo se le asigna el tipo "void".
                    idparam= var.ID().toString();
                    func.addparam(new Variable(idparam,tipoparam));
                    var = var.entrepa2();
                }
                func.setDeclarada(1); //revisar si esta bien asi - RAMIRO
                tabla.put(id,func);
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc(tp2tcParser.FuncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc(tp2tcParser.FuncContext ctx) 
        { 
            Funcion func = (Funcion)tabla.get(ctx.ID().toString());
            if(func.getDeclarada()==0)
            {
                System.out.println("Error semantico: funcion no declarada");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperador(tp2tcParser.OperadorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperador(tp2tcParser.OperadorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperacion(tp2tcParser.OperacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperacion(tp2tcParser.OperacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterListaop(tp2tcParser.ListaopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitListaop(tp2tcParser.ListaopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclaracionv(tp2tcParser.DeclaracionvContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclaracionv(tp2tcParser.DeclaracionvContext ctx) 
        { 
            if(tabla.get(ctx.ID())==null)
            {
                System.out.println("Error semantico: variable no existe");
                return;
            }
            
            if(ctx.operacion() != null)
            {
                Variable var1 = (Variable)ctx.ID();
                Variable var2 = (Variable)tabla.get(ctx.operacion().operando().ID().toString());
                if(var1.gettipo().equals(var2.gettipo()))
                {
                    Variable var = (Variable)tabla.get(ctx.ID().toString());
                    var.setInicializado(1);
                    tabla.remove(ctx.ID().toString());
                    tabla.put(var.getid(), var);
                }
                else
                {
                    System.out.println("Error semantico: variables son de distinto tipo");
                    return;   
                }
                
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCond(tp2tcParser.CondContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCond(tp2tcParser.CondContext ctx) 
        { 
            Variable var1 = (Variable)tabla.get(ctx.operando(0).ID().toString());
            Variable var2 = (Variable)tabla.get(ctx.operando(1).ID().toString());
            
            if(var1.getInicializado()==0 || var2.getInicializado()==0)
            {
                System.out.println("Error semantico: variable no inicilializada");
                return;
            }    
            
            if(!var1.gettipo().equals(var2.gettipo())) //distinto tipo de variable
            {
                System.out.println("Error semantico: variables son de distinto tipo");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConds(tp2tcParser.CondsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConds(tp2tcParser.CondsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCodigo(tp2tcParser.CodigoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCodigo(tp2tcParser.CodigoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBloquecodigo(tp2tcParser.BloquecodigoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBloquecodigo(tp2tcParser.BloquecodigoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfcond(tp2tcParser.IfcondContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfcond(tp2tcParser.IfcondContext ctx) 
        { 
            tp2tcParser.CondsContext recur = ctx.conds();
            while(recur != null)
            {
                //<analisis del cond>
                if(recur.cond().operando(0).ID() != null)
                {
                    Variable var = (Variable)tabla.get(recur.cond().operando(0).ID().toString());
                    if(var.getInicializado()==0)
                    {
                        System.out.println("Error semantico: variable no inicilializada");
                        return;
                    }
                    if(tabla.get(recur.cond().operando(0).ID()) == null)
                    {
                        System.out.println("Error semantico: no existe la ID");
                    }
                    if(tabla.get(recur.cond().operando(1).ID()) == null)
                    {
                        System.out.println("Error semantico: no existe la ID");
                    }
                }
                //<analisis del cond>
                
                recur = recur.conds();
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgif(tp2tcParser.ArgifContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgif(tp2tcParser.ArgifContext ctx) 
        { 
            Variable var = (Variable)tabla.get(ctx.conds().cond().operando(0).ID().toString());
            if(var.getInicializado()==0)
            {
                System.out.println("Error semantico: variable no inicilializada");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForloop(tp2tcParser.ForloopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForloop(tp2tcParser.ForloopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgfor(tp2tcParser.ArgforContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgfor(tp2tcParser.ArgforContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhileloop(tp2tcParser.WhileloopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhileloop(tp2tcParser.WhileloopContext ctx) 
        { 
            tp2tcParser.CondsContext recur = ctx.conds();
            while(recur != null)
            {
                //<analisis del cond>
                if(recur.cond().operando(0).ID() != null)
                {
                    if(tabla.get(recur.cond().operando(0).ID()) == null)
                    {
                        System.out.println("Error semantico: no existe la ID");
                    }
                    if(tabla.get(recur.cond().operando(1).ID()) == null)
                    {
                        System.out.println("Error semantico:  no existe la ID");
                    }
                }
                //<analisis del cond>
                
                recur = recur.conds();
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgwhile(tp2tcParser.ArgwhileContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgwhile(tp2tcParser.ArgwhileContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIns(tp2tcParser.InsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIns(tp2tcParser.InsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArginst(tp2tcParser.ArginstContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArginst(tp2tcParser.ArginstContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInstruccion(tp2tcParser.InstruccionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInstruccion(tp2tcParser.InstruccionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDefinicionverror(tp2tcParser.DefinicionverrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDefinicionverror(tp2tcParser.DefinicionverrorContext ctx) 
        { 
            if(ctx.INT()==null || ctx.CHAR()==null || ctx.FLOAT()==null)
            {
                System.out.println("Error sintactico: falta definir tipo de dato");
                return;
            }
            
            if(ctx.ID(0) == null)
            {
                System.out.println("Error sintactico: falta variable");
                return;
            }
            
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEntrepaerror(tp2tcParser.EntrepaerrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEntrepaerror(tp2tcParser.EntrepaerrorContext ctx) 
        { 
            System.out.println("Error sintactico: Formato incorrecto en declaracion de variables");
            return;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFuncerror(tp2tcParser.FuncerrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFuncerror(tp2tcParser.FuncerrorContext ctx) 
        { 
            if(ctx.PARENTESIS1()==null || ctx.PARENTESIS2()==null)
            {
                System.out.println("Error sintactico: Falta parentesis");
                return;   
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclaracionferror(tp2tcParser.DeclaracionferrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclaracionferror(tp2tcParser.DeclaracionferrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLlamadofuncionerror(tp2tcParser.LlamadofuncionerrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLlamadofuncionerror(tp2tcParser.LlamadofuncionerrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperacionerror(tp2tcParser.OperacionerrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperacionerror(tp2tcParser.OperacionerrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterListaoperror(tp2tcParser.ListaoperrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitListaoperror(tp2tcParser.ListaoperrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclaracionverror(tp2tcParser.DeclaracionverrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclaracionverror(tp2tcParser.DeclaracionverrorContext ctx) 
        { 
            if(ctx.ID()!= null)
            {
                if(ctx.MAS(2) != null || ctx.MENOS(2)!= null)
                {
                    System.out.println("Error sintactico: operadores en exceso");
                    return;
                }
                
                if(ctx.operador(2) != null || ctx.IGUAL(1) != null)
                {
                    System.out.println("Error sintactico: operadores en exceso");
                    return;
                }
                
                if(ctx.IGUAL(0)!= null && ctx.operacionerror()!=null)
                {
                    System.out.println("Error sintactico: operacion incorrecta");
                    return;
                }
            }
            else
            {
                System.out.println("Error semantico: variable inexistente");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConderror(tp2tcParser.ConderrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConderror(tp2tcParser.ConderrorContext ctx) 
        { 
            if(ctx.operando()== null)
            {
                System.out.println("Error semantico: variable no definida.");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondserror(tp2tcParser.CondserrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondserror(tp2tcParser.CondserrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBloquecodigoerror(tp2tcParser.BloquecodigoerrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBloquecodigoerror(tp2tcParser.BloquecodigoerrorContext ctx)
        { 
            if(ctx.LLAVE1() == null || ctx.LLAVE2() == null)
            {
                System.out.println("Error sintactico: Falta llave");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfconderror(tp2tcParser.IfconderrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfconderror(tp2tcParser.IfconderrorContext ctx) 
        { 
            System.out.println("Error sintactico: Falta parentesis");
            return;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgiferror(tp2tcParser.ArgiferrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgiferror(tp2tcParser.ArgiferrorContext ctx) 
        { 
            System.out.println("Error sintactico: Falta parentesis");
            return;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForlooperror(tp2tcParser.ForlooperrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForlooperror(tp2tcParser.ForlooperrorContext ctx) 
        { 
            if(ctx.PARENTESIS1() == null || ctx.PARENTESIS2() == null)
            {
                System.out.println("Error sintactico: Falta parentesis");
                return;
            }
            
            if(ctx.PUNTOYCOMA(0) == null || ctx.PUNTOYCOMA(1)==null)
            {
                System.out.println("Error sintactico: Falta punto y coma");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgforerror(tp2tcParser.ArgforerrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgforerror(tp2tcParser.ArgforerrorContext ctx) 
        { 
            if(ctx.PARENTESIS1() == null || ctx.PARENTESIS2() == null)
            {
                System.out.println("Error sintactico: Falta parentesis");
                return;
            }
            
            if(ctx.PUNTOYCOMA(0) == null || ctx.PUNTOYCOMA(1)==null)
            {
                System.out.println("Error sintactico: Falta punto y coma");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhilelooperror(tp2tcParser.WhilelooperrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhilelooperror(tp2tcParser.WhilelooperrorContext ctx) 
        { 
            if(ctx.PARENTESIS1() == null || ctx.PARENTESIS2() == null)
            {
                System.out.println("Error sintactico: Falta parentesis");
                return;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgwhileerror(tp2tcParser.ArgwhileerrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgwhileerror(tp2tcParser.ArgwhileerrorContext ctx) 
        { 
            if(ctx.PARENTESIS1() == null || ctx.PARENTESIS2() == null)
            {
                System.out.println("Error sintactico: Falta parentesis");
                return;
            }
        }
        
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInserror(tp2tcParser.InserrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInserror(tp2tcParser.InserrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArginserror(tp2tcParser.ArginserrorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArginserror(tp2tcParser.ArginserrorContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}