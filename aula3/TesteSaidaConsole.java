// import javax.swing.JOptionPane;

public class TesteSaidaConsole {
    public static void main (String args []) {
        int a = 57, b = 28;
        System.out.println  ("a = " + a);
        System.out.println  ("b = " + b);
        System.out.println  ("soma = "+ (a + b ));
        System.out.println  ("substracao = "+ (a - b ));
        System.out.println  ("multiplicacao = "+ a * b );
        System.out.println  ("divisao = "+ a / b );
        System.out.println  ("resto de "+ a + " por " + b + " = " + a % b);
        double x =          a / b;
        System.out.println  ("x = " + x);
        double y =          2.5;
        double k =          1.5;
        int c =             (int) (x / y + k);
        System.out.println  ("c = " + c);
        // JOptionPane.showMessageDialog(null, args, "Teste", a, null);
    }
}