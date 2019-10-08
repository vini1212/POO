/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Circulo;
import entities.FormasGeometricas;
import entities.Quadrado;
import entities.Retangulo;
import entities.Triangulo;
import java.util.Locale;

/**
 *
 * @author vinig
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        FormasGeometricas[] formas = new FormasGeometricas[4];
        
        formas[0] = new Circulo(4);
        formas[1] = new Triangulo(2, 4);
        formas[2] = new Retangulo(4, 4);
        formas[3] = new Quadrado(3);
        
        for(FormasGeometricas forma : formas){
            forma.printar();
        }
    }
    
}
