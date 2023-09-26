def factorial
factorial = { n, acc = 1G ->
    n <= 1 ? acc : factorial.trampoline(n - 1, n * acc)
}.trampoline()

println factorial(5)
println factorial(8000)
println factorial(100_000)
