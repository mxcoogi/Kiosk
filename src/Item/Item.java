package Item;

public abstract class Item {
    private String name;
    private int price;
    private String description;

    public Item(String name, String price, String desc) {
        this.name = name;
        try{
            this.price = Integer.parseInt(price);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("올바른 가격을 입력 해 주세요");
        }
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
