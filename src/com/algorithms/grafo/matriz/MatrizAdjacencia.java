package com.algorithms.grafo.matriz;

public class MatrizAdjacencia {

    private int qtdVertices;
    private int caminho[];
    private int[][] grafo;
    private boolean ponderado;

    public MatrizAdjacencia(int qtdVetices, int inicio, boolean ponderado) {
        this.qtdVertices = qtdVetices;
        this.grafo = new int[qtdVetices][qtdVetices];
        this.caminho = new int[this.qtdVertices];
        for (int i = 0; i < this.qtdVertices; i++) {
            this.caminho[i] = -1;
        }
        this.caminho[0] = inicio;
        this.ponderado = ponderado;
    }

    public void inserirAresta(int origem, int destino){
        this.grafo[origem][destino] = 1;
        if(this.ponderado){
            this.grafo[destino][origem] = -1;
        }else{
            this.grafo[destino][origem] = 1;
        }
    }


    public boolean verificaCicloHamiltoniano(int pos) {
        if (pos == this.qtdVertices) {
            if (this.grafo[this.caminho[pos - 1]][this.caminho[0]] == 1) {
                return true;
            }
            return false;
        }
        boolean valido = true;
        for (int x = 0; x < this.qtdVertices; x++) {
            for (int i = 0; i < pos; i++) {
                if (this.caminho[i] == x) {
                    valido = false;
                    break;
                }
            }
            if (valido) {
                this.caminho[pos] = x;
                if (verificaCicloHamiltoniano(pos + 1)) {
                    return true;
                }
                this.caminho[pos] = -1;
            }
            valido = false;
        }
        return false;
    }

}