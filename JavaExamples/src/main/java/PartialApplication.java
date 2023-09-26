import java.util.function.BiFunction;
import java.util.function.Function;

public class PartialApplication {
    static BiFunction<Integer, Integer, Integer> add = Integer::sum;

    static <T, U, V> Function<U, V> partial(BiFunction<T, U, V> f, T x) {
        return (y) -> f.apply(x, y);
    }
    public static void main(String[] args) {
        Function<Integer, Integer> add2 = partial(add, 2);
        System.out.println(add.apply(10, 1));  // 11
        System.out.println(add2.apply(10));    // 12
    }
}
