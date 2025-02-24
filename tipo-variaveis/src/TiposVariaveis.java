public class TiposVariaveis {
    public static void main(String[] args) {

        // Tipos primitivos

        // byte representa um número inteiro pequeno, economizando memória
        byte idade = 25;
        System.out.println("sua idade é: " + idade);

        // short representa um numero inteiro mas pode armazenar valores maiores que byte
        short ano = 2025;
        System.out.println("Ano: " + ano);

        // int tipo primitivo mais usado para armazenar numeros inteiros
        int populacao = 100000;
        System.out.println("População: " + populacao);

        // long é usado para armazenar numeros muito grande.
        long distanciaGalaxia = 3844000000000L; // O "L" no final indica que é um long.
        System.out.println("Distância da Galáxia: " + distanciaGalaxia);

        // flot armazena numeros decimais com precisão menor
        float temperatura = 34.5f; // O "f" no final indica que é um float
        System.out.println("Temperatura: " + temperatura);

        // double armazena numeros decimais com precisão maior
        double valorProduto = 45.99;
        System.out.println("Valor do produto: " + valorProduto);

        // char armazena apenas um caractere ou simbolo.
        char letraInicial = 'F';
        System.out.println("Letra Inicial do Nome: " + letraInicial);
    }


}