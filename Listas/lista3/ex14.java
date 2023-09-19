import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        
        //variaveis
        double soma = 0;
        double nota;
        double media;
        int i;
        int acimaDeOito = 0;
        int notaZero = 0;
        Scanner leitor = new Scanner(System.in);
        
        // entrada
        for (i = 1; i <= 10; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = leitor.nextDouble();
        
        //processamento

            soma += nota;
            
            if (nota > 8) {
                acimaDeOito++;
            } else if (nota == 0) {
                notaZero++;
            }
        }
        
        media = soma / 10;
        
        // saida 
        System.out.println("A media das notas e: " + media);
        
        if (media >= 6) {
            System.out.println("Alunos com notas acima de 8: " + acimaDeOito);
        } else {
            System.out.println("Alunos com notas igual a 0: " + notaZero);
        }
        leitor.close();
    }
}