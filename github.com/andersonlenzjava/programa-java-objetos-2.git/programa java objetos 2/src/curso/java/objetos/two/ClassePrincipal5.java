package curso.java.objetos.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursoconstantes1.java.StatusAluno;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ClassePrincipal5 {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");

		if (login.equalsIgnoreCase("admin") && // simples validação de permissão de acesso
				senha.equalsIgnoreCase("admin")) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

//é uma lista que dentro dela temos uma chave que identifica uma sequecia de valores também 

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

			maps.put(StatusAluno.SUPERAPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.SUPERAPROVADO)) {
					maps.get(StatusAluno.SUPERAPROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("-------------------lista de superaprovados--------------------");
			for (Aluno aluno : maps.get(StatusAluno.SUPERAPROVADO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = "
						+ aluno.getMediaNota() + " Aluno : " + aluno.getNome());
			}

			System.out.println("-------------------lista de aprovados-------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = "
						+ aluno.getMediaNota() + " Aluno : " + aluno.getNome());
			}

			System.out.println("-------------------lista de em recuperação--------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = "
						+ aluno.getMediaNota() + " Aluno : " + aluno.getNome());
			}

			System.out.println("-------------------lista de reprovados------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = "
						+ aluno.getMediaNota() + " Aluno : " + aluno.getNome());
			}
		}

	}

}
