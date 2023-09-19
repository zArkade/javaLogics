import java.util.Scanner;

public class ex10 {
    public static void main ( String[] args){

        //variaveis
        int     pedidoRealizado;
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.println("Aqui esta nosso cardapio ");
        System.out.println("1 - Misto quente    - R$5,50");
        System.out.println("2 - Salada Chinesa  - R$10,20");
        System.out.println("3 - Suco de Laranja - R$4,00");
        System.out.println("4 - Suco de Manga   - R$3,50");

        System.out.println("O que vai pedir? ");
        pedidoRealizado = leitor.nextInt();

        //processamento e saida
        switch ( pedidoRealizado ) {
            case 1:
                System.out.println("Bom apetite, vai lhe custar R$5,50");
                break;
            case 2:
                System.out.println("Bom apetite, vai lhe custar R$10,20");
                break;
            case 3:
                System.out.println("Tenha um excelente drink, vai lhe custar R$4,00");
                break;
            case 4:
                System.out.println("Tenha um excelente drink, vai lhe custar R$3,50");
                break;
            default:
                System.out.println("Erro. Opcao invalida");
        }

        leitor.close();
    }
}
