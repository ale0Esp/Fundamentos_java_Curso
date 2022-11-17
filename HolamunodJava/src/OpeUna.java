
public class OpeUna {
    public static void main(String args[])
    {
        int a = 3;
        int b= -a;
        boolean c = true;
        boolean d= !c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        //Incremento
        //1.preincremento (simbolo antes de la variable)
        var e=3;
        var f= ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //post incremento
        //simbolo despues de la variable
        var g=5;
        var h= g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        //Decremento
        //predecremento
        var i =4;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //postdecremento
        var k = 8;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
    }
}
