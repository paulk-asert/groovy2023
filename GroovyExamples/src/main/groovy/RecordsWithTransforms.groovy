import groovy.contracts.Requires
import groovy.transform.Memoized
import groovy.transform.Sortable
import groovy.transform.builder.Builder

record Point(int x, int y, String color) {
    @Memoized
    String description() {
        "${color.toUpperCase()} point at ($x,$y)"
    }
}

var pinkPointAtOrigin = new Point(x:0, y:0, color:'Pink')
assert pinkPointAtOrigin.description() == 'PINK point at (0,0)'

@Requires({ color && !color.blank })
record Point2(int x, int y, String color) { }

@Sortable
record Point3(int x, int y, String color) { }

var points = [
        new Point3(0, 100, 'red'),
        new Point3(10, 10, 'blue'),
        new Point3(100, 0, 'green'),
]

println points.toSorted(Point.comparatorByX())
println points.toSorted(Point.comparatorByY())
println points.toSorted(Point.comparatorByColor())

record Developer(Integer id, String first, String last, String email, List<String> skills) {
    @Builder
    Developer(Integer id, String full, String email, List<String> skills) {
        this(id, full.split(' ')[0], full.split(' ')[1], email, skills)
    }
}

//move right by 2.m at 5.cm/s
