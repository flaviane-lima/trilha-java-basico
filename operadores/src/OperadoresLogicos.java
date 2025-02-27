public class OperadoresLogicos {

    public static void main(String[] args) {

        // Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

        /*
        && Operador Lógico "E"

        || Operador Lógico "OU"
         */
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2) {

            System.out.println("Os dois valores precisam ser verdadeiro");

        }

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2) {

            System.out.print("Um dos valores precisa ser verdadeiro");
        }



        // ComparacaoAvancada.java
        int numero1 = 1;
        int numero2 = 1;

        if(numero1== 2 & numero2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);

        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )

        System.out.println("Fim");
    }
}
