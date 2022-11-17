//Mi clase en java
public class HolaMundo {
    public static void main(String args[]) {
        int miVarEnt = 10;
        var miVar = 10;// var: inferencia de tipos
       
        String miVarCad = "saludos";
        var miCad2 = "Impri";
        System.out.println(miVarEnt);
        //modificar valor de variable
        miVarEnt= 5;
        //sout+tab =
        System.out.println(miVarEnt);
        
        System.out.println(miVarCad);
        miVarCad = "adios";
        System.out.println(miVarCad);
        System.out.println(miVar);
        System.out.println(miCad2);
        System.out.println("miCad2 = " + miCad2);
        
        var $miVar2 = 3;
        var _miVar=3;
        var mivar4 = 4;
        var mívar = 4;//no recomendado
    }
}
