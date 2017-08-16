package Tutorial.AbstractFactory.Website;

import Tutorial.AbstractFactory.Developer;
import Tutorial.AbstractFactory.ProjectManager;
import Tutorial.AbstractFactory.ProjectTeamFactory;
import Tutorial.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
