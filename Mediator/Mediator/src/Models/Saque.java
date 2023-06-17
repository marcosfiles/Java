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
public class Saque implements Caixa {
    private Queue<Integer> filaSaque = new LinkedList<>();

    @Override
    public void listaFila() {
        System.out.println("Fila Saque: " + filaSaque);
    }

    @Override
    public void redirecionar(int senha) {
        filaSaque.add(senha);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo cliente da fila Saque");
        filaSaque.poll();
    }
}

