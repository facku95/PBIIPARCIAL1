
package com.mycompany.pbii1c2024;

import com.mycompany.pbii1c2024.propiedades.Propiedad;


public class Permuta extends Operacion{
    
    public Boolean registrarPermuta(Propiedad propiedad1,Propiedad propiedad2){
        propiedad2.setPropietario(propiedad1.getPropietario());
        propiedad1.setPropietario(propiedad2.getPropietario());
        this.id++;
        return true;
    }        
            
}
