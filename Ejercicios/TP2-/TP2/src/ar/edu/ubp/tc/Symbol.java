/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.ubp.tc;

/**
 *
 * @author mauroandres
 */
public class Symbol {
    
    String key;
    String type;
    
    Symbol(String key, String type)
    {
        this.type = type;
        this.key = key;
    }
    
    String Type() { return type; }
    String Key() { return key; }
    
}
