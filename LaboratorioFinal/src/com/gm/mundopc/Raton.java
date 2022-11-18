
package com.gm.mundopc;


public class Raton extends DispositivoEntrada{
    //variables
    private final int idRaton;
    static private int contadorRatones;
    //constructores
    public Raton(String entrada, String marca){
        super(entrada,marca);
        idRaton=++Raton.contadorRatones;
    }
    //metodo
    @Override
    public String toString(){
        return "Raton {Id= "+idRaton+super.toString();
    }
    
}
