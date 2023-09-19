import java.util.Scanner;

public class ex12 {
    public static void main ( String[] args) {

        //variaveis
        int     senha;
        int     primeiroDigito;
        int     segundoDigito;
        int     terceiroDigito;
        int     quartoDigito;
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.println("Digite uma senha: ");
        senha = leitor.nextInt();

        //processamento e saida
        if ( senha >= 1000 && senha <= 9999) {
            primeiroDigito = senha / 1000 ;
            segundoDigito = (senha / 100) % 10;
            terceiroDigito = (senha / 10) % 10;
            quartoDigito = senha % 10;
            
            if  ((primeiroDigito == 8 || primeiroDigito == 5 ) &&
                    (quartoDigito == 5 || quartoDigito == 1) &&
                    ((quartoDigito == 5 && (segundoDigito + terceiroDigito) == 3 ||
                    (quartoDigito == 1 && (segundoDigito + terceiroDigito == 0 )))
                    ) 
                ) {
                System.out.println("E uma senha valida!");
                } else {
                    System.out.print("Nao e uma senha valida!");
            }
        } else {
            System.out.println("O senha deve conter 4 digitos");
        }
        leitor.close();
    }
}