
package test;
import domain.Empleado;
import domain.Cliente;
import domain.Persona;
import java.util.Date;
public class TestHerencia {
    public static void main(String[] args) {
        var fecha = new Date();
        //creando un empleado
        Empleado emp1 = new Empleado("Juan",5000.0);
        System.out.println("emp1 = " + emp1);
        //creando cliente
        Cliente cl1 = new Cliente(fecha,true, "Karla", 'f', 28, "Su casita" );
        System.out.println("cl1 = " + cl1);
        //creando persona e instanciando a un tipo cliente
        Persona yo;
        yo = new Cliente("Alejandro");
          //cliente al ser clase hija de persona se puede realizar la instanciacion
       
        System.out.println(yo.toString());//llamamos metodo toString
        System.out.println(yo.getClass().getSimpleName());//regresa el nombre de la clase la cual se intancio (cliente)
    }
}
