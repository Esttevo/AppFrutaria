package br.com.frutaria.controller;

import br.com.frutaria.model.Fruta;

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
        System.out.println("2 - Listar frutas");
        System.out.println("3 - Remover fruta");
        System.out.println("4 - Listar Total de tipos de frutas");
        System.out.println("0 - Sair");
        opcao = sc.nextInt();
        sc.nextLine(); // Limpa a quebra de linha
        
        
        if (opcao < 0 || opcao > 4) {
        	throw new IllegalArgumentException();
        }
        } catch (IllegalArgumentException e ) {
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

    public double frutaPreco() {
        System.out.println("Digite o preço da fruta:");
        return sc.nextDouble();
    }

    public int frutaQuantidade() {
        System.out.println("Digite a quantidade:");
        return sc.nextInt();
    }

    public String frutaTipo() {
        sc.nextLine(); // Limpa a quebra de linha
        System.out.println("Digite o tipo da fruta:");
        return sc.nextLine();
    }

    public void visualizarQuantFrutas() {
    	Fruta.gettotalQuantTiposFruta();
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