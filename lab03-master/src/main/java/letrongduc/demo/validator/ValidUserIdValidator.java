package letrongduc.demo.validator;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Valid;
import letrongduc.demo.enity.User;
import letrongduc.demo.validator.annotation.ValidUserId;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
