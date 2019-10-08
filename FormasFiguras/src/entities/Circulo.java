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
public class Circulo extends FormasGeometricas{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return 2*Math.PI * raio;
    }

    @Override
    public void printar() {
        System.out.println("Circulo -> Area: " + String.format("%.2f", calculaArea())+ " Perimetro: " + String.format("%.2f", perimetro()) + " Raio: " + raio);
    }
          
}
