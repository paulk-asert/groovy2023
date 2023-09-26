import java.math.BigInteger;
import java.util.function.UnaryOperator;

public class FactLambda {
    static UnaryOperator<BigInteger> factorial;
    public static void main(String[] args) {
        factorial = n -> n.equals(BigInteger.ZERO)
                ? BigInteger.ONE
                : n.multiply(factorial.apply(n.subtract(BigInteger.ONE)));
        System.out.println(factorial.apply(BigInteger.valueOf(5))); // 120
        System.out.println(factorial.apply(BigInteger.valueOf(8000))); // StackOverflowError
    }
}
