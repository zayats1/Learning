package lab5;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab5 {

    static final double Min = 0.1;
    static final double Step = 0.01;
    static final double Max = 1.0;

    public static void main(String[] args) {
        var result = midOfNegatives(Min,Max);
  
        out.println("Middle number of all negative function values  is " + result);
    }

    static double midOfNegatives(double min, double max) {
        double sum_of_negatives = 0;
        double quantity_of_negatives = 0;

        for (double x = min; x <= max; x++) {
            double y = f(x);
            if (y < 0) {
                sum_of_negatives += y;
                ++quantity_of_negatives;
            }
        }
        return (quantity_of_negatives == 0) ? 0 : sum_of_negatives / quantity_of_negatives;
    }


    static double p(double x) {
        return pow(E, x * cos(PI / 4));
    }

    static double g(double x) {
        return cos(x * sin(PI / 4));
    }

    static double f(double x) {
        return p(x) * g(x);
    }
}
