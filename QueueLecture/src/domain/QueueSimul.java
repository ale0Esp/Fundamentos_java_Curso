package domain;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueSimul {

    public static void main(String[] args) {
        Stack pila = new Stack();
        Long numeroLong = 12L;
        Integer numeros = 34567;
        Float numeroFloat = 1.0F;
        Double numeroDouble = 1234.5678;

        pila.push(numeroLong);
        imprimirPila(pila);

        pila.push(numeros);
        imprimirPila(pila);

        pila.push(numeroFloat);
        imprimirPila(pila);

        pila.push(numeroDouble);
        imprimirPila(pila);

        try {
            Number objetoEliminado = null;
            while (true) {
                objetoEliminado = (Number) pila.pop();
                System.out.printf("%s se quita \n", objetoEliminado);
                imprimirPila(pila);
            }
        }catch(EmptyStackException e){
        }
    }

    public static void imprimirPila(Stack<Number> pila) {
        if (pila.empty()) {
            System.out.print("la pila esta vacia\n\n");
        } else {
            System.out.print("la pila contiene: ");
            pila.forEach(numero -> {
                System.out.printf("%s, ", numero);
            });
            System.out.print("(superior) \n\n");
        }
    }

}
