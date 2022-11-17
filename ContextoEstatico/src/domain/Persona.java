package domain;

public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas;//Al ser estatico pertenece a la clase

    public Persona(String nombre) {
        this.nombre = nombre;
        //Incrementar contador por objeto
        Persona.contadorPersonas++;//Recomendado
        //Asignar valor nuevo
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override//notacion que se sobre escribe el metodo tOString
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}
