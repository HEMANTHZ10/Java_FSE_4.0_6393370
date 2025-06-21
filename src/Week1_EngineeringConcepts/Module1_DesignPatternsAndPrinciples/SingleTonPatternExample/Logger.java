package Week1_EngineeringConcepts.Module1_DesignPatternsAndPrinciples.SingleTonPatternExample;

public class Logger {
    private static Logger instance;
    private Logger(){}
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String msg){
        System.out.println("[LOGGER MSG] : "+msg);
    }
}
