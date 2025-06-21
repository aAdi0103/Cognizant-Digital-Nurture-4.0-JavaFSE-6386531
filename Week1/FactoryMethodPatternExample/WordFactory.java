public class WordFactory extends DocumentCreation {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
