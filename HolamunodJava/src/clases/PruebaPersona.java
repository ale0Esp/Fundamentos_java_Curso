package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        p1.nombre="Juan";
        p1.apellido="Perez";
        p1.desplegaInfo();
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);//Referencia de memoria
        
        p2.desplegaInfo();
        p2.nombre="Karla";
        p2.apellido="Lara";
        p2.desplegaInfo();
        
    }
    
}
