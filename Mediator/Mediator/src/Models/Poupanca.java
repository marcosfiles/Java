/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author marco
 */
public class Poupanca implements Caixa {
    private Queue<Integer> filaPoupanca = new LinkedList<>();

    @Override
    public void listaFila() {
        System.out.println("Fila Poupanca: " + filaPoupanca);
    }

    @Override
    public void redirecionar(int senha) {
        filaPoupanca.add(senha);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo cliente da fila Poupança");
        filaPoupanca.poll();
    }
}

