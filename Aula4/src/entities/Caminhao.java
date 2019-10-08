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
public class Caminhao extends Veiculo{
      private double velocidadeMax;
      private double price;
      private double cargaMax;
      private double taxaIPVA;

    public Caminhao(double velocidadeMax, double price, double cargaMax, double taxaIPVA) {
        this.velocidadeMax = velocidadeMax;
        this.price = price;
        this.cargaMax = cargaMax;
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

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
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
        return "Peso: " + getCargaMax() + "T" + " - Velocidade Máxima: " + getVelocidadeMax() + " km/h - Preço: R$ " 
                + getPrice() + " – Taxa Base para o IPVA: " + getTaxaIPVA() + " – Valor do Imposto: R$" + calculaIPVA();
    }
    
    
}
