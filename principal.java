package br.com.fiapride.main;

import br.com.fiapride.model.veiculos;

public class principal {

	public static void main(String[] args) {
		System.out.println(".... Iniciando o App de Veiculos ....\n");
		
		veiculos v1 = new veiculos(0,0, 0, null, null);
		System.out.println("Novo automovel - veiculo v1/n");
		v1.getIndividuo = "Carlos";
		System.out.println("Individuo: Carlos /n");
		v1.placa = "ABC-1234";
		System.out.println("NPlaca registrada ABC-1234/n");
		v1.getGas = 10;
		v1.adicionar(50);
		v1.gasta(100);
		System.out.println("Dono: " + v1.individuo1 + " | Placa: " + v1.placa + " | Gasolina: " + v1.getGas());
	}
}