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
public class Retangulo extends FormasGeometricas{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2*(base + altura);
    }

    @Override
    public void printar() {
        System.out.println("Retângulo -> Area: " + calculaArea() + " Perimetro: " + perimetro() + " Base: " + base + " Altura: " + altura);
    }
    
    
}
