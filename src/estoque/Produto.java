package estoque;

public class Produto {

	private String nome;
	private int quantidade;
	private double preco;

	public Produto(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "Produto: " + nome + " | Quantidade: " + quantidade + " | Preço: R$ " + String.format("%.2f", preco);
	}

}