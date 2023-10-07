package exercicio3;

public class Livro {
	String titulo;
	String autor;
	int ano;
	String editora;
	
	void status() {
		System.out.println(this.titulo);
		System.out.println(this.autor);
		System.out.println(this.editora + ", " + this.ano);
		
	}
	
}
