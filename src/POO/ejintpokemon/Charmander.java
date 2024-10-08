package POO.ejintpokemon;

public class Charmander extends Pokemon {
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
}
