package br.com.fiapride.model;

public class veiculos {
	private String individuo;
	public String placa;
	private double gas;
	public String getIndividuo;
	public int getGas;
	public String individuo1;
	
	//ADICIONAR
	public void adicionar(double v) {
		gas = gas + v;
		if (v <=0) {
			System.out.println("Erro: O valor de recarga deve ser maior que zero.");
			return;
		}
		this.gas += v;
		System.out.println("Recarga realizada. Novo saldo: " + this.gas);
	}

	;//GASTA
	public void gasta(double v) {
		gas = gas - v;
	}
	
	//GETGAS
	public double getGas() {
		return this.gas;
	}
	
	//SETGAS
	public void setGas(double i, int v) {
		if (v >= 0) {
			this.gas = v;
		}
		else {
			System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
		}
	}
	
	//VEICULOS - ADICIONAR PESSOA E COMEÇO DO "SALDO"
	public veiculos(double setGas, int i, int i1, String individuo, String individuo1) {
		this.individuo = individuo1;
		this.setGas(0,0);
	}
	
	
}