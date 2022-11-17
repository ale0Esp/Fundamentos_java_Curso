package domain;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contEmp;

    public Empleado() {
        this.idEmpleado = ++Empleado.contEmp;
    }

    public Empleado(String nombre, double sueldo) {
        // super(nombre);
        this();
        this.nombre = nombre;//se hace una llamada a super de manera implicita
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(super.toString()).append(")");
        sb.append('}');
        return sb.toString();
    }

}
