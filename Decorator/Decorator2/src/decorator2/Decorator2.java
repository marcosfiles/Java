/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator2;
import Modules.*;
import Decorator.Sabores;
       

/**
 *
 * @author marco
 */
public class Decorator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Choco tablete = new Tablete();
        System.out.println(tablete.getDescricao());
        Choco bombom = new Bombom();
        System.out.println(bombom.getDescricao());
        
        
        bombom = new Branco(bombom);
        System.out.println(bombom.getDescricao());
          
        
        Choco pastilha = new Pastilha();
        pastilha = new AoLeite(pastilha);
        pastilha = new MeioAmargo(pastilha);
        System.out.println(pastilha.getDescricao());
        
        
        pastilha = new Pastilha();
        pastilha = new Branco(pastilha);
        pastilha = new AoLeite(pastilha);
        pastilha = new MeioAmargo(pastilha);
        System.out.println(pastilha.getDescricao());
    }
    
}
