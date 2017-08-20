package Tutorial.Builder;


public class Light {
    public static void main(String[] args) {
        StateFactory stateFactory = stateOffOnBySpecialty("On");
        State state = stateFactory.steteOffOn();

        state.state();
    }

    private static StateFactory stateOffOnBySpecialty(String java) {
        return null;
    }
}