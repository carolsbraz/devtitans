package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.ArrayList;
import java.util.Iterator;

public class GISMain {
	public static void main(String[] args) {
		
		Localizavel[] vetorLocalizaveis = new Localizavel[2];
		
		
		Celular celular = new Celular(-35000, -70000, 200);
		
		vetorLocalizaveis[0] = celular;
		
		CarroLuxuoso carro = new CarroLuxuoso("KK456");
		
		vetorLocalizaveis[1] = carro;
		
		for(int i = 0; i < vetorLocalizaveis.length; i++) {
			System.out.println(vetorLocalizaveis[i].getPosicao());
		}
		
	}
}
