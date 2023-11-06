package exercicio6;

public class Retangulo extends Quadrado implements Desenho {
	double altura;
	
	public Retangulo(double lado, double altura) {
		super(lado);
		this.altura = altura;
	}
	@Override
	double calcularArea() {
		return lado * altura;
	}
	@Override
	double calcularPerimetro() {
		return 2 * lado + 2 * altura;
	}
	@Override
	public String desenhar() {
		return "Desenhando a Figura Retângulo";
	}

}
