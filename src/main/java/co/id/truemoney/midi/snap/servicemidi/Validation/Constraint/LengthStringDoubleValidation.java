package co.id.truemoney.midi.snap.servicemidi.Validation.Constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.id.truemoney.midi.snap.servicemidi.Utils.Constraint.LengthStringDoubleConstraint;

public class LengthStringDoubleValidation implements ConstraintValidator<LengthStringDoubleConstraint, String> {

    int length;
    int desimal;

    @Override
    public void initialize(LengthStringDoubleConstraint lengthOptionalConstaint) {
        this.length = lengthOptionalConstaint.digit();
        this.desimal = lengthOptionalConstaint.desimal();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!value.isEmpty()) {
            String[] str = value.split("\\.", 2);
            return (str[0].length() <= this.length) && (str[1].length() == this.desimal);
        }
        return true;
    }

}
