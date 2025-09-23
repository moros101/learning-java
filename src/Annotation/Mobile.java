package Annotation;

@Category(name = "Electronics")
@Category(name = "Software")
@Category
@MyCustomAnnotationWithInherited
public class Mobile {

    @Deprecated
//    @Deprecated
    public void dummyMethod() {
        // do smt
    }

    public void dummyMethod2() {}
}
