package refactoring_guru.factory_method.example.buttons;

/**
 * Step 1: make all products follow the same interface.
 *  This interface should declare methods that make sense in every product.
 */
public interface Button {
    public void render();
    public void onClick();
}
