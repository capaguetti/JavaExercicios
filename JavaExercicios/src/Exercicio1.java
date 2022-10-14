import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
//		Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
//		A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior 
//		que 150. Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, 
//		ou seja, se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) 
//		ele não conseguirá a vaga. No final mostre para o candidato se ele conseguiu ou não.
		
		double notaPortugues;
		double notaMatematica;
		double media;
		boolean valida = true;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota de Português:");
		
		notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota de Matemática:");
		
		notaMatematica = scanner.nextDouble();
		
		media = (notaMatematica + notaPortugues)/2;
		
		if (notaMatematica < 60) { 
			valida = false;
		} else if (notaPortugues < 60) {
			valida = false;
		} else if (media < 150) {
			valida = false;
		}
		  
		if (valida) {
			System.out.println("Você foi aprovado com média " + media);
		} else {
			System.out.println("Você não foi aprovado teve média " + media);
		}
			
		
		
		
		
		
		
	}

}
