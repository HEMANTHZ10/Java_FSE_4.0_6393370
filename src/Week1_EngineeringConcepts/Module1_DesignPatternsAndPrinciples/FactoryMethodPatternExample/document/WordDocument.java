package Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document;

public class WordDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Word Document !");
    }
}
