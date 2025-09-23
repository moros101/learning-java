package Collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class main {

    public static void main(String[] args){

        // Iterable
        // Co llection - represents group of objects, interface
        // Vs Collections - utility class - static methods
        // Queue    List    Set

        ArrayList<Integer> arr = new ArrayList <Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("size: " + arr.size());
        System.out.println("isEmpty: " + arr.isEmpty());
        System.out.println("contains 2: " + arr.contains(2));
        System.out.println("toArray: " + arr.toArray());
        arr.remove(3);
        System.out.println("removed using index: " + arr.contains(5));
        // remove using Object, removes first occurrence
        arr.remove(Integer.valueOf(3));
        System.out.println("removed using object: " + arr.contains(3));

        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);
        // addAll
        arr.addAll(stackValues);
        System.out.println("addAll test using containsAll: " + arr.containsAll(stackValues));
        // containsAll
        arr.remove(Integer.valueOf(7));
        System.out.println("containsAll after removing 1 element: " + arr.containsAll(stackValues));
        arr.removeAll(stackValues);
        System.out.println("removeAll: " + arr.contains(8));
        System.out.println(arr.equals(arr));
        System.out.println(arr.stream().anyMatch(x -> x == 2));
        System.out.println(arr.parallelStream().anyMatch(x -> x == 2));
        arr.clear();
        System.out.println("isEmpty: " + arr.isEmpty());


        List<Integer> arr1 = new ArrayList<>();
        arr1.add(4);
        arr1.add(2);
        arr1.add(3);
        arr1.add(1);
        System.out.println("max value: " + Collections.max(arr1));
        System.out.println("min value: " + Collections.min(arr1));
        Collections.sort(arr1);
        System.out.println("sorted");
        arr1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();
        Collections.reverse(arr1);
        System.out.println("reversed");
        arr1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();
        Collections.shuffle(arr1);
        System.out.println("shuffled");
        arr1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();
        Collections.swap(arr1,0,1);
        System.out.println("swap");
        arr1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();
        Collections.rotate(arr1,1);
        System.out.println("rotate");
        arr1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();
        System.out.println("binarySearch 2: " + Collections.binarySearch(arr1,2));
        System.out.println("binarySearch 10: " + Collections.binarySearch(arr1,10));








        //  Queue (Interface) - FIFO
        // new methods - add, offer, poll, remove, peak, element

        // PriorityQueue
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);
        minPQ.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();
        int pollValue = minPQ.poll();
        System.out.println("remove from top: " + pollValue);

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((val1, val2) -> val2 - val1); //  comparator as lambda
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);
        maxPQ.forEach(val1 -> System.out.print(val1 + " "));
        System.out.println();

        // For thread safe pq
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
        pq.add(5);
        pq.add(2);
        System.out.println("show element on top: " + pq.peek());


        // Object collection sorting
        Car[] carArray = new Car[3];
        carArray[0] = new Car("SUV", "Petrol");
        carArray[1] = new Car("Sedan", "Diesel");
        carArray[2] = new Car("HatchBack", "CNG");

