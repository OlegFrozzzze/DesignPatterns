package Tutorial.AbstractFactory.Website;

import Tutorial.AbstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Test website");
    }
}
