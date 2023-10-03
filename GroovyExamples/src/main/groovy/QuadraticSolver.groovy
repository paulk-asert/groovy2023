import groovy.transform.OperatorRename
import org.apache.commons.math3.complex.Complex

record Quadratic(double a, double b = 0, double c = 0) {
    @Newify(Complex)
    List<Complex> solve() {
        var discriminant = Complex(b * b - 4 * a * c)
        findRoots(Complex(-b), discriminant, Complex(2 * a))
    }

    @OperatorRename(div = 'divide', plus = 'add', minus = 'subtract')
    static List<Complex> findRoots(Complex negB, Complex discriminant, Complex twoA) {
        var sqrtDiscriminant = discriminant.sqrt()
        var root1 = (negB + sqrtDiscriminant) / twoA
        var root2 = (negB - sqrtDiscriminant) / twoA
        [root1, root2]
    }
}

assert [
        new Quadratic(2.0, -4.0, 2.0),
        new Quadratic(2.0, -4.0),
        new Quadratic(1.0),
        new Quadratic(a:2.0, b:-5.0, c:-3.0)
]*.solve()*.toSet()*.toString() == [
        '[(1.0, 0.0)]',
        '[(2.0, 0.0), (0.0, 0.0)]',
        '[(0.0, 0.0)]',
        '[(3.0, 0.0), (-0.5, 0.0)]'
]

