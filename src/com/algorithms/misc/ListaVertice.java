package com.algorithms.misc;


import com.algorithms.grafo.lista.Vertice;

public class ListaVertice {

    private Vertice inicio;
    private Vertice fim;
    private int index = 0;

    public void add(){
        Vertice vertice = new Vertice(this.index++);
        if(inicio == null){
            inicio = vertice;
        }else{
            fim.setProximo(vertice);
        }
        fim = vertice;
    }

    public Vertice get(int index){
        Vertice aux = this.inicio;
        while (aux != null){
            if(aux.getPosicao() == index){
                return aux;
            }
            aux = aux.getProximo();
        }
        return null;
    }

    public Vertice getInicio() {
        return inicio;
    }

}
