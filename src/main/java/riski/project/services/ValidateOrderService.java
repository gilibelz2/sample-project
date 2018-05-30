package riski.project.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import riski.project.order.Order;
import riski.project.rule.operator.ContainsOperator;
import riski.project.rule.EmailRule;
import riski.project.rule.Rule;
import riski.project.rule.TotalPriceRule;
import riski.project.rule.operator.GreaterThanOperator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@Service
public class ValidateOrderService {

    ArrayList<Rule> rules = new ArrayList<>();

    public boolean validateRules() throws IOException, NoSuchFieldException, IllegalAccessException {
        Order order = readOrder();
        for (Rule rule: rules) {
            if(!rule.validate(order))
                return false;
        }
        return true;
    }

    public void createRules(){
        rules.add(EmailRule.builder().value("gmail").operator(new ContainsOperator()).build());
        rules.add(TotalPriceRule.builder().value(100).operator(new GreaterThanOperator()).build());
    }

    public Order readOrder() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File("data.json"), new TypeReference<Order>() {});
//        return objectMapper.readValue(new File("C:\\GIT\\my-new-project\\data.json"), new TypeReference<Order>() {});
    }






}
