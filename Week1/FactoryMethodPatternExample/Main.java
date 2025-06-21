public class Main {
    public static void main(String[] args) {
        DocumentCreation wordFactory = new WordFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentCreation pdfFactory = new PdfFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        DocumentCreation excelFactory = new ExcelCreation();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
