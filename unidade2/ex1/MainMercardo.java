package unidade2.ex1;

import java.time.LocalDateTime;

import unidade2.ex1.mercardo_heranca.Produto;
import unidade2.ex1.mercardo_heranca.ProdutoPerecivel;

public class MainMercardo {

	public static void main(String[] args) {
		Produto produto = new Produto("Copo", 10);
		ProdutoPerecivel perecivel = new ProdutoPerecivel("Queijo", 10, LocalDateTime.now());
		System.out.println(produto);
		System.out.println(perecivel);
	}

}
