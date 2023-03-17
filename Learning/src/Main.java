import java.util.*;

public class Main {

    public static void main(String[] args) {

        //arrayListPractice();
        //linkedListPractice();
        //hashSetPractice();
        //treeSetPractice();
        //hashMapPractice();
        treeMapPractice();

    }

    private static void treeMapPractice() {

        //TreeMap elements will be naturally ordered by key values

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "A");
        treeMap.put(2, "B");
        treeMap.put(1, "C");

        System.out.println(treeMap);

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {

            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }

        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

    }

    private static void hashMapPractice() {

        //these data structures have to be fed with key-value data sets

        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println("Size of map is: " + map.size());
        System.out.println(map);

        if (map.containsKey("a")) {

            Integer a = map.get("a");
            System.out.println("Value for key \"a\" is: " + a);

        }

        for (String key : map.keySet()) {

            System.out.println("Key: " + key + ", Value: " + map.get(key));

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }

    }

    private static void treeSetPractice() {

        // The mean reason to use TreeSet is that this type of data structure is maintaining the natural order of the input elements
        // The set property (the uniqueness of the elements) is inherited

        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");

        // The second "C" will not be putted in the HashSet

        treeSet.add("C");

        System.out.println(treeSet);

    }

    private static void hashSetPractice() {

        // The HashSet have a property of random accessing the of the input elements
        // The set property (the uniqueness of the elements) is inherited

        Set<String> hashSet = new HashSet<String>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");

        // The second "C" will not be putted in the HashSet

        hashSet.add("C");

        System.out.println(hashSet);

        System.out.println("List contains C or not? " + hashSet.contains("C"));

        hashSet.remove("A");

        System.out.println("Set after removing A:" + hashSet);

        for (String item : hashSet) {
            System.out.println(item);
        }

    }

    private static void linkedListPractice() {

        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");

        System.out.println(list);

        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);

    }

    private static void arrayListPractice() {

        //list interface -> have many child ArrayList/LinkedList
        //left side - interface, right side - concrete implementation
        List<Integer> arrayList = new ArrayList<Integer>(5);

        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        arrayList.remove(3);

        System.out.println(arrayList);

        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }

        System.out.println();

    }

}
