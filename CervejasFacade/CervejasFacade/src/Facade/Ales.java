/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;
import Models.Ale;
import Models.Porter;
import Models.Stout;
import Models.Trigo;


/**
 *
 * @author marco
 */
public class Ales{
    private Ale ale;
    private Porter porter;
    private Stout stout;
    private Trigo trigo;

    public Ales() {
        
        this.ale = new Ale();
        this.porter = new Porter();
        this.stout = new Stout();
        this.trigo = new Trigo();
    }
    
    public void produzirAle(){
        System.out.println("Tipo -> Ale");
        ale.produzir();
    }
    
    public void produzirPorter(){
        System.out.println("Tipo -> Ale");
        porter.produzir();
    }
    
    public void produzirStout(){
        System.out.println("Tipo -> Ale");
        stout.produzir();
    }
    
    public void produzirTrigo(){
        System.out.println("Tipo -> Ale");
        trigo.produzir();
    }
    
    
    
    
}
