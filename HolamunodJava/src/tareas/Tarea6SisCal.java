/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;
import java.util.Scanner;

public class Tarea6SisCal {
    public static void main(String args[])
    {
       Scanner read = new Scanner(System.in);
       double valor;
       System.out.println("Proporcionar un valor entre el 0 y el 10:");
       valor = Double.parseDouble(read.nextLine());
        if(valor>=9 && valor<=10 )
            System.out.println("A");
        else if(valor>=8 && valor<9 )
            System.out.println("B");
        else if(valor>=7 && valor<8 )
            System.out.println("C");
        else if(valor>=6 && valor<7 )
            System.out.println("D");
        else if(valor>=0 && valor<6 )
            System.out.println("F");
        else
            System.out.println("Valor desconocido");
    }
}
