package refactoring_guru.abstract_factory.example.buttons;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("This is a MacButton!");
    }
}
