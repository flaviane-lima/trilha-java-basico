package RepeticaoFor;

public class ExemploContinue {

    public static void main(String[] args) {
        // continue só imterrompe a interação atual e continua diferente do break
        for (int numero = 1; numero <= 5 ; numero++) {
            if (numero == 3) {
                continue;
            }
            System.out.println(numero);
        }

    }
}
