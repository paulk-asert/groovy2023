import java.util.ArrayList;
import java.util.Arrays;

public class MyList extends ArrayList<String> implements NormalizedGet {
    public MyList(String... arr) {
        super(Arrays.asList(arr));
    }

    @Override
    public String toString() {
        return upperToString(super.toString());
    }

    public static void main(String[] args) {
        System.out.println(new MyList("ant", "bee")); // [ANT, BEE]
    }
}
