/*
String formatted = switch (o) {
    case Integer i when i > 10 -> String.format("a large Integer %d", i);
    case Integer i             -> String.format("a small Integer %d", i);
    case Long l                -> String.format("a Long %d", l);
    default                    -> o.toString();
};
/* */
var expected = [
        (20): 'a large Integer 20',
        (5): 'a small Integer 5',
        (5L): 'a Long 5',
        foo: 'foo'
]
expected.keySet().each { o ->
String formatted = switch (o) {
    case { o instanceof Integer && o > 10 } -> "a large Integer $o"
    case Integer                           -> "a small Integer $o"
    case Long                              -> "a Long $o"
    default                                -> o.toString()
}
    assert formatted == expected[o]
}
