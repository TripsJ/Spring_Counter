import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("counter.xml");

        Phraser phraser = (Phraser) context.getBean("phraser");
        phraser.run();

    }
}
