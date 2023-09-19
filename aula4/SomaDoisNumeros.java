// exercicio feito em sala de aula

import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args){

        //declaração de variáveis
        double primeiroOperando;
        double segundoOperando;
        double resultado;
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.println("Digite o primeiro operando: ");
        primeiroOperando = leitor.nextDouble();

        System.out.println("Digite o segundo operando: ");
        segundoOperando = leitor.nextDouble();

        //processamento
        resultado = primeiroOperando + segundoOperando;

        //saida
        System.out.println("O resultado e " + resultado);

        leitor.close();
    }
}