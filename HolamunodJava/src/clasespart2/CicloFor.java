
package clasespart2;

public class CicloFor {
    public static void main(String args[])
    {
        var cont=0;
        inicio:
        for (cont=0 ; cont<3;cont++)
        {
            if(cont%2==0)
            {
                continue inicio;//labels
            }
        }
        System.out.println("cont = " + cont);
    }
}
