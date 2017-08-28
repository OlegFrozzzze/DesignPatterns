package Tutorial.Composite;

public class Project {
    Team team = new Team();

    Developer firstJavaDEveloper = new JavaDeveloper();
    Developer secondJavaDeveloper = new JavaDeveloper();
    Developer cppDeveloper = new CppDeveloper();

    team.addDeveloper(firstJavaDEveloper);
    team.addDeveloper(secondJavaDeveloper);
    team.addDeveloper(cppDeveloper);

    team.createProject();
}
