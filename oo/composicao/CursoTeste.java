package oo.composicao;

public class CursoTeste {

	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Calleb");
		Aluno aluno2 = new Aluno("Maycon");
		Aluno aluno3 = new Aluno("Vagner");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Drop Completo");
		Curso curso3 = new Curso("JavaScript Completo");
		
		curso1.adicionaAluno(aluno1);
		curso1.adicionaAluno(aluno3);
		
		curso2.adicionaAluno(aluno2);
		curso2.adicionaAluno(aluno1);
		curso2.adicionaAluno(aluno3);
		
		curso3.adicionaAluno(aluno3);
		curso3.adicionaAluno(aluno1);
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estpu matriculado no curso 1..." 
		             + curso2.nome + "..." );
			System.out.println("...e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno2.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
