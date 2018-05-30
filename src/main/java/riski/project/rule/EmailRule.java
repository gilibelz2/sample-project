package riski.project.rule;

import lombok.Builder;
import riski.project.order.Order;
import riski.project.rule.operator.Operator;

@Builder
public class EmailRule implements Rule {

    private String value;
    private Operator operator;

    @Override
    public boolean validate(Order order) throws NoSuchFieldException, IllegalAccessException {
        //return order.getEmail().toLowerCase().contains(value);
        return operator.validate(order.getEmail(), value);
    }
}