//        Arrays.sort(carArray);
        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj2.carName.compareTo(obj1.carName)); // descending









        // Deque (Interface) - FIFO(queue) / LIFO (stack)
        //  addFirst, offerFirst, addLast, offerLast (return true/false)
        //  removeFist, pollFirst (return null if empty)
        //  getFirst, peekFirst (return null if empty)
        // stack => push() -> internally calls addFirst, pop() -> removeFirst

        //  FIFO
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        //Insertion - O(amortized 1) - except when reached limit, resize takes O(n)
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(10);

        //  Deletion - O(1)
        int element = arrayDequeAsQueue.removeFirst();
        System.out.println("removeFirst: " + element);

        // LIFO
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(5);
        arrayDequeAsStack.addFirst(10);
        //  Deletion
        int removedEle =  arrayDequeAsStack.removeFirst();
        System.out.println("removeFirst: " + removedEle);
        // search - O(1)
        System.out.println("search element at first: " + arrayDequeAsStack.peekFirst());

        // for thread safe ArrayDeque
        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();





        // List -> indexed = data can be inserted/removed/access from anywhere
        // methods - add(int index, E element), addAll(int index, Collection c), replaceAll(UniaryOperator op), , sort(Comparator c), get(int index), set(int index, Element e), remove(int index), indexOf(Object o), lastIndexOf(Object o), ListIterator, subList(from,to)


        // ArrayList
        List<Integer>list1 = new ArrayList<>();
        list1.add(0, 100);
        list1.add(1, 200);
        list1.add(2, 300);

        // addAll
        List<Integer>list2 = new ArrayList<>();
        list2.add(0, 400);
        list2.add(1, 500);
        list2.add(2, 600);
        list1.addAll(2,list2);
        System.out.println("addAll: ");
        list1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();

        // replaceALl(UniaryOperator u)
        System.out.println("replaceALl: ");
        list1.replaceAll((Integer val) -> -1 * val);
        list1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();

        //  sort(Comparator c)
        list1.sort((Integer val1, Integer val2) -> val1 - val2 ); // Increasing
        list1.sort((Integer val1, Integer val2) -> val2 - val1);  // Decreasing

        //  get(int index)
        System.out.println("get: " + list1.get(2));

        // set(int index, Element e)
        list1.set(0, 1000);
        System.out.println("set: ");
        list1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();

        // remove(int index)
        list1.remove(2);
        System.out.println("remove: ");
        list1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();

        // indexOf(Object o)
        System.out.println("indexOf: " +  list1.indexOf(1));

        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());

        // traversing backward direction
        while (listIterator1.hasPrevious()) {
            int previousVal =  listIterator1.previous();
            System.out.println("traversing backward: " + previousVal + " nextIndex: " + listIterator1.nextIndex() +  " previousIndex: " + listIterator1.previousIndex());
            if(previousVal == -200){
                listIterator1.set(-50);
            }
        }
        list1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();

        // traversing forward direction
        ListIterator<Integer> listIterator2 = list1.listIterator();
        while (listIterator2.hasNext()) {
            int nextVal =  listIterator2.next();
            System.out.println("traversing forward: " + " nextVal: " + nextVal + " previousIndex: " +  listIterator2.previousIndex() +  " nextIndex: " + listIterator2.nextIndex());
            if(nextVal == -50){
                listIterator2.set(-200);
            }
        }
        list1.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();

        // thread safe
        List<Integer> list = new CopyOnWriteArrayList<>();




        // LinkedList (List(indexed) + Dequeue(getLast, removeFirst))
        LinkedList<Integer> linkList = new LinkedList<>();
        // using deque functionality
        linkList.addLast(200);
        linkList.addLast(300);
        linkList.addLast(400);
        linkList.addFirst(100);
        System.out.println("getFirst: " +  linkList.getFirst());

        // using list funcitonality
        LinkedList<Integer> linkList2 = new LinkedList<>();
        linkList2.add(0, 100);
        linkList2.add(1, 300);
        linkList2.add(2, 400);
        linkList2.add(1, 200);
        linkList2.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();


        // Vector - same as arrayList - thread safe, puts a lock on each element hence inefficient
        Vector<Integer> vector = new Vector<>();
        vector.add(200);

        // stack -  deque is not thread safe
        Stack<Integer> stk = new Stack<>();









        //  Map = Key -> Value (Collection has methods for value only)
        // methods - size, isEmpty, containsKey, containsValue, get, put, remove, putAll,
        Map<Integer, String> rollNumberVsNameMap = new HashMap<>();
        rollNumberVsNameMap.put(null, "TEST");
        rollNumberVsNameMap.put(1, "A");
        rollNumberVsNameMap.put(21, "B");
        rollNumberVsNameMap.put(23, "C");
        rollNumberVsNameMap.put(141, "D");
        rollNumberVsNameMap.put(25, "E");
        System.out.println("rollNumberVsNameMap: " + rollNumberVsNameMap);
        // Hash table (same) - thread safe and not null
        Hashtable<Integer, String > hashTable = new Hashtable<>();
        // Concurrent hash
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        // linked hash map (same) - maintain insertion or access order with doubly linked list (before,after)
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"A");
        linkedHashMap.put(21,"B");
        linkedHashMap.put(23,"C");
        linkedHashMap.put(141,"D");
        linkedHashMap.put(25,"E");
        System.out.println("linkedHashMap: " + linkedHashMap);
        // thread safe -> Collections.synchronisedMap()
        Map<Integer, String> linkedHashMap2 = Collections.synchronizedMap(new LinkedHashMap<>());

        //  TreeMap : Map <- SortedMap <- NavigableMap <- TreeMap
        // Sorted acc to natural order of key or provided comparator
        // Based on red-black tree ( self balancing binary search tree ) O(logn)
        Map<Integer, String> treeMp = new TreeMap<>();
        treeMp.put(21,"SJ");
        treeMp.put(11,"PJ");
        treeMp.put(13, "KJ");
        treeMp.put(5, "TJ");
        System.out.println("treeMp: " + treeMp);







        // Set - internally map is used
        /*
            Doesn't contain duplicate value
            Not an ordered collection
            Cannot be accessed via index
        */


        // HasSet
        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);
        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        set1.addAll(set2);
        System.out.println("set1: " + set1); // union

        set1.removeAll(set2);
        System.out.println("set1: " + set1); // removes common difference
        set1.add(11);
        set1.add(12);

        set1.retainAll(set2);
        System.out.println("set1: " + set1); // intersection

        // ThreadSafeVersion
        ConcurrentHashMap concurrentHashMap1 = new ConcurrentHashMap<>();
        Set<Integer> threadSafeSet = concurrentHashMap1.newKeySet();
        threadSafeSet.add(1);
        threadSafeSet.add(2);

        Iterator<Integer> iterator1 = threadSafeSet.iterator();
        while (iterator1.hasNext()) {

            int val =  iterator1.next();
            if(val == 1){
                // iterator.remove() // we can remove
                threadSafeSet.add(9); // should be able to add cause it's thread safe
            }
        }
        System.out.println("threadSafeSet: " + threadSafeSet);


        // LinkedHashSet - insertion order(yes), access order(no)
        Set<Integer> threadSafeSet2 = Collections.synchronizedSet(new LinkedHashSet<>()); // thread safe version


        // TreeSet
        Set<Integer> treeeSet = new TreeSet<>((Integer o1, Integer o2) ->o2-o1);
        treeeSet.add(2);
        treeeSet.add(77);
        treeeSet.add(82);
        treeeSet.add(91);
        treeeSet.add(5);
        System.out.println("treeeSet: " + treeeSet);


















    }
}
