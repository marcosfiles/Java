/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modules;

import Decorator.Sabores;

/**
 *
 * @author marco
 */
public class MeioAmargo extends Sabores{
    
    public MeioAmargo(Choco chocolate) {
        super(chocolate);
    }
    
      @Override
   public String getDescricao() {
        return super.getDescricao() + "\n |-> Meio Amargo." ; 
    
}
    
}
