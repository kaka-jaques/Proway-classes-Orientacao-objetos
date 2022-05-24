package br.com.entra21.kalil.main.aula01.classes;

import java.util.Scanner;

public class Aluno {
		
		//atributos que cada aluno terá
		public String nome;
		public byte idade;
		public byte qtdPresenca;
		
		public Aluno() {
			
		}

		public byte responderChamada() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("O aluno "+this.nome+"está ai?");
			String resposta = sc.next();
			
			if(resposta.equalsIgnoreCase("sim")) {
				
				this.qtdPresenca++;
				
			}
			
				return this.qtdPresenca;
				
			}
		
}
