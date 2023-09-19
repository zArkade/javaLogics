import java.util.Scanner;

public class ex9 {
    public static void main ( String[] args){

        //variaveis
        double notaPrimeiraProva;
        double notaSegundaProva;
        double mediaNota;
        Scanner leitor = new Scanner (System.in);

        while (true) {
            //entrada
            System.out.println("Nota da primeira prova: ");
            notaPrimeiraProva = leitor.nextDouble();
            
            if ( notaPrimeiraProva > 10 || notaPrimeiraProva < 0) {
                System.out.println("Nota invalida. Insira uma nota valida entre 0 e 10.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Nota da segunda prova: ");
            notaSegundaProva = leitor.nextDouble();
            
            if ( notaSegundaProva > 10 || notaSegundaProva < 0 ) {
                System.out.println("Nota invalida. Insira uma nota valida entre 0 e 10.");
            } else {
                break;
            }
        }

        //processamento
        mediaNota = (notaPrimeiraProva + notaSegundaProva) / 2;

        //saída
        if (mediaNota >= 9) {
            System.out.println("Parabens, continue assim!");
        } else if (mediaNota >= 7) {
            System.out.println("Aprovado.");
        } else if (mediaNota >= 6) {
            System.out.println("Aprovado no limite, estude um pouco mais.");
        } else if (mediaNota >= 2) {
            System.out.println("Nao está aprovado, mas ainda pode solicitar atividades extras.");
        } else {
            System.out.println("Reprovado. Nos vemos no proximo semestre.");
        }

        leitor.close();
    }
}
