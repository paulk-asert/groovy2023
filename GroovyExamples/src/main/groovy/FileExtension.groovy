class FileExtension {
    static int getWordCount(File self) {
        self.text.split(/\w+/).size()
    }
}
