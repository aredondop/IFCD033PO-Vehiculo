/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifcd033po.vehiculo;

/**
 *
 * @author Tecdata
 */
public class VehiculoElectrico extends Vehiculo{
    
    public VehiculoElectrico( String matricula, String bastidor){
        super(matricula, bastidor);
    }
    
    @Override
    public void acelerar( int velocidad){
        super.acelerar(velocidad);
        System.out.println( " Hemos acelerado en "+ velocidad);
    }
    
    public void reducir( int velocidad){
        super.reducir(velocidad);
        System.out.println( " Hemos reducido en "+ velocidad);
    }

    public void frenar() {
        super.frenar(); 
        System.out.println( " Hemos frenado ");
    }

    
}
