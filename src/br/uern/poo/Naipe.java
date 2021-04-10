package br.uern.poo;

import javax.swing.ImageIcon;

/**
 *
 * @author Marcelo
 */
public enum Naipe {

	PAUS ("paus"), OURO("ouro"), COPAS("copas"), ESPADA("espada");

	private final String nome;
	

	private Naipe(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
