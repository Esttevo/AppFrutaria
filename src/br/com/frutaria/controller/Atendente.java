package br.com.frutaria.controller;

import br.com.frutaria.model.Fruta;

import java.util.Scanner;

public class Atendente {
    private Scanner input;

    public Atendente() {
        input = new Scanner(System.in);
    }

    public int menuPrincipal() {
        System.out.println("1 - Cadastrar fruta");
        System.out.println("2 - Listar frutas");
        System.out.println("3 - Remover fruta");
        System.out.println("0 - Sair");
        int opcao = input.nextInt();
        input.nextLine(); // Limpa a quebra de linha
        return opcao;
    }

    public String frutaNome() {
        System.out.println("Digite o nome da fruta:");
        return input.nextLine();
    }

    public double frutaPreco() {
        System.out.println("Digite o preço da fruta:");
        return input.nextDouble();
    }

    public int frutaQuantidade() {
        System.out.println("Digite a quantidade:");
        return input.nextInt();
    }

    public String frutaTipo() {
        input.nextLine(); // Limpa a quebra de linha
        System.out.println("Digite o tipo da fruta:");
        return input.nextLine();
    }

    public void visualizar(Fruta fruta) {
        System.out.println("---");
        System.out.println("Nome: " + fruta.getNome());
        System.out.println("Preço: R$" + fruta.getPreco());
        System.out.println("Quantidade: " + fruta.getQuantidade());
        System.out.println("Tipo: " + fruta.getTipo());
    }

    public String removerFruta() {
        System.out.println("Digite o nome da fruta a remover:");
        return input.nextLine();
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