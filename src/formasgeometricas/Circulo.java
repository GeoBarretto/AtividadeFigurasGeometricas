package formasgeometricas;

public class Circulo implements IFormaGeometrica {
	private double raio;

	public String descricaoForma() {
		return "Circulo";
	}
	
	public double calculaArea() {
		return 3.14 * (raio * raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
}
