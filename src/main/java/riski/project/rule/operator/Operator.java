package riski.project.rule.operator;

import org.springframework.stereotype.Component;

@Component
public abstract class Operator {

    public abstract boolean validate(Object fieldValue, Object validationValue);
}
