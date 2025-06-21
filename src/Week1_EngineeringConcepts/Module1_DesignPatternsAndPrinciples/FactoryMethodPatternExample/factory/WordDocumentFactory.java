package Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory;

import Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.Document;
import Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.WordDocument;

public class WordDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}
