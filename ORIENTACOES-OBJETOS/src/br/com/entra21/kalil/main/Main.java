package br.com.entra21.kalil.main;

import java.util.Scanner;

import br.com.entra21.kalil.main.aula01.classes.*;
import br.com.entra21.kalil.main.aula02.herancas.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		byte op;
		
		do {
			
			System.out.println("Selecione uma opção desejada:");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender classes");
			System.out.println("2 - Aprender herança");
			
			op = sc.nextByte();
			
			switch(op) {
			
			case 0:
				
				System.out.println("Bye bye");
				
				break;
			case 1:
				
				aprenderClassesObjetos();
				
				break;
			case 2:
				
				aprenderHerancas();
				
				break;
			default:
				break;
			
			}
			
		}while(op != 0);
	
	}
	
	public static void aprenderClassesObjetos() {
		
		//PROFESSOR
		
				Professor prof = new Professor("Rubem", (byte) 33);
				
				System.out.println("Nome do professor é "+prof.getNome());
				
				System.out.println("Seta um novo nome pro professor: ");
				prof.setNome(sc.nextLine());
				
				System.out.println("Novo nome do professor é "+prof.getNome());
				
				//chamando atributo instituto sem usar o "new"
				//não um atributo, mas um "objeto" próprio da classe
				System.out.println("O professor trabalha na "+Professor.instituto);
				
				
				
				//ALUNO
				
				//meio de chamar classe
				Aluno alunoTeste   = new Aluno();
				Aluno outroAluno   = new Aluno();
				Aluno alunoFulano  = new Aluno();
				
				//meios de chamar atributos da classe
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
		
	public static void aprenderHerancas() {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte)21);
		funcionario1.setNome("Kalil");
		funcionario1.setCargoAtual("Dev jr");
		funcionario1.setSalario(20054f);
		
		Funcionario funcionario2 = new Funcionario("Kalil", "Fulstack Dev Jr.", (byte) 21, 20000f);
		
		System.out.println("Olá, meu nome é "+funcionario1.getNome()+", tenho "+funcionario1.getIdade()+" anos, trabalho com"+ funcionario1.getCargoAtual()+", recebo R$"+funcionario1.getSalario());
		
		Diretor diretor1 = new Diretor("Paulo", "123.345.235-54", "Programação", (byte) 80, (byte) 37);
		
	}
	
	
	
}