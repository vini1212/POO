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
public class Triangulo extends FormasGeometricas{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calculaArea(){
        return base*altura / 2.0;
    }

    @Override
    public double perimetro() {
        return base*3;
    }

    @Override
    public void printar() {
        System.out.println("Triangulo -> Area: " + calculaArea() + " Perimetro: " + perimetro());
    }
    
    
    
    
    
}
