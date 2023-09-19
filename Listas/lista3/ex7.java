// 7. Faça um programa que lê um valor real, representando o valor de uma peça de roupa. 
// A seguir, o programa deve ler um inteiro (0, 1 ou 2) os quais representam as seguintes opções:

// 0 – Compra à vista
// 1 – Compra parcelada no cartão
// 2 – Crediário

// Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
// Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir 
// o valor da parcela.
// Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o 
// número de parcelas desejado e exibir o valor de cada parcela, que é calculado sobre o 
// valor com juros.

// Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar 
// opção invalida e terminar.

import java.util.Scanner;

public class ex7 {
    public static void main( String[] args) {

        //variaveis
        double  valorRoupa;
        int     tipoPagamento;
        double  descontoPagZero;
        double  valorFinal;
        int     parcelas;
        double  valorParcelado;
        double  valorComJuros;
        double  valorParcelaComJuros;
        Scanner leitor = new Scanner (System.in);

        //entrada
        System.out.println("Qual o valor da peca de roupa desejada? ");
        valorRoupa = leitor.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("0 - Compra a vista;");
        System.out.println("1 - Compra parcelada no cartao");
        System.out.println("2 - Crediario");
        System.out.println("Qual a forma de pagamento desejada?");
        tipoPagamento = leitor.nextInt();

        //processamento e saida
        switch (tipoPagamento) {

            case 0:
                descontoPagZero = valorRoupa * 0.10;
                valorFinal = valorRoupa - descontoPagZero;
                System.out.println("Valor com desconto e de " + valorFinal);
            break;

            case 1:
                System.out.println("Em quantas parcelas fara o pagamento? ");
                parcelas = leitor.nextInt();
                valorParcelado = valorRoupa / parcelas;
                System.out.println("O valor das parcelas seram de " + valorParcelado + " por parcela.");
            break;

            case 2:
                System.out.println("Em quantas parcelas fara o pagamento? ");
                parcelas = leitor.nextInt();
                valorComJuros = valorRoupa * 1.10;
                valorParcelaComJuros = valorComJuros / parcelas;
                System.out.println("O valor das parcelas seram de " + valorParcelaComJuros + " por parcela.");
            break;

            default:
                System.out.println("Opcao informada invalida");
        }

        leitor.close();
    }
}