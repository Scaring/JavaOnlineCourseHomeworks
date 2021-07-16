public class Palindrom {
    public static void main(String[] args) {
        int pal = 101101;
        System.out.println(isPalindrome(pal));

    }

    public static boolean isPalindrome(int x) {
        boolean result = true;
        
        Integer j = (Integer) x;
        String[] s = j.toString().split("");
        int stringLength = s.length;

        for (int i = 0; i < stringLength / 2; i++) {

            int digitFromStart = Integer.parseInt(s[i]);
            int digitFromEnd = Integer.parseInt(s[stringLength - (1 + i)]);

            if (digitFromStart != digitFromEnd) {
                result = false;
                break;
            }

        }

        return result;
    }
}
