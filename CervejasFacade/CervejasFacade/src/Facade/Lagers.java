/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;
import Models.Lager;
import Models.Munich;
import Models.Vienna;

/**
 *
 * @author marco
 */
public class Lagers {
    private Lager lager;
    private Munich munich;
    private Vienna vienna;

    public Lagers() {
        this.lager  = new Lager();
        this.munich = new Munich();
        this.vienna = new Vienna();
                
    }
    
    public void produzirLager(){
        System.out.println("Tipo -> Lager");
        lager.produzir();
    }
    public void produzirMunich(){
        System.out.println("Tipo -> Lager");
        munich.produzir();
    }
    public void produzirVienna(){
        System.out.println("Tipo -> Lager");
        vienna.produzir();
    }
    
    
}
