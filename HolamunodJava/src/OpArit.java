
public class OpArit {
    public static void main(String args[])
    {
        int a=3,b=2;
        var result = a+b;
        System.out.println("result+ = " + result);
        result=a-b;
        System.out.println("result- = " + result);
        result=a*b;
        System.out.println("result* = " + result);
        var result2=3D/b;
        System.out.println("result/ = " + result2);
        result = b%2;
        System.out.println("result% = " + result);
        
        if(b%2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
