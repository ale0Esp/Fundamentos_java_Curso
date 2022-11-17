/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasespart2;

/**
 *
 * @author Windows
 */
public class CalcEstaSwitch {
    public static void main(String args[])
    {
        var mes = 5;
        var estacion="desconocida";
    
//        switch (mes) {
//            case 1, 2, 12 -> estacion= "Invierno";
//            case 3, 4, 5 -> estacion = "Primavera";
//            case 6, 7, 8 -> estacion = "Verano";
//            case 9, 10, 11 -> estacion = " Otonio";
//            default ->  {
//            }
//        }
            switch (mes) {
                case 1: case 2: case 12:
                estacion= "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = " Otonio";
                break;
            default:
                break;
            }
        System.out.println("estacion = " + estacion);
    }
}
