package CondicionaisTernarias;

public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 4;

        // colocando em prática uso de ternário
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "recuperação" : "reprovado";
        System.out.println(resultado);

    }
}
