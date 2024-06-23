import java.util.Calendar;

public class Aluno {
	String nome;
	int matricula;
	int anoNascimento;
	
	Aluno(){
		this.nome="";
		this.matricula=0;
		this.anoNascimento=0;
	}
	
	Aluno(String nome, int matricula, int anoNascimento){
		this.nome = nome;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento;
	}
	
	public int getIdade() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		return ano-this.anoNascimento;
	}
	
	public String getDescricao() {
		return nome + " (mat=" + matricula + ", idade=" + getIdade() +")";
	}
}
