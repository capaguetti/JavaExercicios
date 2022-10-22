import java.util.Scanner;

import javax.swing.text.html.parser.Parser;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		/*
		 * Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7). 
		 * Dependendo do número informado você deve imprimir o nome desse dia.
		 * Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.
		 */
		
		int nDia = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o dia da Semana: ");
		
		nDia = Integer.parseInt(scanner.next());
		
		if (nDia < 1 || nDia > 7)  {
			System.out.print("O valor deve ser referente a um dia da semana! Favor digitar novamente");
		}else {
			switch (nDia) {
			case 1: {
				System.out.print("O dia da semana é Domingo.");
				break;
 			}
			case 2:{
				System.out.print("O dia da semana é Segunda-Feira.");
				break;
			}
			case 3:{
				System.out.print("O dia da semana é Terça-Feira.");
				break;
			}
			case 4:{
				System.out.print("O dia da semana é Quarta-Feira.");
				break;
			}
			case 5:{
				System.out.print("O dia da semana é Quinta-Feira.");
				break;
			}
			case 6:{
				System.out.print("O dia da semana é Sexta-Feira.");
				break;
			}
			case 7:{
				System.out.print("O dia da semana é Sábado.");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + nDia);
			}
		}
		
		
		
	}
}
