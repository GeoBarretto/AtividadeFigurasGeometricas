package test;

import formasgeometricas.Circulo;
import formasgeometricas.ImprimirFormas;
import formasgeometricas.Quadrado;
import formasgeometricas.Retangulo;
import formasgeometricas.Triangulo;

public class TestaFormasGeometricas {
	
	public static void main(String[] args) {

		Quadrado q = new Quadrado();
		q.setLado(7);
		
		
		Circulo c = new Circulo();
		c.setRaio(3);
		
		Retangulo r = new Retangulo();
		r.setAltura(2);
		r.setBase(4);
		
		Triangulo t = new Triangulo();
		t.setAltura(4);
		t.setBase(6);
		
		ImprimirFormas imp = new ImprimirFormas();
		imp.imprimir(q);
		imp.imprimir(c);
		imp.imprimir(r);
		imp.imprimir(t);
	}
	
}