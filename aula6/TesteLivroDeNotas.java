import static javax.swing.JOptionPane.showInputDialog;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        String nomeDisciplina = showInputDialog("Digite o nome da disciplina");
        // construir um livro de notas
        var livroDeNotas = new LivroDeNotas();

        livroDeNotas.setNomeDisciplina(nomeDisciplina);

        // operador de acesso a membro: .
        livroDeNotas.exibirMensagem();
        System.out.println("Até logo");
    }
}
