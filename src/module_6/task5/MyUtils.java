package module_6.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface DrinkReceipt {
    String getName();

    DrinkReceipt addComponent(String componentName, int componentCount);
}

interface DrinkPreparation {
    Map<String, Integer> makeDrink();
}

interface Rating {
    int getRating();
}

class Caffee implements DrinkReceipt, DrinkPreparation, Rating {
    private String name;
    private int rating;
    private Map<String, Integer> ingredients = new HashMap<String, Integer>();

    public Caffee(String name, int rating) {
        this.name = name;
        this.rating = rating;

        ingredients.put("Water", 100);
        ingredients.put("Arabica", 20);
    }

    public String getName() {
        return name;
    }

    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredients.put(componentName, componentCount);
        return this;
    }

    public Map<String, Integer> makeDrink() {
        return ingredients;
    }

    public int getRating() {
        return rating;
    }
}

class Espresso extends Caffee {
    public Espresso(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water", 50);
        return super.makeDrink();
    }
}

class Cappuccino extends Caffee {
    public Cappuccino(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Milk", 50);
        return super.makeDrink();
    }
}

public class MyUtils {
    public Map<String, Double> averageRating(List<Caffee> coffees) {
        Map<String, Double> resultMap = new HashMap<>();

        if(coffees.size() == 0) return resultMap;

        Double avgCaffeeRating = 0.0;
        Double avgEspressoRating = 0.0;
        Double avgCappuccinoRating = 0.0;

        for (Caffee c : coffees) {
            if (c == null)
                continue;

            if (c instanceof Espresso) {
                if (avgEspressoRating != 0.0) {
                    avgEspressoRating = (avgEspressoRating + c.getRating()) / 2;
                    continue;
                }

                avgEspressoRating += c.getRating();
                continue;
            }

            if (c instanceof Cappuccino) {
                if (avgCappuccinoRating != 0.0) {
                    avgCappuccinoRating = (avgCappuccinoRating + c.getRating()) / 2;
                    continue;
                }

                avgCappuccinoRating += c.getRating();
                continue;
            }

            if (c instanceof Caffee) {
                if (avgCaffeeRating != 0.0) {
                    avgCaffeeRating = (avgCaffeeRating + c.getRating()) / 2;
                    continue;
                }

                avgCaffeeRating += c.getRating();
                continue;
            }
        }

        if(avgEspressoRating != 0.0) resultMap.put("Espresso", avgEspressoRating);
        if(avgCappuccinoRating != 0.0) resultMap.put("Cappuccino", avgCappuccinoRating);
        if(avgCaffeeRating != 0.0) resultMap.put("Caffee", avgCaffeeRating);
             
        return resultMap;
    }

    public static void main(String[] args) {
        List<Caffee> l1 = new ArrayList<>();
        l1.add(new Espresso("Espresso", 8));
        l1.add(new Cappuccino("Cappuccino", 10));
        l1.add(new Espresso("Espresso", 10));
        l1.add(new Cappuccino("Cappuccino", 6));
        l1.add(new Caffee("Caffee", 6));

        MyUtils m1 = new MyUtils();
        System.out.println(m1.averageRating(l1).toString());
    }
}