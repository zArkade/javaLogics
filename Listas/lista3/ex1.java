// import java.util.Scanner;
// import javax.swing.JOptionPane;

// public class ex1 {
//     public static void main(String[] args){

//     Scanner scanner = new Scanner(System.in);
    
//     int leitura = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
//     }
// }

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Abre o scanner

        System.out.print("Digite um numero inteiro: "); //input inteiro
        int numeroInteiro = scanner.nextInt();

        System.out.print("Digite um numero real: "); //input real
        double numeroReal = scanner.nextDouble();

        if (numeroInteiro < numeroReal) { //Condição menor
            System.out.println("O numero inteiro e menor que o numero real.");
        }
        
        //  else if (numeroInteiro > numeroReal){ //Condição maior
        //      System.out.println("O numero inteiro e maior que o numero real");
        // }

        scanner.close(); // Feche o scanner
    }
}