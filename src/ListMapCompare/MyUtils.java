package ListMapCompare;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

// Create a listMapCompare() method of the MyUtils class to compare the contents of a list of strings and the values of a map. 
// For example, for a given list [aa, bb, aa, cc] and map {1=cc, 2=bb, 3=cc, 4=aa, 5=cc} you should get true.
// {"aa", "bb", "aa", "cc"}

public class MyUtils {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<String>();
        ls.add("aa");
        ls.add("bb");
        ls.add("dd");
        ls.add("cc");
        ls.add("bb");

        Map<String, String> mp = new HashMap<String, String>();
        mp.put("1", "aa");
        mp.put("2", "bb");
        mp.put("3", "aa");
        mp.put("4", "dd");
        mp.put("5", "aa");
        mp.put("6", "dd");

        MyUtils my = new MyUtils();
        System.out.println(my.listMapCompare(ls, mp));
    }

    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (list.contains(entry.getValue()) == false)
                return false;
        }

        for (String item : list) {
            if (map.values().contains(item) == false)
                return false;
        }

        return true;
    }

}