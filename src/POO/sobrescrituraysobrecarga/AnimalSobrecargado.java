package POO.sobrescrituraysobrecarga;

public class AnimalSobrecargado {
    private int id_animal;
    private String descripcion;

    //constructores


    //metodos getters y setters

    //otros metodos

    public void hacerSonido(){
        System.out.println("Haciendo sonido de animal");
    }

    //Sobrecarga de metodos
    public void hacerSonido(String nombreAnimal){
        System.out.println("Haciendo sonido de "+nombreAnimal);
    }

    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal "+nombreAnimal+" hace un sonido de tipo "+tipoSonido);
    }
}
