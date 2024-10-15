public class VegetarianPizza implements Pizza{
    @Override
    public String getDesc() {
        return "Vegetarian Pizza";
    }

    @Override
    public double getCost() {
        return 2200;
    }
}
