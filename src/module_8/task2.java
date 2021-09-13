package module_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class task2 {

    static Consumer<double[]> cons = x -> {
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 2) {
                x[i] *= 0.8;
            } else {
                x[i] *= 0.9;
            }
        }
    };

    public static double[] getChanged(double[] initialArray, Consumer<double[]> cons) {
        double[] resultArray = new double[initialArray.length];

        for (int i = 0; i < initialArray.length; i++) {
            resultArray[i] = initialArray[i];
        }

        cons.accept(resultArray);

        return resultArray;
    }

    public static void main(String[] args) {
        double[] result = task2.getChanged(new double[] { 1, 2, 3, -1, -5, 0 }, task2.cons);
        for (double d : result) {
            System.out.println(d);
        }
    }
}
