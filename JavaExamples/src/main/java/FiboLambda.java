import java.math.BigInteger;
import java.util.function.UnaryOperator;

public class FiboLambda {
    static UnaryOperator<Integer> fibI;
    static UnaryOperator<Long> fibL;
    static UnaryOperator<BigInteger> fibBI;
    public static void main(String[] args) {
        fibI = n -> n <= 1 ? n : fibI.apply(n - 1) + fibI.apply(n - 2);
        fibL = n -> n <= 1 ? n : fibL.apply(n - 1) + fibL.apply(n - 2);
        fibBI = n -> n.compareTo(BigInteger.ONE) <= 0
                ? n
                : fibBI.apply(n.subtract(BigInteger.ONE)).add(fibBI.apply(n.subtract(BigInteger.TWO)));

        var start = System.currentTimeMillis();
//        System.out.println(fibI.apply(10)); // 55
//        System.out.println(fibL.apply(50L)); // 12586269025
        System.out.println(fibBI.apply(BigInteger.valueOf(50))); // 354224848179261915075
        var mid = System.currentTimeMillis();
        System.out.println(mid - start);
        System.out.println(fibBI.apply(BigInteger.valueOf(51))); // 354224848179261915075
        var late = System.currentTimeMillis();
        System.out.println(late - mid);
        System.out.println(fibBI.apply(BigInteger.valueOf(52))); // 354224848179261915075
        var end = System.currentTimeMillis();
        System.out.println(end - late);
        var years = ((System.currentTimeMillis() - start) / 1000 / 60 / 60.0 / 24 / 365.5) * (Math.pow(2, 50));
        System.out.println("Completed in " + years + " years");
    }
}
