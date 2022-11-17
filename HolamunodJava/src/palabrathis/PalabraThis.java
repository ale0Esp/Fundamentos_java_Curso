
package palabrathis;


public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan","Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona.nombre = " + persona.nombre);
        System.out.println("persona.apellido = " + persona.apellido);
    }
    
}
class Persona{//solo se accede dentro del mismo paquete
    String nombre;
    String apellido;
    Persona(String nombre, String apellido){//constructor
        //super(); llamada al constructor de la clase padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("this"+this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public Imprimir(){
        super();
    }
    public void imprimir(Persona persona)
    {
        System.out.println("Persona; "+ persona);
        System.out.println("IMPRESION DWEL OBJETO: "+this);
    }
}