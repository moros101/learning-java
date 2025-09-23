package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class main {

    public static void main(String args[]) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        // Reflection is used to examine classes, methods, fields, interfaces at runtime and change the behaviour of the class
        // - META DATA of the
        // To reflect class we need to get object of class
        Class singletonClass = Singleton.class;

        // to access private constructors too
        Constructor[] constructorList = singletonClass.getDeclaredConstructors();
        for(Constructor singletonConstructor : constructorList){
//            System.out.println("Modifier". Modifier.toString(singletonConstructor.getModifiers()));

            singletonConstructor.setAccessible(true);
            Singleton singletonObject = (Singleton) singletonConstructor.newInstance();
            singletonObject.db();
        }
    }

}
