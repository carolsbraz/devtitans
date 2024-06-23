package br.edu.icomp.ufam.lab_heranca;

import java.util.ArrayList;
import java.util.Iterator;

public class FormasMain {
	public static void main(String[] args) {
		
		ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
		
		Circulo circulo = new Circulo(2,4,5);
		formas.add(circulo);
		
		Retangulo retangulo = new Retangulo(2,4,6,7);
		formas.add(retangulo);
		
		Quadrado quadrado = new Quadrado(2,4,6);
		formas.add(quadrado);
		
		Iterator<FormaGeometrica> iterator = formas.iterator();
		
	    while (iterator.hasNext()) {
	    	FormaGeometrica formaAtual = iterator.next();
	      System.out.println(formaAtual);
	    } 

		
	}
}
