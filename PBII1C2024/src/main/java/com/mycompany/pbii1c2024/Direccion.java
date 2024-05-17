
package com.mycompany.pbii1c2024;


public class Direccion {
    private String calle;
    private Integer altura;
    private String localidad;

    public Direccion(String calle, Integer altura, String localidad) {
        this.calle = calle;
        this.altura = altura;
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    @Override
    public String toString(){
        return this.calle+this.altura+this.localidad;
    }
    
    
}
