package curso.java.objetos.two;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ClassePrincipal2 {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		// cria??o de um la?o que abrange tudo e repete tudo, e depois de executar o
		// la?o duas vezez permitindo alimentar a lista com objetos
		// imprime

		for (int qtd = 1; qtd <= 3; qtd++) {

			/* Cria??o de um objeto na mem?ria com o endere?o dentro da vari?vel aluno1 */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);

			// La?os para criar a entrada de dados para v?rias disciplinas

			for (int pos = 1; pos <= 4; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina); // cada uma vai ter uma posi??o na mem?ria n?o precisa ser
															// estatico
															// ele vai criando por si e dai ela
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("qual a disciplina 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover mais alguma disciplina ?");
				} // est? l?gica funciona, mas n?o passa em todas as condi??es de teste possivel
					// ....
			}

			alunos.add(aluno1);
			// adiciona um aluno a minha lista de alunos

		}
		// para substituir valores de uma posi??o de uma determinada lista (formas de
		// trabalhar com listas)
		//vai navegando pelas posi??es e imprime os alunos da lista e suas disciplinas 
		
		for (int pos = 0; pos < alunos.size(); pos++) {

			Aluno aluno = alunos.get(pos); // retorna o aluno de uma determinada posi??o percorer as listas por posi??o
			System.out.println("###############################################################");
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Media do aluno e = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("--------------------------------------------------------");

//percore a lista pela posi??o			
			
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {


				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Materia = " + disc.getDisciplina() + " Nota = " + disc.getNota());
			}

			/*
			 * la?o para percorer as listas de maneira autom?tica for (Disciplina disc :
			 * aluno.getDisciplinas()) { System.out.println("Materia = " +
			 * disc.getDisciplina() + " Nota = " + disc.getNota());
			 * 
			 * }
			 */
		}
	}

}
