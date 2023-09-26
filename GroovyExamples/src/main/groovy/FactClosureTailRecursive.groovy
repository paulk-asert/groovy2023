def factorial
factorial = { n, acc = 1G ->
    n <= 1 ? acc : factorial(n - 1, n * acc)
}

println factorial(5)
