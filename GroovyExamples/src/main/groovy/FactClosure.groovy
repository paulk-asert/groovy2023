def factorial
factorial = {
    it <= 1 ? 1G : it * factorial(it - 1)
}

println factorial(5) // 120
println factorial(8000) // StackOverFlow
