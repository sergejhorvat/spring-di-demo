package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println("\n"+"Calling from myController.hello()");
        controller.hello();

        System.out.println("\n"+"Calling from PropertyInjectedController.class).sayHello()");
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println("\n"+"Calling from SetterInjectedController.class).sayHello()");
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println("\n"+"Calling from ConstructorInjectedController.class).sayHello()");
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
