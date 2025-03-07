package Item;

import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {

    private String category;
    private Map<Integer, Item> menuList;
    private int size = 0;

    public Menu(String category){
        this.category = category;
        this.menuList = new LinkedHashMap<>();
    }

    public String getCategory() {
        return category;
    }

    public void AddItem(Item item){
        menuList.put(++size, item);
    }

    public void showItem(){
        menuList.forEach((key, value) -> {
            System.out.println(key + ". " + value.toString());
        });
    }
}
