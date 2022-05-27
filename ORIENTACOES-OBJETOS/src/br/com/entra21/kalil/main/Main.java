package br.com.entra21.kalil.main;

import java.util.Scanner;

import br.com.entra21.kalil.main.aula01.classes.*;
import br.com.entra21.kalil.main.aula02.herancas.*;
import br.com.entra21.kalil.main.aula03.poliformismo.*;
import br.com.entra21.kalil.main.aula04.conceitospoo.*;
import br.com.entra21.kalil.main.aula05.interfaces.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		byte op;
		
		do {
			
			System.out.println("Selecione uma opção desejada:");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender Classes");
			System.out.println("2 - Aprender Herança");
			System.out.println("3 - Aprender Poliformismo");
			System.out.println("4 - Aprender Conceito POO");
			System.out.println("5 - Aprender Polimorfismo com Interface");
			System.out.println("6 - Exercicios");
			
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
			case 3:
				
				aprenderPolimorfismo();
				
				break;
			case 4:
				
				aprenderConceitosPOO();
				
				break;
			case 5:
				
				aprenderPolimorfismoInterface();
				
				break;
			case 6:
				
				exerciciosPOO();
				
				break;
			default:
				System.out.println("Presta atenção pateta!");
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
	
	public static void aprenderPolimorfismo(){
		
		Atleta atleta = new Atleta();
		Gamer gamer = new Gamer("coldzera", (byte) 40, 154, 35, "csgo", "1080p");
		Velocista velocista = new Velocista();
		Nadador nadador = new Nadador("Sérgio Michael", (byte) 39, 23, 40, "Piscína", "Sunga e Touca");

		atleta.agradecerVitoria();
		System.out.println("---------------");
		gamer.agradecerVitoria();
		System.out.println("---------------");
		velocista.agradecerVitoria();
		System.out.println("---------------");
		nadador.agradecerVitoria();
		
	}

	private static void aprenderConceitosPOO() {
		
		//a classe ponto tem alta COESÃO pois ele é preciso nas suas responsabilidades
		Ponto pontoAlto = new Ponto(30, 10000);
		Ponto esquerdaBaixo = new Ponto(-20, -100);
		
		//A classe Reta é AGREGADA por Ponto que pode não estar inicializadas
		//A associação de Reta e Ponto é de "um para muitos", respectivamente
		Reta torta = new Reta();
		Reta retaDiagonal = new Reta(pontoAlto, esquerdaBaixo);
		
		
		
	}
	
	private static void aprenderPolimorfismoInterface() {
		
		Humano kalil = new Humano();
		kalil.setNome("Kalil");
		kalil.apresentarSe();
		kalil.alimentar("Pizza");
		kalil.locomover();
		kalil.comunicar("salve salve garela");
		
		Gato taehyung = new Gato("taehyung", new Pessoa("Naine", "", (byte) 22));
		
		Pato duck = new Pato();
		duck.alimentar("milho");
		duck.comunicar("quack");
		duck.locomover();
		
		Planta umae = new Planta();
		umae.alimentar("");
		umae.comunicar("");
		umae.locomover();
		
	}
	
	public static void exerciciosPOO() {
		
		Carro tesla = new Carro("Tesla", "X4", 13.4f);
		System.out.println("Este carro é um "+tesla.getMarca()+", modelo "+tesla.getModelo()+", e faz uns "+tesla.abastecer(24f)+" Kilometros");
		
	}
	
}