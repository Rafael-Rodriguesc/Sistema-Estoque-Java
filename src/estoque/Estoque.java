package estoque;

import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> listaProdutos = new ArrayList<>();

	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
	}

	public Produto buscarProduto(String nome) {

		for (Produto produto : listaProdutos) {

			if (produto.getNome().equalsIgnoreCase(nome)) {
				return produto;
			}

		}

		return null;
	}

	public boolean removerProduto(String nome) {

		Produto produto = buscarProduto(nome);

		if (produto != null) {

			listaProdutos.remove(produto);
			return true;

		}

		return false;
	}

	public void mostrarEstoque() {

		if (listaProdutos.isEmpty()) {

			System.out.println("\nO estoque está vazio.");
			return;

		}

		System.out.println("\n========== ESTOQUE ==========");

		for (Produto produto : listaProdutos) {

			System.out.println("--------------------------------");
			System.out.println("Produto: " + produto.getNome());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.printf("Preço: R$ %.2f%n", produto.getPreco());

		}

	}

}