/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cervejasfacade;
import Models.*;
import Facade.*;

/**
 *
 * @author marco
 */
public class CervejasFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ales  cervejasAles   = new Ales();
        Lagers cervejasLagers = new Lagers();
        cervejasAles.produzirAle();
        cervejasAles.produzirPorter();
        cervejasAles.produzirStout();
        cervejasAles.produzirTrigo();
        
        System.out.println("\n\n");
        cervejasLagers.produzirLager();
        cervejasLagers.produzirMunich();
        cervejasLagers.produzirVienna();
        
    }
    
}
