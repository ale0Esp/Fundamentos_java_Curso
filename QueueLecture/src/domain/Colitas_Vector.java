
import java.util.LinkedList;//clase para enlazar las listas
import java.util.Queue;//clase para las pilas
import java.lang.Thread;//clase para usar Sleep
import java.util.Scanner;

public class Colitas_Vector {

    static Queue<String> queue = new LinkedList<>();//instanciamos a pila la collecion

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("<---Menu--->");
        System.out.println("1.-Ingresar documento\n2.-Imprimir\n3-Mostrar cola");
        do {
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    imprimir();
                    break;

            }
        } while (opc != 5);

    }

    private static void push() {
        int tope = 5;
        String doc;
        if (queue.size() < tope) {//retorna el tamaño de cola y lo compara con tope
            doc = tipoDoc();
            queue.add(doc);//usa el metodo de add para añadir elementos
            System.out.println("Se ha ingresado el documento");
        } else {
            System.out.println("Cola llena");
        }
    }

    private static String tipoDoc() {//Elegimos tipo de documento a imprimir
        Scanner sc = new Scanner(System.in);
        String doc = "";
        int opc;
        System.out.println("Documento:  ");
        System.out.println("1.-doc\n2.-xls\n3.-txt\n4.-pdf");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                doc = "docx";
                break;
            case 2:
                doc = "xls";
                break;
            case 3:
                doc = "txt";
                break;
            case 4:
                doc = "pdf";
                break;
        }
        return doc;
    }

    private static void pop() {
        if (queue.isEmpty()) {
            System.out.println("cola vacia");
        } else {
            System.out.println("Imprimiendo documento: " + queue.peek());//sirve para vizualizar elementos
            try {
                for(int i=0;i<4;i++){
                    System.out.println("Imprimiendo...");
                    Thread.sleep(1000);//simular espera    
                }
            } catch (InterruptedException e) {
                return;
            }

            queue.poll();//desencola elemento
            System.out.println("Se ah impreso el documento");
        }
    }

    private static void imprimir() {
        if (queue.isEmpty()) {
            System.out.print("la cola esta vacia\n\n");
        } else {
            System.out.print("la cola contiene: ");
            for (String cola : queue) {//
                System.out.printf("%s ", cola);
            }
        }
    }

}
