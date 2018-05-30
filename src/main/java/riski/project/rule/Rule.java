package riski.project.rule;

import riski.project.order.Order;

public interface Rule {
    boolean validate(Order order) throws NoSuchFieldException, IllegalAccessException;
}
