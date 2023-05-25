package letrongduc.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import letrongduc.demo.enity.Category;
import letrongduc.demo.validator.annotation.ValidCategoryId;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != 0L;
    }
}
