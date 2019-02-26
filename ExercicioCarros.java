package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

//Exercício realizado pelos alunos:
//	Adler Mateus Cachuba
//	Elisariane Barbosa
public class ExercicioCarros {
	public static void main(String args[]) {
		// Colocamos dois ints para o usuario usar como escolha
		int escolha = 7;
		int usuarioNovoCarro = 7;

		// A lista com todos os carros que chamaremos de categoria global
		ArrayList<Carros> carrolista = new ArrayList();

		// A lista com as categorias
		ArrayList<Carros> categoriaUm = new ArrayList();
		ArrayList<Carros> categoriaDois = new ArrayList();
		ArrayList<Carros> categoriaTres = new ArrayList();

		// Vai realizar até o usuario digitar 0
		do {
			System.out.println("Bem vindo ao Sistema de Carros IFPR 2019");
			System.out.println("1- Cadastrar carro");
			System.out.println("2- Visualizar todos carros e suas características");
			System.out.println("3- Mostrar carros nas categorias");
			System.out.println("0- Sair do programa");

			System.out.println("--------------");

			// Usuario digita sua opção
			System.out.print("Digite sua opção:");
			Scanner digitaMenu = new Scanner(System.in);
			escolha = digitaMenu.nextInt();

			if (escolha == 1) {
				do {
					// Instanciamos um novo objeto
					Carros carro = new Carros();

					System.out.print("Digite a cor do carro: ");
					Scanner digita = new Scanner(System.in);
					carro.cor = digita.nextLine();

					System.out.print("Digite o ano do carro: ");
					carro.ano = digita.nextInt();

					System.out.print("Digite true se for novo, caso contrário digite false: ");
					carro.novo = digita.nextBoolean();

					System.out.print("Digite o preço: ");
					carro.preco = digita.nextDouble();

					// Colocamos ele na categoria conforme seu preço, e na categoria global
					if (carro.preco <= 10000) {
						categoriaUm.add(carro);
					}

					if (carro.preco > 10000 && carro.preco <= 20000) {
						categoriaDois.add(carro);
					}

					if (carro.preco > 20000) {
						categoriaTres.add(carro);
					}

					carrolista.add(carro);

					// Menu para re-cadastramento de carro
					System.out.println("-----------------------");
					System.out.println("Cadastrar outro carro?");
					System.out.println("1- Sim");
					System.out.println("0- Não");
					System.out.println("----------------------");
					usuarioNovoCarro = digita.nextInt();

				} while (usuarioNovoCarro != 0);

			}

			if (escolha == 2) {
				// Mostramos a quantidade de carros disponíveis, e todos os carros e seus
				// atributos
				System.out.println("Mostrar todos os Carros e suas Categorias");
				System.out.println("Atualmente temos " + carrolista.size() + " carros disponíveis");
				System.out.println("-----------------------------------------");
				for (int i = 0; i < carrolista.size(); i++) {
					System.out.println("Carro número " + (i + 1) + carrolista);

				}

				System.out.println("-----------------------------------------");
			}

			if (escolha == 3) {
				// Mostramos conforme as categorias
				int escolhaCategoria;
				System.out.println("-----------------------------------------");
				System.out.println("Digite a categoria escolhida:");
				System.out.println("1- Carros com valor abaixo de R$10.000");
				System.out.println("2- Carros de R$10.000 a R$20.000");
				System.out.println("3- Carros com valor acima de R$20.000");
				System.out.println("-----------------------------------------");
				System.out.print("Digite sua opção:");
				Scanner escolhaCat = new Scanner(System.in);
				escolhaCategoria = escolhaCat.nextInt();

				if (escolhaCategoria == 1) {
					for (int i = 0; i < categoriaUm.size(); i++) {
						System.out.println("Carro número " + (i + 1) + categoriaUm);
					}
					System.out.println("-----------------------------------------");
				}
				if (escolhaCategoria == 2) {
					for (int i = 0; i < categoriaDois.size(); i++) {
						System.out.println("Carro número " + (i + 1) + categoriaDois);
					}
					System.out.println("-----------------------------------------");
				}
				if (escolhaCategoria == 3) {
					for (int i = 0; i < categoriaTres.size(); i++) {
						System.out.println("Carro número " + (i + 1) + categoriaTres);
					}
					System.out.println("-----------------------------------------");
				} else {
					System.out.println("Você digitou uma categoria que está vazia por enquanto ");
					System.out.println("-----------------------------------------");
				}

			}

		} while (escolha != 0);

	}

}