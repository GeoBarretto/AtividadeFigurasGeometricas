package formasgeometricas;

public class Quadrado implements IFormaGeometrica {
 
	private double lado;
	
	public String descricaoForma() {
		return "Quadrado";	
	}
	
	public double calculaArea() {
		return lado * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
}