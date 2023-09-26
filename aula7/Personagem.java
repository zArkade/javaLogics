public class Personagem {

    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " cacando...");
            energia = energia - 2;
            if (fome < 10) {
                fome = fome++;
            }
            if (sono >= 10) {
                System.out.println("Desmaiou de sono...");
                this.dormir();
            }
            sono = sono + 1;
        } else {
            System.out.println(" Sem energia suficiente para cacar.");
        }
    }

    void comer() {
        if (fome < 10 && fome >= 1) {
            System.out.println(nome + " comendo...");
            if (energia < 10) {
                energia = Math.min(10, energia + 1);
            }
            fome = fome - 1;
        } else {
            System.out.println(nome + " sem fome.");
        }
    }

    void dormir() {
        if (sono > 2 && sono <= 10) {
            System.out.println(nome + " dormindo...");
            energia = energia < 10 ? energia + 2 : 10;
            fome = fome + 1;
            sono = sono - 2;
        } else {
            System.out.println(nome + "Sem sono.");
        }
    }
}