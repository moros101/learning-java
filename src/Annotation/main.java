package Annotation;

import java.util.ArrayList;
import java.util.List;

public class main{

    @SuppressWarnings("all") // deprication, unused
    public static void main(String[] args) {

        // Annotation - @
        // adding META DATA to java code
        // Read annotation/ meta data info - Using reflection
        //

        Mobile mobileObj = new Mobile();
        mobileObj.dummyMethod();

        System.out.println(new ChildClass().getClass().getAnnotation(MyCustomAnnotationWithInherited.class));

        Category[] CategoryAnnotationArray = new Mobile().getClass().getAnnotationsByType(Category.class);
        for (Category category : CategoryAnnotationArray) {
            System.out.println(category.name());
        }


    }

    @Override
    public void dummyMethod2(){

    }

    public void dummyMethod3(){

    }

    @SafeVarargs // Heap pollution warning - (static or final or private - no overriding)
    public static void printLogs(List<Integer> ...logNumbersList){

        Object[] objectList = logNumbersList;

        List<String> stringValuesList = new ArrayList<>();
        stringValuesList.add("Hello");
        objectList[0] =  stringValuesList;

    }
}
