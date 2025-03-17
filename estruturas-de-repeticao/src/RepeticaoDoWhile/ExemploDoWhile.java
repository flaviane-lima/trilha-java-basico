package RepeticaoDoWhile;

import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) {

        System.out.println("Discando...");

        // estrutura do while
        do {
            // vai executar até a pessoa atender
            System.out.println("Telefone tocando");
        } while (tocando());
        System.out.println("Alô !!!");

    }

    // método
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        // negando o ato de continuar tocando
        return !atendeu;

    }
}
