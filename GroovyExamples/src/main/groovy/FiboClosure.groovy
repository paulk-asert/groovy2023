
var fib
fib = { n -> n <= 1 ? n : fib(n - 1) + fib(n - 2) }.memoize()

var start = System.currentTimeMillis()
assert fib(10) == 55
assert fib(50L) == 12586269025L
assert fib(100G) == 354224848179261915075G
println "Completed in ${System.currentTimeMillis() - start} ms" // 117
