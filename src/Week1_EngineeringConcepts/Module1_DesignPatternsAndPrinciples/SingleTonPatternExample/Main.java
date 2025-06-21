package Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.SingleTonPatternExample;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Message from first logger!");

        Logger logger2 = Logger.getInstance();
        logger2.log("Message from second logger!");

        if(logger1==logger2){
            System.out.println("Both logger instances are same, Singleton Pattern is working");
        }else{
            System.out.println("Logger instances are different, Single Pattern is failed");
        }

    }
}
