package formasgeometricas;

public class Triangulo implements IFormaGeometrica {
	private double altura;
	private double base;

	public String descricaoForma() {
		return "Retangulo";
	}

	@Override
	public double calculaArea() {
	
		return (base * altura)/2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
}
