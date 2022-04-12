package lab4;
import static java.lang.System.*;

public class Lab4 {
     static final int Min = 3;
     static final int Max = 7;

    public static void main(String[] args) {
         out.println("Min = " + Min + " Max = " + Max);
         out.println("Sum = " + sum_for(Min,Max));
         out.println("Product = " + product_for(Min,Max));
    }

    static int sum_for(int min, int max) {
        int sum = 0;
        for (int num = min; num <= max; num++) {
            sum += num;
        }
        return sum;
    }

    static int product_for(int min, int max) {
        int prod = 1;
        for (int num = min; num <= max; num++) {
            prod *= num;
        }
        return prod;
    }
}