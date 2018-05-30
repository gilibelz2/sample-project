package riski.project.rule.operator;

public class ContainsOperator extends Operator {

    @Override
    public boolean validate(Object fieldValue, Object validationValue){
        return !(((String)fieldValue).toLowerCase().contains(((String)validationValue)));
    }
}
