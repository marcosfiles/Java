/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;
import Modules.*;

/**
 *
 * @author marco
 */
public abstract class Sabores implements Choco{
    private final Choco chocolate;

    public Sabores(Choco chocolate) {
        this.chocolate = chocolate;
        
    }
    @Override
        public String getDescricao(){
            return chocolate.getDescricao();
        }
        
   
}
