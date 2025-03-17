package RepeticaoFor;

public class ForArrays {

    public static void main(String[] args) {
        // exemplo de estruturas com array
        String alunos[] = { "Felipe", "Jona", "Julia", "Marcos"};

        //interação com for
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

    }
}
