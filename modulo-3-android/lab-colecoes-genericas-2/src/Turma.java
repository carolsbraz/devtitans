import java.util.ArrayList;

public class Turma {
	String nome, professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();
	
	int[][] tabela = { {1,2,3,4,5,6,7},{8,9,10,11,12,13,14},{15,16,17,18,19,20,21},{22,23,24,25,26,27,28},{29,30,31,32,33,34,35}};
	
	String getDia(int dia) {
		switch (dia) {
		case 0: {
			return "segunda";
		}
		case 1: {
			return "terça";
		}
		case 2: {
			return "quarta";
		}
		case 3: {
			return "quinta";
		}
		case 4: {
			return "sexta";
		}
		default:
			return "";
		}
	}
	
	String getHora(int hora) {
		switch (hora) {
		case 0: {
			return "8hs";
		}
		case 1: {
			return "10hs";
		}
		case 2: {
			return "12hs";
		}
		case 3: {
			return "14hs";
		}
		case 4: {
			return "16hs";
		}
		case 5: {
			return "18hs";
		}
		case 6: {
			return "20hs";
		}
		default:
			return "";
		}
	}

	String getHorario(int horario) {
		
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++){
				if(horario == tabela[i][j]) {
					return getDia(i) + " " + getHora(j);
				}
			}
		}
		
		return "Horário inválido";
	}
	
	Turma(){
		this("", "", 0, false);
	}
	
	Turma(String nome, String professor, int numALunos, boolean acessivel){
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numALunos;
		this.acessivel = acessivel;
	}
	
	void addHorario(int horario) {
		this.horarios.add(horario);
	}
	
	String getHorariosString() {
		String listaHorarios = "";
		
		int i = 0;
		
		for(i = 0; i < horarios.size()-1; i++){ 
			listaHorarios += getHorario(horarios.get(i)) + ", ";
		}
		
		listaHorarios += getHorario(horarios.get(i));
		
		return listaHorarios;
	}
	
	String getDescricao() {
		return "Turma: "+ this.nome +"\n"
				+ "Professor: "+ this.professor +"\n"
				+ "Número de Alunos: "+ this.numAlunos +"\n"
				+ "Horário: "+ this.getHorariosString() +"\n"
				+ "Acessível: "+ (acessivel? "sim" : "não") +"";
	}
	
}
