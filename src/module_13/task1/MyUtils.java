package module_13.task1;

import java.util.Map;
import java.util.ArrayList;
import java.util.stream.Stream;

public class MyUtils {
    public Stream<String> nameList(Map<String, Stream<String>> map) {
        if(map == null) throw new NullPointerException();

        //map.forEach((key, val) -> val.forEach(System.out::println));

        ArrayList<String> resList = new ArrayList<>();

        map.forEach((key, val) -> {
            if(val != null) val.forEach(s-> {
                if(s != null){
                    String word = s.replace(" ", "").toLowerCase();
                    if(word != "") resList.add(word.substring(0, 1).toUpperCase() + word.substring(1));
                }
            });
        });

        // resList.stream()
        //                 .sorted()
        //                 .distinct()
        //                 .forEach(System.out::println);
        // System.out.println(resList == null);
        System.out.println(resList.toString());

        return resList.stream()
                .sorted()
                .distinct();
    }
}


//public class MyUtils {
//    public Stream<String> nameList(Map<String, Stream<String>> map) {
//        if(map == null) throw new NullPointerException();
//
//        return map.values()
//                .stream()
//                .flatMap(s -> s)
//                .filter(s -> s!=null && !s.isBlank())
//                .map(s -> {
//                    String word = s.replace(" ", "").toLowerCase();
//                    return word.substring(0, 1).toUpperCase() + word.substring(1);
//                })
//                .sorted()
//                .distinct();
//    }
//}