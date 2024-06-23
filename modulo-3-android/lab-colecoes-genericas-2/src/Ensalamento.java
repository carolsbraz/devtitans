import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class Ensalamento {
	ArrayList<Sala> salas = new ArrayList<Sala>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();
	
	Ensalamento(){
	}
	
	void addSala(Sala sala) {
		this.salas.add(sala);
	}
	
	void addTurma(Turma turma) {
		this.turmas.add(turma);
	}
	
	Sala getSala(Turma turma){
		for (TurmaEmSala ensalamento: ensalamento) {
			if(ensalamento.turma == turma) {
				return ensalamento.sala;
			}
		}
		return null;
	}
	
	boolean salaDisponivel(Sala sala, int horario) {
		for(TurmaEmSala ensalamento : ensalamento) {
			if(ensalamento.sala == sala) {
				for(Integer horarios : ensalamento.turma.horarios) {
					if(horarios == horario) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
		for(Integer horario : horarios) {
			if(!salaDisponivel(sala, horario)) {
				return false;
			}
		}
		return true;
	}
	
	int getTotalTurmasAlocadas() {
		int contador = 0;
		for(TurmaEmSala ensalamento : ensalamento) {
			if(ensalamento.sala != null) {
				contador++;
			}
		}
		return contador;
		
	}
	
	int getTotalEspacoLivre() {
		int contador = 0;
		int auxiliar = 0;
		for(TurmaEmSala ensalamento : ensalamento) {
			auxiliar = ensalamento.sala.capacidade - ensalamento.turma.numAlunos;
			contador += auxiliar;
		}
		return contador;
	}
	
	String relatorioResumoEnsalamento() {
		return "Total de Salas: " + salas.size() + "\n"
				+ "Total de Turmas: " + turmas.size() + "\n"
				+ "Turmas Alocadas: " + getTotalTurmasAlocadas()+ "\n"
				+ "Espaços Livres: " + getTotalEspacoLivre() + "";
	}
	
	String relatorioTurmasPorSala() {
		String relatorio = "";
		
		relatorio += relatorioResumoEnsalamento();
		
		for(Sala sala: salas) {
			relatorio += "\n\n--- " + sala.getDescricao() + " ---";
			for(TurmaEmSala ensalamento : ensalamento) {
				
				if(ensalamento.sala == sala) {
					relatorio += "\n\n";
					relatorio += ensalamento.turma.getDescricao();
					
					
				}
				
			}
		}
		
		return relatorio;
	}
	
	String relatorioSalasPorTurma() {
		String relatorio = "";
		boolean flag = true;
		
		relatorio += relatorioResumoEnsalamento() + "\n\n";
		
		for(Turma turma : turmas) {
			relatorio += turma.getDescricao() + "\n";
			relatorio += "Sala: ";
			flag = true;
			for(TurmaEmSala ensalamento : ensalamento) {
				if(ensalamento.turma == turma) {
					relatorio += ensalamento.sala.getDescricao();
					flag = false;
				}
			}
			if(flag) {
				relatorio += "SEM SALA";
				
			}
			relatorio += "\n\n";
		}
		
		
		return relatorio;
	}
	
	boolean alocar(Turma turma, Sala sala) {
		if(turma.acessivel && !sala.acessivel) {
			return false;
		}
		if(turma.numAlunos > sala.capacidade) {
			return false;
		}
		if(!salaDisponivel(sala, turma.horarios)) {
			return false;
		}
		TurmaEmSala ensalando = new TurmaEmSala(turma, sala);
		ensalamento.add(ensalando);
		return true;
	}
	
	
	ArrayList<Turma> alocarTurmasCompativeis(Sala sala, ArrayList<Turma> turmasCompativeis) {
		
		ArrayList<Turma> turmasNaoAlocadas = new ArrayList<Turma>();
		
		Collections.sort (turmasCompativeis, new Comparator<Turma>() {
			public int compare(Turma p1, Turma p2) {
				return p1.numAlunos < p2.numAlunos ? +1 : (p1.numAlunos > p2.numAlunos ? -1 : 0);
			}
		});
		
		//System.out.println("PARA A SALA: " + sala.capacidade);
		for (Turma turma : turmasCompativeis) {
			//System.out.println("VOU TENTAR ALOCAR EM A TURMA: " + turma.numAlunos);
			if(!alocar(turma, sala)) {
				turmasNaoAlocadas.add(turma); 
			}
		}
		
		return turmasNaoAlocadas;
	}
	
	void alocaSalasCompativeis(Turma turma, ArrayList<Sala> salasCompativeis) {
		for (Sala sala : salasCompativeis) {
			//System.out.println("VOU TENTAR ALOCAR EM: " + sala.capacidade);
			if(alocar(turma, sala)) {
            	return;
            }
		}
	}
	
	void alocarRestante(ArrayList<Turma> turmasParaAlocar) {
		
		ArrayList<Turma> turmasOrdenadas = new ArrayList<Turma>();
		
		turmasOrdenadas = turmasParaAlocar;
		
		Collections.sort (turmasOrdenadas, new Comparator<Turma>() {
				public int compare(Turma p1, Turma p2) {
					return p1.numAlunos < p2.numAlunos ? +1 : (p1.numAlunos > p2.numAlunos ? -1 : 0);
			}
		});
		
		
		ArrayList<Sala> salasCompativeis = new ArrayList<Sala>();
		
		for(Turma turma : turmasOrdenadas) {
		
			//System.out.println("VOU ORDENAR COM: " + turma.numAlunos);
			
			for(Sala sala : salas) {
				if(sala.capacidade >= turma.numAlunos) {
					salasCompativeis.add(sala);
				}
			}
		    
			Collections.sort (salasCompativeis, new Comparator<Sala>() {
				public int compare(Sala p1, Sala p2) {
					return p1.capacidade < p2.capacidade ? -1 : (p1.capacidade > p2.capacidade ? +1 : 0);
			}
			});
			
			alocaSalasCompativeis(turma, salasCompativeis);
		}
		
	}
	
	void alocarTodas() {
		
		ArrayList<Turma> turmasNaoAlocadas = new ArrayList<Turma>();
		ArrayList<Turma> turmasParaAlocar = new ArrayList<Turma>();
		
		// Ordenar salas em ordem decrescente
		ArrayList<Sala> salasOrdenadas = new ArrayList<Sala>();
		
		for(Sala sala : salas) {
			salasOrdenadas.add(sala);
		}
		
		Collections.sort (salasOrdenadas, new Comparator<Sala>() {
				public int compare(Sala p1, Sala p2) {
					return p1.capacidade < p2.capacidade ? +1 : (p1.capacidade > p2.capacidade ? -1 : 0);
			}
		});
		
		
		
		for(Sala sala : salasOrdenadas) {
			
		}
		
		//Guardar turmas que são menores que a sala atual e maiores que a próxima
		
		for(int i = 0; i <= (salasOrdenadas.size() - 1); i++) {
			System.out.println("\n\nORDENANDO: " + salasOrdenadas.get(i).getDescricao());
			ArrayList<Turma> turmasCompativeis = new ArrayList<Turma>();
			for(Turma turma : turmas) {
				if(salasOrdenadas.size() - 1 > i) {
					if(salasOrdenadas.get(i).capacidade >= turma.numAlunos && salasOrdenadas.get(i+1).capacidade < turma.numAlunos) {
						System.out.println(turma.nome + " " + turma.numAlunos);
						turmasCompativeis.add(turma);
					}
				}else {
					if(salasOrdenadas.get(i).capacidade >= turma.numAlunos) {
						System.out.println(turma.nome + " " + turma.numAlunos);
						turmasCompativeis.add(turma);
					}
				}
				
			}	
			
			turmasNaoAlocadas = alocarTurmasCompativeis(salasOrdenadas.get(i), turmasCompativeis);
			
			for(Turma turmaNaoAlocada : turmasNaoAlocadas) {
				turmasParaAlocar.add(turmaNaoAlocada);
			}
			
			turmasNaoAlocadas.clear();
		}
		
		
		alocarRestante(turmasParaAlocar);
		
	}
	
}
