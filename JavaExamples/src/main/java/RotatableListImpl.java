import java.util.ArrayList;
import java.util.List;

public class RotatableListImpl extends ArrayList<String>
        implements RotatableList<String> {
    public RotatableListImpl() {
        super(List.of("p", "i", "n", "s"));
    }
}
