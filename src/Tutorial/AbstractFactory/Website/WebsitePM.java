package Tutorial.AbstractFactory.Website;

import Tutorial.AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("website PM maneges");
    }
}
