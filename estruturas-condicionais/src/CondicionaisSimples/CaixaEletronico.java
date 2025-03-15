package CondicionaisSimples;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        // lendo os dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor que quer digitar: ");
        double valorSolicitado = scanner.nextDouble();

        // saldo que tem na conta
        double saldo = 25.0;

        // implementando a estrutura condiciona simples
        if (valorSolicitado < saldo) {

            saldo = saldo - valorSolicitado;

        }

        // printando na tela a saída
        System.out.printf("Saldo atual: %.2f%n", saldo);



    }
}