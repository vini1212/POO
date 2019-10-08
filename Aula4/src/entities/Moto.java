/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author vinig
 */
public class Moto extends Veiculo{
    private double velocidadeMax;
    private double price;
    private int cilindradas;
    private double taxaIPVA;
            
    public Moto(double velocidadeMax, double price, int cilindradas, double taxaIPVA) {
        this.velocidadeMax = velocidadeMax;
        this.price = price;
        this.cilindradas = cilindradas;
        this.taxaIPVA = taxaIPVA;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double getTaxaIPVA() {
        return taxaIPVA;
    }

    public void setTaxaIPVA(double taxaIPVA) {
        this.taxaIPVA = taxaIPVA;
    }
    
    @Override
    public double calculaIPVA() {
        return ((getTaxaIPVA())/100) * price;
    }
    
    @Override
    public String toString() {
        return "Cilindradas: " + getCilindradas() + "cc - Velocidade Máxima: " + getVelocidadeMax() + " km/h - Preço: R$ " 
                + getPrice() + " – Taxa Base para o IPVA: " + getTaxaIPVA() + " – Valor do Imposto: R$" + calculaIPVA();
    }
}
