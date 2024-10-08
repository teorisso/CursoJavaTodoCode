package POO.collections.linkedlists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {


        // Crear un  de tipo Persona que es lo que se va a guardar en la lista
        List<Persona> listaPersonas = new LinkedList<Persona>();

        // Agregar elementos a la lista al final
        listaPersonas.add(new Persona(1, "Teo", 20));
        listaPersonas.add(new Persona(2, "Juan", 30));
        listaPersonas.add(new Persona(3, "Pedro", 40));
        listaPersonas.add(new Persona(4, "Maria", 50));

        System.out.println("----Bucle for each----");
        // Recorrer la lista con un for each para recorrer elemento por elemento
        //Las linkedlists estan pensadas para ir registros en orden y no para recorrerlos por indice

        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
        }
    }
}
