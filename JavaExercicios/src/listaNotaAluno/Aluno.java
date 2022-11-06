package listaNotaAluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private int idade;
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
	public List<Diciplina> getDiciplinas() {
		return diciplinas;
	}
	
	List<Diciplina> diciplinas = new ArrayList<Diciplina>();
	
	public void setDiciplinas(List<Diciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}
		
}
