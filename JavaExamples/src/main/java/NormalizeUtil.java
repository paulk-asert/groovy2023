import java.util.List;
public abstract class NormalizeUtil {
    static int normalize(List<?> list, int index) {
        if (index < 0) index += list.size();
        return index;
    }
}
