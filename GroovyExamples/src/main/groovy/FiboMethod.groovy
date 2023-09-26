import groovy.transform.Memoized

@Memoized
def fib(n) {
    if (n <= 1) return n
    fib(n - 1) + fib(n - 2)
}

assert fib(10) == 55
assert fib(50L) == 12586269025L
assert fib(100G) == 354224848179261915075G
