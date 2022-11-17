
package clasespart2;


public class SenIfElse {
    public static void main(String args[])
    {
        var cond=true;
        if(cond)
            System.out.println("es verdadera");
        else
            System.out.println("falsa");
        
        
        var num =7;
        var numTex= "Numero desconocido";
        if(num == 1)
            numTex="numero 1";
        else if(num == 2)
            numTex="numero 2";
        else if(num == 3)
            numTex="numero 3";
        else if(num == 4)
            numTex="Numero 4";

        System.out.println("numTex = " + numTex);
                
    }
}
