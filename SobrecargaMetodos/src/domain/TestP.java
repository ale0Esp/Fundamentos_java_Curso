package domain;


public class TestP {

    public static void main(String[] args) {
        var resIntOne= operaciones.Operaciones.suma(5, 5);
        var restDouble= operaciones.Operaciones.suma(5.5, 5.5);
        var restIntTwo= operaciones.Operaciones.suma(55, 55, 55);
        System.out.println("resIntOne = " + resIntOne);
        System.out.println("restDouble = " + restDouble);
        System.out.println("restIntTwo = " + restIntTwo);
    }
}
