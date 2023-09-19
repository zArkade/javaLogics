import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Abre o scanner

        System.out.print("Digite um numero: "); //numero 1
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro numero: "); //numero 2
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) { //Condição maior1
            System.out.println("O numero " + numero1 + " e o maior");
        }

        else if (numero1 < numero2) { // Condição maior2
            System.out.println("O numero " + numero2 + " e o maior");
        }

        else {
            System.out.println("Estes numeros sao iguals");
        }

        scanner.close(); // Feche o scanner
    }
}
