package Item;

public abstract class ITem {
    private String name;
    private int price;
    private String desciption;

    public void setName(String name) {
        this.name = name;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
