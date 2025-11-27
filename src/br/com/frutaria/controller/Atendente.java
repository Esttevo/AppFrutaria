package br.com.frutaria.controller;

import br.com.frutaria.model.*;

import java.util.Scanner;

public class Atendente {
	private Scanner sc;

	public Atendente() {
		sc = new Scanner(System.in);
	}

	public int menuPrincipal() {
		int opcao = -1;
		try {
			System.out.println("1 - Cadastrar fruta");
			System.out.println("2 - Cadastrar Verduras");
			System.out.println("3 - Listar Todas As frutas");
			System.out.println("4 - Listar todas as verduras");
			System.out.println("5 - Remover fruta");
			System.out.println("6 - Remover Verdura");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			sc.nextLine(); // Limpa a quebra de linha

			if (opcao < 0 || opcao > 6) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("ASD");
			sc.nextLine();
		} catch (RuntimeException e) {
			System.out.println();
			sc.nextLine();
		}
		return opcao;
	}

	public String frutaNome() {
		System.out.println("Digite o nome da fruta:");
		return sc.nextLine();
	}

	public String verduraNome() {
		System.out.println("Digite o nome da VERdura:");
		return sc.nextLine();
	}

	public double verduraPreco() {
		System.out.println("Digite o preço da VERdura:");
		return sc.nextDouble();
	}

	public double frutaPeso() {
		System.out.println("Digite o peso do produto: ");
		return sc.nextDouble();
	}

	public int frutaQuantidade() {
		System.out.println("Digite a quantidade:");
		int q =  sc.nextInt();	
		return q;
	}
	public int verduraQuantidade() {
		System.out.println("Digite a quantidade:");
		int q =  sc.nextInt();
		return q;
	}

	public String frutaTipo() {
		sc.nextLine();
		System.out.println("Digite o tipo da fruta:");
		return sc.nextLine();
	}
	public String verduraTipo() {
		sc.nextLine();
		System.out.println("Digite o tipo da verdura:");
		return sc.nextLine();
	}

	public void visualizarFruta(Fruta fruta) {
		System.out.println("---");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Peso: " + fruta.getPeso());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Tipo: " + fruta.getTipo());
	}

	public void visualizarVerdura(Verdura verdura) {
		System.out.println("---");
		System.out.println("Nome: " + verdura.getNome());
		System.out.println("Preço: R$" + verdura.getPreco());
		System.out.println("Quantidade: " + verdura.getQuantidade());
		System.out.println("Tipo: " + verdura.getTipo());
	}

	public String removerFruta() {
		System.out.println("Digite o nome da fruta a remover:");
		return sc.nextLine();
	}

	public void visualizarFrutaRemovida(String nome) {
		System.out.println("A fruta '" + nome + "' foi removida.");
	}

	public void mensagemNaoEncontrado() {
		System.out.println("Fruta não encontrada.");
	}

	public void finalizarApp() {
		System.out.println("Sistema encerrado.");
	}
}