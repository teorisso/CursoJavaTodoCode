package POO.herencia;

public class Jefe extends Persona {
    int id_jefe;
    String departamento_jefe;

    public Jefe() {
    }

    public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String departamento_jefe, int id_jefe) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.departamento_jefe = departamento_jefe;
        this.id_jefe = id_jefe;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }
}
