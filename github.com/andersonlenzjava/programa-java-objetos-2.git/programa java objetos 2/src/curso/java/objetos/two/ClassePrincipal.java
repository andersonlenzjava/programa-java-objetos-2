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

		/*
		 * String disciplina1 =
		 * JOptionPane.showInputDialog("Qual o nome da disciplina 1"); String nota1 =
		 * JOptionPane.showInputDialog("Qual a nota 1"); String disciplina2 =
		 * JOptionPane.showInputDialog("Qual o nome da disciplina 2"); String nota2 =
		 * JOptionPane.showInputDialog("Qual a nota 2"); String disciplina3 =
		 * JOptionPane.showInputDialog("Qual o nome da disciplina 3"); String nota3 =
		 * JOptionPane.showInputDialog("Qual a nota 3"); String disciplina4 =
		 * JOptionPane.showInputDialog("Qual o nome da disciplina 4"); String nota4 =
		 * JOptionPane.showInputDialog("Qual a nota 4");
		 */

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNumeroCpf(cpf);
		aluno1.setDataMatricula("03/09/1992");

		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);

		aluno1.getDisciplinas().add(disciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Java");
		disciplina2.setNota(80);

		aluno1.getDisciplinas().add(disciplina2);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("HTML");
		disciplina3.setNota(77);

		aluno1.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("CSS");
		disciplina4.setNota(66);
		
		aluno1.getDisciplinas().add(disciplina4);

//--------------------------------------------------------------------------------------------//		
		System.out.println("Idade do aluno 1: " + aluno1.getNome());
		System.out.println("Idade do aluno 1: " + aluno1.getIdade());
		System.out.println("Idade do aluno 1: " + aluno1.getDataNascimento());
		System.out.println("Idade do aluno 1: " + aluno1.getNumeroCpf());
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