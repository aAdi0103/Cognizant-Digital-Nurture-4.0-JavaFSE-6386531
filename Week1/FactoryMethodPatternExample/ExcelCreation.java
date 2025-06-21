public class ExcelCreation extends DocumentCreation {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
