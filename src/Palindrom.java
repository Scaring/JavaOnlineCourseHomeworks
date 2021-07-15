public class Palindrom {
    public static void main(String[] args) {
        int pal = 1001;
        System.out.println(isPalindrome(pal));

    }

    public static boolean isPalindrome(int x) {
        boolean result = true;

        Integer j = x;
        String[] s = j.toString().split("");
        int stringLength = s.length;

        for (int i = 0; i < stringLength; i++) {
            if (i >= (stringLength - (i + 1)))
                break;

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
