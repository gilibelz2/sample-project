package riski.project.rule;

import lombok.Builder;
import riski.project.order.Order;
import riski.project.rule.operator.Operator;

@Builder
public class TotalPriceRule implements Rule {

    private double value;
    private Operator operator;

    @Override
    public boolean validate(Order order) {
        return operator.validate(order.getTotal_price(), value);
    }
}
