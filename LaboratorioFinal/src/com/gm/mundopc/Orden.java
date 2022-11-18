package com.gm.mundopc;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    final private static int maxComputadoras = 10;

    //constructor
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora) {
        if (contadorComputadoras < maxComputadoras) {
            computadoras[++Orden.contadorComputadoras] = computadora;
        }
    }

    public void mostrarOrden() {
        System.out.println("******Orden*****\n");
        System.out.println("No Orden= " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
