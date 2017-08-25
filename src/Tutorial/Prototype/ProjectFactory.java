package Tutorial.Prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    Project coloneProject(){
        return (Project) project.copy();
    }
}
