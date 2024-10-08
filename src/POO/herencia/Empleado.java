package POO.herencia;

public class Empleado extends Persona{

    //Atributos de la clase Empleado no heredados
    int num_legajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String cargo, int num_legajo, Double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.cargo = cargo;
        this.num_legajo = num_legajo;
        this.sueldo = sueldo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }
}
