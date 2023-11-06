package exercicio6;

public class Circulo extends Figura implements Desenho {
	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	@Override
	double calcularArea() {
		return Math.PI * raio * raio;
	}
	@Override
	double calcularPerimetro() {
		return Math.PI * 2 * raio;
	}
	@Override
	public String desenhar() {
		return "Desenhando a Figura Círculo";
	}

}
