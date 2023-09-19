import javax.swing.JOptionPane;

public class testeValor{
    public static void main ( String [] args) {

        //variaveis
        int n;

        //entrada
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));

        //processamento e saida
        if ( n >= 100 ){            
            JOptionPane.showMessageDialog(null, n + " maior ou igual a 100");
        } else {
            JOptionPane.showMessageDialog(null, n + " menor que 100");
        }
    }
}