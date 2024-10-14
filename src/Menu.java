import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String desc;
    public Menu(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getDesc(){
        return desc;
    }
    @Override
    public void print(){
        System.out.println("\n" + getName() + ": " + getDesc());
        System.out.println("--------------------------");

        for(MenuComponent menuComponent: menuComponents){
            menuComponent.print();
        }
    }

}
