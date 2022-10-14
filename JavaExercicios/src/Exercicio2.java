import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a 
//		meta seja alcançada. Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento 
//		anual da empresa para o ano que passou. Depois, receba o parâmetro referente ao faturamento real da 
//      empresa no ultimo ano. Por último, receba a média salarial do funcionário(a) para o ano anterior (não 
//		precisa fazer cálculo de média salarial, já que estamos trabalhando com um algoritmo fictício - na hora 
//		de informar esse parâmetro, invente um valor qualquer para representar essa média salarial).  Nessa empresa 
//      fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários 
//      ganharam um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta, 
//      mas, seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.
//		No final, mostre de quanto será o prêmio desse funcionário(a).
	
		double metafaturamento;
		double faturamentoReal;
		double mediaSalario;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a meta do faturamento: ");
		metafaturamento = scanner.nextDouble();
		
		System.out.print("Informe o faturamento real: ");
		faturamentoReal = scanner.nextDouble();
		
		System.out.print("Informe a média do seu salário:");
		mediaSalario = scanner.nextDouble();
		
		
		if (faturamentoReal >= metafaturamento) {
			System.out.println("Você recebera bônus de :" + mediaSalario);
		} else if (faturamentoReal >= metafaturamento*0.8) {
			System.out.println("Você recebera bônus de 80%: " + mediaSalario*0.8);
		} else {
			System.out.println("Você não receberá bonus!");
		}
	}

}
