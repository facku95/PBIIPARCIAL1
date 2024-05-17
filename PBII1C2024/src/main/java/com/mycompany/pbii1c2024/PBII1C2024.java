

package com.mycompany.pbii1c2024;

import com.mycompany.pbii1c2024.propiedades.Casa;
import com.mycompany.pbii1c2024.propiedades.Departamento;
import com.mycompany.pbii1c2024.propiedades.Propiedad;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class PBII1C2024 {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);       
    
        Persona juan=new Persona("Juan",5555);
        Propiedad depto1 = new Departamento(juan,"Arieta",2,"san justo",20000);
        Inmobiliaria.listaPropiedadesInmobiliaria.add(depto1);
        
        Propiedad depto2 = new Departamento(juan,"Arieta",4,"san justo",25000);
        Inmobiliaria.listaPropiedadesInmobiliaria.add(depto2);
        
        Double suma=depto1.getPrecio().doubleValue()+depto2.getPrecio().doubleValue();
        Double prom=suma/2;
        
        Double promedio = Inmobiliaria.promedioDepto(Inmobiliaria.getListaDpto());
        System.out.println(promedio);
        System.out.println(prom);
        
        
    
    /*int i=0; 
    menuprint.menu();
    i=keyboard.nextInt();
    
    switch(i){
        case 1 -> {
        System.out.println("--AGREGAR PROPIEDAD--");
        System.out.println("Ingresar nombre:\n");
        String nombre=keyboard.nextLine();
        System.out.println("Ingresar DNI Propietario");
        Integer dni = keyboard.nextInt();
        Persona propietario=Inmobiliaria.findByDNI(dni);
        
        
        }
        case 2 -> System.out.println("--ABM CLIENTES--");
        case 3 -> System.out.println("--ABM CLIENTES--");
        case 4 -> System.out.println("--ABM CLIENTES--");
        case 5 -> System.out.println("--ABM CLIENTES--");
        case 6 -> System.out.println("--ABM CLIENTES--");
        case 7 -> System.out.println("--ABM CLIENTES--");
        case 8 -> System.out.println("--ABM CLIENTES--");
        case 9 -> System.out.println("--ABM CLIENTES--");
        case 10 -> System.out.println("--ABM CLIENTES--");
        case 11 -> System.out.println("--ABM CLIENTES--");
        case 12 -> System.out.println("--ABM CLIENTES--");
        case 13 -> System.out.println("--ABM CLIENTES--");
    }*/
    
    }
    public class menuprint{
 
        
        public static void menu(){
        System.out.println("Inmobiliaria Del Oeste");
        System.out.println("--ABM PROPIEDADES--");
        System.out.println("\t 1-Agregar propiedad");
        System.out.println("\t 2-Editar propiedad");
        System.out.println("--ABM CLIENTES--");
        System.out.println("\t 3-Alta cliente");
        System.out.println("--Listados de propiedades--");
        System.out.println("\t 5-Por precio");
        System.out.println("\t 6-Por Ubicacion");
        System.out.println("--Busqueda de propiedades--");
        System.out.println("\t 7-Rango de precios");
        System.out.println("\t 8-Ubicacion");
        System.out.println("\t 9-ALquileres");
        System.out.println("\t 10-Ventas");
        System.out.println("\t 11-Permutas");
        System.out.println("--Gestion comercial--");
        System.out.println("\t 12-Vender una propiedad");
        System.out.println("\t 13-Alquilar una propiedad");
        System.out.println("0- Finalizar \n");
        }
        
        public static void submenu1(){
        System.out.println("1- Campo");
        System.out.println("2- Terreno");
        System.out.println("3- PH");
        System.out.println("4- Casa");
        System.out.println("5- Departamento");
        
        }
        
        
    }
    
    
}
