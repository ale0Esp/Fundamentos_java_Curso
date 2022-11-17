
public class HolaMunod2 {
    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var i = 3;
        var j = 4;
        System.out.println(i+j);//suma de numero
        System.out.println(i+j+usuario);
        System.out.println(usuario+i+j);//contexto cadena
         System.out.println(usuario+(i+j));//parentesis modifica la prioridad de evaluacion
    }
}
