public class LivroDeNotas {

    private String nomeDisciplina;
    // getters/setters

    public void setNomeDisciplina(String nome) {
        nomeDisciplina = nome;
    }

    public void exibirMensagem() {
        System.out.println("Bem vindo ao livro de notas de " + nomeDisciplina);
    }
}