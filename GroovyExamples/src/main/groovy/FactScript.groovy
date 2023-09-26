import groovy.transform.CompileStatic
import groovy.transform.TailRecursive

@CompileStatic
Number fact(Number n) {
    n <= 1 ? 1G : n * fact(n - 1)
}

println fact(5)
println fact(8000)

@TailRecursive
def factorial(n, acc = 1) {
    n <= 1 ? acc : factorial(n - 1, n * acc)
}

println factorial(100000G)
