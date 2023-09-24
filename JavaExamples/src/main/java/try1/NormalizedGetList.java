package try1;

import java.util.List;
abstract class NormalizedGetList<E> implements List<E> {
    public E get(int index) {
        if (index < 0) index += size();
        return List.super.get(index);
    }
}
