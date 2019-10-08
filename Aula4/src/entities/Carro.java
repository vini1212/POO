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
public class Carro extends Veiculo{
    private double velocidadeMax;
    private double price;
    private String cor;
    private double taxaIPVA;
    
    public Carro(double velocidadeMax, double price, String cor, double taxaIPVA) {
        this.velocidadeMax = velocidadeMax;
        this.price = price;
        this.cor = cor;
        this.taxaIPVA = taxaIPVA;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public double getPrice() {
        return price;
    }

    public String getCor() {
        return cor;
    }

    public double getTaxaIPVA() {
        return taxaIPVA;
    }

    @Override
    public double calculaIPVA() {
        return ((getTaxaIPVA())/100) * price;
    }

    @Override
    public String toString() {
        return "Cor: " + getCor() + " - Velocidade Máxima: " + getVelocidadeMax() + " km/h - Preço: R$ " 
                + getPrice() + " – Taxa Base para o IPVA: " + getTaxaIPVA() + " – Valor do Imposto: R$" + calculaIPVA();
    }
}
