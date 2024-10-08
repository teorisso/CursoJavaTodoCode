package POO.sobrescrituraysobrecarga;

public class Gato extends AnimalSobrescrito{
    @Override
    public void hacerSonido() {
        System.out.println("Soy un gato y hago miau miau");
    }
}
