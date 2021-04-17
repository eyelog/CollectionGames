package javaset.sets;

import javaset.model.TestBox;
import javaset.model.TestBoxMode;

import java.util.*;

public class SimpleSet {

    public static void main(String[] args) {

        Set<Object> hashSet = new HashSet<>();
        hashSet.add(new TestBox(1, "1"));
        hashSet.add(new TestBox(1, "1"));
        hashSet.add(new TestBoxMode(1, "1"));
        hashSet.add(new TestBoxMode(1, "1"));
        hashSet.add(new TestBox(2, "2"));
        hashSet.add("100");
        hashSet.add(100);
        System.out.println("hashSet: " + hashSet);


        Set<Object> treeSet = new TreeSet();
        treeSet.add(101);
        treeSet.add(17);
        treeSet.add(57);
        treeSet.add(39);
        System.out.println("treeSet: " + treeSet);


        Set<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new TestBox(1, "1"));
        linkedHashSet.add(new TestBox(1, "1"));
        linkedHashSet.add(new TestBoxMode(1, "1"));
        linkedHashSet.add(new TestBoxMode(1, "1"));
        linkedHashSet.add("17");
        linkedHashSet.add(57);
        linkedHashSet.add(39);
        System.out.println("linkedHashSet: " + linkedHashSet);
    }
}
