package POO.ejintpokemon;

public class EjIntPokemon {
    public static void main(String[] args) {
    Squirtle squirtle = new Squirtle();
    Charmander charmander = new Charmander();
    Bulbasur bulbasur = new Bulbasur();
    Pikachu pikachu = new Pikachu();

    System.out.println("-----------------");
    System.out.println("Pokemones atacando");
    System.out.println("-----------------");
    System.out.println("Squirtle");
    squirtle.atacarAraniazo();
    squirtle.atacarHidrobomba();

    System.out.println("-----------------");
    System.out.println("Charmander");
    charmander.atacarAraniazo();
    charmander.atacarLanzallamas();

    System.out.println("-----------------");
    System.out.println("Bulbasur");
    bulbasur.atacarAraniazo();
    bulbasur.atacarDrenaje();

    System.out.println("-----------------");
    System.out.println("Pikachu");
    pikachu.atacarAraniazo();
    pikachu.atacarImpactrueno();

    }
}
