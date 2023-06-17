/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author marco
 */
public class AgenciaBancaria implements Mediador {
    private Caixa poupanca;
    private Caixa saque;
    private Caixa cheque;
    private Caixa deposito;

    @Override
    public void criaFilaPoupanca(Caixa p) {
        poupanca = p;
    }

    @Override
    public void criaFilaSaque(Caixa p) {
        saque = p;
    }

    @Override
    public void criaFilaCheque(Caixa p) {
        cheque = p;
    }

    @Override
    public void criaFilaDeposito(Caixa p) {
        deposito = p;
    }

    @Override
    public void controlaFila(int fila, int senha) {
        switch (fila) {
            case 1:
                poupanca.redirecionar(senha);
                break;
            case 2:
                saque.redirecionar(senha);
                break;
            case 3:
                cheque.redirecionar(senha);
                break;
            case 4:
                deposito.redirecionar(senha);
                break;
            default:
                System.out.println("Fila inválida.");
        }
    }
}

