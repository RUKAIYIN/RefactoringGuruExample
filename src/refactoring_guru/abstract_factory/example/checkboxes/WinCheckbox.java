package refactoring_guru.abstract_factory.example.checkboxes;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("This is a WinCheckbox!!");
    }
}
