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
public class Quadrado extends FormasGeometricas{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return 4*lado;
    }

    @Override
    public void printar() {
        System.out.println("Quadrado -> Area: " + calculaArea() + " Perimetro: " + perimetro() + " Lado: " + lado);
    }
    
    
    
    
    
}
