package POO.ejintpokemon;

public class Bulbasur extends Pokemon implements IPlanta {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasur ataca con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasur ataca con araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasur ataca con mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasur ataca con drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasur ataca con paralizar");
    }
}
