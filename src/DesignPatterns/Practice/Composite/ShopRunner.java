package DesignPatterns.Practice.Composite;

public class ShopRunner {
    public static void main(String[] args) {
        Box mainBox = new Box();
        Box boxWithIphones = new Box();
        Box boxWithApples = new Box();

        boxWithIphones.addGoods(new Iphone("6s", 500));
        boxWithIphones.addGoods(new Iphone("5s", 300));
        boxWithApples.addGoods(new Apple("red apple", 25));
        mainBox.addGoods(boxWithIphones);
        mainBox.addGoods(boxWithApples);

        System.out.println(mainBox.getPrice());
    }
}
