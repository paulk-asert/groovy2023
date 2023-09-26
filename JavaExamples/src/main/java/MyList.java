import java.util.ArrayList;
import java.util.Arrays;

public class MyList extends ArrayList<String> {
    public MyList(String... arr) {
        super(Arrays.asList(arr));
    }

    @Override
    public String get(int index) {
        return super.get(NormalizeUtil.normalize(this, index));
    }

    public static void main(String[] args) {
        System.out.println(new MyList("ant", "bee").get(-1)); // bee
    }
}
