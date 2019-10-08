/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapratica.q1;

/**
 *
 * @author vinig
 */
public class Aviao {
    private int numeroDoVoo;
    private Data data;
    protected boolean[] assentos;
    private int nOcupados;
    
    public Aviao(int numeroDoVoo, Data data) {
        this.numeroDoVoo= numeroDoVoo;
        this.data = data;
        assentos = new boolean[300];
        nOcupados = 0;
        for(int i = 0; i < assentos.length; i++){
            assentos[i] = false; //todas as cadeiras estão desocupadas
        }
    }
    
    public int proximoLivre(){
        for(int i = 0; i < assentos.length; i++){
            if(!assentos[i]){
                return i;
            }
        }
        return -1;
    }
    
    public boolean verifica(int cadeira){
        return assentos[cadeira];
    }
    
    public boolean ocupa(int cadeira){
        if (cadeira > 299){
            return false;
        }
        
        if(!verifica(cadeira)){
            assentos[cadeira] = true;
            nOcupados++;
            return true;
        }
        return false;
    }
    
    public int vagas(){
        return assentos.length - nOcupados;
    }

    public int getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public Data getData() {
        return data;
    }  
    
}
