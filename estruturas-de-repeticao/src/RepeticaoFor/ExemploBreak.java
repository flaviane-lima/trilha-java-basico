package RepeticaoFor;

public class ExemploBreak {

    public static void main(String[] args) {
        // exemplo de estrutura com break, qu e significa interromper o laço.
        for (int numero = 1; numero <= 5 ; numero++) {
            if (numero == 3) {
                break;
            }
            System.out.println(numero);
        }

    }
}
