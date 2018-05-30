package riski.project.rule.operator;

public class GreaterThanOperator extends Operator {
    @Override
    public boolean validate(Object fieldValue, Object validationValue) {
        return !(((double)fieldValue)>((double)validationValue));
    }
}
