// 6. Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária
//     e o segundo é um valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque
//     (ou seja, o saldo não fique negativo), o programa deve mostrar o saldo remanescente. Caso 
//     contrário, deve informar o usuário que não foi possível realizar o saque.

import java.util.Scanner;

public class ex6 {
    public static void main( String[] args){
    //declaração de variáveis
        double saldoConta;
        double saqueConta;
        double saldoRestante;
        Scanner leitor = new Scanner (System.in);

    //entrada
        System.out.print("Digite seu saldo em conta: ");
        saldoConta = leitor.nextDouble();

        System.out.print("Digite o valor desejado para o saque: ");
        saqueConta = leitor.nextDouble();

    //processamento e saida
        saldoRestante = saldoConta - saqueConta;

        if ( saldoConta >= saqueConta) {
            System.out.println("O saque sera realizado e o valor de saldo restante na conta sera de " + saldoRestante);
        } else {
            System.out.println("O saque nao pode ser realizado pois o valor em conta e menor que o valor de saque");
        }

        leitor.close();
    }
}
