package Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory;

import Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.Document;
import Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.PDFDocument;

public class PDFDocumentFactory extends DocumentFactory{
    public Document createDocument() {
        return new PDFDocument();
    }
}
