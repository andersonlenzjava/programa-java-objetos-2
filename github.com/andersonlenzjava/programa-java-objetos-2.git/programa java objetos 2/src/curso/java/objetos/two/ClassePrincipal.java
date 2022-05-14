package curso.java.objetos.two;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ClassePrincipal {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		// cria��o de um la�o que abrange tudo e repete tudo, e depois de executar o
		// la�o duas vezez permitindo alimentar a lista com objetos
		// imprime

		for (int qtd = 1; qtd <= 3; qtd++) {

			/* Cria��o de um objeto na mem�ria com o endere�o dentro da vari�vel aluno1 */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);

			// La�os para criar a entrada de dados para v�rias disciplinas

			for (int pos = 1; pos <= 2; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina); // cada uma vai ter uma posi��o na mem�ria n�o precisa ser
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
				} // est� l�gica funciona, mas n�o passa em todas as condi��es de teste possivel
					// ....
			}

			alunos.add(aluno1);
			// adiciona um aluno a minha lista de alunos

		}

		// este la�o � usado para verificar se algum dos alunos � igual a anderson
		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("anderson")) {
				alunos.remove(aluno);
				break;
			} else {
				// --------------------------------------------------------------------------------------------//
				System.out.println("Nome do aluno : " + aluno);

//		System.out.println("-----------------------------------------------------------------");

				System.out.println("Resultado do aluno = " + aluno.getAlunoAprovado());

				System.out.println("Media das notas � = " + aluno.getMediaNota());

				System.out.println("-----------------------------------------------------------------");
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "\n");
//--------------------------------------------------------------------------------------------//	
//		System.out.println(aluno1); // imprime tudo os dados do objeto para checagem rapida, la na frente vai ser
				// feito uma sele��o//
				System.out.println(aluno.getDisciplinas());
			}

		}
		// para o objeto aluno percore toda a lista de alunos, e retorna todos os aluno
		// da lista de alunos
		// la�os for podem ser aplicdos a objetos e dai possuem sintaxe diferente

		for (Aluno aluno : alunos) {
			System.out.println("Restante de alunos que sobraram da lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas materias s�o");

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());

			}

		}
	}

}