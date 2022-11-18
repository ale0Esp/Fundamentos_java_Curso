
package testA;

import java.io.*;
import java.util.Scanner;

public class Matriz {
//Requiere modificaciones
    static float Matrix[][] = new float[4][4];
    static float prom[] = new float[4];
    static int alumno, materia,cont=0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float cal = 0, /*prom = 0*/ sum = 0;

        for (alumno = 0; alumno < Matrix.length; alumno++) {// las variables pueden mejorar
            System.out.println("ALUMNO\t" + alumno);
            for (materia = 0; materia < Matrix[alumno].length; materia++) {
                System.out.println("Inserta la calificacion de la materia:\t" + materia);
                cal = Matrix[alumno][materia] = sc.nextFloat();

                sum = sum + cal;
                cal = cal + 1;

            }
            prom[alumno] = sum / 4;
        }
        System.out.println("");
        for (alumno = 0; alumno < Matrix.length; alumno++)//se puede mejorara mas
        {
            System.out.println(alumno+1+" "+Matrix[alumno][0]+" "+Matrix[alumno][1]+" "+Matrix[alumno][2]+" "+Matrix[alumno][3]);
            cont++;
        }
        for(alumno = 0; alumno < prom.length; alumno++){//el promedio esta mal
            System.out.println("promedios "+alumno+"="+prom[alumno]);
        }
    }

}
