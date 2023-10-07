package exercicio3;

public class TesteLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro();
		livro1.titulo = "Pré-Escrita - Coleção Aprenda em Casa";
		livro1.autor = "Vários Autores";
		livro1.ano = 2015;
		livro1.editora = "Todolivro";
		System.out.print("1.\n");
		livro1.status();
		
		Livro livro2 = new Livro();
		livro2.titulo = "Imperfeitos";
		livro2.autor = "Christina Lauren";
		livro2.ano = 2022;
		livro2.editora = "Faro Editorial";
		System.out.print("\n2.\n");
		livro2.status();
		
		Livro livro3 = new Livro();
		livro3.titulo = "Perigoso!";
		livro3.autor = "Tim Warnes";
		livro3.ano = 2014;
		livro3.editora = "Ciranda Cultural";
		System.out.print("\n3.\n");
		livro3.status();
		

	}

}
