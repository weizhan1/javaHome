package javaHome;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        System.out.println("Is HashSet empty? "+hs.isEmpty());
        hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of the HashSet: "+hs.size());
        System.out.println("Does HashSet contains first element? "+hs.contains("first"));
        
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

class MyHashSetCopy {
	 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
    }
}

class MyHashSetClear {
	 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("My HashSet content:");
        System.out.println(hs);
        System.out.println("Clearing HashSet:");
        hs.clear();
        System.out.println("Content After clear:");
        System.out.println(hs);
    }
}

class MyHashSetToArray {
	 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("HashSet content: ");
        System.out.println(hs);
        String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }
}

class MyHashSetRetain {
	 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        hs.add("apple");
        hs.add("rat");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("rat");
        subSet.add("second");
        subSet.add("first");
        hs.retainAll(subSet);
        System.out.println("HashSet content:");
        System.out.println(hs);
    }
}

