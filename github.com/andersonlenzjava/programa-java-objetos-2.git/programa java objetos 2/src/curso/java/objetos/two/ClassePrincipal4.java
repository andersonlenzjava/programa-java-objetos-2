package curso.java.objetos.two;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursoconstantes1.java.StatusAluno;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ClassePrincipal4 {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosSuperAprovado = new ArrayList<Aluno>();
		List<Aluno> alunosAprovado = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosreprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {

			/* Criação de um objeto na memória com o endereço dentro da variável aluno1 */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);

			for (int pos = 1; pos <= 1; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			alunos.add(aluno1);

		}

// laço para varer a lista de alinos e retornar os statos e fazer algo ao encotrar um determinado(usando static)		

		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.SUPERAPROVADO)) {
				alunosSuperAprovado.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovado.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosreprovados.add(aluno);
			}
		}

		System.out.println("-------------------lista de superaprovados--------------------");
		for (Aluno aluno : alunosSuperAprovado) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota()
					+ " Aluno : " + aluno.getNome());
		}

		System.out.println("-------------------lista de aprovados-------------------------");
		for (Aluno aluno : alunosAprovado) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota()
					+ " Aluno : " + aluno.getNome());
		}

		System.out.println("-------------------lista de em recuperação--------------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota()
					+ " Aluno : " + aluno.getNome());
		}

		System.out.println("-------------------lista de reprovados------------------------");
		for (Aluno aluno : alunosreprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota()
					+ " Aluno : " + aluno.getNome());
		}
	}
}
