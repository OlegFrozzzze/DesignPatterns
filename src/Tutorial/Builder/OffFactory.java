package Tutorial.Builder;

public class OffFactory implements StateFactory{
    @Override
    public State steteOffOn() {
        return new Off();
    }
}
