package POO.ejintpokemon;

public class Pikachu extends Pokemon{
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu ataca con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu ataca con araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu ataca con mordisco");
    }
}
