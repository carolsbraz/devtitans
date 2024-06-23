
public class TurmaMain {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Caroline", 1, 2002);
		System.out.println(aluno.getDescricao());
		
		Aluno aluno2 = new Aluno("Caroline2", 1, 2002);
		System.out.println(aluno2.getDescricao());
		
		Professor professor = new Professor("Dr.", "Moises", 204845);
		System.out.println(professor.getDescricao());
		
		Turma turma = new Turma("DevTitans", 2024, 1, professor);
		turma.addAluno(aluno);
		turma.addAluno(aluno2);
		
		System.out.println(turma.getAluno(1).nome);
		System.out.println(turma.getMediaIdade());
		
		System.out.println(turma.getDescricao());
	}
}
