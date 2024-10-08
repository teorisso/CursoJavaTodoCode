package POO.ejintpokemon;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ataca con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander ataca con araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander ataca con mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataca con puño fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ataca con lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataca con ascuas");
    }
}
