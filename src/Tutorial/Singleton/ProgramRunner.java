package Tutorial.Singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLoger().addLogInfo("first ");
        ProgramLogger.getProgramLoger().addLogInfo("second ");
        ProgramLogger.getProgramLoger().addLogInfo("Third ");

        ProgramLogger.getProgramLoger().showLogFile();
    }
}
