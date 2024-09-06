package unidade2.ex1;

import java.time.LocalDateTime;

import unidade2.ex1.mercardo_heranca.Produto;
import unidade2.ex1.mercardo_heranca.ProdutoPerecivel;

public class MainMercardo {

	public static void main(String[] args) {
		Produto p1 = new Produto("Copo", 10);
		Produto p2 = new Produto("Caneta", 5);
		Produto p3 = new Produto("Borracha", 7);
		ProdutoPerecivel p4 = new ProdutoPerecivel("Queijo", 10, LocalDateTime.now());
		ProdutoPerecivel p5 = new ProdutoPerecivel("Carne", 2, LocalDateTime.now());

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}

}
