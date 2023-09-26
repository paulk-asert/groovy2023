import java.math.BigInteger;

public class FactMethod {
    static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE))
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        System.out.println(factorial(BigInteger.valueOf(5L))); // 120
        System.out.println(factorial(BigInteger.valueOf(12000L))); // StackOverflowError
    }
}
