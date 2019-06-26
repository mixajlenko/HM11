import factories.AbstractFactory;
import factories.MacFactory;
import factories.WindowsFActory;

public class ListOfNubersDemo {
    public static void main(String[] args) throws ScaryException {
        Application app = new Application();
        Application app2 = configureApplication();
        app2.paint();
        app.logicOfApplication();


    }

    private static Application configureApplication() {
        Application app;
        AbstractFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFActory();
            app = new Application(factory);
        }
        return app;
    }
}
