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
public class ListaDeCanetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista listaCanetas = new Lista(3);
        
        listaCanetas.inserir("Azul");
        listaCanetas.inserir("Amarelo");
        listaCanetas.inserir("Verde");
        
        
        listaCanetas.imprime();
        
        System.out.printf("O tamanho da lista de canetas é: %d\n", listaCanetas.tamanho());
    }
    
}
