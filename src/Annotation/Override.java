package Annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE) // SOURCE(discarded by compiler,CLASS(discarded in runtime - reflection X),RUNTIME
@Documented
@Inherited
public @interface Override {

}
