package unidade1.ex2.pacote_comida;

public class MainLanchonete {

	public static void main(String[] args) {
		Lanche l1 = new Lanche("Dogão", 8);
		Lanche l2 = new Lanche("Espeto", 4);

		Lanchonete lanchonete = new Lanchonete();
		lanchonete.fazerPedido("Jorge", l1);
		lanchonete.fazerPedido("Julia", l2);

		lanchonete.listarItens();
		lanchonete.listarPedidos();
	}

}
