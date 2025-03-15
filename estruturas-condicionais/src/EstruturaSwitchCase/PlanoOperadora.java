package EstruturaSwitchCase;

public class PlanoOperadora {

    public static void main(String[] args) {
        /*
        Porém um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algorítimo seria conforme ilustração abaixo:

Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

O sistema terá 03 planos: BASIC, MIDIA , TURBO

BASIC: 100 minutos de ligação

MIDIA: 100 minutos de ligação + Whats e Intagram grátis

TURBO: 100 minutos de ligação + Whats e Intagram grátis + 5Gb Youtube

Copy
// Modo condicional convencional
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T

		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");
			System.out.println("5Gb Youtube");
		}


	}
}
         */

        // usando a estrutura para este caso fica sintaticamente melhor
        String plano = "M";  // M / T

        switch ( plano ) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Wats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }

    }
}
