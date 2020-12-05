import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.ioc.Framework;
import spring.ioc.ITraitement;

import java.util.Scanner;

public class Client {

    public static void main() {

        Framework framework = Framework.getInstance();

        int[][] image = {
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9},
        };

        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();
        scanner.close();
        Class classImpl;
        ITraitement impl = null;

        try {
            classImpl = Class.forName(className);
            impl = (ITraitement) classImpl.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        framework.setTraitement(impl);
        long expected = framework.getTraitement().traiter(image);
        long actuel = 45;
    }
}
