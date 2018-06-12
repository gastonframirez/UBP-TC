/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.ubp.tc;

import java.util.ArrayList;

/**
 *
 * @author mauroandres
 */
public class Func {
    
    String key;
    String type;
    ArrayList<String> types = new ArrayList<>();
    
    Func(String key, String type, ArrayList types)
    {
        this.key = key;
        this.type = type;
        this.types = types;
    }
    
    String Key() { return key; }
    String Type() { return type; }
    ArrayList Types() { return types; }
    
}
