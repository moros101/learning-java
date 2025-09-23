package Annotation;

import java.lang.annotation.Repeatable;

@Repeatable(Container.class)
public @interface Category {
    String name() default "Hello";
}
