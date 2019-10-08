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
public class ClienteDeEmail {
    private ServidorDeEmail servidor;
    private String usuario;

    public ClienteDeEmail(ServidorDeEmail servidor, String usuario) {
        this.servidor = servidor;
        this.usuario = usuario;
    }
    
    public Email proximoEmail(){
        return servidor.proximoEmail(usuario);
    }
    
    public void imprimirProximoEmail(){
        Email email = servidor.proximoEmail(usuario);
        email.imprimir();
    }
    
    public void enviar(String destinatario, String mensagem){
        Email email = new Email(usuario, destinatario, mensagem);
        servidor.enviar(email);
    }
}
