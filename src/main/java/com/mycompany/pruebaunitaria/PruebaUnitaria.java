/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaunitaria;

/**
 *
 * @author jose
 */
public class PruebaUnitaria {
    public static void main(String[] args){
        Calculadora obj = new Calculadora();
        int resultado=obj.sumarNumeros(3, 3);
  
        System.out.println(resultado);
    }
}
