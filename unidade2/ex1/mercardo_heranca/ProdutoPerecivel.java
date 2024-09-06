package unidade2.ex1.mercardo_heranca;

import java.time.LocalDateTime;

public class ProdutoPerecivel extends Produto {
	private LocalDateTime validadade;

	public ProdutoPerecivel(String nome, int quantidade, LocalDateTime validadade) {
		super(nome, quantidade);
		this.validadade = validadade;
	}

	public LocalDateTime getValidadade() {
		return validadade;
	}

	public void setValidadade(LocalDateTime validadade) {
		this.validadade = validadade;
	}

	@Override
	public String toString() {
		return "ProdutoPerecivel [validadade=" + validadade + ", toString()=" + super.toString() + "]";
	}

	
}
