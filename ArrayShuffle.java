package patttern;

import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] ans = shuffle(arr);
        for(int e : ans)
            System.out.print(e + " ");

    }

     public static  int[] shuffle( int[] arr){
        Random r = new Random();
         for (int i = 0; i < arr.length-1; i++) {
             int j = r.nextInt(i+1);
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }

        return  arr;
     }
}
