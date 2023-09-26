var add = Integer::sum

assert add(10, 1) == 11

var add2 = add.curry(2)

assert add2(10) == 12
