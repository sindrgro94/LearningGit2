package Sindre;

/**
 * Created by sgrostad on 21/06/2017.
 */
public class Calculator {
    public static int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
    public static int evaluateWithInt(int x, int y){
        return x+y;
    }
}
