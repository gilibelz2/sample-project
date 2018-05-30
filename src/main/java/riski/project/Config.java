package riski.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import riski.project.services.ValidateOrderService;

import java.io.IOException;

@Configuration
@ComponentScan
public class Config {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(riski.project.Config.class);
        ValidateOrderService validateOrderService = context.getBean(ValidateOrderService.class);
        validateOrderService.createRules();
        boolean response = validateOrderService.validateRules();
        System.out.println("********************");
        if(!response){
            System.out.println("The order does not satisfy the rules");
        }else{
            System.out.println("The order does satisfy the rules");
        }
        System.out.println("********************");
    }

}
