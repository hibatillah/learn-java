package Praktikum_PBO_3;

public class MainLogger {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.debug("Debug with level "+logger.debugLevel);

        logger.debugLevel = 20;
        logger.info("info with level "+logger.debugLevel);
    }
    
}
