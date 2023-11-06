package exercicio6;

public class CriarObjetos {

	public static void main(String[] args) {
		

//criando instancias para calcular a area
		
		Quadrado quadrado = new Quadrado(2);
		
		Circulo circulo = new Circulo(2.0);
		
		Triangulo triangulo = new Triangulo(2.6, 5, 8.7, 3.9);
		
		Retangulo retangulo = new Retangulo(5.4, 7.9);
		
//printando
		
		System.out.println("Quadrado");
		System.out.println("Área: " + quadrado.calcularArea());
		System.out.println("Perímetro: " + quadrado.calcularPerimetro());
		System.out.println("Desenho: " + quadrado.desenhar());
		
		System.out.println("\nCirculo ");
		System.out.println("Área: " + circulo.calcularArea());
		System.out.println("Perímetro: " + circulo.calcularPerimetro());
		System.out.println("Desenho: " + circulo.desenhar());
		
		System.out.println("\nTriângulo");
		System.out.println("Área: " + triangulo.calcularArea());
		System.out.println("Perímetro: " + triangulo.calcularPerimetro());
		System.out.println("Desenho: " + triangulo.desenhar());
		
		System.out.println("\nRetangulo");
		System.out.println("Área: " + retangulo.calcularArea());
		System.out.println("Perímetro: " + retangulo.calcularPerimetro());
		System.out.println("Desenho: " + retangulo.desenhar());
		
		

	}

}
