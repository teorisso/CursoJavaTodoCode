package POO.sobrescrituraysobrecarga;

public class Perro extends AnimalSobrescrito{

    private String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;

    //Ovverride
    //Sobrescritura de metodos
    //Se sobrescribe el metodo hacerSonido de la clase padre implementandolo a mi manera
    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y hago guau guau");
    }
}
