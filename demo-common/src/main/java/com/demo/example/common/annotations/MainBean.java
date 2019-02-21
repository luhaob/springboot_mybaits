package com.demo.example.common.annotations;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2019/1/16.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
public @interface MainBean {
    @AliasFor("value")
    String beanName() default "";
    @AliasFor("beanName")
    String value() default "";
}
