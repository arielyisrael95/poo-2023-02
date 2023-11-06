package exercicio6;

public class Triangulo extends Figura implements Desenho {
	
	double base, lado1, lado2, altura;
	
	public Triangulo(double base, double lado1, double lado2, double altura) {
		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
		
	}
	@Override
	public double calcularArea() {
		return base * altura / 2;
	}
	@Override
	double calcularPerimetro() {
		return base + lado1 + lado2;
	}
	@Override
	public String desenhar() {
		return "Desenhando a Figura Triangulo";
	}
	

}
