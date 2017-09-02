package Tutorial.Facade;

public class BugTracker {
    private boolean activeSprint;
    public boolean isActiveSprint(){
        return activeSprint;
    }
    public void startSprint(){
        System.out.println("Sprint is active");
        activeSprint = true;
    }
}
