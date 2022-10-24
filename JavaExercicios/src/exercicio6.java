import java.util.Scanner;

import javax.sound.midi.ShortMessage;

public class exercicio6 {

	
	public static void main(String[] args) {
		/* 
		 * receber 4 notas e calcular a média.
		 * usando metodo para calcular a média
		 */
	
	exercicio61 aluno = new exercicio61();
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Nome do Aluno: ");
	aluno.setNomeAluno(scanner.nextLine());
	
	System.out.print("Digite a nota 1: ");
	aluno.setNota1(scanner.nextDouble());
	
	System.out.print("Digite a nota 2: ");
	aluno.setNota2(scanner.nextDouble());
	
	System.out.print("Digite a nota 3: ");
	aluno.setNota3(scanner.nextDouble());
	
	System.out.print("Digite a nota 4: ");
	aluno.setNota4(scanner.nextDouble());
	
	System.out.println(aluno.getNomeAluno());
	System.out.println(aluno.calcularMedia());
		
	}	

}
