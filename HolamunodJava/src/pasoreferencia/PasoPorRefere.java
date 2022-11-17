
package pasoreferencia;
import clases.Persona;

public class PasoPorRefere {
    public static void main(String[] args) {
        //Persona per1 = new Persona();
        Persona per1 = null;
        per1.nombre="Juan";
        System.out.println("per1 nombre = " + per1.nombre);
        per1=cambiaValor(per1);
        System.out.println("per1(cambiado) nombre = " + per1.nombre);
    }
    //metodo
    public static Persona cambiaValor(Persona pers)
    {
        if(pers==null)
        {
            System.out.println("Valor de persona invalido");
            return null;
        }
        pers.nombre="Karla";
        return pers;
    }
    
}
