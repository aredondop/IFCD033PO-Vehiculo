/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifcd033po.vehiculo;

/**
 *
 * @author Ángel Redondo
 */
public class VehiculoCombustion extends Vehiculo{
    
    private final int humo = 10;
    
    public VehiculoCombustion( String matricula, String bastidor){
        super(matricula, bastidor);
    }
    
    public int echarHumo(){
        return this.humo * (this.getVelocidad() + 1);
    }
    @Override
    public void acelerar( int velocidad){
        super.acelerar(velocidad);
        System.out.println( " Hemos acelerado en "+ velocidad + " y echado "+ this.echarHumo() + " humo");
    }
    
    public void reducir( int velocidad){
        super.reducir(velocidad);
        System.out.println( " Hemos reducido en "+ velocidad + " y echado "+ this.echarHumo() + " humo");
    }

    public void frenar() {
        super.frenar(); 
        System.out.println( " Hemos frenado y echado "+ this.echarHumo() + " humo");
    }
}
