public class DivideTwoIntegers {
    public static void main(String[] args) {
        int a = -100;
        int b = 10;
        System.out.println(divide(a, b));
    }

    public static int count(int a, int b) {
        int res = 0;
        while (a <= b) {
            a -= b;
            res++;
        }
        return res;
    }

    public static int divide(int dividend, int divisor) {
        int result = 0;
        boolean isSameSign = true;

        /* ************************SPECIAL CASES*********************** */
        if (divisor == 0)
            throw new Error("Divisor must be not 0!");

        if (divisor == 1)
            return dividend;

        if (divisor == dividend)
            return 1;

        // dividend is 0 or divisor is min possible value!
        if (dividend == 0 || divisor == Integer.MIN_VALUE)
            return 0;

        // devision owerflow case! (dividend == Integer.MIN_VALUE && divisor == 1 )
        if ((dividend + 1) / divisor == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        /* ************************COMMON CASES************************ */
        if (dividend > 0 && divisor > 0) { // both are positive
            dividend *= (-1);
            divisor *= (-1);
        }

        if (dividend > 0 && divisor < 0) { // divisor is negative
            dividend *= (-1);
            isSameSign = false;
        }

        if (dividend < 0 && divisor > 0) { // dividend is negative
            divisor *= (-1);
            isSameSign = false;
        }

        result = count(dividend, divisor);

        return isSameSign ? result : result * (-1);
    }
}

// we use negative numbers becouse of specific of MAX and MIN possible values
// Integer.MAX_VALUE == 2147483647 we can switch it to negative >>> -2147483647
// but we can not do the same with Integer.MIN_VALUE == -2147483648 because it will be +2147483648 > Integer.MAX_VALUE
// and it will be equal to 0