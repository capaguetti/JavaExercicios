import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crie um sistema onde o usuário vai cadastrar, utilizando o console, 
		 * as 5 tarefas mais importantes do dia dele. Armazene cada uma dessas 
		 * tarefas em um vetor e, no final, imprima as tarefas novamente.
		 */
		
		String[] ativ = new String[5];

		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i <= 4; i++) {
			System.out.print("Digite a " + (i+1) + "ª atividade: ");
			ativ[i] = scanner.next();
		}
		
		int x = 0;
		while (x < 5) {
			System.out.println("A Atividade "+ (x+1) + "ª:" + ativ[x]);	
			x++;
		}
		
	}

}
