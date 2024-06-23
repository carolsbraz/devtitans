
public class Professor {
	String titulacao;
	String nome;
	int matricula;
	
	Professor(){
		this.titulacao="";
		this.nome="";
		this.matricula=0;
	}
	
	Professor(String titulacao, String nome, int matricula){
		this.titulacao = titulacao;
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getDescricao() {
		return "Prof. " + this.titulacao + " " + this.nome + " - mat " + this.matricula;
	}
}
