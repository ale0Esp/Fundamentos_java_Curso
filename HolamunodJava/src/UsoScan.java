import java.util.Scanner;
public class UsoScan 
{
    public static void main(String args[]) 
    {
        Scanner read = new Scanner (System.in);
        var titulo ="";
        var autor="";
        System.out.println("Proporciona el titulo: ");
        titulo = read.nextLine();
        System.out.println("Proporciona el autor:");
        autor = read.nextLine();
        System.out.println(titulo+" Fue escrito por " +autor);
    }
    
}
