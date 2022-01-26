package refactoring_guru.abstract_factory.example.buttons;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("This a WinButton!");
    }
}
