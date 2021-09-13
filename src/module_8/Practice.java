package module_8;

import java.util.function.Predicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.Function;
import java.util.function.Consumer;

interface Operatiable {
    int calc(int x, int y);
}

public class Practice {
    public static void main(String[] args) {
        // Operatiable
        Operatiable add = (x, y) -> x + y;
        Operatiable mult = (x, y) -> x * y;
        Operatiable sub = (x, y) -> x - y;

        System.out.println(add.calc(10, 11));
        System.out.println(mult.calc(2, 22));
        System.out.println(sub.calc(15, 7));

        // Predicate
        Predicate<Byte> isPositive = x -> x > 0;

        System.out.println(isPositive.test((byte) 1));

        //BinaryOperator
        BinaryOperator<Integer> binaryMult = (x, y) -> x * y;

        System.out.println(binaryMult.apply(5, 6));

        //UnaryOperator
        UnaryOperator<Integer> sqr = x -> x*x;

        System.out.println(sqr.apply(5));

        //Function
        Function<Integer, String> convert = x -> x + " and some text!";

        System.out.println(convert.apply(125));

        //Consumer
        Consumer<Integer> cons = x -> System.out.println(x + " in consuner log");

        cons.accept(188);
        System.out.println(isPositive.getClass());

    }
}
