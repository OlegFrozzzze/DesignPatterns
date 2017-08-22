package Tutorial.Builder;

public class Light {
    public static void main(String[] args) {
        StateFactory stateFactory = stateOffOnBySpecialty("On");
        State state = stateFactory.steteOffOn();

        state.state();
    }

    static StateFactory stateOffOnBySpecialty(String Status) {
        if (Status.equalsIgnoreCase("On"))
            return new OnFactory();
        else if (Status.equalsIgnoreCase("Off")) {
            return new OffFactory();
        } else {
            throw new RuntimeException(Status + "is unknown specialty");
        }
    }
}