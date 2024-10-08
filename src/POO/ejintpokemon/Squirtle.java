package POO.ejintpokemon;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle ataca con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle ataca con araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle ataca con mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataca con hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca con burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataca con pistola de agua");
    }
}
