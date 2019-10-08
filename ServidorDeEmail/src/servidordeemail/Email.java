/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidordeemail;

/**
 *
 * @author vinig
 */
public class Email {
    private String remetente;
    private String destinario;
    private String mensagem;

    public Email() {
    }

    public Email(String remetente, String destinario, String mensagem) {
        this.remetente = remetente;
        this.destinario = destinario;
        this.mensagem = mensagem;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinario() {
        return destinario;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public void imprimir(){
        System.out.println("Remetente: " + getMensagem());
        System.out.println("Destinatário: " + getDestinario());
        System.out.println("Mensagem: " + getMensagem());
    }
}
