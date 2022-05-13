package curso.java.objetos.two;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ClassePrincipal {

	public static void main(String[] args) {

		/* Criação de um objeto na memória com o endereço dentro da variável aluno1 */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno 1");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento");
		String cpf = JOptionPane.showInputDialog("Qual o numero do CPF");

		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNumeroCpf(cpf);
		
		//Laços para criar a entrada de dados para várias disciplinas
		
		for (int pos = 1; pos <= 4; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina); //cada uma vai ter uma posição na memória não precisa ser estatico ele vai criando por si  e dai ela
		}

//--------------------------------------------------------------------------------------------//		
		System.out.println("Nome do aluno 1: " + aluno1.getNome());
		System.out.println("Idade do aluno 1: " + aluno1.getIdade());
		System.out.println("Data Nascimento do aluno 1: " + aluno1.getDataNascimento());
		System.out.println("Numero do CPF do aluno 1: " + aluno1.getNumeroCpf());
		System.out.println("Data da matricula aluno 1: " + aluno1.getDataMatricula());
		System.out.println("-----------------------------------------------------------------");
	
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
		System.out.println("Media das notas é  = " + aluno1.getMediaNota());

		System.out.println("-----------------------------------------------------------------");
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2() + "\n");
//--------------------------------------------------------------------------------------------//	
		System.out.println(aluno1); // imprime tudo os dados do objeto para checagem rapida, la na frente vai ser
									// feito uma seleção//
	}

}