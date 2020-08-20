package com.algorithms;

import com.algorithms.grafo.lista.Grafo;

public class Main {

    public static void main(String[] args) {
	    Grafo grafo = new Grafo(false);
	    grafo.add(7);
	    grafo.addAresta(0,1,0);
        grafo.addAresta(0,2,0);

        grafo.addAresta(1,3,0);
        grafo.addAresta(1,2,0);
        grafo.addAresta(1,4,0);

        grafo.addAresta(2,3,0);
        grafo.addAresta(2,5,0);

        grafo.addAresta(3,4,0);
        grafo.addAresta(3,5,0);

        grafo.addAresta(4,5,0);
        grafo.addAresta(4,6,0);

        grafo.addAresta(6,5,0);

        grafo.verificaEuleriano();
    }
}
