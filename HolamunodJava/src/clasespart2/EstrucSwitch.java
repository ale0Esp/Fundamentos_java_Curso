
package clasespart2;


public class EstrucSwitch 
{
    public static void main(String args[])
    {
        var numero = 8;
        var numText="Valor desconocido";
        switch(numero)
        {
            case 1:
                numText="numero 1";
                break;
            case 2:
                numText="numero 2";
                break;
            case 4:
                numText="numero 4";    
                break;
            default:
                numText="No existe";    
        }
        System.out.println("numText = " + numText);
    }
}
