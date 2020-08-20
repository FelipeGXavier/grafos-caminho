package com.algorithms.grafo.lista;


import com.algorithms.misc.ListaAresta;

public class Vertice {

    private ListaAresta listaAresta;
    private int posicao;
    private Vertice proximo;
    private boolean visitado;

    public Vertice(int posicao) {
        this.listaAresta = new ListaAresta();
        this.posicao = posicao;
    }

    public ListaAresta getListaAresta() {
        return listaAresta;
    }

    public Vertice getProximo() {
        return proximo;
    }

    public void setProximo(Vertice proximo) {
        this.proximo = proximo;
    }

    public int getPosicao() {
        return posicao;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
}
