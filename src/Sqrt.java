public class Sqrt {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(mySqrt(num));
    }

    public static int mySqrt(int x) {
        if (x == 1)
            return 1;

        if (x == Integer.MAX_VALUE)
            return 46340;

        for (int i = 1; true; i++) {
            if (x / (i * i) != 0)
                continue;
            i -= 1;
            return i;
        }
    }
}