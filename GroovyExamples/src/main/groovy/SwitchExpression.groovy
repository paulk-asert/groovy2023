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

class CustomIsCase {
    boolean isCase(subject) { subject > 20 }
}

assert switch(10) {
    case 0                  -> false
    case 1, 2               -> false
    case 0..9               -> false
    case '11'               -> false
    case [9, 11, 13]        -> false
    case Float              -> false
    case { it % 3 == 0 }    -> false
    case new CustomIsCase() -> false
    case ~/\d\d/            -> true
    default                 -> false
}
