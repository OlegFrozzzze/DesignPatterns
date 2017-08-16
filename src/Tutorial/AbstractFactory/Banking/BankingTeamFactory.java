package Tutorial.AbstractFactory.Banking;

import Tutorial.AbstractFactory.Developer;
import Tutorial.AbstractFactory.ProjectManager;
import Tutorial.AbstractFactory.ProjectTeamFactory;
import Tutorial.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
