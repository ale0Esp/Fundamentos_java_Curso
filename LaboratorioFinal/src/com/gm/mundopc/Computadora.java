package com.gm.mundopc;

public class Computadora {
//variables
    final private int idComputadora;
    private static int contadorComputadora;
    private String computadora;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
//constructores
    private Computadora(){
        this.idComputadora=++Computadora.contadorComputadora;
    }
    
    public Computadora(String computadora, Monitor monitor, Teclado teclado, Raton raton ){
        this();
        this.computadora=computadora;
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }
//metodos
    public String getComputadora() {
        return computadora;
    }

    public void setComputadora(String computadora) {
        this.computadora = computadora;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", computadora=" + computadora + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
    
}
