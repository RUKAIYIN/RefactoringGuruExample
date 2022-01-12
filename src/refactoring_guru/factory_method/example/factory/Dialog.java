package refactoring_guru.factory_method.example.factory;

import refactoring_guru.factory_method.example.buttons.Button;

/**
 * Step 2
 *  Add an empty factory method inside the creator class.
 *  The return type of the method should match the common product interface.
 *
 * Step 3
 *  In the creator's class find all references to product constructors.
 *  One by one, replace them with calls to the factory method,
 *  while extracting the product creation code into the factory method.
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * factory method
     *
     * Step LAST
     *  If, after all the extractions, the base factory method has become empty,
     *  you can make it abstract.
     *  If there's something left, you can make it a default behaviour of the method.
     */
    public abstract Button createButton();
}
