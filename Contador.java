import java.util.Scanner;
import Exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro\n");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro\n");
		int parametroDois = terminal.nextInt();
        terminal.close();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch ( ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro\n");
		}
		
	}
	static void contar( int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if( parametroUm > parametroDois ) {
            throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;
        for(int contador = 1 ; contador<=contagem; contador++){
   			System.out.println("Imprimindo o número " + contador);
   
        }
    }
}