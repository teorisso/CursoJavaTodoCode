package POO.collections.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        // Crear un ArrayList de tipo Persona que es lo que se va a guardar en la lista
        List<Persona> listaPersonas = new ArrayList<Persona>();

        // Agregar elementos a la lista
        listaPersonas.add(new Persona(1, "Teo", 20));
        listaPersonas.add(new Persona(2, "Juan", 30));
        listaPersonas.add(new Persona(3, "Pedro", 40));
        listaPersonas.add(new Persona(4, "Maria", 50));

        System.out.println("----Bucle for----");
        // Recorrer la lista por indice
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println("Persona " + i + ": " + listaPersonas.get(i).getNombre());
        }

        System.out.println("----Bucle for each----");
        // Recorrer la lista con un for each para recorrer elemento por elemento
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }

    }
}
