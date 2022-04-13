package lab6;

import java.util.Arrays;

import static java.lang.System.out;

public class Lab6 {
    static  int[] numbers = {0,1,2,3,4,5,6,7};
    static final  int MULTIPLIER = 2;

    public static void main(String[] args) {
        out.println(Arrays.toString(multiplyArrayValues(numbers, MULTIPLIER)));
        out.println(Arrays.toString(numbers));
    }

    static int [] multiplyArrayValues(int [] array,int multiplier){
        int [] arr = array.clone(); // otherwise, array will be mutated
        for (int i =0; i < arr.length; i++) {
            arr[i] *= multiplier;
        }
        return  arr;
    }

}
