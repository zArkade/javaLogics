// 5. Escreva um programa que lê três inteiros a partir do teclado e imprime a soma,
// a média, o produto, o menor e o maior desses números.

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){

        //declaração de variáveis
        int numeroUm;
        int numeroDois;
        int numeroTres;
        int resultadoSoma;
        int resultadoMedia;
        int resultadoProduto;
        int resultadoMenor;
        int resultadoMaior;
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.print("Digite o primeiro operando: ");
        numeroUm = leitor.nextInt();

        System.out.print("Digite o segundo operando: ");
        numeroDois = leitor.nextInt();

        System.out.print("Digite o terceiro operando: ");
        numeroTres = leitor.nextInt();

        //processamento
        resultadoSoma = numeroUm + numeroDois + numeroTres;
        resultadoMedia = ( numeroUm + numeroDois + numeroTres ) / 3;
        resultadoProduto = numeroUm * numeroDois * numeroTres;
        if ( numeroUm <= numeroDois && numeroUm <= numeroTres ) {
                resultadoMenor = numeroUm;
            } else if ( numeroDois <= numeroUm && numeroDois <= numeroTres ) {
                resultadoMenor = numeroDois;
            } else {
                resultadoMenor = numeroTres;
            }
        if ( numeroUm >= numeroDois && numeroUm >= numeroTres ) {
                resultadoMaior = numeroUm;
        } else if ( numeroDois >= numeroUm && numeroDois >= numeroTres ) {
                resultadoMaior = numeroDois;
        } else {
                resultadoMaior = numeroTres;
        }
            

        // saida
        System.out.println("O resultado da soma dos operandos e " + resultadoSoma);
        System.out.println("O resultado da media dos operandos e " + resultadoMedia);
        System.out.println("O resultado do produto dos operandos e " + resultadoProduto);
        System.out.println("O menor dos operandos e " + resultadoMenor);
        System.out.println("O maior dos operandos e " + resultadoMaior);

        leitor.close();
    }
}
