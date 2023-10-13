
public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.err.println("Error: "+e.getMessage());
            if (x < 0) {
                return Double.NEGATIVE_INFINITY;
            } else {
                return Double.POSITIVE_INFINITY;
            }

        }

    }
}
