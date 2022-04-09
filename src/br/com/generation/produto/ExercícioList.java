package br.com.generation.produto;

public class ExercícioList {
	
		
		//Atributos --> variaveis
		private String produto;
		private String nome;
		
		
		//Construtores de classe
		
		
		public ExercícioList(String produto, String nome) {
			super();
			this.produto = produto;
			this.nome = nome;
		}
		
		

		//Metodos getters and setters
		public String getProduto() {
			return produto;
		}


		public void setProduto(String produto) {
			this.produto = produto;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}



		@Override
		public String toString() {
			
			return "O " + produto + nome + "FOI ADICIONADO ";
		}
		
		
		


	}


