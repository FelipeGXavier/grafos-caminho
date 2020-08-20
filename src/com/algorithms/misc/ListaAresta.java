package com.algorithms.misc;


import com.algorithms.grafo.lista.Aresta;
import com.algorithms.grafo.lista.Vertice;

public class ListaAresta {

    private Aresta inicio;
    private Aresta fim;

    public void add(int peso, Vertice vertice){
        Aresta novo = new Aresta(peso, vertice);
        if(inicio == null){
            inicio = novo;
        }else{
           fim.setProximo(novo);
        }
        fim = novo;
    }

    public Aresta getInicio() {
        return inicio;
    }

    public void setInicio(Aresta inicio) {
        this.inicio = inicio;
    }

    public Aresta getFim() {
        return fim;
    }

    public void setFim(Aresta fim) {
        this.fim = fim;
    }
}
