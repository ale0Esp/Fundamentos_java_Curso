
public class TypeChar 
{
    public static void main(String args[])
    {
        char miCarac= 'a';
        char varChar='\u0021';
        char varCharDex= 33;
        char varCharSim='!';
        
        System.out.println("miCarac = " + miCarac);
        System.out.println("varChar = " + varChar);
        System.out.println("varCharDex = " + varCharDex);
        System.out.println("varCharSim = " + varCharSim);
        var miCarac11= 'a';
        var varChar1='\u0021';
        var varCharDex1= 33;//va a inferir que sera una variable int
        var varCharSim1='!';
        System.out.println("miCarac1 = " + miCarac11);
        System.out.println("varChar1 = " + varChar1);
        System.out.println("varCharDex1 = " + varCharDex1);
        System.out.println("varCharSim1 = " + varCharSim1);
        
        int varEnteSimb= '!';
        System.out.println("varEnteSimb = " + varEnteSimb);
        int letra = 'A';
        System.out.println("letra = " + letra);
    }
}
