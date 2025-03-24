package br.com.dbc.hotel.utils;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = EnumValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface EnumValid {
    Class<? extends Enum<?>> enumClass();
    String message() default "Valor inválido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
