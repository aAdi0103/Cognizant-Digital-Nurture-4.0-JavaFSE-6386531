public class PdfFactory extends DocumentCreation {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
