/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbii1c2024;

/**
 *
 * @author Test
 */
public class Alquiler extends Operacion{
    private Persona inquilino;
    private byte contrato; //tiempo de contrato de alquiler en meses
    private Integer precio;
    
    public Boolean registrarAlquiler(Persona inquilino,byte tiempo){
        this.inquilino=inquilino;
        this.id++;
        this.contrato=tiempo;
        return true;
    }     
    
    
}
