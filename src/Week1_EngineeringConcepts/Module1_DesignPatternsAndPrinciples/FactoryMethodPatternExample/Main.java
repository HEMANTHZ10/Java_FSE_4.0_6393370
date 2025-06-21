package Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample;
import Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory.*;
import Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.*;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
