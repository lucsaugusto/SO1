package controller;

import java.util.ArrayList;
import java.util.List;

public class CassinoController extends Thread{
	private Jogador jogadores[] = new Jogador[10];
	private int vencedores[] = new int[3];
	private int pos = 0;
	private int jogada = 0;
	
	public CassinoController() {
		for(int i = 0; i < 10; i++) {
			jogadores[i] = new Jogador();
		}
		
	}
	
	
	
	public void rodar() {
		do {
			for(int i = 0; i < 10; i++) {
				jogada = jogadores[i].jogar();
				if(jogada == 7 || jogada == 11) {
					jogadores[i].setPontos();
					if(jogadores[i].getPontos() == 5) {
						vencedores[pos] = i + 1;
						pos++;
					}
				}
			}
		} while(pos != 3);
		
		System.out.println(
				"Jogador "+ vencedores[0] + ": Ficou em 1º lugar e recebeu R$ 5.000,00\n"+
				"Jogador "+ vencedores[1] + ": Ficou em 2º lugar e recebeu R$ 4.000,00\n"+
				"Jogador "+ vencedores[2] + ": Ficou em 3º lugar e recebeu R$ 3.000,00\n"
		);
	}
}