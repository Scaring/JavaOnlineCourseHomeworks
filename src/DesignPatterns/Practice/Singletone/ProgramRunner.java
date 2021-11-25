package DesignPatterns.Practice.Singletone;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Hi");
        ProgramLogger.getProgramLogger().addLogInfo("there");
        ProgramLogger.getProgramLogger().addLogInfo("all");
        ProgramLogger.getProgramLogger().addLogInfo("people!");

        ProgramLogger.getProgramLogger().seeLog();
    }
}
