package Tutorial.Builder;

public class OnFactory implements StateFactory{
    @Override
    public State steteOffOn() {
        return new On();
    }
}
