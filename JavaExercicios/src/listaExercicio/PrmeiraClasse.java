package listaExercicio;

public class PrmeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Aluno aluno = new Aluno();
	
	aluno.setNome("Carlos");
	aluno.setIdade(30);
	
	Disciplina disp1 = new Disciplina();
	disp1.setNome("Mat1");
	disp1.setNota(10);
	aluno.getDiciplinas().add(disp1);
		
	System.out.println(aluno.getNome() + "e " + aluno.getIdade() + " anos");
	System.out.println(aluno.getDiciplinas().get(0).getNome());
	System.out.println(aluno.getDiciplinas().get(0).getNota());

	}

}
