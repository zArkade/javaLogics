import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        //variaveis
        double  salarioHora;
        int     horasTrabalhadas;
        double  imposto;
        double  comissao;
        double  salarioBruto;
        double  salarioLiquido;
        Scanner leitor = new Scanner(System.in);
        
        // entrada
        System.out.print("Digite o seu salario por hora: ");
        salarioHora = leitor.nextDouble();
        
        System.out.print("Digite o numero de horas trabalhadas: ");
        horasTrabalhadas = leitor.nextInt();
        
        System.out.print("Digite o imposto (entre 0 e 1): ");
        imposto = leitor.nextDouble();
        
        System.out.print("Digite a comissao: ");
        comissao = leitor.nextDouble();
        
        // processamento
        salarioBruto = salarioHora * horasTrabalhadas;
        
        salarioLiquido = salarioBruto - (salarioBruto * imposto);
        
        if (horasTrabalhadas >= 120) {
            salarioLiquido += comissao;
        }
        
        // saida
        System.out.println("Salario Bruto: R$" + salarioBruto);
        System.out.println("Salario Liquido: R$" + salarioLiquido);
        
        leitor.close();
    }
}