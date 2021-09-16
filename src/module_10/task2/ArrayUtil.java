package module_10.task2;

class ArrayUtil {
    public static <T> T setAndReturn(T[] arr, T val, int position ) {
        arr[position] = val;
        return arr[position];
    }
}