package POO.Logica;

// Clase Alumno
public class Alumno {

    //atributos globales
    //Definen un estado de la clase
    int id;
    String nombre;
    String apellido;

    //metodos
    //Definen el comportamiento de la clase
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y mi nombre es: " + nombre + " " + apellido);
    }

    public void saberAprobado(double calificacion) {
        if (calificacion >= 6){
            System.out.println("Aprobe la materia");
        } else {
            System.out.println("Uy no aprobé");
        }
    }

    //metodos constructores
    //Son funciones especiales que se ejecutan al instanciar una clase
    //Se llaman siempre igual que la clase
    //No retornan nada ni siquiera VOID
    //Pueden recibir o no parametros

    // Alt + Insert

    public Alumno() {
        //Constructor vacio
    }

    public Alumno(int id, String nombre, String apellido) {
        //Constructor recibiendo parametros
        //Atributos de la clase
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;

        //this al atributo de esta clase que estoy creando asignalo a lo que recibo por parametro en el constructor
    }

    //Metodos especiales getters y setters.
    //Son metodos que permiten acceder a los atributos de la clase
    //Generalmente se agregan antes de los metodos personalizados y despues de los constructores
    //Alt + Insert
    //Seleccionar Getter and Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
