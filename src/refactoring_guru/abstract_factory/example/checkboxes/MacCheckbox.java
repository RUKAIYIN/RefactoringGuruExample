package refactoring_guru.abstract_factory.example.checkboxes;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("This is a MacCheckbox!!");
    }
}
