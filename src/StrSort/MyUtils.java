package StrSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Create the strSort() method of the MyUtils class to sort a list of stirngs
// first by length and alphabetically within the same length. 
// The original list must be unchanged. 
// For example, for a given list [zz, abc, aa, aaa] you should get [aa, zz, aaa, abc].
// [z, aaaa, aaa, cc, ]
// [z, aaa, aaa, cc, z]

public class MyUtils {
    public static void main(String[] args) {
        String[] s1 = { "z", "aaa", "aaa", "cc", "z" };
        List<String> LsStr = Arrays.asList(s1);
        MyUtils my = new MyUtils();

        List<String> tl = my.strSort(LsStr);
        String[] targetArray = tl.toArray(new String[0]);

        System.out.println(Arrays.toString(targetArray));
    }

    public List<String> strSort(List<String> originList) {
        List<String> cloned = new ArrayList<String>(originList);

        Collections.sort(cloned, new Comparator<String>() {
            public int compare(String a, String b) {

                if (a.length() == 0 && b.length() == 0)
                    return 0;

                if (a.length() == 0)
                    return -1;
                    
                if (b.length() == 0)
                    return 1;

                int lengthCompare = a.length() - b.length();
                int firstCharCompare = a.charAt(0) - b.charAt(0);

                if (lengthCompare == 0) {

                    if (firstCharCompare == 0 && a.length() > 1 && b.length() > 1)
                        return a.charAt(1) - b.charAt(1);

                    return firstCharCompare;
                }

                return lengthCompare;
            }
        });

        return cloned;
    }
}
