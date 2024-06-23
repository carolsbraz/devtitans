import java.util.ArrayList;

public class Turma {
	String disciplina;
	int ano;
	int semestre;
	Professor professor;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	Turma(String disciplina, int ano, int semestre, Professor professor){
		this.disciplina = disciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;
	}
	
	public void addAluno(Aluno aluno) {
		if(getAluno(aluno.matricula)==null) {
			alunos.add(aluno);
		}
	}
	
	public Aluno getAluno(int matricula){
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).matricula == matricula) {
				return alunos.get(i);
			}
		}
		return null;
	}
	
	public double getMediaIdade(){
		int soma = 0;
		for(int i = 0; i < alunos.size(); i++) {
			soma += alunos.get(i).getIdade();
		}
		return soma/alunos.size();
	}
	
	public String getDescricao() {
		String descricao = "";
		
		descricao += "Turma " + this.disciplina + " - " + this.ano + "/" + this.semestre + "(" + professor.getDescricao() + "):\n";
		
		for(int i = 0; i < alunos.size(); i++) {
			descricao += " - Aluno " + (i+1) + ": " + alunos.get(i).getDescricao() + "\n";
		}
		
		
		return descricao;
	}
}
