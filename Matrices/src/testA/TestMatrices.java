package testA;

import domain.Persona;

public class TestMatrices {
   
    public static void main(String[] args) {
        Persona personas[][]= new Persona[2][2];
        int edades[][] = new int[3][2];
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                edades[i][j] = i + j;//Se auto asigna por suma de i+j.
            }
        }
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("edades [" + i + "][" + j + "] = " + edades[i][j]);
            }
        }
       personas[0][0]= new Persona("Juan");
       personas[0][1]= new Persona("Karla");
       personas[1][0]= new Persona("Daniel");
       personas[1][1]= new Persona("Perla");
       //imprime personas
        System.out.println("");
       imprimir(personas);
       //imprime frutas
        System.out.println("");
       imprimir(frutas);
    }
    
    public static void imprimir(Object matriz[][]){
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
    }
}
