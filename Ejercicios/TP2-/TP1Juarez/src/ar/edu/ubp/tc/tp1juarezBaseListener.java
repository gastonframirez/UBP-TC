// Generated from C:\Users\mauroandres\Documents\NetBeansProjects\TP1Juarez\src\ar\edu\u005Cubp\tc\tp1juarez.g4 by ANTLR 4.5.3
package ar.edu.ubp.tc;

import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link tp1juarezListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class tp1juarezBaseListener implements tp1juarezListener {
    ArrayList<HashMap<String, Symbol>> variables = new ArrayList<>();
    HashMap<String, Func> funciones = new HashMap<>();
    
    @Override public void enterVtype(tp1juarezParser.VtypeContext ctx) { }
    @Override public void exitVtype(tp1juarezParser.VtypeContext ctx) { }

    @Override public void enterVal(tp1juarezParser.ValContext ctx) { }
    @Override public void exitVal(tp1juarezParser.ValContext ctx) { CheckID(ctx); }

    @Override public void enterDec(tp1juarezParser.DecContext ctx) {}
    @Override public void exitDec(tp1juarezParser.DecContext ctx) { AddVariable(ctx); }

    @Override public void enterFtype(tp1juarezParser.FtypeContext ctx) { }
    @Override public void exitFtype(tp1juarezParser.FtypeContext ctx) { }

    @Override public void enterArg(tp1juarezParser.ArgContext ctx) { }
    @Override public void exitArg(tp1juarezParser.ArgContext ctx) 
    { 
        if (ctx.ftype() != null && ctx.ID() != null)
            AddVariable(ctx.ID().toString(), ctx.ftype().getText());
    }

    @Override public void enterRet(tp1juarezParser.RetContext ctx) { }
    @Override public void exitRet(tp1juarezParser.RetContext ctx) { }

    @Override public void enterFunc(tp1juarezParser.FuncContext ctx) { NewVariable(); }
    @Override public void exitFunc(tp1juarezParser.FuncContext ctx)
    {
        ArrayList<String> args = new ArrayList<>();
        tp1juarezParser.ArgContext myCtx = ctx.arg();
        if (ctx.ftype() != null)
        {
            if (ctx.cblock() == null)
            {
                while (myCtx != null)
                {
                    args.add(myCtx.ftype().getText());
                    myCtx = myCtx.arg();
                }
                funciones.put(ctx.ID().toString(), new Func(ctx.ID().toString(), ctx.ftype().getText(), args));
            }
            else if (funciones.containsKey(ctx.ID().toString()))
            {
                int i = 0;
                while (myCtx != null)
                {
                    args.add(myCtx.ftype().getText());
                    if (args.size() > funciones.get(ctx.ID().toString()).Types().size())
                    {
                        System.out.println("la cantidad de parametros utilizados no coincide con la cantidad declarados");
                        break;
                    }
                    if (!myCtx.ftype().getText().equals(funciones.get(ctx.ID().toString()).Types().get(i)))
                        System.out.println("el tipo del parametro no coincide con el tipo declarado");
                    i++;
                    myCtx = myCtx.arg();
                }
            }
        }
        else if (funciones.containsKey(ctx.ID().toString()))
        {
            int i = 0;
            while (myCtx != null)
            {
                if ((i + 1) > funciones.get(ctx.ID().toString()).Types().size())
                {
                    System.out.println("la cantidad de argumentos ingresados no coincide con la cantidad declarados");
                    break;
                }
                if (!MyType(myCtx.ID().toString()).equals(funciones.get(ctx.ID().toString()).Type()))
                    System.out.println("el tipo de argumento no coincide con el declarado");
                i++;
                myCtx = myCtx.arg();
            }
        }
        else
            System.out.println("la funcion no ha sido declarada");
        RemoveVariable();
    }

    @Override public void enterCondition(tp1juarezParser.ConditionContext ctx) { }
    @Override public void exitCondition(tp1juarezParser.ConditionContext ctx) { }

    @Override public void enterConditions(tp1juarezParser.ConditionsContext ctx) { }
    @Override public void exitConditions(tp1juarezParser.ConditionsContext ctx) { }

    @Override public void enterIfc(tp1juarezParser.IfcContext ctx) { }
    @Override public void exitIfc(tp1juarezParser.IfcContext ctx) { }
    
    @Override public void enterElsec(tp1juarezParser.ElsecContext ctx) { }
    @Override public void exitElsec(tp1juarezParser.ElsecContext ctx) { }

    @Override public void enterForc(tp1juarezParser.ForcContext ctx) { NewVariable(); }
    @Override public void exitForc(tp1juarezParser.ForcContext ctx) { RemoveVariable(); }

    @Override public void enterWhilec(tp1juarezParser.WhilecContext ctx) { NewVariable(); }
    @Override public void exitWhilec(tp1juarezParser.WhilecContext ctx) { RemoveVariable(); }

    @Override public void enterOperator(tp1juarezParser.OperatorContext ctx) { }
    @Override public void exitOperator(tp1juarezParser.OperatorContext ctx) { }

    @Override public void enterOperation(tp1juarezParser.OperationContext ctx) { }
    @Override public void exitOperation(tp1juarezParser.OperationContext ctx) { }

    @Override public void enterOperations(tp1juarezParser.OperationsContext ctx) { }
    @Override public void exitOperations(tp1juarezParser.OperationsContext ctx) { }

    @Override public void enterOps(tp1juarezParser.OpsContext ctx) { }
    @Override public void exitOps(tp1juarezParser.OpsContext ctx) { }

    @Override public void enterCode(tp1juarezParser.CodeContext ctx) {}
    @Override public void exitCode(tp1juarezParser.CodeContext ctx) {}

    @Override public void enterCblock(tp1juarezParser.CblockContext ctx) { NewVariable(); }
    @Override public void exitCblock(tp1juarezParser.CblockContext ctx) { RemoveVariable(); }

    @Override public void enterInstr(tp1juarezParser.InstrContext ctx) { }
    @Override public void exitInstr(tp1juarezParser.InstrContext ctx) {}

    @Override public void enterInstruction(tp1juarezParser.InstructionContext ctx) { NewVariable(); }
    @Override public void exitInstruction(tp1juarezParser.InstructionContext ctx) { RemoveVariable(); }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }
    @Override public void visitErrorNode(ErrorNode node) { }
    
    boolean IsKey(String key)
    {
        for (int i = (variables.size() - 1); i >= 0; i--)
        {
            if (variables.get(i).containsKey(key))
            {
                variables.get(i).get(key).Use();
                return true;
            }
        }
        return false;
    }
    
    String MyType(String key)
    {
        for (int i = (variables.size() - 1); i > 0; i--)
        {
            if (variables.get(i).containsKey(key))
                return variables.get(i).get(key).Type();
        }
        return "quak";
    }
    
    void NewVariable()
    {
        variables.add(new HashMap<>());
    }
    
    void RemoveVariable()
    {
        for(String key : variables.get(variables.size() - 1).keySet())
        {
            if (!variables.get(variables.size() - 1).get(key).IsUsed())
                System.out.println("la variable -" + key + "- ha sido declarada pero no ha sido utilizada");
        }
        variables.remove(variables.size() - 1);
    }
    
    void AddVariable(tp1juarezParser.DecContext ctx)
    {
        for (int i = 0; i < ctx.ID().size(); i++)
        {
            if (!variables.get(variables.size() - 1).containsKey(ctx.ID(i).toString()))
                variables.get(variables.size() - 1).put(ctx.ID(i).toString(), new Symbol(ctx.ID(i).toString(), ctx.vtype().getText()));
            else
                System.out.println("la variable -" + ctx.ID(i).toString() + "- ya ha sido declarada en este contexto");
        }
    }
    
    void AddVariable(String id, String type)
    {
        if (!variables.get(variables.size() - 1).containsKey(id))
            variables.get(variables.size() - 1).put(id, new Symbol(id, type));
        else
            System.out.println("la variable -" + id + "- ya ha sido declarada en este contexto");
    }
    
    void CheckID(tp1juarezParser.ValContext ctx)
    {
        if (ctx.ID() == null)
            return;
        if (IsKey(ctx.ID().toString()))
            return;
        System.out.println("la variable -" + ctx.ID().toString() + "- no existe");
    }
    
}