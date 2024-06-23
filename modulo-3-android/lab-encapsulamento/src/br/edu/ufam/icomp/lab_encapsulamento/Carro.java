package br.edu.ufam.icomp.lab_encapsulamento;

public class Carro {
	protected String placa;
	
	public Carro(String placa) {
		this.setPlaca(placa);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
