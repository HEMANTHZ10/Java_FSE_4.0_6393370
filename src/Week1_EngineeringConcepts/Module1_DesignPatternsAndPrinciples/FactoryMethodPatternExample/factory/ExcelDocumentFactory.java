package Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory;

import Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.Document;
import Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument() {
        return new ExcelDocument();
    }
}
