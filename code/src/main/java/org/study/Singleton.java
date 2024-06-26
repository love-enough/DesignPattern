package org.study;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Singleton {

    public static void main(String[] args) {
        ShoppingCartManager cart = ShoppingCartManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String itemName = scanner.next();
            int quantity = scanner.nextInt();
            cart.addToCart(itemName, quantity);
        }
        cart.viewCart();
    }
}

class ShoppingCartManager {
    //饿汉模式
    private static final ShoppingCartManager instance = new ShoppingCartManager();

    //购物车存储商品和数量的映射
    private Map<String, Integer> cart;
    //私有构造函数
    private ShoppingCartManager() {
        cart = new LinkedHashMap<>();
    }
    public static ShoppingCartManager getInstance() {
        return instance;
    }
    public void addToCart(String itemName, int quantity) {
        cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
    }
    public void viewCart() {
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
