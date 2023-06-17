/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xepacomposite;

import Models.*;

/**
 *
 * @author marco
 */
public class XepaComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Frutas
        Fruta pera = new Fruta("Pera", 5.55);
        Fruta banana = new Fruta("Banana", 6.7);
        
        //Verduras
        Verdura Alface = new Verdura("Alface", 7.0);
        Verdura Cenoura = new Verdura("Cenoura",9.0);
        
        //Caixa de Fruta
        Xepa xepaFruta = new Xepa();
        
        xepaFruta.adicionarFruta(pera);
        xepaFruta.adicionarFruta(banana);
        xepaFruta.imprimir();
        
        System.out.println("\n"+"*********************************");
        
        //Caixa de Verdura
        
        Xepa xepaVerdura = new Xepa();
        
        xepaVerdura.adicionarVerdura(Alface);
        xepaVerdura.adicionarVerdura(Cenoura);
        xepaVerdura.imprimir();
        
        System.out.println("\n"+"*********************************");
        
        //Caixa mista 
        
        Xepa xepaMista = new Xepa();
        
        xepaMista.adicionarFruta(pera);
        xepaMista.adicionarFruta(banana);
        xepaMista.adicionarVerdura(Alface);
        xepaMista.adicionarVerdura(Cenoura);
        xepaMista.imprimir();
    }
    
}
