package refactoring_guru.abstract_factory.example.buttons;

/**
 * Step 1 Map out a matrix of product types versus variants of these products
 * Step 2 Declare abstract product interfaces for all product types.
 *  Then make all concrete product classes implement these interfaces.
 */
public interface Button {
    void paint();
}
