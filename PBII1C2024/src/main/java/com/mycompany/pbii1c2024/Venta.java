
package com.mycompany.pbii1c2024;


public class Venta extends Operacion{
    private Integer precio;
    
    public Boolean registrarVenta(Persona comprador){
        this.propietario=comprador;
        this.id++;
        return true;
    }
    
    
}
