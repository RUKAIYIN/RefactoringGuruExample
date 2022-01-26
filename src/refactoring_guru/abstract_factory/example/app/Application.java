package refactoring_guru.abstract_factory.example.app;

import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;

/**
 * Step 5 Create factory initialization code somewhere in the app.
 *  It should instantiate one of the concrete factory classes, depending on the application configuration
 *  or the current environment.
 *  Pass this factory object to all classes that construct products.
 */
public class Application {
    private GUIFactory myGUIFactory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory passedGUIFactory) {
        this.myGUIFactory = passedGUIFactory;
        this.createUI();
    }

    private void createUI() {
        this.button = myGUIFactory.createButton();
        this.checkbox = myGUIFactory.createCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
