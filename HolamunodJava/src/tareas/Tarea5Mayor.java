
package tareas;
import java.util.Scanner;
public class Tarea5Mayor {
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int num1,num2;
        System.out.println("Proporciona el numero1:");
        num1= Integer.parseInt(read.nextLine());
        System.out.println("Proporciona el numero2:");
        num2= Integer.parseInt(read.nextLine());
        var rest=(num1 > num2)? num1: num2;
        System.out.println("El numero mayor es:\n"+rest);
    }
}
