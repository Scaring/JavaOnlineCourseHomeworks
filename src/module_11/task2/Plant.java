package module_11.task2;

public class Plant {
    private String name;
    private Color color;
    private Type type;

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }


    //TASK 3
    public static Plant tryCreatePlant(String type, String color, String name) throws TypeException, ColorException {
        try {
            return new Plant(type, color, name);
        } catch (TypeException ex) {
            try {
                return new Plant("Ordinary", color, name);
            } catch (ColorException ex1) {
                return new Plant("Ordinary", "Red", name);
            }
        } catch (ColorException ex) {
            try {
                return new Plant(type, "Red", name);
            } catch (TypeException ex1) {
                return new Plant("Ordinary", "Red", name);
            }
            
        }
    }

    public Plant(String type, String color, String name) throws ColorException, TypeException {
        this.name = name;

        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (Exception ex) {
            throw new ColorException("Invalid value " + color.toString() + " for field color");
        }

        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (Exception ex) {
            throw new TypeException("Invalid value Unknown type for field type");
        }
    }

    @Override
    public String toString() {
        return "{type: " + type.toString() + ", color: " + color.toString() + ", name: " + name + "}";
    }

    public static void main(String[] args) {
        Plant p1;
        try {
            p1 = new Plant("RARE", "WHITE", "NAME");
            System.out.println(p1.toString());
        } catch (ColorException | TypeException e) {
            e.printStackTrace();
        }
    }

}

class ColorException extends Exception {
    ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {
    TypeException(String message) {
        super(message);
    }
}

enum Color {
    WHITE, RED, BLUE
}

enum Type {
    RARE, ORDINARY
}