import java.util.Date;

public class Operadores {
    public static void main(String[] args) {

        // operadores de atribuição '=' exemplos:
        String nome = "Flaviane";
        int idade = 35;
        double peso = 62.5;
        char sexo = 'M'; // caracter só permite um unico valo
        boolean doadorOrgao = false;
        // date dataNascimento = new Date(); quando estamos criando um novo objeto na aplicação

        // operadores aritméticos é usado para realizar operações matemáticas entre valores numéricos
        // operadores são + soma, - subtração, * multiplicação e / divisão
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // quando usamos o sinal de adição (+) e quando a variável é tipo tetxto vai ocorre uma concatenação
        String nomeCompleto = "linguagem" + "Java";

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        // unarios são aplicados com um outro operador artimético.

        int numero = 5;

        numero = - numero; // deixando ele negativo

        System.out.println(numero);

        // neste caso para ele ficar positivo vou ter que multiplicar por -1
        numero = numero * -1;

        System.out.println(numero);

        // Operadores ternário é uma forma resumida para definir uma condição e decidir entre eles







        System.out.println("Hello, World!");
    }
}