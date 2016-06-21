package xyz.restinmotion.learning;

import org.apache.wicket.validation.CompoundValidator;
import org.apache.wicket.validation.validator.PatternValidator;
import org.apache.wicket.validation.validator.StringValidator;

public class UsernameValidator extends CompoundValidator<String> {

    private static final long serialVersionUID = 1L;

    public UsernameValidator() {

        this.add(StringValidator.lengthBetween(5, 15));
        this.add(new PatternValidator("[a-z0-9_-]+"));

    }
}
