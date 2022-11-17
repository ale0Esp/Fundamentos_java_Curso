
public class OpeAsigRela {
    public static void main(String args[])
    {
        var a = 3;
        var b = 2;
        var c = (a==b);
        var d = a!=b;
        var cadena = "hola";
        var cadena2 = "Adios";
        var e= cadena == cadena2;//compara referencias
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2);//compara contenidos
        System.out.println("f = " + f);
        //operadores relacionales
        var g = a > b;
        System.out.println("g = " + g);
        
        
        var edad =17; 
        var adultp = 18;
        if(edad>=adultp)
            System.out.println("Es un adulto");
        else
            System.out.println("es menor");
    }
}
