
package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    //variables
    private final int idTeclado;
    private static int contadorTeclados;
    //constructores
    public Teclado(String entrada, String marca){
        super(entrada,marca);
        this.idTeclado=++Teclado.contadorTeclados;
    }
    //metodos

    @Override
    public String toString() {
        return "Teclado{" + "\nidTeclado=" + idTeclado +super.toString()+ '}';
    }
    
    
}
