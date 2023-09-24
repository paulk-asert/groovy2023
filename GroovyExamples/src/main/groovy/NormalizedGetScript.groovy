import static groovy.test.GroovyAssert.shouldFail

def nums = [1, 2, 3]
assert nums[-1] == 3
assert nums.getAt(-1) == 3
shouldFail(IndexOutOfBoundsException) {
    nums.get(-1)
}

trait NormalizedGet<E> implements List<E> {
    E get(int index) {
        if (index < 0) index += size()
        super.get(index)
    }
}

class MyList extends ArrayList implements NormalizedGet {}

nums = [1, 2, 3] as MyList
assert nums.get(-1) == 3
