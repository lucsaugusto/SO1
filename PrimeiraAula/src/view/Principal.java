package view;

import controller.OperacoesController;

public class Principal { 
	public static void main(String[] args) {
		
		OperacoesController opController = new OperacoesController();
//		opController.OpString();
//		opController.OpBuffer();
		
		String frase = "Sejam bem vindos de vola � Fatec Zona Leste neste semestre";
		opController.OpFrase(frase);
	}
}
