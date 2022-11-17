package tareas;
import java.util.Scanner;
public class Tarea3TiendaLibros {

    public static void main(String args[]) {
        
        Scanner read = new Scanner (System.in);
        System.out.println("Proporciona el nombre: ");
        var nomb=read.nextLine();
        System.out.println("Proporciona el Id:");
        var id = Integer.parseInt(read.nextLine());
        System.out.println("Proporciona el precio:");
        var prec= Double.parseDouble(read.nextLine());
        System.out.println("Proporciona el envio gratuito");
        Boolean enviGratuito= read.nextBoolean();
        System.out.println(nomb+" #"+id);
        System.out.println("Precio: $"+prec);
        System.out.println("Envio gratuito: "+enviGratuito);
    }
}
