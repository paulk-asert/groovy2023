trait Starable {
    String starify() {
        this.replaceAll('o', '⭐')
    }
}

def groovy = 'Groovy' as Starable
assert groovy.starify() == 'Gr⭐⭐vy'
