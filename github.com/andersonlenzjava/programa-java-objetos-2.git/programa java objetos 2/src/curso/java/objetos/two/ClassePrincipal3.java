package curso.java.objetos.two;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ClassePrincipal3 {

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

			for (int pos = 1; pos <= 4; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina); // cada uma vai ter uma posição na memória não precisa ser
															// estatico
															// ele vai criando por si e dai ela
			}

			alunos.add(aluno1);
			// adiciona um aluno a minha lista de alunos

		}
		// pega os dados preenchidos

		for (int pos = 0; pos < alunos.size(); pos++) {

			Aluno aluno = alunos.get(pos); // retorna o aluno de uma determinada posição percorer as listas por posição

////////////////////////////////////////////////////////////////////////////////////////////////
//se o aluno igual alex ele é substituido e criado um novo aluno e novas disciplinas são adicionadas a ele 
//poderia ser um método este processo para ficar mais organizado 			

			if (aluno.getNome().equalsIgnoreCase("alex")) {

				Aluno trocar = new Aluno(); // criou o novo aluno trocar
				trocar.setNome("Aluno foi trocado"); // setou o seu nome que poderia ser entrada teclado

				for (int nd = 1; nd <= 4; nd++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina do aluno a trocar " + nd + "?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina do aluno a trocar " + nd + "?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					trocar.getDisciplinas().add(disciplina);
					// adiciona disciplinas ao aluno trocar

				}
				alunos.set(pos, trocar);// grava os dados da variavel trocar na posição do aluno alex
				aluno = alunos.get(pos);// recupera para variavel aluno os novos dados, para seguir o sistema com a nova
										// lista
			}
//////////////////////////////////////////////////////////////////////////////////////////////////

			System.out.println("###############################################################");
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Media do aluno e = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("---------------------------------------------------------------");

//percore a lista pela posição			

			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {

				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Materia = " + disc.getDisciplina() + " Nota = " + disc.getNota());
			}

		}
	}

}
