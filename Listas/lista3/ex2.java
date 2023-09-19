import java.util.Scanner;

// import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //chama o scanner

        // System.out.print(JOptionPane.showInputDialog(null,"Digite um numero real")); TENTATIVA COM JOption
        // double numeroReal1 = scanner.nextDouble();
        
        System.out.print("Digite um numero real: "); //numeroReal 1
        double numeroReal1 = scanner.nextDouble();

        // System.out.print(JOptionPane.showInputDialog(null,"Digite um numero real")); TENTATIVA COM JOption
        // double numeroReal2 = scanner.nextDouble();

        System.out.print("Digite um numero real: "); // numeroReal 2
        double numeroReal2 = scanner.nextDouble();

        if (numeroReal1 == numeroReal2) { //Condição igualdade
            // System.out.println(JOptionPane.showMessageDialog(null, "Os numeros informados são iguais")); TENTATIVA COM JOption
            System.out.println("Os numeros informados sao iguais");
        }

        // else if ( numeroReal1 != numeroReal2) { //Condição diferença
        //     System.out.println("Os numeros informados sao diferentes");
        // }

        scanner.close();
    }
}