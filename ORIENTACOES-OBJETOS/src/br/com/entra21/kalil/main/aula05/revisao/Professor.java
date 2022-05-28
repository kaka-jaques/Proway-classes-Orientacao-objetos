package br.com.entra21.kalil.main.aula05.revisao;

import br.com.entra21.kalil.main.aula02.herancas.Pessoa;

public class Professor extends Pessoa implements comportamentosAcademicos {

	private Estudante estudantes[];
	private Disciplina disciplina[];
	
	public Professor() {
		
	}
	
	public Professor(Estudante[] estudantes, Disciplina[] disciplina) {
		super();
		this.estudantes = estudantes;
		this.disciplina = disciplina;
	}

	public Professor(String nome, String cpf, byte idade) {
		super(nome, cpf, idade);
	}
	
	public Professor(String nome, String cpf, byte idade, Estudante[] estudantes, Disciplina[] disciplina) {
		super(nome, cpf, idade);
		this.estudantes = estudantes;
		this.disciplina = disciplina;
	}

	public Estudante[] getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	@Override
	public String realizarApresentacao() {
	
		String msg = "Oi, sou o professor "+super.getNome()+", e tenho "+this.estudantes.length;
		return msg;
	}

	@Override
	public String gerarDossie(String nome) {
		
		String msg = "";
		Estudante student = null;
		
		for(byte estudante=0;estudante <this.estudantes.length;estudante++) {
			if(this.estudantes[estudante] != null && this.estudantes[estudante].getNome().equals(nome)) {
				student = this.estudantes[estudante];
				break;
			}
		}
		
		if(student != null) {
			msg = escreverDetalheDossie(student);
		}else {
			return "Parece que "+nome+"não está na minha lista seleta de alunos";
		}
		
		return msg;
	}
	
	private String escreverDetalheDossie(Estudante estudante) {
		
		String detalhe = "O estudante "+estudante.getNome()+" já aprendeu "+estudante.getDisciplinas().length+" disciplinas";
		detalhe += "\nObservações que eu percebi sobre este aluno";
		detalhe += "\n"+estudante.getObservacao();
		
		return detalhe;
		
	}
	
}
