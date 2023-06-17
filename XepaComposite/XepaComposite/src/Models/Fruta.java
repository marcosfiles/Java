package Models;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marco
 */
public class Fruta implements Produto {
    String nome;
    Double valor;

    
    
    public Fruta(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }
 
    @Override
    public void imprimir() {
        
        System.out.println( this.nome + "---"+ this.valor.toString());
        
    }
    
}
