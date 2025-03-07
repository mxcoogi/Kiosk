package kiosk;
import Item.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Item.MenuItem;
public class Kiosk implements Interactable{

    private List<Item> itemList;
    private Scanner sc;

    public Kiosk(){
        itemList = new ArrayList<>();
        sc = new Scanner(System.in);
        init();
    }


    @Override
    public void init() {
        itemList.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        itemList.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        itemList.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        itemList.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    @Override
    public void start() {
        String temp;
        while (true) {
            System.out.println("1. 메뉴 보기  2. 메뉴 추가  0. 종료");
            temp = sc.nextLine();
            switch (temp) {
                case "1":
                    showMenu();
                    break;
                case "2":
                    addMenu();
                    break;
                case "0":
                    return;
                default:
                    break;
            }
        }
    }


    @Override
    public void showMenu() {
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }

    private void addMenu(){
        String name; int price; String description;
        System.out.print("메뉴 명: ");
        name = sc.nextLine();
        System.out.print("메뉴 가격: ");
        try{
            String temp = sc.nextLine();
            price = Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            System.out.println("올바른 가격을 입력해 주세요");
            return ;
        }
        System.out.print("메뉴 설명: ");
        description =  sc.nextLine();
        itemList.add(new MenuItem(name, price, description));
    }

}
