
package domain;
import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private static int contCliente;
    private Date fechaReg;
    private boolean vip;
    
    public Cliente( Date fechaReg, boolean vip, String nombre, 
            char genero, int edad, String direccion){
        super(nombre,genero,edad,direccion);//primer linea
        this.idCliente=++Cliente.contCliente;
        this.vip=vip;
        this.fechaReg=fechaReg;        
    }   
    
    public Cliente(String nombre){
        super(nombre);
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
     return this.nombre;
    }
    
    
}
