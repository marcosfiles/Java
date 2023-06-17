/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototype;

import Models.*;
import java.util.ArrayList;

/**
 *
 * @author puc
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        
        
        //Construindo os pneus do carro
        Pneu pneuCarro = new Pneu("Firestrone",16);
        Pneu pneucarroClone1 = (Pneu) pneuCarro.clone();
        Pneu pneucarroClone2 = (Pneu) pneuCarro.clone();
        Pneu pneucarroClone3 = (Pneu) pneuCarro.clone();
        
        //Construindo os pneus do caminhao
        Pneu pneuCaminhao = new Pneu("Michelin",30);
        Pneu pneuCaminhaoClone1 = (Pneu) pneuCaminhao.clone();
        Pneu pneuCaminhaoClone2 = (Pneu) pneuCaminhao.clone();
        Pneu pneuCaminhaoClone3 = (Pneu) pneuCaminhao.clone();
        Pneu pneuCaminhaoClone4 = (Pneu) pneuCaminhao.clone();
        Pneu pneuCaminhaoClone5 = (Pneu) pneuCaminhao.clone();
              
      
        //Construindo os veiculos
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();
        
        //adicionando os pneus no carro
        carro.pneu = new ArrayList<>();
        carro.pneu.add(pneuCarro);
        carro.pneu.add(pneucarroClone1);
        carro.pneu.add(pneucarroClone2);
        carro.pneu.add(pneucarroClone3);
        
        
        System.out.println("PNEUS DO CARRO \n");
        System.out.println( pneuCarro.getTipo() + " - " +
                String.valueOf( pneuCarro.getAro()));
        
        System.out.println( pneucarroClone1.getTipo() + " - " +
                String.valueOf( pneucarroClone1.getAro()));
        
        System.out.println( pneucarroClone2.getTipo() + " - " +
                String.valueOf( pneucarroClone2.getAro()));
        
        System.out.println( pneucarroClone3.getTipo() + " - " +
                String.valueOf( pneucarroClone3.getAro()));        
        
        
        //Adicionando os pneus no caminhao
        caminhao.pneu = new ArrayList<>();
        caminhao.pneu.add(pneuCaminhao);
        caminhao.pneu.add(pneuCaminhaoClone1);
        caminhao.pneu.add(pneuCaminhaoClone2);
        caminhao.pneu.add(pneuCaminhaoClone3);
        caminhao.pneu.add(pneuCaminhaoClone4);
        caminhao.pneu.add(pneuCaminhaoClone5);
        
        //Imprimindo o caminhao
        
        System.out.println("++++++++++++++++++++++++++++++++++\n\n");
        System.out.println("PNEUS DO CAMINHAO");
        
        System.out.println(pneuCaminhao.getTipo() + " - " +
                String.valueOf(pneuCaminhao.getAro()));
        

        System.out.println(pneuCaminhaoClone1.getTipo() + " - " +
                String.valueOf(pneuCaminhaoClone1.getAro()));

        System.out.println(pneuCaminhaoClone2.getTipo() + " - " +
                String.valueOf(pneuCaminhaoClone2.getAro()));

        System.out.println(pneuCaminhaoClone3.getTipo() + " - " +
                String.valueOf(pneuCaminhaoClone3.getAro()));

        System.out.println(pneuCaminhaoClone4.getTipo() + " - " +
                String.valueOf(pneuCaminhaoClone4.getAro()));

        System.out.println(pneuCaminhaoClone5.getTipo() + " - " +
                String.valueOf(pneuCaminhaoClone5.getAro()));        
    }
    
}
