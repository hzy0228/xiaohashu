package cn.hdy.framework.common.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @Author: hao-zhao-yu
 * @Date: 2025/10/26 8:57
 * @Version: v1.0.0
 * @Description: TODO
 **/
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    /**
     * @param constraintAnnotation
     */
    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
    }

    /**
     * @param phoneNumber
     * @param context
     * @return
     */
    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        // 校验逻辑：正则表达式判断手机号是否为 11 位数字
        return phoneNumber != null && phoneNumber.matches("\\d{11}");
    }
}
