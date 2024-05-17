
package com.mycompany.pbii1c2024;

import com.mycompany.pbii1c2024.propiedades.Casa;
import com.mycompany.pbii1c2024.propiedades.Departamento;
import com.mycompany.pbii1c2024.propiedades.Propiedad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Inmobiliaria {

    static ArrayList<Propiedad> listaPropiedades = new ArrayList<>();
    public static Set<Propiedad> listaPropiedadesInmobiliaria = new HashSet<>();
    static Set<Persona> listaClientes = new HashSet<>();
    
    public static List sortByPrecio(){
        List found;
        
        
        
        
        return found=null;
    }
    public static Persona findByDNI(Integer dni){
        Persona propietario=null;
        
        for(Persona persona : listaClientes){
            if (persona.getDni().equals(dni)){
                propietario=persona;
            }
        }     
        return propietario;
    }
    
    public static Double promedio(Set lista){
        Integer suma=0;
        Double prom =0.0;
        Integer size=getListaCasas().size();
        for(Propiedad prop : getListaCasas()){
            suma+=prop.getPrecio();
        }
        
        prom=(double)suma/size;
        return prom;
    }
    
    public static Double promedioDepto(Set lista){
        Integer suma=0;
        Double prom =0.0;
        Integer size=getListaDpto().size();
        for(Propiedad prop : getListaDpto()){
            suma+=prop.getPrecio();
        }
        
        prom=(double)suma/size;
        return prom;
    }
    
    public static Set<Casa> getListaCasas(){
        Set<Casa> casas = new HashSet<>();
        for(Propiedad casa : getListaPropiedadesInmobiliaria()){
            if(casa instanceof Casa){
                casas.add((Casa) casa);
            }
        }
        return casas;
    }
    
        public static Set<Departamento> getListaDpto(){
        Set<Departamento> deptos = new HashSet<>();
        for(Propiedad depto : getListaPropiedadesInmobiliaria()){
            if(depto instanceof Departamento){
                deptos.add((Departamento) depto);
            }
        }
        return deptos;
    }
    
    public static void altaCasa(Propiedad casa){
        listaPropiedades.add(casa);
    }

    public static ArrayList<Propiedad> getListaPropiedades() {
        return listaPropiedades;
    }

    public static Set<Propiedad> getListaPropiedadesInmobiliaria() {
        return listaPropiedadesInmobiliaria;
    }
    
    
   
    
}
