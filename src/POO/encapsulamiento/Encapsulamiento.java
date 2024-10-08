package POO.encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(15, "Teo", "Risso");

        System.out.println("Alumno 2: " + alumno2.getId());
        System.out.println("Alumno 2: " + alumno2.getNombre());
        System.out.println("Alumno 2: " + alumno2.getApellido());
    }
}
