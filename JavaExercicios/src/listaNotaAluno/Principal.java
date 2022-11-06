package listaNotaAluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final List<Aluno> alunos= new ArrayList<Aluno>();
		
		int qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de Alunos:"));
		int qtdeDiciplina = 0;
		
		while (qtdeAlunos > 0) {
			Aluno aluno = new Aluno();
			
			aluno.setNome(JOptionPane.showInputDialog(null, "Nome do Aluno:"));
			aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade do aluno " + aluno.getNome()+":" )));
			
			qtdeDiciplina = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidades de diplina:"));
			
			
			while (qtdeDiciplina > 0) {
			
				Diciplina diciplina = new Diciplina();
					
				diciplina.setDsNome(JOptionPane.showInputDialog(null,"Qual a diciplina:"));
				diciplina.setNota(Integer.parseInt(JOptionPane.showInputDialog("Qual a nota da diciplina "+ diciplina.getDsNome())));
				
				aluno.diciplinas.add(diciplina);
				
				qtdeDiciplina--;
			}
			
			alunos.add(aluno);
			
			qtdeAlunos--;
		}
		
		
	}

}
