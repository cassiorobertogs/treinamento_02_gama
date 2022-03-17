/*
 * Considere que você está desenvolvendo um aplicativo de livro eletrônico. 
Você deve criar uma classe chamada Ebook com os seguintes atributos:
título, autor, total de páginas e número da página atual.
A classe deve ter os seguintes métodos:
Avançar uma página
Voltar uma página
Mudar para uma página informada
Mostrar o número da página atual
Escreva  o app main para criar um objeto e testar os métodos.
Monstrar os dados do livro

 */
public class Ex03Ebook {

	private String titulo;
	private String autor;
	private int numeroDePaginas;
	private int paginaAtual;

	public Ex03Ebook(String titulo, String autor, int numeroDePaginas, int paginaAtual) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		if (numeroDePaginas > 0) {
			this.numeroDePaginas = numeroDePaginas;
		}
		if (paginaAtual > 0) {
			this.paginaAtual = paginaAtual;
		}
	}// fim do construtor

	public void avancaPagina() {
		this.paginaAtual += 1;
	}

	public void retrocedePagina() {
		this.paginaAtual -= 1;
	}

	public void irParaPagina(int irParaPagina) {
		if (irParaPagina > 0 && irParaPagina <= numeroDePaginas) {
			this.paginaAtual = irParaPagina;
		}
	}
	public int getPaginaAtual(){
		return this.paginaAtual;
	}
}// fim class
