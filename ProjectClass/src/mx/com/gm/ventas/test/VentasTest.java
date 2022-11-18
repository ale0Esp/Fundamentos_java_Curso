package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {

    public static void main(String[] args) {
        Productos producto1 = new Productos("camisa", 59.99);
        Productos producto2 = new Productos("Pantalon", 99.99);
        Orden orden1 = new Orden();
        
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}
