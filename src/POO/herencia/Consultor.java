package POO.herencia;

public class Consultor extends Persona {
    String nombre_consultora;
    int num_consultor;

    public Consultor() {
    }

    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int num_consultor, String nombre_consultora) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_consultor = num_consultor;
        this.nombre_consultora = nombre_consultora;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
}
