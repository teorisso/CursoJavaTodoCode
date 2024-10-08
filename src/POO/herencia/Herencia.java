package POO.herencia;

public class Herencia {

    public static void main(String[] args) {
        /*
        Empleado empleado1 = new Empleado();

        empleado1.getNum_legajo();
        empleado1.getNombre();

        Consultor consultor1 = new Consultor();
        consultor1.getNum_consultor();
        consultor1.getNombre();

         */

        Persona vector[] = new Persona[5];
        //Polimorfismo
        //Se puede hacer con todos los objetos de la misma clase
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        //vector[4] = "Hola";

        Persona persona1 = new Persona();
        Consultor consultor1 = new Consultor();

        persona1 = consultor1;


    }
}
