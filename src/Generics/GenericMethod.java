package Generics;

public class GenericMethod {

    public <K,V> void printValue(Pair<K,V> pair1, Pair<K,V> pair2) {
        if(pair1.getKey().equals(pair2.getKey())) {
            System.out.println(pair1.getValue() + " => " + pair2.getValue());
        }
    }

    public <T> void setValue(T object) {

    }
}
