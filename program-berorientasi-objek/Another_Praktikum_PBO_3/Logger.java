package Another_Praktikum_PBO_3;

public class Logger{
    public int debugLevel;

    public Logger(){
        debugLevel = 10;
    }

    public void debug(String logLine){
        System.out.println("Debug: "+logLine);
    }

    public void info(String logLine){
        System.out.println("info: "+logLine);
    }
}