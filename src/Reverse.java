public class Reverse {
    public static void main(String[] args) {
        int rev = 12233;
        // System.out.println((Integer.MAX_VALUE / 10) * 10 + 7);
        // System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(rev));
    }

    public static int reverse(int x) {
        int result = 0;
        
        while ( x != 0 ){
            int pop = x % 10;
            x /= 10;

            result = result * 10 + pop;
        }



        return result;
    }
}
