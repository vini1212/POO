/*.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author vinig
 */
public class CadastroDeCarros {
    private Veiculo[] tipos;

    public CadastroDeCarros(){
        tipos = new Veiculo[3];
        tipos[0] = new Carro(120.0, 15000, "Preto", 2.0);
        tipos[1] = new Moto(280.0, 55000, 1200, 2.5);
        tipos[2] = new Caminhao(90.0, 70000, 5.0, 1.5);
    }
       
    public void exibeInfoVeiculo(){
        int i = 0;
        for(Veiculo tipo : tipos){
            tipo.calculaIPVA();
            System.out.println("Veículo[" + i + "] : " + tipo);
            i++;
        }
    }
}
