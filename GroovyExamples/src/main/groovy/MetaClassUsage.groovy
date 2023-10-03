File.metaClass.getWordCount = {
    delegate.text.split(/\w+/).size()
}

String.metaClass.getResource = {
    new File(getClass().classLoader.getResource(delegate).toURI())
}

assert 'magna_carta_latin.txt'.resource.wordCount == 3771
assert 'magna_carta_en.txt'.resource.wordCount == 4740
