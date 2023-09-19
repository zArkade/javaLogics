import java.util.Scanner;

public class ex11 {
    public static void main ( String[] args){

        //variaveis
        int     codigoEstado;
        double  valorCarga;
        double  valorFinal = 0.0;
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.println("Informe qua o codigo do estado de 1 a 5");
        codigoEstado = leitor.nextInt();

        System.out.println("Qual e o valor da carga?");
        valorCarga = leitor.nextDouble();

        //processamento

        if ( codigoEstado == 2 || codigoEstado == 5 ) {
            valorFinal = valorCarga - ( 0.12 * valorCarga );
        } else if ( codigoEstado == 1 || codigoEstado == 3 || codigoEstado == 4 ) {
            valorFinal = valorCarga - ( 0.15 * valorCarga );
        } else{
            System.out.println("Codigo de estado invalido");
        }

        //saida
        System.out.println("O valor final da carga e de " + valorFinal );

        leitor.close();
    }
}
