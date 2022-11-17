
public class tiposPrim 
{
    public static void main(String args[])
    {
        /*
            tipos primitivos enteros: byte, short, int, long
        */
        //Byte-----------------------------------------------------
        byte numByte = (byte)129; 
        System.out.println("numByte = " + numByte);
        System.out.println("valor minimo byte: "+Byte.MIN_VALUE);
        System.out.println("Valor maxicmo btyte "+ Byte.MAX_VALUE);
        //SHORT----------------------------------------------------
        short numShort = (short)38000;
        System.out.println("numShort = " + numShort);
        System.out.println("valor minimo short: "+Short.MIN_VALUE);
        System.out.println("Valor maxicmo short "+ Short.MAX_VALUE);
        //Int---------------------------------------------------------
        int numInt= (int)2147483648L;
        System.out.println("numInt = " + numInt);
        System.out.println("valor minimo int: "+Integer.MIN_VALUE);
        System.out.println("Valor maxicmo int: "+ Integer.MAX_VALUE);
        //Long--------------------------------------------------------.
        long numLong = 9223372036854775807L;
        System.out.println("numLong = " + numLong);
        System.out.println("valor minimo long: "+Long.MIN_VALUE);
        System.out.println("Valor maxicmo long: "+Long.MAX_VALUE);
    }
    
}
