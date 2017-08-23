package Tutorial.Bridge;

public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stoke Exchange developments in progress");
        developer.writeCode();
    }
}
