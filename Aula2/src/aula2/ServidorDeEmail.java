/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vinig
 */
public class ServidorDeEmail {

    private List<Email> emails = new ArrayList<>();

    public ServidorDeEmail() {
        
    }
    
    public int quantidadeDeEmails(String destinatario){
        int count = 0;
        for(Email lista : emails){
            if(lista.getDestinario().equals(destinatario)){
                count += 1;
            }
        }
        return count;
    }
    
    public Email proximoEmail(String destinatario){
        Iterator<Email> it = emails.iterator();
        while(it.hasNext()){
            Email proximo = it.next();
            if(proximo.getDestinario().equals(destinatario)){
                it.remove();
                return proximo;
            }
        }
        
        return null; //se não achar o próximo email ele retorna nulo
    }
    
    public void enviar(Email email){
        emails.add(email);
    }
}
