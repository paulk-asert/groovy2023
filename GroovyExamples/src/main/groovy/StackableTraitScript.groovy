interface Handler {
    String handle(String message)
}

trait UpperHandler implements Handler {
    String handle(String message) { super.handle(message.toUpperCase()) }
}

trait ReverseHandler implements Handler {
    String handle(String message) { super.handle(message.reverse()) }
}

trait StarHandler implements Handler {
    String handle(String message) { message.replaceAll('O', '⭐') }
}

class MyHandler implements StarHandler, ReverseHandler, UpperHandler {}

assert new MyHandler().handle('yvoorG') == 'GR⭐⭐VY'
