package unidade1.ex2.pacote_comida;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
	private List<Lanche> pedidos;
	private List<String> clientes;

	public Lanchonete() {
		this.pedidos = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public void listarItens() {
		for (Lanche lanche : pedidos) {
			System.out.println(lanche);
		}
	}

	public void listarPedidos() {
		System.out.println("Pedidos:");
		for (int i = 0; i < pedidos.size(); i++) {
			System.out.println(pedidos.get(i));
			System.out.println(clientes.get(i));
		}
	}

	protected void fazerPedido(String cliente, Lanche lanche) {
		clientes.add(cliente);
		pedidos.add(lanche);
		
	}

}
