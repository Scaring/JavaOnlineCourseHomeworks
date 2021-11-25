package DesignPatterns.Practice.Singletone;


class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logString = "This is log...\n";

    private ProgramLogger() {
    }

    public static ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogInfo(String info) {
        logString += info + "\n";
    }

    public void seeLog() {
        System.out.println(logString);
    }
}
