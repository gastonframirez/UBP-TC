// Generated from C:\Users\Ramiro\Desktop\tp2v3\src\tp2v3\tp2v3.g4 by ANTLR 4.5.3
package tp2v3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link tp2v3Listener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class tp2v3BaseListener implements tp2v3Listener {
	ArrayList mapas = new ArrayList<Map>();

        int contextoActual;

        tp2v3BaseListener()
        {
            contextoActual=0;
            Map mapa = new HashMap();
            mapas.add(mapa);
        }
        
	@Override public void enterNumero(tp2v3Parser.NumeroContext ctx) { }
	@Override public void exitNumero(tp2v3Parser.NumeroContext ctx) { }
	
        @Override public void enterOperando(tp2v3Parser.OperandoContext ctx) { }
	@Override public void exitOperando(tp2v3Parser.OperandoContext ctx) { }
	
        @Override public void enterTipodato(tp2v3Parser.TipodatoContext ctx) { }
	@Override public void exitTipodato(tp2v3Parser.TipodatoContext ctx) { }
	
        @Override public void enterDeclaracionv(tp2v3Parser.DeclaracionvContext ctx) { }
	@Override public void exitDeclaracionv(tp2v3Parser.DeclaracionvContext ctx) 
        { 
            if(ctx.ID() == null)
            {
                System.out.println("Error sintactico: formato incorrecto declaracion de variable");
                return;
            }

            Variable var = new Variable("i","i");
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
            //<REVISAR SI LA ID EXISTE EN LOS MAPAS>
            int contexto = this.contextoActual;
            while(contexto>-1)
            {
                Map mapu = (HashMap) mapas.get(contexto);
                if(mapu.get(var.getid()) != null)
                {
                    System.out.println("Error semantico: variable ya existente");
                    System.exit(0); // "salir"
                }
                contexto--;
            }
            Map mapu = (HashMap) mapas.get(contextoActual);
            mapu.put(ctx.ID(0).toString(),var);
        }
	
        @Override public void enterTipofuncion(tp2v3Parser.TipofuncionContext ctx) { }
        @Override public void exitTipofuncion(tp2v3Parser.TipofuncionContext ctx) { }
	
        @Override public void enterEntrepa1(tp2v3Parser.Entrepa1Context ctx) { }
	@Override public void exitEntrepa1(tp2v3Parser.Entrepa1Context ctx) { }
	
        @Override public void enterEntrepa2(tp2v3Parser.Entrepa2Context ctx) { }
	@Override public void exitEntrepa2(tp2v3Parser.Entrepa2Context ctx) { }
	
        @Override public void enterRet(tp2v3Parser.RetContext ctx) { }
	@Override public void exitRet(tp2v3Parser.RetContext ctx) { }
	
        @Override public void enterLlamadofunc(tp2v3Parser.LlamadofuncContext ctx) { }
	@Override public void exitLlamadofunc(tp2v3Parser.LlamadofuncContext ctx) 
        { 
            //<check: existencia de la funcion>
            int contexto = contextoActual;
            int encontrado = 0;
            Funcion funcion = null;
            while(contexto>-1 || encontrado==1)
            {
                Map mapu = (HashMap) mapas.get(contexto);
                if(mapu.get(ctx.ID().toString()) != null)
                { 
                    if(mapu.get(ctx.ID().toString()) instanceof Funcion ) // "si esto que encontre es una funcion"
                    {
                         encontrado = 1;
                         funcion = (Funcion) mapu.get(ctx.ID().toString());
                    }
                }

                contexto--;
            }

            if(encontrado == 0)
            {
                System.out.println("Error semantico: funcion no declarada");
                return;
            }
            //</check: existencia de la funcion>

            //<check: llamado funcion - parametros>         
            //recuperamos el prototipo de los parametros de la funcion
            ArrayList params = funcion.getParam();

            //variables para el analisis de cada ID de cada parametro
            tp2v3Parser.Entrepa1Context recu = ctx.entrepa1();
            int i = 0; //iterador del parametro que estamos analizando
            contexto = contextoActual;
            Variable var = null;
            while(recu != null)
            {
                if(recu.operando().ID() != null) // "si hay una siguiente ID"
                {
                    encontrado = 0;
                    while(contexto>-1 || encontrado==1) // busqueda de la ID en el mapa
                    {
                        Map mapu = (HashMap) mapas.get(contexto); // "obtener el mapa del contexto"
                        if(mapu.get(recu.operando().ID().toString()) != null) // "si encuentro algo con el nombre que me interesa en el mapa"
                        { 
                            if(mapu.get(recu.operando().ID().toString()) instanceof Variable ) // "si esto que encontre es una variable"
                            {
                               encontrado = 1;
                               var = (Variable) mapu.get(recu.operando().ID().toString()); // recuepero la variable
                            }
                        }
                        contexto--; // "revisar el siguiente contexto"

                    }

                    if(encontrado == 0) // "si no encontre la variable en la tabla"
                    {
                        System.out.println("Error: Variable no declarada");
                        System.exit(0); // "salir"
                    }
                    Variable par = (Variable)params.get(i);
                    if(par == null) // solo entra aca en el caso que se ingresen mas IDs que parametros tenga la funcion
                    {
                        System.out.println("el prototipo de la funcion no corresponde con la llamada");
                        System.exit(0); // "salir"
                    }
                    if ( var.gettipo().equals(par.gettipo()) == false ) // "si el tipo de la variable
                    {                                                   //no correpsonde con el tipo
                                                                        //esperado por la funcion"
                         System.out.println("Error en la funcion ' " + ctx.ID().toString() + "' se esperaba un parametro del tipo " + par.gettipo() + "pero se recibio uno del tipo" + var.gettipo());
                         System.exit(0); // "salir"                                               
                    }

                }
                recu = recu.entrepa1();
            }
            //</check: llamado funcion - atributos>
        }
	
        @Override public void enterDefinicionfunc(tp2v3Parser.DefinicionfuncContext ctx) { }
	@Override public void exitDefinicionfunc(tp2v3Parser.DefinicionfuncContext ctx) 
        { 
            /*pasos a seguir:
            1- obtener la ID y tipo de funcion. 
            2- obtener los parametros de la funcion
            3- ver si la funcion ya existe en el contexto actual
            3.5a-si la funcion ya existe, revisar que no este definida, y que estemos analizando una definicion
            3.5b-si la funcion no existe, agregarla al mapa.

            */
            String tipofunc= "";

            if(ctx.ID()==null)
            {
                System.out.println("Error semantico: falta ID de funcion");
                System.exit(0); // "salir" 
            }
            String id = ctx.ID().toString();
            if(ctx.PARENTESIS1()==null)
            {
                System.out.println("Error sintactico: falta parentesis");
                System.exit(0); // "salir" 
            }

            if(!"main".equals(id)) // bandaid: entra multiples veces a "main" y termina creando un
            {                      // error. no se por que hace eso. hay que arreglarlo
                //<tipo de la funcion>
                if(ctx.tipofuncion().CHAR() != null) tipofunc = ctx.tipofuncion().CHAR().toString();
                if(ctx.tipofuncion().INT() != null) tipofunc = ctx.tipofuncion().INT().toString();
                if(ctx.tipofuncion().FLOAT() != null) tipofunc = ctx.tipofuncion().FLOAT().toString();
                if(ctx.tipofuncion().VOID() != null) tipofunc = ctx.tipofuncion().VOID().toString();
                Funcion func = new Funcion(id,tipofunc);
                //</tipo de la funcion>


                String idparam = "";
                int haycoma= 0; //bandera: para asegurarme que no pase un funcion(algo, );

                //< 2 -obtencion de los parametros de la funcion>
                tp2v3Parser.Entrepa2Context recu = ctx.entrepa2(); 
                while(recu != null)
                {
                    if(recu.tipodato()!=null && haycoma == 0) 
                    //revisa que no sea la cadena no vacia dentro de los atributos
                    {
                        
                        String tipoparam = "a"; 
                        if(recu.tipodato() == null && haycoma == 1) // tipo de dato solo puede ser null si entrepa 2 esta vacio, o 
                        {
                            System.out.println("Error: se esperaba algo despues de la ,");
                            System.exit(0); // "salir" 

                        }
                        if(recu.ID() == null ) // si falta la ID 
                        {
                            if(ctx.bloquecodigo() != null) // si hay un bloque de codigo
                            {
                                System.out.println("Error semantico: falta ID del parametro en la definicion de la funcion");
                                System.exit(0); // "salir" 
                            }
                        }
                        //<recupero el tipo del parametro de la funcion>
                        if(recu.tipodato().CHAR() != null)tipoparam = recu.tipodato().CHAR().toString();
                        if(recu.tipodato().FLOAT() != null)tipoparam = recu.tipodato().FLOAT().toString();
                        if(recu.tipodato().INT() != null)tipoparam = recu.tipodato().INT().toString();
                        if("a".equals(tipoparam)) tipoparam = "void";
                        //</recupero el tipo del parametro de la funcion>

                        if(recu.ID() != null)idparam = recu.ID().toString();
                        if(recu.ID() == null)idparam = Funcion.atributo_no_nombrado;//para casos del tipo int funcion(int,float);

                        func.addparam(new Variable(idparam,tipoparam)); // agrego el parametro a la funcion
                        haycoma=0;
                        if(recu.COMA() != null)haycoma=1;
                        recu = recu.entrepa2();
                    }
                }   
                //</ 2 -obtencion de los parametros de la funcion>

                //<3 - revisamos si la funcion existe en el contexto actual>

                int encontrado = 0;
                Funcion funcion = null;

                Map mapu = (HashMap) mapas.get(contextoActual);
                if(mapu.get(func.getNombre()) != null)
                { 
                    if(mapu.get(func.getNombre()) instanceof Funcion ) 
                    // "si esto que encontre es una funcion"
                    {
                        encontrado = 1;
                        funcion = (Funcion) mapu.get(func.getNombre());
                    }
                }
                //</ 3 -revisamos si la funcion existe en el contexto actual>

                //<3.5a -si la funcion existe...>
                if(encontrado==1)
                {
                    if(ctx.bloquecodigo() == null)
                    {
                        System.out.println("Error: funcion ya declarada");
                        System.exit(0); // "salir" 
                    }
                    if(funcion.getDefinida() == 1)
                    {
                        System.out.println("Error: funcion ya definida");
                        System.exit(0); // "salir" 
                    }
                    int long_encontrado = funcion.getParam().size();
                    int long_func = func.getParam().size();
                    if(long_encontrado != long_func) // si uno tiene mas parametros que el otro
                    {
                        System.out.println("Error en la cantidad de parametros");
                        System.exit(0); // "salir" 
                    }
                    int i=0;
                    while(i<long_func)
                    {
                        Variable param_i_funcion = (Variable)funcion.getParam().get(i);
                        Variable param_i_func = (Variable)func.getParam().get(i);
                        if(!param_i_funcion.gettipo().equals(param_i_funcion.gettipo())) 
                        // si los tipos no son iguales
                        {
                            System.out.println("Error en los parametros");
                            System.exit(0); // "salir" 
                        }
                        if(! param_i_funcion.getid().equals(Funcion.atributo_no_nombrado) ) 
                        // "si el atributo tiene nombre"
                        {
                            if(! param_i_funcion.getid().equals(param_i_func.getid())) 
                            // "si los nombres son distintos"
                            {
                                System.out.println("Error en los parametros");
                                System.exit(0); // "salir"
                            }
                        }
                        i++;
                    }
                }
                //</3.5a -si la funcion existe...>

                //<3.5b -si la funcion no existe...>
                if(encontrado==0)
                {
                    mapu.put(func.getNombre(),func);
                }
                //</3.5b - si la funcion no existe...>
            }
        }
	
        @Override public void enterOperador(tp2v3Parser.OperadorContext ctx) { }
	@Override public void exitOperador(tp2v3Parser.OperadorContext ctx) { }
	
        @Override public void enterOperacion(tp2v3Parser.OperacionContext ctx) { }
	@Override public void exitOperacion(tp2v3Parser.OperacionContext ctx) { }
	
        @Override public void enterListaop(tp2v3Parser.ListaopContext ctx) { }
	@Override public void exitListaop(tp2v3Parser.ListaopContext ctx) { }
	
        @Override public void enterListaoperror(tp2v3Parser.ListaoperrorContext ctx) { }
	@Override public void exitListaoperror(tp2v3Parser.ListaoperrorContext ctx) 
        { 
            System.out.println("Error sintactico: exceso de operadores");
            return;
        }
	
        @Override public void enterDefinicionv(tp2v3Parser.DefinicionvContext ctx) { }
	@Override public void exitDefinicionv(tp2v3Parser.DefinicionvContext ctx) 
        { 
            if(ctx.MAS(2) != null || ctx.MENOS(2) != null)
            {
                System.out.println("Error sintactico: operadores en exceso");
                System.exit(0); // "salir" 
            }

            if(ctx.operador(1) != null)
            {
                System.out.println("Error sintactico: operadores en exceso");
                System.exit(0); // "salir"  
            }

            if(ctx.MAS(1) != null && (ctx.operador() != null || ctx.IGUAL() != null))
            {
                System.out.println("Error sintactico: operadores en exceso");
                System.exit(0); // "salir"  
            }

            if(ctx.MENOS(1) != null && (ctx.operador() != null || ctx.IGUAL() != null))
            {
                System.out.println("Error sintactico: operadores en exceso");
                System.exit(0); // "salir" 
            }

            if(ctx.IGUAL(1) != null)
            {
                System.out.println("Error sintactico: operadores en exceso");
                System.exit(0); // "salir" 
            }

            if(absolute_finder(ctx.ID().toString()) == null) // si no existe la variable
            {
                System.out.println("Error semantico: variable no existe");
                System.exit(0); // "salir" 
            }

            if(absolute_finder(ctx.ID().toString()) instanceof Funcion) // si la ID le pertenece a una funcion
            {
                System.out.println("Error: la ID es de una funcion");
                System.exit(0); // "salir" 
            }

            if(ctx.operacion() != null) // en caso de una operacion...
            {
                //<obtenemos la id de la funcion a definir>
                Variable var_def = (Variable)absolute_finder(ctx.ID().toString()); // Puedo hacer esto, por que ya esta controlado que la ID le pertenece a una variable
                //</obtenemos la id de la funcion a definir>

                if(ctx.operacion().listaoperror()!= null && ctx.operacion().operando()!=null)
                {
                    System.out.println("Error sintactico: exceso de operadores");
                    System.exit(0); // "salir" 
                }

                tp2v3Parser.OperacionContext ope = ctx.operacion(); //si estamos aqui, operacion es no null
                tp2v3Parser.ListaopContext lisop = null;

                Object auxiliar=null;
                Variable var2;
                do
                {
                    if(ope.operando().ID() != null) // si el siguiente operando es una ID
                    {
                        auxiliar=absolute_finder(ope.operando().ID().toString());
                        if(auxiliar == null) // si no se encontro el operador en ningun mapa
                        {
                            System.out.println("Error: operadondo no encontrado.");
                            System.exit(0); // "salir" 
                        }
                        if(auxiliar instanceof Funcion)//si la ID corresponde a una funcion
                        {
                            System.out.println("Error: uso de funciones como operando no soportado.");
                            System.exit(0); // "salir" 
                        }
                        var2 = (Variable)auxiliar; //ya vimos que auxiliar existe, y que no es una funcion, por lo que debe ser una variable
                        if(!var_def.gettipo().equals(var2.gettipo())) // "si son de tipos distintos"
                        {
                            System.out.println("Error: se esperaba un operando del tipo " + var_def.gettipo() + "pero se obtuvo uno del tipo" + var2.gettipo());
                            System.exit(0); // "salir" 
                        }
                    }   
                    lisop = ope.listaop(); 
                }while(lisop != null);
                //si llegamos hasta aca, la operacion fue exitosa, por lo tanto
                var_def.setInicializado(1);
            }

        }
	
        @Override public void enterCond(tp2v3Parser.CondContext ctx) { }
	@Override public void exitCond(tp2v3Parser.CondContext ctx) 
        { 
            if(ctx.operando(0) == null || ctx.operando(1)==null)
            {   
                System.out.println("Error semantico: variable inexistente");
                System.exit(0); // "salir"
            }

            //el operando(0) puede ser una ID, un INT o un FLOAT, revisemos eso
            String tipo_operando_0 = "";
            Variable var0 = null;


            if(ctx.operando(0).numero() != null) // el operando es un numero
            {
                if(ctx.operando(0).numero().NUMERO() != null){ tipo_operando_0 = "int";}
                else {tipo_operando_0 = "float";}
            }
            else // el operando es una ID
            {
                var0 = absolute_Variable_finder(ctx.operando(0).ID().toString());
                if(var0 == null) // la ID corresponde a una funcion
                {
                    System.out.println("Error: la id corresponde a una funcion");
                    System.exit(0); // "salir"
                }
                if(var0.getInicializado() == 0)
                {
                    System.out.println("Warning: variable no inicializada");
                }
                tipo_operando_0=var0.gettipo();
            }

            //igual con el operador(1)
            String tipo_operando_1="";
            Variable var1= null;
            if(ctx.operando(1).numero() != null) // el operando es un numero
            {
                if(ctx.operando(1).numero().NUMERO() != null){ tipo_operando_1 = "int";}
                else {tipo_operando_1 = "float";}
            }
            else // el operando es una ID
            {
                var1 = absolute_Variable_finder(ctx.operando(1).ID().toString());
                if(var1 == null) // la ID corresponde a una funcion
                {
                    System.out.println("Error: la id corresponde a una funcion");
                    System.exit(0); // "salir"
                }
                if(var1.getInicializado() == 0)
                {
                    System.out.println("Warning: variable no inicializada");
                }
                tipo_operando_1=var1.gettipo();
            }

            if(!tipo_operando_0.equals(tipo_operando_1)) //distinto tipo de variable
            {
                System.out.println("Error semantico: variables son de distinto tipo");
                System.exit(0); // "salir"
            }
        }
	
        @Override public void enterConds(tp2v3Parser.CondsContext ctx) { }
	@Override public void exitConds(tp2v3Parser.CondsContext ctx) { }
	
        @Override public void enterCodigo(tp2v3Parser.CodigoContext ctx) { }
	@Override public void exitCodigo(tp2v3Parser.CodigoContext ctx)
        { 
            if(ctx.PUNTOYCOMA()==null)
            {
                System.out.println("Error sintactico: Falta punto y coma");
                System.exit(0); // "salir"
            }
        }
	
        @Override public void enterBloquecodigo(tp2v3Parser.BloquecodigoContext ctx) 
        {          
            if(ctx.LLAVE1()!=null)
            {
                contextoActual++;
                Map mapa = new HashMap();
                mapas.add(mapa);
            }

            if(ctx.LLAVE2()!=null)
            {
                mapas.remove(mapas.get(contextoActual));
                contextoActual--;
            }
            
        }
	@Override public void exitBloquecodigo(tp2v3Parser.BloquecodigoContext ctx) { }
	
        @Override public void enterIfcond(tp2v3Parser.IfcondContext ctx) { }
	@Override public void exitIfcond(tp2v3Parser.IfcondContext ctx) 
        { 
            if(ctx.PARENTESIS1() == null)
            {
                System.out.println("Error: se esperaba un parentesis");
                System.exit(0); // "salir"
            }

            if(ctx.ins()==null && ctx.bloquecodigo() == null)
            {
                System.out.println("Error: se esperaba una instruccion");
                System.exit(0); // "salir"
            }
        }
	
        @Override public void enterElsecond(tp2v3Parser.ElsecondContext ctx) { }
	@Override public void exitElsecond(tp2v3Parser.ElsecondContext ctx) 
        { 
            if(ctx.ins()==null && ctx.bloquecodigo() == null)
            {
                System.out.println("Error: se esperaba una instruccion");
                System.exit(0); // "salir"
            }
        }
	
        @Override public void enterForloop(tp2v3Parser.ForloopContext ctx) { }
	@Override public void exitForloop(tp2v3Parser.ForloopContext ctx) 
        { 
            if(ctx.PARENTESIS1() == null)
            {
                    System.out.println("Error: se esperaba un parentesis");
                    System.exit(0); // "salir"
            }

            if(ctx.ins()==null && ctx.bloquecodigo() == null)
            {
                System.out.println("Error: se esperaba una instruccion");
                System.exit(0); // "salir"
            }
        }
	
        @Override public void enterWhileloop(tp2v3Parser.WhileloopContext ctx) { }
	@Override public void exitWhileloop(tp2v3Parser.WhileloopContext ctx) 
        { 
            if(ctx.PARENTESIS1() == null)
            {

                    System.out.println("Error: se esperaba un parentesis");
                    System.exit(0); // "salir"
            }

            if(ctx.ins()==null && ctx.bloquecodigo() == null)
            {
                System.out.println("Error: se esperaba una instruccion");
                System.exit(0); // "salir"
            }
        }
	
        @Override public void enterIns(tp2v3Parser.InsContext ctx) { }
	@Override public void exitIns(tp2v3Parser.InsContext ctx) { }
	
        @Override public void enterInstruccion(tp2v3Parser.InstruccionContext ctx) { }
	@Override public void exitInstruccion(tp2v3Parser.InstruccionContext ctx) 
        { 
            if(ctx.PUNTOYCOMA()==null)
            {
                System.out.println("Error sintactico: Falta punto y coma");
                System.exit(0);
            }
        }

        @Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
        
        Object absolute_finder(String a_encontrar)
        {/*"""absolute_finder busca la ID de a_encontrar en todos los mapas, y devuelve lo encontrado
          toma como prioridad los mapas de mayor contexto."""*/

            int contexto = contextoActual;
            Map mapu = (HashMap) mapas.get(contexto);
            while(contexto>-1)
            {
                if(mapu.get(a_encontrar) != null) return mapu.get(a_encontrar);
                contexto--;
                mapu = (HashMap) mapas.get(contexto);
            }

            return null;
        } 

        Variable absolute_Variable_finder(String a_encontrar)
        {/*"""absolute_finder busca la ID de a_encontrar en todos los mapas, y devuelve lo encontrado
              solo si lo encontrado es una variable.toma como prioridad los mapas de mayor contexto."""*/

            int contexto = contextoActual;
            Map mapu = (HashMap) mapas.get(contexto);
            while(contexto>-1)
            {
                if(mapu.get(a_encontrar) != null)
                {
                    if(mapu.get(a_encontrar) instanceof Variable){return (Variable)mapu.get(a_encontrar);}
                }
                contexto--;
                mapu = (HashMap) mapas.get(contexto);
            }

            return null;
        } 

        Funcion absolute_Funcion_finder(String a_encontrar)
        {/*"""absolute_finder busca la ID de a_encontrar en todos los mapas, y devuelve lo encontrado
              solo si lo encontrado es una Funcion.toma como prioridad los mapas de mayor contexto."""*/

            int contexto = contextoActual;
            Map mapu = (HashMap) mapas.get(contexto);
            while(contexto>-1)
            {
                if(mapu.get(a_encontrar) != null)
                {
                    if(mapu.get(a_encontrar) instanceof Funcion){return (Funcion)mapu.get(a_encontrar);}
                }
                contexto--;
                mapu = (HashMap) mapas.get(contexto);
            }

            return null;
        } 
}