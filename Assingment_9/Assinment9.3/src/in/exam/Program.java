
package in.exam;
import java.util.*;
public class Program {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException occurred: " + ex.getMessage());
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException occurred: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception occurred: " + ex.getMessage());
        }
    }

    private static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
