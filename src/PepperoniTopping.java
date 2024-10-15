public class PepperoniTopping extends ToppingDecorator{
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDesc() {
        return super.getDesc() + ", added Pepperoni";
    }
    @Override
    public double getCost() {
        return super.getCost() + 200;
    }
}
