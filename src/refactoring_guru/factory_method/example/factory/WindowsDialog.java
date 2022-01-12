package refactoring_guru.factory_method.example.factory;

import refactoring_guru.factory_method.example.buttons.Button;
import refactoring_guru.factory_method.example.buttons.WindowsButton;

/**
 * Step 4
 *  Create a set of creator subclasses for each type of product listed in the factory method.
 *  Override the factory method in the subclasses and extract the appropriate bits of
 *  construction code from the base method.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
