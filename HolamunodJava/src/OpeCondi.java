
public class OpeCondi {

    public static void main(String args[]) {
        var a = 15;
        var valorMin = 0;
        var valorMax = 10;

        var resultado = a >= valorMin && a <= valorMax;
        if (resultado) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera de rango");
        }
        var vacaciones = true;
        var diaDescnaso = false;
        if (vacaciones || diaDescnaso)
            System.out.println("Puede asistir al juego");
        else
            System.out.println("Ocupado");
    }

}
