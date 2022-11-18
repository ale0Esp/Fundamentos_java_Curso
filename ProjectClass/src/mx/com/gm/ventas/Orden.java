package mx.com.gm.ventas;

public class Orden {

    private int idOrden;
    private Productos productos[];
    private int contadorProductos=0;
    private static int contadorOrdenes;
    final private static int MAX_PRODUCTOS = 10;

    //CONSTRUCTORES
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Productos[Orden.MAX_PRODUCTOS];
    }

    //metodos
    public void agregarProducto(Productos producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ah superaodp el max de productosd" + Orden.MAX_PRODUCTOS);
        }

    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {

        System.out.println("Id Orden" + this.idOrden);
        //double totalOrden = this.calcularTotal();
        System.out.println("total de la orden: $" + calcularTotal());
        System.out.println("Productos de la orden");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }

    }
}
