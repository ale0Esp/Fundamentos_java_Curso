package test;

import domain.Persona;

public class Prueba {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Karla");

        imprimir(p1);
        imprimir(p2);
    }

    public static void imprimir(Persona per) {
        System.out.println("Persona = " + per);
        //Se imprime un ID que esta definida como static la cual 
        //Se inicializa en la clase Persona mas no en el objeto
    }
  
}
