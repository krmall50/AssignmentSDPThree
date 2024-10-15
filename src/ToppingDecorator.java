public abstract class ToppingDecorator implements Pizza {
    protected Pizza temp;
    public ToppingDecorator(Pizza pizza){
        this.temp = pizza;
    }

    @Override
    public String getDesc() {
        return temp.getDesc();
    }

    @Override
    public double getCost() {
        return temp.getCost();
    }
}
