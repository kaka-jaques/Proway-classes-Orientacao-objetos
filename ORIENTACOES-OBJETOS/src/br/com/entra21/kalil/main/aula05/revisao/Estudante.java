package br.com.entra21.kalil.main.aula05.revisao;

import br.com.entra21.kalil.main.aula02.herancas.Pessoa;

public class Estudante extends Pessoa implements comportamentosAcademicos{

	private Disciplina disciplinas[];
	
	public Estudante() {
		
	}
	
	public Estudante(Disciplina[] disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}
	
	public Estudante(String nome, String cpf, byte idade) {
		super(nome, cpf, idade);
	}
	
	public Estudante(String nome, String cpf, byte idade, Disciplina[] disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String realizarApresentacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gerarDossie(String nome) {
		
		String msg = "";
		
		if(nome.equals(super.getNome())) {
			msg = "O dossie sobre mim é gerado com minha interação entre professor e colegas";
		}else {
			msg = "EI! Você errou meu nome";
		}
		
		return msg;
		
	}
	
}
