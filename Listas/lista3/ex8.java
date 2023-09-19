// 8. Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea.
// O programa deve exibir um texto para o usuário conforme a tabela abaixo:
// IMC Texto
// Abaixo de 18,5 Abaixo do peso ideal.
// Entre 18,5 e 24,9 Peso ideal, muito bem.
// Entre 25,0 e 29,9 Sobrepeso, um regime leve pode ajudar.
// Entre 30,0 e 34,9 Obesidade leve.
// Entre 35,0 e 39,9 Obesidade moderada.
// Acima de 40 Obesidade mórbida.

import java.util.Scanner;

public class ex8 {
    public static void main( String[] args) {

        //variaveis
        double  altura;
        double  peso;
        double  imc;
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.println("Informe sua altura: ");
        altura = leitor.nextDouble();

        System.out.println("Informe seu peso: ");
        peso = leitor.nextDouble();

        //processamento
        imc = peso / (altura * 2);

        //saida
        if ( imc < 18.5){
            System.out.println("Voce esta abaixo do peso ideal.");
        } else if ( imc >= 18.5 && imc <= 24.9 ) {
            System.out.println("Voce esta no peso ideal, muito bem!!");
        } else if ( imc >= 25 && imc <= 29.9 ) {
            System.out.println("Voce esta sobrepeso, um regime leve pode ajudar.");
        } else if ( imc >= 30 && imc <= 34.9 ) {
            System.out.println("Voce esta com obesidade leve.");
        } else if ( imc >= 35 && imc <= 39.9 ) {
            System.out.println("Voce esta com obesidade moderada.");
        } else
            System.out.println("Voce esta com obesidade morbida.");

        leitor.close();
    }
}
