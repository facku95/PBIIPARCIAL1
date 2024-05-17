
package com.mycompany.pbii1c2024.propiedades;

import com.mycompany.pbii1c2024.Direccion;
import com.mycompany.pbii1c2024.Persona;
import java.util.Comparator;
import java.util.Objects;

public class Propiedad implements Comparator<Integer>{
    private Integer id=0;
    private Persona propietario;
    private String direccion;
    private Integer precio;
    

    public Propiedad(Persona propietario, String direccion,Integer altura,String localidad,Integer precio) {
        this.propietario = propietario;
        Direccion domicilio=new Direccion(direccion,altura,localidad);
        this.direccion=domicilio.toString();
        this.precio=precio;
        this.id++;
    }
    

    public Persona getPropietario(){
        return this.propietario;
    }
    public void setPropietario(Persona prop){
        this.propietario=prop;
    }

    public Integer getPrecio() {
        return precio;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Propiedad other = (Propiedad) obj;
        return Objects.equals(this.direccion, other.direccion);
    }

    @Override
    public int compare(Integer precio1, Integer precio2) {
        return precio1.compareTo(precio2);
    }

   
    
    
}