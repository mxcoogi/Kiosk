package kiosk;
import Item.Item;

import java.util.*;

import Item.*;
import io.InputValidator;

public class Kiosk implements Interactable{

    private Map<Integer, Menu> menuList;
    private static int cnt=0;
    private Scanner sc;
    private String temp;

    public Kiosk(){
        menuList = new LinkedHashMap<>();
        sc = new Scanner(System.in);
        init();
    }


    @Override
    public void init() {
        //메뉴 초기설정 메소드 추후 작서예정
        Menu burger = new Menu("Burger");
        burger.AddItem(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burger.AddItem(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burger.AddItem(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burger.AddItem(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menuList.put(++cnt, burger);
        Menu pizza = new Menu("Pizza");
        pizza.AddItem(new MenuItem("Cheese Pizza", 9500, "모짜렐라 치즈와 토마토 소스가 토핑된 피자"));
        pizza.AddItem(new MenuItem("Pepperoni Pizza", 11500, "페퍼로니와 모짜렐라 치즈가 토핑된 피자"));
        pizza.AddItem(new MenuItem("Veggie Pizza", 10500, "버섯, 파프리카, 양파, 올리브가 토핑된 채식 피자"));
        pizza.AddItem(new MenuItem("Margherita Pizza", 9900, "모짜렐라 치즈, 바질, 토마토 소스가 토핑된 클래식 마르게리타 피자"));
        menuList.put(++cnt, pizza);
    }

    @Override
    public void start() {
        while (true) {
            showMenu();
        }
    }


    @Override
    public void showMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        menuList.keySet().forEach(s -> System.out.println(s +". "+menuList.get(s).getCategory()));
        System.out.print("확인할 카테고리 메뉴의 번호를 입력해 주세요 or 0. 종료 : ");
        try{
            int input = InputValidator.isValid();
            if(input == 0) System.exit(-1); ;
            menuList.get(input).showItem();
        } catch (Exception e) {
            System.out.println("잘못된 입력 입니다");
        }
    }


}
