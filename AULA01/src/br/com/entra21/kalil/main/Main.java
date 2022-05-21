package br.com.entra21.kalil.main;

import java.util.Scanner;
import br.com.entra21.kalil.main.classes.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//PROFESSOR
		
		Professor prof = new Professor("Rubem", (byte) 33);
		
		System.out.println("Nome do professor é "+prof.getNome());
		
		System.out.println("Seta um novo nome pro professor: ");
		prof.setNome(sc.nextLine());
		
		System.out.println("Novo nome do professor é "+prof.getNome());
		
		//chamando atributo instituto sem usar o "new"
		System.out.println("O professor trabalha na "+Professor.instituto);
		
		
		
		//ALUNO
		
		Aluno alunoTeste   = new Aluno();
		Aluno outroAluno   = new Aluno();
		Aluno alunoFulano  = new Aluno();
		
		//meio de chamar classe
		Aluno alunoObjeto;
		
		alunoObjeto= new Aluno();
		
		alunoTeste.idade = 21;
		alunoTeste.nome = "Kalil";
		
		outroAluno.idade = 2;
		outroAluno.nome = "Naine";
		
		alunoFulano.idade = 10;
		alunoFulano.nome = "Rubem";
		
		System.out.println("Qual o nome do último aluno?");
		alunoObjeto.nome = sc.nextLine();
		
		System.out.println("Qual a idade de "+alunoObjeto.nome);
		alunoObjeto.idade = sc.nextByte();
		
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		
		outroAluno.responderChamada();
		outroAluno.responderChamada();
		outroAluno.responderChamada();
		outroAluno.responderChamada();
		
		alunoObjeto.responderChamada();
		alunoObjeto.responderChamada();
		alunoObjeto.responderChamada();
		alunoObjeto.responderChamada();
		
		System.out.println("Aluno "+alunoTeste.nome+" compareceu "+alunoTeste.qtdPresenca);
		System.out.println("Aluno "+outroAluno.nome+" compareceu "+outroAluno.qtdPresenca);
		System.out.println("Aluno "+alunoObjeto.nome+" compareceu "+alunoObjeto.qtdPresenca);
		
	}

}