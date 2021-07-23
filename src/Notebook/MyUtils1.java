package Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Create a createNotebook() method of the MyUtils class to create a new map with name as key 
// and phone list as value.  The method receives a map  with phone as key and name as value.
// For example, for a given map {0967654321=Petro, 0677654321=Petro, 0501234567=Ivan, 
// 0970011223=Stepan, 0631234567=Ivan} you should get {Ivan=[0501234567, 0631234567], 
// Petro=[0967654321, 0677654321], Stepan=[0970011223]}.

public class MyUtils1 {
    public static void main(String[] args) {

        Map<String, String> test = new HashMap<String, String>();
        test.put("0631234567", null);
        // Map.of("0967654321", "Petro", "0677654321", "Petro", "0501234567", "Ivan",
        // "0970011223", "Stepan", "0631234567", null);

        System.out.println(test.toString());

        MyUtils1 my = new MyUtils1();

        try {
            System.out.println(my.createNotebook(test));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Map<String, List<String>> createNotebook(Map<String, String> phones) {

        Map<String, List<String>> names = new HashMap<String, List<String>>();

        for (Map.Entry<String, String> phonebook : phones.entrySet()) {
            names.put(phonebook.getValue(), new ArrayList<String>());
        }

        for (Map.Entry<String, List<String>> namebook : names.entrySet()) {

            for (Map.Entry<String, String> phonebook : phones.entrySet()) {
                if (namebook.getKey() == null) {
                    names.get(null).add(phonebook.getKey());
                } else if (namebook.getKey().equals(phonebook.getValue())) {
                    names.get(namebook.getKey()).add(phonebook.getKey());
                }
            }
        }

        return names;
    }

}
// System.out.println(item.getValue());
// System.out.println(item.getKey());