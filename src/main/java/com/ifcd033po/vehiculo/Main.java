/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifcd033po.vehiculo;

/**
 *
 * @author Ángel Redondo
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Creamos un vehículo electrico");
        
        VehiculoElectrico miElectrico = new VehiculoElectrico("AAAA", "BBBB");
        miElectrico.acelerar(100);
        miElectrico.reducir(20);
        miElectrico.frenar();
        
        VehiculoCombustion miClasico = new VehiculoCombustion("M2020A", "AAA");
        miClasico.acelerar(50);
        miClasico.reducir(10);
        miClasico.frenar();
    }
    
}
