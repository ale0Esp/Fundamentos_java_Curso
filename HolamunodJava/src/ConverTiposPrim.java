import java.util.Scanner;
        
public class ConverTiposPrim {
    public static void main(String args[])
    {
//        convertir tipo String a int
        var edad = Integer.parseInt("20");
        var valorPi = Double.parseDouble("3.1416");
        var read = new Scanner(System.in);
        //var edad ="20";
        System.out.println("edad = " + (edad+1));
        System.out.println("valorPi = " + valorPi);
        System.out.println("Proporciona tu edad");
        edad = Integer.parseInt(read.nextLine());
        System.out.println("edad = " + (edad));
        //Int to String
        
        var edadText= String.valueOf(10);
        System.out.println("edadText = " + edadText);
        
        
        var caract= "Hola".charAt(1);
        System.out.println("caract = " + caract);
        caract = read.nextLine().charAt(0);
        System.out.println("caract = " + caract);
    }
}
