/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ifcd033po.vehiculo;

/**
 *
 * @author Ángel Redondo
 */
public abstract class Vehiculo {
    
    private String matricula, bastidor;
    private int velocidad;
    
    public Vehiculo( String matricula, String bastidor){
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.velocidad = 0;
        
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
    public void acelerar( int velocidad){
        this.velocidad = this.velocidad + velocidad;
    }
    
    public void reducir( int velocidad){
        this.velocidad = this.velocidad - velocidad;
    }
    
    public void frenar(){
        this.velocidad = 0;
    }

}
