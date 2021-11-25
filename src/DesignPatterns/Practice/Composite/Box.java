package DesignPatterns.Practice.Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements IPackable {
    private List<IPackable> goods = new ArrayList<IPackable>();

    public void addGoods(IPackable item) {
        goods.add(item);
    }

    public int getPrice() {
        int total = 0;

        for (IPackable g : goods) {
            total += g.getPrice();
        }

        return total;
    }
}
