import java.util.ArrayList;

public class EnsalamentoMain {
	public static void main(String args[]) {

		Sala sala = new Sala(10,2,10,true);
		Sala sala2 = new Sala(10,21,60,true);
		Sala sala3 = new Sala(10,22,40,true);
		Sala sala4 = new Sala(10,25,39,true);
		Sala sala5 = new Sala(10,3,19,true);
		Sala sala6 = new Sala(10,24,37,true);
		
		
		
		ArrayList<Integer> horarios = new ArrayList<Integer>();
		Turma turma = new Turma("Algoritmos e Estruturas de Dados II", "Edson", 9, true);
		
		turma.horarios = horarios;
		
		turma.addHorario(6);
		turma.addHorario(17);
		turma.addHorario(25);
		
		
		ArrayList<Integer> horarios2 = new ArrayList<Integer>();
		Turma turma2 = new Turma("Projeto de Programas", "Horácio", 21, true);
		
		turma2.horarios = horarios2;
		
		turma2.addHorario(8);
		turma2.addHorario(20);
		turma2.addHorario(15);
		
		ArrayList<Integer> horarios3 = new ArrayList<Integer>();
		Turma turma3 = new Turma("Projeto de Programas 2", "Horácio", 25, true);
		
		turma3.horarios = horarios3;
		
		turma3.addHorario(8);
		turma3.addHorario(20);
		turma3.addHorario(15);
		
		Ensalamento ensalamento = new Ensalamento();
		
		ensalamento.addSala(sala);
		ensalamento.addSala(sala2);
		ensalamento.addSala(sala3);
		ensalamento.addSala(sala4);
		ensalamento.addSala(sala5);
		ensalamento.addSala(sala6);
		
		
		ensalamento.addTurma(turma);
		ensalamento.addTurma(turma2);
		ensalamento.addTurma(turma3);
		
		ensalamento.alocarTodas();
		
		
		System.out.println(ensalamento.relatorioTurmasPorSala());
	}
}
