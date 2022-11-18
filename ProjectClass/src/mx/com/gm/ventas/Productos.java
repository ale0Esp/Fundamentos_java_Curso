package mx.com.gm.ventas;

public class Productos extends Object {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProdutos;

    //Constructores
    private Productos() {       
        this.idProducto = ++Productos.contadorProdutos;
    }

    public Productos(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nid producto: " + idProducto
                + "\nnombre: " + this.nombre + "\nprecio = " + this.precio;
    }

}
