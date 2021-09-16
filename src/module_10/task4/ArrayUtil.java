package module_10.task4;

class ArrayUtil {
    public static double averageValue(Array<? extends Number> arr) {
        double result = 0;
        
        for(int i = 0; i < arr.length(); i++){
            result += arr.get(i).doubleValue();
        }
        
        return result/arr.length();
    }
}