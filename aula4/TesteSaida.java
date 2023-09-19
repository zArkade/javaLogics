import javax.swing.JOptionPane;

public class TesteSaida {
    public static void main (String args[]) {
        int a = 10, b= 5;

        JOptionPane.showMessageDialog(null, "Soma = " + (a + b ));
        JOptionPane.showMessageDialog(null, "Multiplicacao = " + a * b + "\nSubtracao = " + (a - b));
    }
}