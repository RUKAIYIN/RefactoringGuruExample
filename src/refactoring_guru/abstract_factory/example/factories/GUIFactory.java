package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;

/**
 * Step 3 Declare the abstract factory interface with a set of creation methods for all abstract products.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
