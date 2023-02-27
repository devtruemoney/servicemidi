package co.id.truemoney.midi.snap.servicemidi.Utils.Constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.id.truemoney.midi.snap.servicemidi.Validation.Constraint.LengthStringDoubleValidation;

@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = LengthStringDoubleValidation.class)
public @interface LengthStringDoubleConstraint {

    String message();

    Class<?>[] groups() default {};

    int digit() default Integer.MAX_VALUE;

    int desimal() default 2;

    Class<? extends Payload>[] payload() default {};

}
