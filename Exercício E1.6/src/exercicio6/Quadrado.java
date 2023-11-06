package exercicio6;

public class Quadrado extends Figura implements Desenho {
	double lado;
	

	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	double calcularArea() {
		return lado * lado;
	}
	
	@Override
	double calcularPerimetro() {
		return lado * 4;
	}
	
	@Override
	public String desenhar() {
		return "Desenhando a figura Quadrado";
	}

}
