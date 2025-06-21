package Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory;

import Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument();
}
