package context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// Singleton del IoC Container.
// Spring crea todos los beans al iniciar.

public class AppContext {

    private static final ApplicationContext context =
            new ClassPathXmlApplicationContext("beans.xml");

    private AppContext() {
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
