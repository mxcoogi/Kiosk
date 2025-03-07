package Item;

public class MenuItem extends Item {

    public MenuItem(String name, int price, String description){
        super(name, price, description);
    }

    @Override
    public String toString() {
        return String.format("%-20s | W %-5.1f | %s", getName(), getPrice()/1000.0, getDescription());
    }

}
