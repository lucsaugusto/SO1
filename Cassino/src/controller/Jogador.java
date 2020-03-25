package controller;

import java.util.Random;

public class Jogador{
	Random random = new Random();
	public int dado1 = 0;
	public int dado2 = 0;
	private int pontos = 0;
	
	public Jogador() {
		super();
	}
	
	public int jogar() {
		dado1 = random.nextInt(6)+1;
		dado2 = random.nextInt(6)+1;
		//System.out.println("Dado1: "+ dado1 +"\nDado2: "+ dado2);
		return dado1 + dado2;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos() {
		pontos = pontos+1;
	}
	
}
