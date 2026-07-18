package estoque;

public class Venda {

	public boolean realizarVenda(Produto produto, int quantidadeVendida) {

		if (quantidadeVendida <= 0) {
			System.out.println("Quantidade inválida!");
			return false;
		}

		if (produto.getQuantidade() >= quantidadeVendida) {

			produto.setQuantidade(produto.getQuantidade() - quantidadeVendida);

			System.out.println("\nVenda realizada com sucesso!");
			return true;

		} else {

			System.out.println("\nEstoque insuficiente!");
			return false;

		}

	}

}