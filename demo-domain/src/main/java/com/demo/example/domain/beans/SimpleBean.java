package com.demo.example.domain.beans;


import com.demo.example.common.annotations.MainBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@MainBean(beanName = "SimpleBean2")
public class SimpleBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleBean.class);
        String[] beannames = context.getBeanNamesForType(SimpleBean.class);
        //当加上@AliasFor时, 输出"mainbean"

        //当去掉@AliasFor注解后, 输出"main"

        System.out.println(beannames[0]);
        context.close();
    }
}


