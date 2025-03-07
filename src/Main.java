import Item.Item;
import Item.MenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Item> itemList = new ArrayList<>();
        String temp;
        itemList.add(new MenuItem("ShackBurger", "6900", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        itemList.add(new MenuItem("SmokeShack", "8900", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        itemList.add(new MenuItem("Cheeseburger", "6900", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        itemList.add(new MenuItem("Hamburger", "5400", "비프패티를 기반으로 야채가 들어간 기본버거"));
        while (true) {
            System.out.println("1. 메뉴 보기  2. 메뉴 추가  0. 종료");
            temp = sc.nextLine();

            switch (temp) {
                case "1":
                    for(Item item : itemList){
                        System.out.println(item.toString());
                    }
                    break;
                case "2":
                    System.out.print("메뉴 명: ");
                    String name = sc.nextLine();
                    System.out.print("메뉴 가격: ");
                    String price = sc.nextLine();
                    System.out.print("메뉴 설명: ");
                    String description =  sc.nextLine();
                    itemList.add(new MenuItem(name, price, description));
                    break;
                case "3":
                    return;
                default:
                    break;
            }
        }

    }
}