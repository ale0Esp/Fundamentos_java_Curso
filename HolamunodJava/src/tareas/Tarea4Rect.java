
package tareas;
import java.util.Scanner;
public class Tarea4Rect {
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int alto, ancho, area, perimetro;
        System.out.println("Proporciona el alto: ");
        alto = read.nextInt();
        System.out.println("Proporciona el ancho");
        ancho=read.nextInt();
        area= alto*ancho;
        perimetro= (alto+ancho)*2;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
        
    }
    
}
