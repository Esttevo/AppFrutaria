package br.com.frutaria.service;

import br.com.frutaria.controller.Atendente;
import br.com.frutaria.model.*;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Fruta> listaFruta;
    private List<Verdura> listaVerdura;
    private List<Produto> listaProdutos;
    
    public Estoque() {
        listaFruta = new ArrayList<>();
        listaVerdura = new ArrayList<>();
        listaProdutos = new ArrayList<>();
    }

    public void gerenciarEstoque(int opcao, Atendente atendente) {
        switch (opcao) {
            case 1-> {
                String nome = atendente.frutaNome();
                double peso = atendente.frutaPeso();
                int quantidade = atendente.frutaQuantidade();
                String tipo = atendente.frutaTipo();

                Fruta fruta = new Fruta(nome, peso, quantidade, tipo);
                listaFruta.add(fruta);
                break;
            }
            case 2 -> {
            	String nome = atendente.verduraNome();
            	double preco = atendente.verduraPreco();
            	int quantidade = atendente.verduraQuantidade();
            	String tipo = atendente.verduraTipo();
            	
            	Verdura verdura = new Verdura(nome, quantidade, tipo, preco);
            	listaVerdura.add(verdura);
            	break;
            }

            case 3-> {
                if (listaFruta.isEmpty()) {
                    System.out.println("Não há frutas cadastradas.");
                } else {
                    for (Fruta fruta : listaFruta) {
                        atendente.visualizarFruta(fruta);
                    }
                }
                break;
            }
            case 4-> {
            	if (listaVerdura.isEmpty()) {
            		System.out.println("Não há verduras cadastradas.");
            	} else {
            		for (Verdura verdura: listaVerdura) {
            			atendente.visualizarVerdura(verdura);
            		}
            	}
            	break;
            }

            case 5-> {
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
            case 6-> {
            	String nome = atendente.removerFruta();
            	boolean removido = false;
            	
            	for (int indice = 0; indice < listaVerdura.size(); indice++) {
            		if (listaVerdura.get(indice).getNome().equalsIgnoreCase(nome)) {
            			listaVerdura.remove(indice);
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
          
            case 0-> {
                // A opção de saída já é tratada no método `finalizarApp` em Atendente
                
            }
            default ->{
                System.out.println("Opção inválida.");
            }
           }
    }
}