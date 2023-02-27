package co.id.truemoney.midi.snap.servicemidi.Validation.Constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.id.truemoney.midi.snap.servicemidi.Utils.Constraint.LengthNumberOptionalConstraint;

public class LengthOptionalNumberValidation implements ConstraintValidator<LengthNumberOptionalConstraint, Integer> {

    int length;

    @Override
    public void initialize(LengthNumberOptionalConstraint lengthOptionalConstaint) {
        this.length = lengthOptionalConstaint.digit();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        return Integer.toString(value).length() == this.length;
    }

}
