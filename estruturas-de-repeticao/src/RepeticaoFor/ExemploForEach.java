package RepeticaoFor;

public class ExemploForEach {

    public static void main(String[] args) {
        // exemplo de estruturas com array
        String alunos[] = { "Felipe", "Jona", "Julia", "Marcos"};

        //forma abreviada
        for (String aluno : alunos){
            System.out.println("o nome do aluno é: " + aluno);
        }

    }
}
