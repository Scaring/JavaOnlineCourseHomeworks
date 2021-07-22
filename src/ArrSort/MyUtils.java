package ArrSort;

import java.util.Arrays;
import java.util.Comparator;

public class MyUtils {

    public int[][] arrSort(int[][] arr) {

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a.length == 0 && b.length == 0)
                    return 0;

                if (a.length == 0)
                    return 1;

                if (b.length == 0)
                    return -1;

                if (b[0] - a[0] == 0 && a.length > 1 && b.length > 1)
                    return a[1] - b[1];

                if (b[0] - a[0] == 0 && a.length > 1 )
                    return 1;

                if (b[0] - a[0] == 0 && b.length > 1)
                    return -1;

                return b[0] - a[0];
            }
        });
        return arr;
    }

    public static void main(String[] args) {
        int[][] a1 = {  { 1 }, { 1, 2 }, { 1, 2, 3 }, { 3, 1, 2 } };

        MyUtils my = new MyUtils();

        System.out.println(Arrays.deepToString(my.arrSort(a1)));

    }
}

//Comparator - compares x & y 
// if x > y return 1 () --- x replaces left
// if x < y return -1 --- y replaces left 
// if x equals y return 0 --- x & y don`t change place

//ArrSortTest.checkOneColumn()
//input:    {{ 1, 2, 3 }, { 1 }, { 1, 2 }, { 3, 1, 2 }}
//expected: {{ 3, 1, 2 }, { 1 }, { 1, 2, 3 }, { 1, 2 }}