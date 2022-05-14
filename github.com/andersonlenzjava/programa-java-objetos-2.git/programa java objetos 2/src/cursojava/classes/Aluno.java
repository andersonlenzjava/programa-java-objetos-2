package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

/* Classe é uma forma que representa o aluno */
public class Aluno {

	private String nome;
	private Integer idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;

	/* forma de instânciar uma lista de disciplina  ATRIBUI A VARIAVEL disciplinas a lista dos atributos de disciplinas*/
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
	this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
	return disciplinas;
	}

	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	/*
	 * /* Método get com retorno de um double com o cálculo da média do aluno
	 */
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		//laço para fazer uma varedura de todos os atributos do atributo nota
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	/* Chamo o método dentro do proprio método */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	/* Normalmente é usado boolean, string fica mais para telas */
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if(media >= 70) {
				if(media > 90) { 
					return "Aluno você está aprovado - Parabéns";
				}else {
					return "Aluno você está aprovado";
				}
			}else {
				return "Aluno você está de recuperação - estude mais !!";
			}
		}else {
			return "Aluno você está reprovado";
		}
	}	

	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}

}