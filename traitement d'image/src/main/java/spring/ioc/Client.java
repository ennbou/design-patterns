package spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;


@Configuration
@ComponentScan(basePackages = {"spring.ioc"})
class Config{}

public class Client {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Framework framework = Framework.getInstance();
        int[][] image = {new int[]{1, 2, 3},new int[]{4, 5, 6},new int[]{7, 8, 9},};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Le nom de classe : ");
        String className = scanner.nextLine();
        ITraitement impl = (ITraitement) context.getBean(className);
        framework.setTraitement(impl);
        long expected = framework.getTraitement().traiter(image);
        long actuel = 45;
        System.out.println(expected == actuel ? "le traitement a ete bien effectuer" : "echec!!!");
        System.out.print("Le nom de classe : ");
        className = scanner.nextLine();
        impl = (ITraitement) context.getBean(className);
        framework.setTraitement(impl);
        expected = framework.getTraitement().traiter(image);
        System.out.println(expected == actuel ? "le traitement a ete bien effectuer" : "echec!!!");
        System.out.print("Le nom de classe : ");
        className = scanner.nextLine();
        impl = (ITraitement) context.getBean(className);
        framework.setTraitement(impl);
        expected = framework.getTraitement().traiter(image);
        System.out.println(expected == actuel ? "le traitement a ete bien effectuer" : "echec!!!");
        scanner.close();
    }
}
