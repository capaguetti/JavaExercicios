package listaExercicio;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	String nome;
	int idade;
	
	private List<Disciplina> diciplinas = new ArrayList<Disciplina>(); 
	
	public List<Disciplina> getDiciplinas() {
		return diciplinas;
	}
	public void setDiciplinas(List<Disciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	

}
