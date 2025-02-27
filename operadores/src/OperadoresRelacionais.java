public class OperadoresRelacionais {

    public static void main(String[] args) {
        // Os operadores relacionais avaliam a relação entre duas variáveis ou expressões

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2: " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente a numero2: " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2: " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numero1 é igual ou maior numero2: " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero1 é menor que numero2: " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numero1 é igual ou menor que o numero2: " + simNao);

        // EXEMPLO USANDO CONDICIONAIS

        if(numero1 == numero2) {
            System.out.print("Numero 1 maior que numero 2");
        }

        if( numero1 != numero2) {
            System.out.print("Numero 1 é diferente de numero 2");
        }

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");


    }
}
