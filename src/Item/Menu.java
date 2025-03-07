package Item;

import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {

    private String category;
    private Map<Item, Boolean> menuList;

    public Menu(String category){
        this.category = category;
        this.menuList = new LinkedHashMap<>();
    }

    public String getCategory() {
        return category;
    }

    public void AddItem(Item item){
        menuList.put(item, true);
    }

    public void showItem(){
        menuList.forEach((key, value) -> {
            if(value){
                System.out.println(key.toString());
            }
        });
    }
}
