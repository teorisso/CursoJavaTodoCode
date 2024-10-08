package POO.Logica;

public class POO {
    public static void main(String[] args) {
        //Instanciar un objeto de la clase Alumno.
        //Utilizar el constructor vacio
        Alumno alumno1 = new Alumno();

        //Asignar valores a los atributos del objeto

        alumno1.setId(1);
        alumno1.setNombre("Teo");
        alumno1.setApellido("Risso");

        //Utilizar el metodo mostrarNombre
        alumno1.mostrarNombre();
        alumno1.saberAprobado(5.9);
        System.out.println("-------------------------------------------------");

        //Utilizar los metodos getters
        System.out.println("El id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre del alumno 1 es: " + alumno1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alumno1.getApellido());
        System.out.println("-------------------------------------------------");

        //Utilizar el constructor con parametros
        Alumno alumno2 = new Alumno(2, "Maria", "Gomez");
        alumno2.mostrarNombre();
        alumno2.saberAprobado(6.0);
        System.out.println("-------------------------------------------------");

        alumno2.setId(3);
        System.out.println("El id del alumno 2 es: " + alumno2.getId());


    }
}
