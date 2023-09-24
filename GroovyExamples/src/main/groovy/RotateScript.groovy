trait RotatableList<E> implements List<E> {
    void rotate(int distance) {
        Collections.rotate(this, distance)
    }
}

class RotatableListImpl extends ArrayList<String>
        implements RotatableList<String> {
    RotatableListImpl() {
        super(['p', 'i', 'n', 's'])
    }
}

var myList = new RotatableListImpl()
myList.rotate(1)
assert myList == ['s', 'p', 'i', 'n']
