package Item;

public class MenuItem extends Item {

    public MenuItem(String name, String price, String description){
        super(name, price, description);
    }

    @Override
    public String toString() {
        return String.format("%-15s | W %.1f | %s", getName(), getPrice()/1000.0, getDescription());
    }

}
