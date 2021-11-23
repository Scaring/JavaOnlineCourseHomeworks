package DesignPatterns.Singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String fileLog = "This is log string: \n\n";

    public static ProgramLogger getProgramLogger(){
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }

        return programLogger;
    }

    private ProgramLogger(){}

    public void addLogInfo(String logInfo){
        fileLog += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(fileLog);
    }
}
