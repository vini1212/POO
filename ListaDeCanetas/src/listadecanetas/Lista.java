/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadecanetas;

/**
 *
 * @author vinig
 */
public class Lista {

    private int numeroDeElementos = 0;
    private Caneta[] colecao;

    public Lista(int tam) { //construtor que cria um vetor e passa um parâmetro do tamanho para o vetor
        this.colecao = new Caneta[tam];
    }

    public void inserir(String cor) {
        Caneta c = new Caneta(cor);
        this.colecao[this.numeroDeElementos] = c;
        this.numeroDeElementos++;
    }

    public String retornaItem(int posicao) {
        for (int i = 0; i < colecao.length; i++) {
            if (i == posicao) {
                return colecao[i].getCor();
            }
        }
        return null;
    }

    public int tamanho() {
        return numeroDeElementos;
    }

    public void imprime() {
        for (int i = 0; i < colecao.length; i++) {
            System.out.println("Caneta[" + i + "]: " + colecao[i]);
        }
    }

}
