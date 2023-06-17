/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Models;

/**
 *
 * @author marco
 */
public interface Mediador {
    void criaFilaPoupanca(Caixa p);
    void criaFilaSaque(Caixa p);
    void criaFilaCheque(Caixa p);
    void criaFilaDeposito(Caixa p);
    void controlaFila(int fila, int senha);
}
