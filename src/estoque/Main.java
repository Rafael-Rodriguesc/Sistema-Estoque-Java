package estoque;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		Estoque estoque = new Estoque();
		Venda sistemaVenda = new Venda();

		int opcao = 0;

		while (opcao != 6) {

			System.out.println("\n========== SISTEMA DE ESTOQUE ==========");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Atualizar Quantidade");
			System.out.println("3 - Realizar Venda");
			System.out.println("4 - Buscar Produto");
			System.out.println("5 - Mostrar Estoque");
			System.out.println("6 - Sair");
			System.out.print("Escolha uma opção: ");

			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {

			case 1:

				System.out.print("Nome do produto: ");
				String nome = sc.nextLine();

				System.out.print("Quantidade: ");
				int quantidade = sc.nextInt();

				System.out.print("Preço: ");
				double preco = sc.nextDouble();
				sc.nextLine();

				Produto novoProduto = new Produto(nome, quantidade, preco);

				estoque.cadastrarProduto(novoProduto);

				System.out.println("\nProduto cadastrado com sucesso!");
				break;

			case 2:

				System.out.print("Nome do produto: ");
				nome = sc.nextLine();

				Produto produto = estoque.buscarProduto(nome);

				if (produto != null) {

					System.out.print("Nova quantidade: ");
					int novaQuantidade = sc.nextInt();
					sc.nextLine();

					produto.setQuantidade(novaQuantidade);

					System.out.println("Quantidade atualizada!");

				} else {

					System.out.println("Produto não encontrado.");

				}

				break;

			case 3:

				System.out.print("Nome do produto: ");
				nome = sc.nextLine();

				produto = estoque.buscarProduto(nome);

				if (produto != null) {

					System.out.print("Quantidade para venda: ");
					int qtdVenda = sc.nextInt();
					sc.nextLine();

					sistemaVenda.realizarVenda(produto, qtdVenda);

				} else {

					System.out.println("Produto não encontrado.");

				}

				break;

			case 4:

				System.out.print("Nome do produto: ");
				nome = sc.nextLine();

				produto = estoque.buscarProduto(nome);

				if (produto != null) {

					System.out.println(produto);

				} else {

					System.out.println("Produto não encontrado.");

				}

				break;

			case 5:

				estoque.mostrarEstoque();
				break;

			case 6:

				System.out.println("\nPrograma encerrado.");
				break;

			default:

				System.out.println("Opção inválida.");

			}

		}

		sc.close();

	}

}