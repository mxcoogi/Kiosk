package Item;

public abstract class Item {
    private String name;
    private int price;
    private String description;

    public Item(String name, int price, String desc) {
        this.name = name;
        this.price = price;
        this.description = desc;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public abstract String toString();

}
