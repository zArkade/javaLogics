import java.util.Scanner;

public class ex13 {
    public static void main (String[] args){

        //variaveis
        int primeiroNumero;
        int segundoNumero;
        int terceiroNumero;
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.println("Informe o primeiro numero");
        primeiroNumero = leitor.nextInt();

        System.out.println("Informe o segundo numero");
        segundoNumero = leitor.nextInt();

        System.out.println("Informe o terceiro numero");
        terceiroNumero = leitor.nextInt();

        //processamento
        System.out.println("A ordem decresente dos numero e ");

        if 
            (primeiroNumero == segundoNumero || 
            primeiroNumero == terceiroNumero ||
            segundoNumero == terceiroNumero) {
                System.out.println("Os  numeros nao podem ser iguais");
        } else if 
            (primeiroNumero > segundoNumero &&
            primeiroNumero > terceiroNumero && 
            segundoNumero > terceiroNumero) {
                System.out.println(primeiroNumero);
                System.out.println(segundoNumero);
                System.out.println(terceiroNumero);
        } else if 
            (primeiroNumero > segundoNumero &&
            primeiroNumero > terceiroNumero && 
            terceiroNumero > segundoNumero) {
                System.out.println(primeiroNumero);
                System.out.println(terceiroNumero);
                System.out.println(segundoNumero);
        } else if 
            (segundoNumero > primeiroNumero &&
            segundoNumero > terceiroNumero &&
            primeiroNumero > terceiroNumero) {
                System.out.println(segundoNumero);
                System.out.println(primeiroNumero);
                System.out.println(terceiroNumero);
        } else if
            (segundoNumero > primeiroNumero &&
            segundoNumero > terceiroNumero &&
            terceiroNumero > primeiroNumero) {
                System.out.println(segundoNumero);
                System.out.println(terceiroNumero);
                System.out.println(primeiroNumero);
        } else if
            (terceiroNumero > primeiroNumero &&
            terceiroNumero > segundoNumero &&
            primeiroNumero > segundoNumero) {
                System.out.println(terceiroNumero);
                System.out.println(primeiroNumero);
                System.out.println(segundoNumero);
        } else if
            (terceiroNumero > primeiroNumero &&
            terceiroNumero > segundoNumero &&
            segundoNumero > primeiroNumero) {
                System.out.println(terceiroNumero);
                System.out.println(segundoNumero);
                System.out.println(primeiroNumero);
        } else {
            System.out.println("Erro no codigo");
        }
        leitor.close();
    }
}
