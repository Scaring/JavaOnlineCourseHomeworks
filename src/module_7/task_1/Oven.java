package module_7.task_1;

class Pizza {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    private Pizza() {
    }

    public String getCheese() {
        return cheese;
    }

    public String getMeat() {
        return meat;
    }

    public String getSeafood() {
        return seafood;
    }

    public String getVegetable() {
        return vegetable;
    }

    public String getMushroom() {
        return mushroom;
    }

    public static class PizzaBuilder{
        private Pizza pizza = new Pizza();

        private PizzaBuilder() {
        }

        public PizzaBuilder addCheese(String cheese) {
            pizza.cheese = cheese;
            return this;
        }

        public PizzaBuilder addMeat(String meat) {
            pizza.meat = meat;
            return this;
        }

        public PizzaBuilder addSeafood(String seafood) {
            pizza.seafood = seafood;
            return this;
        }

        public PizzaBuilder addVegetable(String vegetable) {
            pizza.vegetable = vegetable;
            return this;
        }

        public PizzaBuilder addMushroom(String mushroom) {
            pizza.mushroom = mushroom;
            return this;
        }

        public Pizza build(){
            return pizza;
        }
    }

    public static PizzaBuilder base() {
        return new PizzaBuilder();
    }

}

class Oven {
    public static Pizza cook() {
        Pizza.PizzaBuilder p1 = Pizza.base();

        p1.addCheese("Mozarella");        
        p1.addMeat("Beef");
        p1.addVegetable("Tomatos");

        return p1.build();
    }
}