import java.util.Collections;
import java.util.List;

public interface RotatableList<E> extends List<E> {
    default void rotate(int distance) {
        Collections.rotate(this, distance);
    }
}
