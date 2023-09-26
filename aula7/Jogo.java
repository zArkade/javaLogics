public class Jogo {
    public static void main(String[] args) throws InterruptedException {

        Personagem cacador = new Personagem();
        cacador.nome = "Arakde";
        // cacador.cacar();

        Personagem lenhador = new Personagem();
        lenhador.nome = "Sacy";
        // lenhador.cacar();

        // cacador.comer();
        // lenhador.dormir();

        while (true) {
            cacador.cacar();
            lenhador.cacar();
            cacador.comer();
            lenhador.comer();
            cacador.dormir();
            lenhador.dormir();
            cacador.cacar();
            lenhador.cacar();
            cacador.cacar();
            lenhador.cacar();
            cacador.cacar();
            lenhador.cacar();
            cacador.cacar();
            lenhador.cacar();
            System.out.println("====================");
            Thread.sleep(2000);
        }
    }
}
