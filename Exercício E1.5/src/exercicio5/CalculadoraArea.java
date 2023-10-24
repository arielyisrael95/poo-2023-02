package exercicio5;

public class CalculadoraArea extends FormaGeometrica {

	public static void main(String[] args) {
		
		double x, y, z;
		
		Circulo areaCirculo = new Circulo();
		x = areaCirculo.calcularArea(3.5);
		
		Retangulo areaRetangulo = new Retangulo();
		y = areaRetangulo.calcularArea(2.3, 3.1);
		
		Triangulo areaTriangulo = new Triangulo();
		z = areaTriangulo.calcularArea(6.7, 4.0);
		
		System.out.println(" Soma das área: " + (x + y + z));
	}

}
