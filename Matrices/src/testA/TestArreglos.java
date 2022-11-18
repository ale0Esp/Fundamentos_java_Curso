package testA;

import domain.Persona;
import java.util.Arrays;

public class TestArreglos {

    public static void main(String[] args) {
        //arreglosPrimitivos();
        //arreglosObject();
        
    }

    public static void arreglosPrimitivos() {
        int edades[] = new int[3];
        String frutas[]={"Naranja","Platano","uva"};
        for (String fruta : frutas) {//sintaxis solo en no primitivos
            System.out.println("frutas = " + fruta);
        }
        System.out.println("edades = " + Arrays.toString(edades));

        edades[0] = 10;
        System.out.println("edades = " + edades[0]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades[" + i + "]=" + edades[i]);
            
        }
    }

    public static void arreglosObject() {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karlas");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

}
