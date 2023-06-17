/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Xepa {
    String nome;
    Double valorTotal;
    private List<Fruta> fruta;
    private List<Verdura> verdura;

       
    public Xepa() {
        this.fruta = new ArrayList<>();
        this.verdura = new ArrayList<>();
        this.valorTotal = 0.0;
        this.nome = null;
    }
       
    public void adicionarFruta(Fruta fruta){
        this.fruta.add(fruta);        
        somarFruta(fruta);
    }
    
    public void adicionarVerdura(Verdura verdura){
        this.verdura.add(verdura);
        somarVerdura(verdura);
    }
    
    public void removerFruta(Fruta fruta){
        subtrairFruta(fruta);
        this.fruta.remove(fruta);
    }
    
    public void removerVerdura(Verdura verdura){
        
        subtrairVerdura(verdura);
        this.verdura.remove(verdura);
        
    }
 
    private void somarFruta(Fruta fruta){
        
        valorTotal = valorTotal + fruta.valor;       
    }
    
    private void somarVerdura(Verdura verdura){
        valorTotal = valorTotal + verdura.valor;
    }
    
    private void subtrairFruta(Fruta fruta){
        
        valorTotal = valorTotal - fruta.valor;       
    }
    
    private void subtrairVerdura(Verdura verdura){
        valorTotal = valorTotal - verdura.valor;
    }
    
    private String verificaTipoCaixa(){
        //caixa de verdura
        if(fruta.isEmpty()&& !(verdura.isEmpty())){
            return "caixaverdura";
            }
        
        if (verdura.isEmpty() && !(fruta.isEmpty())){
            return "caixafruta";
        }else{
            return "caixamista";
        }
    }
    
    public void imprimir(){
        
        switch(verificaTipoCaixa()){
                case "caixafruta":
                    System.out.println("* " +"Caixa de Frutas -> " + "[ Valor total = " + valorTotal.toString()+"]" );
                    for (Fruta frutas : fruta)
                        frutas.imprimir();
                    break;
                
                case "caixaverdura" :
                    System.out.println("* " +"Caixa de Verduras -> " + "[ Valor total = " + valorTotal.toString()+"]" );
                    for (Verdura verduras : verdura)
                        verduras.imprimir();
                    break;
                
                case "caixamista":
                    System.out.println("* " +"Caixa Mista -> " + "[ Valor total = " + valorTotal.toString()+"]" );
                    for (Verdura verduras : verdura)
                        verduras.imprimir();
                    for (Fruta frutas : fruta)
                        frutas.imprimir();
                    break;
                    
                default:
                    System.out.println("Vazio");
                    break;
                    
        }          
        
    }
}  
            
        
    

