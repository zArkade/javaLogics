import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Abre o scanner

        System.out.print("Digite um numero inteiro: "); //input inteiro 1
        int numeroInteiro1 = scanner.nextInt();

        System.out.print("Digite um numero real: "); //input inteiro 2
        double numeroInteiro2 = scanner.nextDouble();

        if (numeroInteiro1 > numeroInteiro2) { //Condição maior
            System.out.println("O " + numeroInteiro1 + " e maior que o " + numeroInteiro2 + ", portanto, o primeiro e maior que o segundo.");
        }
        
        else if (numeroInteiro1 < numeroInteiro2) { //Condição menor
             System.out.println("O " + numeroInteiro1 + " e menor que o " + numeroInteiro2 + ", portanto, o segundo e maior que o primeiro.");
         }

        scanner.close(); // Feche o scanner
    }
}
