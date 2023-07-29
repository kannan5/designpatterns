package CreationalPatterns.Singleton.ExerciseSolution;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private String fileName;


    private static Map<String, Logger> loggerInstances = new HashMap<>();

    public static Logger GetInstance(String fileName){

        if (!loggerInstances.containsKey(fileName))
            loggerInstances.put(fileName, new Logger(fileName));
        return loggerInstances.get(fileName);
    }

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.println("Writing a message to the log. "+ fileName);
    }
}
