package POO.ejintpokemon;

public class Pikachu extends Pokemon implements IElectrico {
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

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu ataca con impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu ataca con puño trueno");
    }
}
