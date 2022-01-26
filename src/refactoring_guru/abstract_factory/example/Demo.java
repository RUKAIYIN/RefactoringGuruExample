package refactoring_guru.abstract_factory.example;

import refactoring_guru.abstract_factory.example.app.Application;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;
import refactoring_guru.abstract_factory.example.factories.MacGUIFactory;
import refactoring_guru.abstract_factory.example.factories.WinGUIFactory;

/**
 * EN: Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * EN: Application picks the factory type and creates it in run time
     * (usually at initialization stage), depending on the configuration or
     * environment variables.
     */
    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacGUIFactory();
        } else {
            factory = new WinGUIFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
