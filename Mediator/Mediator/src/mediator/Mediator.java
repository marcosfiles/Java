/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediator;
import Models.*;

/**
 *
 * @author marco
 */
public class Mediator {
    public static void main(String[] args) {
        // Criando os caixas
        Caixa poupanca = new Poupanca();
        Caixa saque = new Saque();
        Caixa cheque = new Cheque();
        Caixa deposito = new Deposito();

        // Criando o mediador e vinculando os caixas
        Mediador mediador = new AgenciaBancaria();
        mediador.criaFilaPoupanca(poupanca);
        mediador.criaFilaSaque(saque);
        mediador.criaFilaCheque(cheque);
        mediador.criaFilaDeposito(deposito);

        // Gerando senhas sequenciais e redirecionando para as filas
        int senha = 1;
        int totalSenhas = 10;

        for (int i = 0; i < totalSenhas; i++) {
            int tipoServico = (i % 4) + 1;
            mediador.controlaFila(tipoServico, senha++);
        }

        // Chamando as senhas uma por uma e imprimindo a fila respectiva
        for (int i = 0; i < totalSenhas; i++) {
            int tipoServico = (i % 4) + 1;

            switch (tipoServico) {
                case 1:
                    poupanca.atender();
                    break;
                case 2:
                    saque.atender();
                    break;
                case 3:
                    cheque.atender();
                    break;
                case 4:
                    deposito.atender();
                    break;
            }

            // Imprimir a fila atual após cada atendimento
            System.out.println();
            poupanca.listaFila();
            saque.listaFila();
            cheque.listaFila();
            deposito.listaFila();
            System.out.println();
        }
    }
}
