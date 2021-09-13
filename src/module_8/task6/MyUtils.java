package module_8.task6;

import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.List;

class MyUtils {
    public static int findMaxByCondition(List<Integer> numbers, Predicate<Integer> pr) {
        int result = 0;
        
        for(Integer num : numbers){
            if(pr.test(num) && num > result) result = num;
        }
        
        return result;
    }
}

class User {
    public final List<Integer> values = new ArrayList<Integer>();  

    int getFilterdValue(BiFunction<List<Integer>, Predicate<Integer>, Integer> bf, Predicate<Integer> pr ) {
        return  bf.apply(values, pr);  
    }
    
    int getMaxValueByCondition(Predicate<Integer> predicate) {
        return getFilterdValue(MyUtils::findMaxByCondition, predicate);       
    }
}