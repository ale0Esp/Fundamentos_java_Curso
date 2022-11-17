
public class TiposPrimPartTwo {

    public static void main(String args[]) {
        /*
            Tipos primitivos float y double
         */
        //float-----------------------------------------------------
        float numFloat = (float) 3.4028235E38D; //tambien (float)10.0
        System.out.println("numFloat = " + numFloat);
        System.out.println("valor minimo floar: " + Float.MIN_VALUE);
        System.out.println("valor minimo floar: " + Float.MAX_VALUE);
        //double----------------------------------------------------
        double numDoub = 1.7976931348623157E308;
        System.out.println("numDoub = " + numDoub);
        System.out.println("valor minimo Double: " + Double.MIN_VALUE);
        System.out.println("valor minimo Double: " + Double.MAX_VALUE);
    }

}
