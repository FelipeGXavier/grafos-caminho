package com.algorithms.grafo.lista;


import com.algorithms.misc.ListaVertice;

public class Grafo {

    private ListaVertice lista;
    private int qtdVertices = 0;
    private boolean ponderado;
    private boolean direcionado;

    public Grafo(boolean direcionado) {
        this.lista = new ListaVertice();
        this.direcionado = direcionado;
    }

    /**
     * Inicia a instância dos vértices a partir da quantidade passada na construtor
     */
    public void add(int qtdVertices) {
        this.qtdVertices = qtdVertices;
        for (int i = 0; i < qtdVertices; i++) {
            this.lista.add();
        }
    }

    public void verificaEuleriano(){
        Vertice vertice = this.lista.getInicio();
        int size = 0;
        int arestasImpar = 0;
        boolean euleriano = true;
        while (vertice != null){
            Aresta aresta = vertice.getListaAresta().getInicio();
            while (aresta != null) {
                size++;
                aresta = aresta.getProximo();
            }
            if(size%2 != 0){
                euleriano = false;
                arestasImpar++;
            }
            vertice = vertice.getProximo();
            size = 0;
        }
        if(euleriano){
            System.out.println("Grafo euleriano");
        }else if(arestasImpar == 2){
            System.out.println("Grafo semi-euleriano");
        }else{
            System.out.println("Grafo não euleriano");
        }
    }


    public void addAresta(int origem, int destino, int peso) {
        Vertice origemVertice = this.lista.get(origem);
        Vertice destinoVertice = this.lista.get(destino);
        if (this.direcionado) {
            origemVertice.getListaAresta().add(peso, destinoVertice);
        } else {
            origemVertice.getListaAresta().add(peso, destinoVertice);
            destinoVertice.getListaAresta().add(peso, origemVertice);
        }
    }



}
