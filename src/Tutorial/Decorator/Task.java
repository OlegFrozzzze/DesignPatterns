package Tutorial.Decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();

        System.out.println(developer.makeJob());
    }
}
