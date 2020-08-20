package com.algorithms.grafo.lista;

public class Aresta {

    private int peso;
    private Aresta proximo;
    private Vertice destino;

    public Aresta(int peso, Vertice destino) {
        this.peso = peso;
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public Vertice getDestino() {
        return destino;
    }

    public Aresta getProximo() {
        return proximo;
    }

    public void setProximo(Aresta proximo) {
        this.proximo = proximo;
    }
}
