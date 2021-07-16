public class DivisionWithoutDivision {
    public static void main(String[] args) {
        int a = 1038925803;
        int b = 0;
        System.out.println(divide(a, b));
    }

    public static int divide(int dividend, int divisor) {
        int result = 0;

        /* ************************SPECIAL CASES************************ */
        if (divisor == 0) {
            String message = "Divisor must be not 0!";
            throw new Error(message);
        }

        if (divisor == 1)
            return dividend;

        if (divisor == dividend)
            return 1;

        // dividend is 0 or divisor is min possible value!
        if (dividend == 0 || divisor == Integer.MIN_VALUE)
            return 0;

        // devision owerflow case!
        if ((dividend + 1) / divisor == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        /* ************************COMMON CASES************************ */
        if (dividend > 0 && divisor > 0) { // both are positive
            while (dividend >= divisor) {
                dividend -= divisor;
                result++;
            }
        } else if (dividend < 0 && divisor < 0) { // both are negative
            while (dividend <= divisor) {
                dividend -= divisor;
                result++;
            }
        } else if (dividend > 0 && divisor < 0) {
            divisor *= (-1);

            while (dividend >= divisor) {
                dividend -= divisor;
                result++;
            }
            result *= (-1);

        } else if (dividend < 0 && divisor > 0) {
            divisor *= (-1);

            while (dividend <= divisor) {
                dividend -= divisor;
                result++;
            }
            result *= (-1);

        }

        return result;
    }
}
