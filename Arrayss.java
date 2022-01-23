package ComproTest;

import java.util.Arrays;

public class Arrayss {

    public static int[] fill(int[]arr, int k, int n){
        //2 4 5 6 7 8 9 n = 10 k = 3
        //2 4 5 2 4 5 2 4 5 2
        if (k <= 0 || n <= 0)
            return null;
        int[]   arr2 = new int[n];
        int i = 0;
        while (i < n){
            for (int j = 0; j < k; j++){
                arr2[i] = arr[j];
                i++;
                if (i == n)
                    break;
            }
        }
        return arr2;
    }

    public static int isSuper(int[] a){
        //1 2 4 8 16 38
        int sum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (sum >= a[i])
                return 0;
            sum += a[i];
        }
        return 1;
    }

    public static int isHollow(int[] a){
        //    2 1 45 0 0 0 0 0 56 78 76
        if (a[0] == 0)
            return 0;
        int i = 0;
        while (i < a.length && a[i] != 0)
            i++;
        int count1 = i;
        while (i < a.length && a[i] == 0)
            i++;
        int countZeros = i - count1;
        while (i < a.length && a[i] != 0)
            i++;
        int count3 = i - countZeros - count1;
        if (countZeros >= 3 && count1 == count3)
            return 1;
        return 0;
    }

    public static void main(String[] args){
        int[]   arr1 = {1, 2, 3, 4, -33,4, -5, -12, 1, 1, 1, 1, 2, 2};
        int[]   arr2 = {1, 2, 3, 0, 0, -33, -5, -12};
        int[]   arr3 = {1, 2, 6, 13};

        int[] arr = fill(arr1, 3, 10);
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
        System.out.println(isSuper(arr3));
        System.out.println(isHollow(arr2));
        int[]   arr11 = {-33, -5, -12, 3, 5};
        int[]   arr22 = {1, 2, 3, 0, 0, 0, 4, -33, -5};
        int[]   arr33 = {1, 2, 5, 13};
        arr = fill(arr11, 3, 10);
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
        System.out.println(isSuper(arr33));
        System.out.println(isHollow(arr22));
    }
}
