package lab7;

import java.util.Arrays;
import java.util.Random;

public class Lab7 {
    static final int COLS = 6;
    static final int ROWS = 2;

    static final int RAND_LIMIT = 1000;

    static void fillArrayRandomNumbers(int[] arr,int limit) {
        Random rd = new Random();
        Arrays.setAll(arr, i -> rd.nextInt() % limit);
    }

    static int sumOfArrayInts(int[] arr){
        int sum = 0;
        for (int num:arr){
            sum +=num;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[ROWS][COLS];
         Arrays.stream(matrix).forEach(arr->fillArrayRandomNumbers(arr,RAND_LIMIT));

         System.out.println("Sums of matrix rows");
         Arrays.stream(matrix).forEach(arr->System.out.println(sumOfArrayInts(arr)));
    }
}
