package br.com.frutaria.service;

import br.com.frutaria.controller.Atendente;
import br.com.frutaria.model.Fruta;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Fruta> listaFruta;

    public Estoque() {
        listaFruta = new ArrayList<>();
    }

    public void gerenciarEstoque(int opcao, Atendente atendente) {
        switch (opcao) {
            case 1-> {
                String nome = atendente.frutaNome();
                double preco = atendente.frutaPreco();
                int quantidade = atendente.frutaQuantidade();
                String tipo = atendente.frutaTipo();

                Fruta fruta = new Fruta(nome, preco, quantidade, tipo);
                listaFruta.add(fruta);
                break;
            }

            case 2-> {
                if (listaFruta.isEmpty()) {
                    System.out.println("Não há frutas cadastradas.");
                } else {
                    for (Fruta fruta : listaFruta) {
                        atendente.visualizar(fruta);
                    }
                }
                break;
            }

            case 3-> {
                String nome = atendente.removerFruta();
                boolean removido = false;

                for (int indice = 0; indice < listaFruta.size(); indice++) {
                    if (listaFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
                        listaFruta.remove(indice);
                        removido = true;
                        break;
                    }
                }

                if (removido) {
                    atendente.visualizarFrutaRemovida(nome);
                } else {
                    atendente.mensagemNaoEncontrado();
                }
             
            }
            case 4-> {
            	atendente.visualizarQuantFrutas();
            }
            case 0-> {
                // A opção de saída já é tratada no método `finalizarApp` em Atendente
                
            }
            default ->{
                System.out.println("Opção inválida.");
            }
           }
    }
}