package co.id.truemoney.midi.snap.servicemidi.Utils.Constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.id.truemoney.midi.snap.servicemidi.Validation.Constraint.LengthOptionalNumberValidation;

@Target({ ElementType.METHOD, ElementType.FIELD }) // ?..memberi batsan
@Retention(RetentionPolicy.RUNTIME) // ?..menfesifikasi
@Documented
@Constraint(validatedBy = LengthOptionalNumberValidation.class)
public @interface LengthNumberOptionalConstraint {

    String message() default "Validation Error";

    Class<?>[] groups() default {}; // ??....

    int digit() default Integer.MAX_VALUE;

    Class<? extends Payload>[] payload() default {};
}
