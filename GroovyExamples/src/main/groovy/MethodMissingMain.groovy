class Foo {
    def methodMissing(String name, args) {
        "You called $name(${args.join(', ')})"
    }
}

var foo = new Foo()
assert foo.unknown() == 'You called unknown()'
assert foo.divide(0) == 'You called divide(0)'
assert foo.add(1, 2) == 'You called add(1, 2)'
