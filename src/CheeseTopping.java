public class CheeseTopping extends ToppingDecorator{
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", added cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 150;
    }
}
