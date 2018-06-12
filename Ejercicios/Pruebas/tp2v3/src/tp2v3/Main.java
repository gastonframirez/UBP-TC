/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2v3;

import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main 
{    
    public static void main(String args[]){
        try{
            
            System.out.println("Entro al try");
        }catch(Exception e){
            //cualquier error, capturamos la exception.
            e.printStackTrace();
        }
    }   
}
