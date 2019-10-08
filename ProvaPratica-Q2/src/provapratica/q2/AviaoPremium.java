/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapratica.q2;

/**
 *
 * @author vinig
 */
public class AviaoPremium extends Aviao{
    private int premium;
    private int nVagas;
    
    public AviaoPremium(int numeroDoVoo, Data data, int nVagas, int premium) {
        super(numeroDoVoo, data);
        this.premium = premium;
        this.nVagas = nVagas;
        assentos = new boolean[nVagas];
        for(int i = 0; i < assentos.length; i++){
            assentos[i] = false;
        }
    }
    
    public int maxVagas(){
        return assentos.length;
    }
    
    public int cadeiraPremium(){
        return premium;
    }
    
    public char tipo(int cadeira){
        if(cadeira >= premium){
            return 'C';
        }
        
        else{
            return 'P';
        }
    }

    @Override
    public int proximoLivre() {
        for(int i = 0; i < assentos.length; i++){
            if((tipo(i) == 'C') && (!assentos[i])){
                return i;
            }
        }
        return -1;
    }
    
    public int proximoPremiumLivre(){
        for(int i = 0; i < assentos.length - cadeiraPremium(); i++){
            if(!assentos[i]){
                return i;
            }
        }
        return -1;
    }    
}
