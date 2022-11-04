package ListaExercicio2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import listaExercicio.Disciplina;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	final List<Aluno> alunos = new ArrayList<Aluno>();
	String name;
	String idade;
	
	for (int i = 0; i <= 2; i++) {
	
	Aluno aluno = new Aluno();
		
	name = JOptionPane.showInputDialog("Qual o seu nome?");
	idade = JOptionPane.showInputDialog("Qual a sua idade?");
	aluno.setIdade(Integer.parseInt(idade));
	aluno.setNome(name);
	
	alunos.add(aluno);

	}
	int i = 0;
	for (i = 0; i < alunos.size(); i++ ) {
	System.out.print(alunos.get(i).getIdade());
	}
	}

}
