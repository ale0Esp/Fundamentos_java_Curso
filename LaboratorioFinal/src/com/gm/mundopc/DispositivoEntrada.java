package com.gm.mundopc;

public class DispositivoEntrada extends Object {
    //variables
    protected String tipoEntrada;
    protected String marca;
    //constructor
    public DispositivoEntrada(String tipo, String marca){
        this.tipoEntrada=tipo;
        this.marca=marca;
    }
    //metodos
    public String getEntrada(){
        return this.tipoEntrada;
    }
    public void setEntrada(String entrada){
        this.tipoEntrada=entrada;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    @Override
    public String toString(){
        return "Dispositivo \nTipoEntrada= "+this.tipoEntrada+"\nMarca= "+this.marca;
    }
    
}
