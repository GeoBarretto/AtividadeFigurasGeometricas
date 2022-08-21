package formasgeometricas;

public class ImprimirFormas {
	public void imprimir(IFormaGeometrica fg){
		
		System.out.println("Jogo matematico - Descubra a area da figura geometrica informando os dados");
		System.out.println("Figura geometrica: " + fg.descricaoForma());
		System.out.println("Area da figura: " + fg.calculaArea());
		System.out.println("--------------------------------------");
	}
}