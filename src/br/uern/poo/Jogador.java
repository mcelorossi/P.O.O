package br.uern.poo;

public class Jogador {
	
	private final int cartasNoJogo = 5;
	private  String nome; 
	private  CartaBaralho mao [];
	private int pontos;
	
	public Jogador (String nome, CartaBaralho mao []) {
		this.nome = nome;
		this.mao = mao;
		this.pontos = 0
	}
	
	private int adicionarPontuação(CartaBaralho carta1, CartaBaralho carta2) {
		int pontuacao = carta1.getCarta().getPontos() + carta2.getCarta().getPontos();
		return pontuacao;
		
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getCartasNoJogo() {
		return cartasNoJogo;
	}
	public String getNome() {
		return nome;
	}
	public CartaBaralho[] getMao() {
		return mao;
	}
	
	

}
