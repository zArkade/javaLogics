import javax.swing.JOptionPane;

public class Entradas {
    public static void main(String[] args) {
        
        String s;

        s = JOptionPane.showInputDialog(" Digite um inteiro ");
        int i = Integer.parseInt(s);

        s = JOptionPane.showInputDialog("Digite um double");
        double d = Double.parseDouble(s);

        s = JOptionPane.showInputDialog("True or False?");
        boolean b = Boolean.parseBoolean(s);

        int in = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
    
        JOptionPane.showMessageDialog(null, i);
        JOptionPane.showMessageDialog(null, d);
        JOptionPane.showMessageDialog(null, b);
        JOptionPane.showMessageDialog(null, in);

        JOptionPane.showMessageDialog(null, "Primeiro inteiro: " + i + "\nO double : " + d + "\nO segunto inteiro: " + in + "\nO boolean: " + b);
    }
}
