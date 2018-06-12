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
    boolean used;
    
    Symbol(String key, String type)
    {
        this.type = type;
        this.key = key;
        this.used = false;
    }
    
    String Type() { return this.type; }
    String Key() { return this.key; }
    void Use() { this.used = true; }
    boolean IsUsed() { return this.used; }
}
