package curso.java.objetos.two;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ClassePrincipal2 {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		// criação de um laço que abrange tudo e repete tudo, e depois de executar o
		// laço duas vezez permitindo alimentar a lista com objetos
		// imprime

		for (int qtd = 1; qtd <= 3; qtd++) {

			/* Criação de um objeto na memória com o endereço dentro da variável aluno1 */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);

			// Laços para criar a entrada de dados para várias disciplinas

			for (int pos = 1; pos <= 2; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina); // cada uma vai ter uma posição na memória não precisa ser
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
				} // está lógica funciona, mas não passa em todas as condições de teste possivel
					// ....
			}

			alunos.add(aluno1);
			// adiciona um aluno a minha lista de alunos

		}
		//para substituir valores de uma posição de uma determinada lista 
		
		for (int pos = 0; pos <alunos.size(); pos ++) {
			
		}
	}

}
