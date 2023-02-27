package co.id.truemoney.midi.snap.servicemidi.Validation.Constraint;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.id.truemoney.midi.snap.servicemidi.Utils.Constraint.DateLengthOptionalConstraint;

public class DateLengthOptionalNumberValidation implements ConstraintValidator<DateLengthOptionalConstraint, String> {

    int length;

    @Override
    public void initialize(DateLengthOptionalConstraint lengthOptionalConstaint) {
        this.length = lengthOptionalConstaint.length();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value.isEmpty())
            return true;

        if (value.length() != this.length)
            return false;

        try {
            ZoneId zone = ZoneId.of("Asia/Jakarta");
            LocalDate d2 = LocalDate.from(LocalDateTime.now());
            LocalDate d1 = LocalDate.from(DateTimeFormatter.ISO_DATE_TIME.withZone(zone).parse(value));
            return d1.compareTo(d2) == 0;
        } catch (Exception e) {
            return false;
        }
    }

}
