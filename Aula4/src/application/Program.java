/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.CadastroDeCarros;
import java.util.Locale;

/**
 *
 * @author vinig
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        CadastroDeCarros veiculos = new CadastroDeCarros();
        veiculos.exibeInfoVeiculo();
    }
}
