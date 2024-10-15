public class MushroomTopping extends ToppingDecorator{
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDesc() {
        return super.getDesc() + ", added Mushroom";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }
}
