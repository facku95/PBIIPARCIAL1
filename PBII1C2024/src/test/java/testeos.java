

import com.mycompany.pbii1c2024.Inmobiliaria;
import com.mycompany.pbii1c2024.Persona;
import com.mycompany.pbii1c2024.propiedades.Casa;
import com.mycompany.pbii1c2024.propiedades.Departamento;
import com.mycompany.pbii1c2024.propiedades.Propiedad;
import java.util.Collections;

import org.junit.jupiter.api.Test;



public class testeos {
    
    @Test
    public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
        Persona juan=new Persona("Juan",5555);
        Propiedad casa1 = new Casa(juan,"Arieta",2,"san justo",20000);
        Inmobiliaria.altaCasa(casa1);
        Boolean check=Inmobiliaria.getListaPropiedades().contains(casa1);
        assert(check);
    }
     @Test
     public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria(){
        Persona juan=new Persona("Juan",5555);
        Propiedad casa1 = new Casa(juan,"Arieta",2,"san justo",20000);
        Propiedad casa2 = new Casa(juan,"Arieta",2,"san justo",20000);
        Inmobiliaria.altaCasa(casa1);
        Inmobiliaria.altaCasa(casa2);
        int size = Inmobiliaria.getListaPropiedades().size();
        assert(size==2);    
     }
     @Test
     public void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria(){
        Persona juan=new Persona("Juan",5555);
        Propiedad depto1 = new Departamento(juan,"Arieta",2,"san justo",20000);
        Inmobiliaria.altaCasa(depto1);
        Boolean check=Inmobiliaria.getListaPropiedades().contains(depto1);
        assert(check);
         
     }
     
     @Test
     public void queSePuedanDarDeAltaDosDepartamentoEnLaInmobiliaria(){
        Persona juan=new Persona("Juan",5555);
        Propiedad depto1 = new Departamento(juan,"Arieta",2,"san justo",20000);
        Inmobiliaria.altaCasa(depto1);
        Inmobiliaria.altaCasa(depto1);
        int size = Inmobiliaria.getListaPropiedades().size();
        assert(size==2);
     }
     
     @Test
     public void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion(){
        Persona juan=new Persona("Juan",5555);
        Propiedad depto1 = new Departamento(juan,"Arieta",2,"san justo",20000);
        Inmobiliaria.listaPropiedadesInmobiliaria.add(depto1);
        Inmobiliaria.listaPropiedadesInmobiliaria.add(depto1);
        int size = Inmobiliaria.getListaPropiedadesInmobiliaria().size();
        assert(size==1); 
     }
     
     @Test
     public void queSePuedaObtenerElValorPromedioDeLasCasas(){
        Persona juan=new Persona("Juan",5555);
        Propiedad casa1 = new Casa(juan,"Arieta",2,"san justo",20000);
        Inmobiliaria.listaPropiedadesInmobiliaria.add(casa1);
        
        Propiedad casa2 = new Casa(juan,"Arieta",4,"san justo",25000);
        Inmobiliaria.listaPropiedadesInmobiliaria.add(casa2);
        
        Double suma=casa1.getPrecio().doubleValue()+casa2.getPrecio().doubleValue();
        Double prom=suma/2;
        
        Double promedio = Inmobiliaria.promedio(Inmobiliaria.getListaCasas());
        assert(promedio==22500&&prom==22500);        
     }
     
     @Test
     public void queSePuedaObtenerElValorPromedioDeLosDepartamentos(){
        Persona juan=new Persona("Juan",5555);
        Propiedad depto1 = new Departamento(juan,"Arieta",2,"san justo",20000);
        Inmobiliaria.listaPropiedadesInmobiliaria.add(depto1);
        
        Propiedad depto2 = new Departamento(juan,"Arieta",4,"san justo",25000);
        Inmobiliaria.listaPropiedadesInmobiliaria.add(depto2);
        
        Double suma=depto1.getPrecio().doubleValue()+depto2.getPrecio().doubleValue();
        Double prom=suma/2;
        
        Double promedio = Inmobiliaria.promedioDepto(Inmobiliaria.getListaDpto());
        assert(promedio==22500&&prom==22500); 
     }
     
     @Test
     public void queLaBusquedaPorRangoDePrecioDeMeArrojeUnaaListaNoNuloSiAplicanResultados(){
        
     }
     
     
    
   
}
