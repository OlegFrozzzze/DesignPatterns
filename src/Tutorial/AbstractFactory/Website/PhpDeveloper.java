package Tutorial.AbstractFactory.Website;

import Tutorial.AbstractFactory.Developer;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("write PHP code");
    }
}
