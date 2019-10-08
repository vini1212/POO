/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author vinig
 */
public class Email {
    private String remetente;
    private String destinario;
    private String mensagem;

    public Email(String remetente, String destinario, String mensagem) {
        this.remetente = remetente;
        this.destinario = destinario;
        this.mensagem = mensagem;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getDestinario() {
        return destinario;
    }

    public String getMensagem() {
        return mensagem;
    }
    
    public void imprimir(){
        System.out.println("Remetente: " + getRemetente());
        System.out.println("Destinatário: " + getDestinario());
        System.out.println("Mensagem: " + getMensagem());
    }
}
